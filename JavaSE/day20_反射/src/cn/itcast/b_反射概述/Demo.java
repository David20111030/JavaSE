package cn.itcast.b_�������;


/**
 ���䣺����ͨ��Class�ļ�����ȥʹ�ø��ļ��еĳ�Ա���������췽������Ա������
 	Person p = new Person();
 		p.ʹ��
 		
 	Ҫ������ʹ�ã����������õ�class�ļ�������ʵҲ���ǵõ�Class��Ķ���
 	
 	Class�ࣺ
 		��Ա����  Field
 		���췽��  Constructor
 		��Ա����  Method
 		
    ��ȡClass�ļ�����ļ��ַ�ʽ��
    	1��Object���getClass()����
    	2���������͵ľ�̬����class
    	3��class��ľ�̬������public static class forName(String name);��������и����ַ����������ӿ�������� Class ����
 	
  һ��������˭�أ�
  	A���Լ����ʱ����ѡһ�֣��ڶ��ֱȽϷ��㡣
  	B��������ʱ�򣺵�����
  			Ϊʲô��?��Ϊ��������һ���ַ�����������һ������������������Ϳ��԰��������ַ������õ������ļ���ȥ��
 * @author ��Ԫ
 *
 */
public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		//��ʽ1
		Person p = new Person();
		Class clazzp = p.getClass();//��ȡClass�ļ�����
		
		System.out.println(clazzp);//class cn.itcast.b_�������.Person
		
		Person p2 = new Person();
		Class clazzp2 = p2.getClass();//class cn.itcast.b_�������.Person
		
		System.out.println(clazzp2);
		
		System.out.println(p==p2);//false  �Ƚϵ��Ƕ���
		System.out.println(clazzp==clazzp2);//true  �Ƚϵ���ͬһ�����Class����
		
		//��ʽ2
		Class clazzp3 = Person.class;
		//int.class;String.class;
		System.out.println(clazzp2==clazzp3);//true
		
		//��ʽ3
		Class clazzp4 = Class.forName("cn.itcast.b_�������.Person");
		System.out.println(clazzp2==clazzp4);//true
		
		//˵����ͬһ�����Class������һ����
	}
}
