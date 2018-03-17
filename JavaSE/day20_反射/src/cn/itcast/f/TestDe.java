package cn.itcast.f;

import java.lang.reflect.Type;

public class TestDe {
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("cn.itcast.f.Person");
		
		Type[] types = clazz.getGenericInterfaces();//��ȡʵ�ֵĽӿڵ�����
		
		for(Type type:types){
			System.out.println(type);
		}
		//�����
		//interface cn.itcast.f.Man
		
		System.out.println("==============");
		
		Type type = clazz.getGenericSuperclass();//��ȡ�̳еĸ��������
		System.out.println(type);//class cn.itcast.f.Human
		
		//��ȡ���г���(����)��Class���� ֻ�ǵ�ǰ��ĸ��࣬������үү���
		System.out.println(clazz.getSuperclass().getName());//cn.itcast.f.Human
		//��ȡ���нӿڵ�Class����
		System.out.println(clazz.getInterfaces());//[Ljava.lang.Class;@30e79eb3
		
	}
}
