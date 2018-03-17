package cn.itcast._01基本语法;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 java目前只内置了三种标准注解：
  	@Override  表示当前的方法定义将覆盖超类中的方法。
  	@Deprecated 如果程序员使用了注解为它的元素，那么编译器会发出警告信息
  	@SuppressWarnings 关闭不当的编译器警告信息。
 
 java还另外提供了四种注解，专门负责新注解的创建：
 	@Target  表示该注解可以用于什么地方。可能的ElementType参数包括：
 				CONSTRUCTOR 构造器的生命
 				FIELD ： 域声明(包括enum示例)(全局变量或字段或属性)
 				LOCAL_VARIABLE:局部变量声明
 				METHOD :方法声明
 				PACKAGE：包声明
 				PARAMETER :参数声明
 				TYPE ：类、接口(包括注解类型)或enum声明
 				
 	@Retention  表示需要在什么级别保存该注解信息。可选的RetentionPlicy参数包括：
 					SOURCE： 注解将被编译器丢弃
 					CLASS ：注解在class文件中可用，但会被JVM丢弃。
 					RUNTIME： JVM将在运行期也保留注解，因此可以通过反射机制读取注解的信息
 					
 	@Documented  将此注解包含在javadoc中
 	
 	@Inherited  允许子类继承父类中的注解
 */	

/**
 * 定义一个注解
 * @author 贤元
 *
 */
//注意：没有元素的注解称为"标记注解(marker annotation)"

@Target(ElementType.METHOD)  //表示注解将应用于方法上
@Retention(RetentionPolicy.RUNTIME) //表示需要在什么级别保存该注解信息
public @interface UseCase {
	public int id();//这是注解的元素
	public String description() default "no description";//这是注解的元素   并为该元素提供默认值
}

/**
 注解元素可用的类型如下所示：
 	A：所有基本类型(int,float,boolean等)
 	B：String
 	C:enum
 	D:Annotation
 	E:以上类型的数组
 	如果你使用了其他类型，那编译期就会报错。注意，也不允许使用任何包装类型，不过由于自动打包的存在，这算不上什么限制。
 	注解可以作为注解中的元素的类型，也就是说注解可以嵌套。
 */