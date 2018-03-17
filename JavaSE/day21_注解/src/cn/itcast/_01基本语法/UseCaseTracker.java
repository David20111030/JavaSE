package cn.itcast._01基本语法;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 这是编写的注解处理器
 * @author 贤元
 *
 */
public class UseCaseTracker {
	
	public static void trackUserCase(List<Integer> useCases,Class<?> c1){
		/**
		 * getDeclaredMethods()返回 Method 对象的一个数组，
		 * 		这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
		 */
		for(Method m:c1.getDeclaredMethods()){
			UseCase uc = m.getAnnotation(UseCase.class);//如果存在该元素的指定类型的注解，则返回这些注解，否则返回 null。
			if(uc != null){
				System.out.println("Found Use Case:"+ uc.id()+" "+uc.description());
				/**
				 * 将List集合中的对应的元素移出，就是为了下面的for循环能打印出集合中有的但在PasswordUtils的注解上没有的id值
				 */
				useCases.remove(new Integer(uc.id()));
			}
		}
		
		for(int i:useCases){
			System.out.println("Warnging: Missing use case-"+i);
		}
	}
	
	public static void main(String[] args){
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47,48,49,50);//将所有指定元素添加到指定 List集合 中。
		trackUserCase(useCases, PasswordUtils.class);
	}
	
/**
 * 	打印结果：
 	Found Use Case:47 Passwords must contain at least one numeric
	Found Use Case:49 New passwords can't equal previously used ones
	Found Use Case:48 no description
	Warnging: Missing use case-50
		
 */
}