package a_Collection.gz.itcast_03;

public class Student {
	//��Ա������
	private String name;
	private int age;
	
	//���췽��
	public Student(){
		super();
	}
	
	//�вι��췽��
	public Student(String name,int age){
		super();
		this.name=name;
		this.age=age;
	}
	
	//��Ա����
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

	//��дtoString����
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
