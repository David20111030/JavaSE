package a_acn.lixian;

public class Student extends Teacher {
  //练习：学生案例和老师案例
	//使用继承，父类中成员private修饰  子类如何访问呢
	public String hobby;
	public Student(){
		System.out.println("Student");
	}
	public Student(String hobby){
		super("lixin",23,'男');//调用父类的构造函数
		super.show();//使用super调用父类的成员方法
		this.hobby=hobby;
	}
	public void message(){
		System.out.println(this.hobby);
	}
	public static void main(String[] args){
		Student st=new Student("打球");
		st.message();
	}
	
	
}
