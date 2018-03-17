package cn.itcast.b_反射概述;


/**
 反射：就是通过Class文件对象，去使用该文件中的成员变量，构造方法，成员方法。
 	Person p = new Person();
 		p.使用
 		
 	要想这样使用，首先你必须得到class文件对象，其实也就是得到Class类的对象。
 	
 	Class类：
 		成员变量  Field
 		构造方法  Constructor
 		成员方法  Method
 		
    获取Class文件对象的几种方式：
    	1、Object类的getClass()方法
    	2、数据类型的静态属性class
    	3、class类的静态方法：public static class forName(String name);返回与带有给定字符串名的类或接口相关联的 Class 对象。
 	
  一般我们用谁呢？
  	A：自己玩的时候：任选一种，第二种比较方便。
  	B：开发的时候：第三种
  			为什么呢?因为第三种是一个字符串，而不是一个具体的类名，这样就可以把这样的字符串配置到配置文件中去。
 * @author 贤元
 *
 */
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		//方式1
		Person p = new Person();
		Class clazzp = p.getClass();//获取Class文件对象
		
		System.out.println(clazzp);//class cn.itcast.b_反射概述.Person
		
		Person p2 = new Person();
		Class clazzp2 = p2.getClass();//class cn.itcast.b_反射概述.Person
		
		System.out.println(clazzp2);
		
		System.out.println(p==p2);//false  比较的是对象
		System.out.println(clazzp==clazzp2);//true  比较的是同一个类的Class对象
		
		//方式2
		Class clazzp3 = Person.class;
		//int.class;String.class;
		System.out.println(clazzp2==clazzp3);//true
		
		//方式3
		Class clazzp4 = Class.forName("cn.itcast.b_反射概述.Person");
		System.out.println(clazzp2==clazzp4);//true
		
		//说明：同一个类的Class对象是一样的
	}
}
