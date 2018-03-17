package cn.itcast.b_反射概述;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * 注意：构造方法不是成员方法哦！！！！
 * @author 贤元
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		//通过反射获取构造方法并使用
		reflect_Constructor();
		
		//通过反射获取成员变量并使用
		//reflect_Field();
		
		//通过反射获取成员方法并使用
		//reflect_Method();
		
		
	}

	/**
	 * 通过反射获取构造方法并使用
	 */
	public static void reflect_Constructor() throws Exception {
		//首先获取字节码文件对象   也就是获取Class对象
		//Class clazz = Person.class;
		//Class clazz = new Person().getClass();
		//项目开发中推荐使用这种方式
		Class clazz = Class.forName("cn.itcast.b_反射概述.Person");
		
		//获取所有构造方法
		//public Constructor[] getConstructors();//获取所有公共的构造方法
		/**
		 * public Constructor[] getDeclaredConstructors();
		 * 	//获取声明的构造方法，也就是获取所有的构造方法，包括公有的和私有及默认包类型(也就是不写修饰符)的
		 */
		Constructor[] cons =  clazz.getConstructors();//获取公共的构造方法
		for(Constructor con : cons){
			System.out.println(con);
		}
		/**
		 * public cn.itcast.b_反射概述.Person(java.lang.String,int,java.lang.String)
		   public cn.itcast.b_反射概述.Person()
		 */
		
		System.out.println("=============");
		Constructor[] cons2 =  clazz.getDeclaredConstructors();//获取所有的构造方法
		for(Constructor con : cons2){
			System.out.println(con);
		}
		/**
		 * public cn.itcast.b_反射概述.Person(java.lang.String,int,java.lang.String)
			cn.itcast.b_反射概述.Person(java.lang.String,int)
			public cn.itcast.b_反射概述.Person()
			private cn.itcast.b_反射概述.Person(java.lang.String)
		 */
		
		System.out.println("==================");
		
		//获取单个构造方法
		/**
		 * public Constructor<T> getConstructor(Class<?>... paramenterTypes);
		 * //获取一个公有的构造方法，返回一个 Constructor 对象,它反映此 Class 对象所表示的类的指定公共构造方法。
		 */
		/**
		 * public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes);
		 * 			//获取一个已经声明的构造方法，公有、私有的构造方法都可以获取到。
		 */
		//参数表示的是，你要获取的构造方法的构造参数个数及数据类型的Class字节码文件对象
		Constructor cons3 = clazz.getConstructor();//获取公有的无参构造方法
		System.out.println(cons3);//public cn.itcast.b_反射概述.Person()
		
		System.out.println("========");
		
		//获取一个私有的带有String类型参数的有参构造函数
		Constructor cons4 = clazz.getDeclaredConstructor(String.class);//获取一个私有的带有String类型参数的有参构造函数
		System.out.println(cons4);//private cn.itcast.b_反射概述.Person(java.lang.String)
		
		System.out.println("=========");
		
		/**
		 * public T newInstance();
		 * 	 这是Class类中的方法。创建此 Class 对象所表示的类的一个新实例。也就是创建该clazz对象表示的类的对象，也就是创建Person对象
		 */
		Person p = (Person) clazz.newInstance();
		System.out.println(p);//Person [name=null, age=0, address=null]
		p.show();//show
		
		System.out.println("====================");
		
		//===============================================**********
		//通过反射获取公有的带参构造方法并使用
		Class c = Class.forName("cn.itcast.b_反射概述.Person");
		//获取带参构造方法对象
		Constructor con = c.getConstructor(String.class,int.class,String.class);//通过Class对象获取代餐构造方法对象
		//通过带参构造方法创建对象
		/**
		 * public T newInstance(Object... initargs);
		 * 		使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例
		 */
		Object obj = con.newInstance("李贤元",950,"福建");
		System.out.println(obj);//Person [name=李贤元, age=950, address=福建]
		
		
		System.out.println("===============");
		//==================================================**********
		//通过反射获取私有构造方法并使用
		Class c2 = Class.forName("cn.itcast.b_反射概述.Person");
		//获取私有的带参构造方法并使用
		Constructor con2 = c2.getDeclaredConstructor(String.class);
		//注意：获取私有的带参构造构造方法并使用的时候，会发生非法访问异常。如何解决呢？开启暴力访问就行了。
		
		System.out.println(con2);//private cn.itcast.b_反射概述.Person(java.lang.String)
		
		//暴力访问  开启暴力访问
		con2.setAccessible(true);//值为true则只是放射的对象在使用时应该取消Java语句访问检查
		Object obj2 = con2.newInstance("李贤元");//这个newInstance方法是属于Constructor方法的
		System.out.println(obj2);//Person [name=李贤元, age=0, address=null]  
		//打印一个类的对象，相当于调用该类的toString方法
	}
	
	



	/**
	 * 通过反射获取成员变量并使用
	 */
	public static void reflect_Field() throws Exception {
		//获取字节码文件对象
		Class clazz = Class.forName("cn.itcast.b_反射概述.Person");
		
		//获取所有的成员变量
		//public Field[] getFields();//只能获取所有的公有的成员变量
		/**
		 * public Field[] getDeclaredFields();
		 * 	//获取所有的已经声明的成员变量，也就是包括公有和私有的成员变量。也就是所有成员变量，不管公有还是私有
		 */

		//获取所有的成员变量
		Field[] fields = clazz.getDeclaredFields();
		for(Field field:fields){
			System.out.println(field);
		}
		/**
		 * private java.lang.String cn.itcast.b_反射概述.Person.name
			private int cn.itcast.b_反射概述.Person.age
			public java.lang.String cn.itcast.b_反射概述.Person.address
		 */
		
		System.out.println("=============");
		
		//=====================
		//通过无参构造方法创建对象
		Constructor con = clazz.getConstructor();
		Object obj = con.newInstance();
		
		//获取单个的成员变量
		/**
		 * public Field getField(String name); 
		 * 		返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段。这个方法只能获取公共的成员变量
		 */
		/**
		 * public Field getDeclaredField(String name);
		 * 		这个方法可以获取公有或者私有的成员变量。,返回一个 Field 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明字段。
		 */
		//获取私有成员变量name,并为其赋值
		Field nameField = clazz.getDeclaredField("name");
		//public void set(Object obj,Object value); 将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
		//因为成员变量name是私有的，所以要开启暴力访问
		nameField.setAccessible(true);
		nameField.set(obj, "李贤元");
		
		System.out.println(obj);//Person [name=李贤元, age=0, address=null]
	}

	
	
	


	/**
	 * 通过反射获取成员方法并使用
	 * @throws Exception
	 */
	public static void reflect_Method() throws Exception {
		//获取Class字节码文件对象
		Class clazz = Class.forName("cn.itcast.b_反射概述.Person");
		
		//获取所有的方法
		//public Method[] getMethods();//获取所有的公有的成员方法
		/**
		 * public Field[] getDeclaredFields();
		 * 		获取已经声明的成员方法。也就是获取所有的成员方法，不管公有还是私有的成员方法都可以获取到。
		 */
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods){
			System.out.println(method);
		}
		/**
			public java.lang.String cn.itcast.b_反射概述.Person.toString()
			public java.lang.String cn.itcast.b_反射概述.Person.getString(java.lang.String,int)
			private void cn.itcast.b_反射概述.Person.appShow(java.lang.String)
			private void cn.itcast.b_反射概述.Person.function()
			public void cn.itcast.b_反射概述.Person.method(java.lang.String)
			public void cn.itcast.b_反射概述.Person.show()		 
		 */
		
		System.out.println("===========");
		//创建一个对象
		Person p = (Person)clazz.newInstance();
		//==================================
		//获取单个成员方法
		/**
		 * public Method getMethod(String name,Class<?>... parameterTypes);
		 * 			获取单个公有的成员方法。只能获取公有的成员方法
		 */
		/**
		 * public Method getDeclaredMethod(String name,Class<?>... parameterTypes);
		 * 			获取已经声明的单个成员方法。公有的和私有的成员方法都可以获取到。
		 */
		//第一个参数表示的方法名，第二个参数表示的是方法的参数的class类型
		
		//获取单个私有的并且带参数的成员方法appShow(String name)并使用
		Method appshowMethod = clazz.getDeclaredMethod("appShow", String.class);
		//public Object invoke(Object obj,Object... args);
		//返回值是Object接收，第一个参数表示对象是谁，第二个参数表示调用该方法的实际参数
		/**
		 * 参数：
				obj - 从中调用底层方法的对象
				args - 用于方法调用的参数 
				返回：
				使用参数 args 在 obj 上指派该对象所表示方法的结果 
		 */
		//注意：因为使用的是私有的成员方法，所以要开启暴力访问。否则会发生IllegalAccessException非法访问异常
		appshowMethod.setAccessible(true);
		appshowMethod.invoke(p, "李贤元");//appShow方法:李贤元
	}
	
}