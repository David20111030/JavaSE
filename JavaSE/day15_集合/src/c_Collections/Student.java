package c_Collections;
/**
 * 自然排序
 * 实现自然排序，必须要实现Comparable<T>接口   T：代表你要进行自然排序的类
 * @author 贤元
 *
 */
public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	
	
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

	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	@Override
	public int compareTo(Student s) {
		//主要条件  年龄  按年龄从小到大排序
		int num=this.age-s.age;
		//次要条件
		int num2= num==0?this.name.compareTo(s.name):num;
		return num2;
	}

	


	
}
