package a_acn.lixian;

public class Student extends Teacher {
  //��ϰ��ѧ����������ʦ����
	//ʹ�ü̳У������г�Աprivate����  ������η�����
	public String hobby;
	public Student(){
		System.out.println("Student");
	}
	public Student(String hobby){
		super("lixin",23,'��');//���ø���Ĺ��캯��
		super.show();//ʹ��super���ø���ĳ�Ա����
		this.hobby=hobby;
	}
	public void message(){
		System.out.println(this.hobby);
	}
	public static void main(String[] args){
		Student st=new Student("����");
		st.message();
	}
	
	
}
