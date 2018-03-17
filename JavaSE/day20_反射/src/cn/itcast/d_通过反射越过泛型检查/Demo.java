package cn.itcast.d_通过反射越过泛型检查;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢？
 * @author 贤元
 *
 */
public class Demo {
	public static void main(String[] args) throws Exception{
		//创建集合对象
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1520);
		//获取ArrayList类的Class字节码文件对象
		Class arrayClazz = array.getClass();
		//通过反射获取ArrayList类中的add()方法对象
		Method m = arrayClazz.getMethod("add", Object.class);
		 
		//执行调用array的add方法  参数一：赋值给哪个对象，参数二：赋值
		m.invoke(array, "hello");
		m.invoke(array, "world");
		m.invoke(array, "java");
		
		System.out.println(array);//[1520, hello, world, java]
		
	}
}
