package c_java_IO.InputStream_OutpuStream.j_ObjectOutputStream_ObjectInputStream;

import java.io.Serializable;

/*
 * NotSerializableException:未序列化异常
 * 
 * 类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
 * 该接口居然没有任何方法，类似于这种没有方法的接口被称为标记接口。
 * 
 * java.io.InvalidClassException: 
 * cn.itcast_07.Person; local class incompatible: 
 * stream classdesc serialVersionUID = -2071565876962058344, 
 * local class serialVersionUID = -8345153069362641443
 * 
 * 为什么会有问题呢?
 * 		Person类实现了序列化接口，那么它本身也应该有一个标记值。
 * 		这个标记值假设是100。
 * 		开始的时候：
 * 		Person.class -- id=100
 * 		wirte数据： oos.txt -- id=100
 * 		read数据: oos.txt -- id=100	
 * 
 * 		现在：
 * 		Person.class -- id=200
 * 		wirte数据： oos.txt -- id=100
 * 		read数据: oos.txt -- id=100
 * 我们在实际开发中，可能还需要使用以前写过的数据，不能重新写入。怎么办呢?
 * 回想一下原因是因为它们的id值不匹配。
 * 每次修改java文件的内容的时候,class文件的id值都会发生改变。
 * 而读取文件的时候，会和class文件中的id值进行匹配。所以，就会出问题。
 * 但是呢，如果我有办法，让这个id值在java文件中是一个固定的值，这样，你修改文件的时候，这个id值还会发生改变吗?
 * 不会。现在的关键是我如何能够知道这个id值如何表示的呢?
 * 不用担心，你不用记住，也没关系，点击鼠标即可。
 * 你难道没有看到黄色警告线吗?
 * 
 * 我们要知道的是：
 * 		看到类实现了序列化接口的时候，要想解决黄色警告线问题，就可以自动产生一个序列化id值。
 * 		而且产生这个值以后，我们对类进行任何改动，它读取以前的数据是没有问题的。
 * 
 * 注意：
 * 		我一个类中可能有很多的成员变量，有些我不想进行序列化。请问该怎么办呢?
 * 		使用transient关键字或者使用static关键字声明不需要序列化的成员变量。
 * 		用这两个关键字修饰的成员变量是没有get/set方法的，因为他们是不属于对象
 * 
 * 
 * 
 */
/**
 * 如何实现序列化？
 * 步骤：
 * 		1、要实现序列化的类必须实现序列化接口 Serialize(这是一个标记接口)  该接口位于java.lang包中，
 * 		2、使用一个输出流来构造一个ObjectOutputStream(对象流)对象
 * 		3、用对象的writeObject(Object object)方法就可以将obj对象写出(即保存其状态)
 * @author 贤元
 *
 */
/**
 * 序列化的两个特点：
 * 	1、如果一个类能被序列化，那么他的子类也能够给被序列化
 *  2、由于static(静态)代表类的成员，transient(Java语言关键字，如果用transient声明一个实例变量，
 *  当对象存储时，他的值不需要维持。)代表对象的临时数据，
 *  因此被static、transient这两个关键字修饰的成员是不会被序列化。
 *  
 * @author 贤元
 *
 */
public class Person implements Serializable {
	
	//这个最好加上，直接点击Person下面的黄色警告线就会自动出来
	private static final long serialVersionUID = 2158478794264414617L;

	private  String name;

	// private int age;
	
	private static double height;//体重  不想被序列化的成员变量

	private transient int age;//不想被序列化的成员变量

	// int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static double getHeight() {
		return height;
	}

	public static void setHeight(double height) {
		Person.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
}
