package cn.itcast.f;

import java.lang.reflect.Type;

public class TestDe {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("cn.itcast.f.Person");
		
		Type[] types = clazz.getGenericInterfaces();//获取实现的接口的类型
		
		for(Type type:types){
			System.out.println(type);
		}
		//结果：
		//interface cn.itcast.f.Man
		
		System.out.println("==============");
		
		Type type = clazz.getGenericSuperclass();//获取继承的父类的类型
		System.out.println(type);//class cn.itcast.f.Human
		
		//获取所有超类(父类)的Class对象 只是当前类的父类，不包括爷爷类的
		System.out.println(clazz.getSuperclass().getName());//cn.itcast.f.Human
		//获取所有接口的Class对象
		System.out.println(clazz.getInterfaces());//[Ljava.lang.Class;@30e79eb3
		
	}
}
