package cn.itcast._02编写并实现注解处理器;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 *  一个注解处理器
 * @author 贤元
 *
 */
@Target(ElementType.FIELD)  //表示将用于成员变量上  也就是字段上
@Retention(RetentionPolicy.RUNTIME)  //表示JVM在运行时也保存该注解，因此可以通过反射机制获取该注解事信息
public @interface Constraints {
	//定义注解的元素,并设置默认值
	boolean primaryKey() default false;
	boolean allowNull() default true;
	boolean unique() default false;
}
