package cn.itcast.f;

public class Person extends Human implements Man{
	//私有的成员变量(成员变量也叫字段)
	private String name;
	private int age;
	//公有的成员变量
	public String address;

	public String getString(String s, int i) {
		return s + "---" + i;
	}
	
	//公有构造函数
	public Person() {
	}
	//不写修饰符，默认为包类型，也就是只有在同一个包下的类能访问
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	//私有构造函数
	private Person(String name) {
		this.name = name;
	}


	//成员方法
	public void show() {
		System.out.println("show");
	}

	public void method(String s) {
		System.out.println("method " + s);
	}

	//私有的成员方法
	private void function() {
		System.out.println("function");
	}

	//私有的带参数的成员方法
	private void appShow(String name){
		System.out.println("appShow方法:"+name);
	}
	
	//重写toString()方法
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address
				+ "]";
	}

}
