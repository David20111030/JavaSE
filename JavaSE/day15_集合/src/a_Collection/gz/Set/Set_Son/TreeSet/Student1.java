package a_Collection.gz.Set.Set_Son.TreeSet;
/**
 * ���һ�����Ԫ��Ҫ���ܹ�������Ȼ���򣬾ͱ���ʵ����Ȼ����Ľӿ�Comparable
 * @author ��Ԫ
 *
 */
public class Student1 implements Comparable<Student1> {
	private String name;
	private int age;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, int age) {
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
	
	
	
	@Override
	public int compareTo(Student1 s) {
		//��Ҫ����  �����ĳ���
		int num =this.name.length()- s.name.length();
		//�����ĳ�����ͬ��������������������ͬ
		int num2= num==0?this.name.compareTo(s.name):num;//int compareTo(String anotherString)���ֵ�˳��Ƚ������ַ�����
		//�����ĳ��Ⱥ�������ͬ��������������ͬ�����Ի��ü����ж�����
		int num3=num2==0?this.age-s.age:num2;
		return num3;
		
		
		
	}
	
}
