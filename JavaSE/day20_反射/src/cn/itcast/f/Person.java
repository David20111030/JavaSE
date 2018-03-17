package cn.itcast.f;

public class Person extends Human implements Man{
	//˽�еĳ�Ա����(��Ա����Ҳ���ֶ�)
	private String name;
	private int age;
	//���еĳ�Ա����
	public String address;

	public String getString(String s, int i) {
		return s + "---" + i;
	}
	
	//���й��캯��
	public Person() {
	}
	//��д���η���Ĭ��Ϊ�����ͣ�Ҳ����ֻ����ͬһ�����µ����ܷ���
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	//˽�й��캯��
	private Person(String name) {
		this.name = name;
	}


	//��Ա����
	public void show() {
		System.out.println("show");
	}

	public void method(String s) {
		System.out.println("method " + s);
	}

	//˽�еĳ�Ա����
	private void function() {
		System.out.println("function");
	}

	//˽�еĴ������ĳ�Ա����
	private void appShow(String name){
		System.out.println("appShow����:"+name);
	}
	
	//��дtoString()����
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address
				+ "]";
	}

}
