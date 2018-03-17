package a_Collection.gz.itcast_03;

public class Student {
	//成员变量、
	private String name;
	private int age;
	
	//构造方法
	public Student(){
		super();
	}
	
	//有参构造方法
	public Student(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	
	//成员方法
	//getXxx()/setXxx()
	public String getName(){
		return this.name;
	}
	public void setName(){
		this.name=name;
	}
	
	public int getAge(){
		return this.age;
	}
	public void setAge(){
		this.age=age;
	}

	//重写toString方法
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
