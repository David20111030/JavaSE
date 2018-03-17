package cn.itcast.c通过配置文件运行类中的方法;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 通过配置文件运行类中的方法：
	 反射：
	 	需要有配置文件配合使用
	 	用class.txt代替
	 	并且你知道有两个键
	 	ClassName
	 	methodName

 */
public class 通过配置文件运行类中的方法 {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// 加载键值对数据
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		// 获取数据
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");

		System.out.println(className);//cn.itcast.c通过配置文件运行类中的方法.Student
		System.out.println(methodName);//love
		// 反射
		Class c = Class.forName(className);//获取对应类的Class对象
		System.out.println(c);//class cn.itcast.c通过配置文件运行类中的方法.Student
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);//cn.itcast.c通过配置文件运行类中的方法.Student@3c0f3387 因为这个没重写toString方法
		
		// 调用方法
		Method m = c.getMethod(methodName);
		m.invoke(obj);//爱生活，爱Java

	}
}
