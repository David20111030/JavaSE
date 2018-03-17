package a_Collection.gz.List.List_����;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ����������͡� 
 * 		���������ͣ������͵�������һ���Ĵ��ݡ�
 * 	  ��ʽ��
 * 		<��������>
 * 		��������������ֻ�����������͡�	
 * 	�ô���
 * 		A��������ʱ�ڵ�������ǰ���˱����ڼ�
 * 		B��������ǿ������ת��
 * 		C���Ż��˳�����ƣ�����˻�ɫ������
 * 		
 * 		
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author ��Ԫ
 *
 */
public class GenericDemo {
	public static void main(String[] args) {
		test1();
		
		System.out.println("---test2()--");
		test2();
		
		System.out.println("---test3()---");
		test3();
		
		System.out.println("---test4()---");
		test4();
		
		
	
	}
	
	
	public static void test1(){
		//��������
		ArrayList<String> array=new ArrayList<String>();
		
		//���Ԫ��
		// ���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		//array.add(new Integer(100));�����������
		//array.add(10);//JDK5�Ժ���Զ�װ�䣬�ȼ��ڣ�array.add(Integer.valueOf(10));
		
		//����
		Iterator<String> it=array.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		/**
		 * ���������
		 * 	hello
			world
			java
		 */
		
		// �������������
		 String[] strArray = new String[3];
		 strArray[0] = "hello";
		 strArray[1] = "world";
		// strArray[2] = 10;//���������д�
		
	}
	
	/**
	 * ��������Щ�ط�ʹ���أ�
	 * 		��API������࣬�ӿڣ���������������<E>���ǻ���Ҫʹ�÷��͡�һ����˵�����ڼ�����ʹ�á�
	 */
	public static void test2(){
		//��ArrayList�洢�ַ���Ԫ�أ����������÷��͸Ľ�����
		ArrayList<String> array=new ArrayList<String>();
		
		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		System.out.println("����������");
		//ʹ�õ���������
		Iterator<String> it=array.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		
		System.out.println("��ͨfor����");
		//ʹ����ͨforѭ������  size()  get()
		for(int i=0;i<array.size();i++){
			String s=array.get(i);
			System.out.println(s);
		}
		
		System.out.println("��ǿfor����");
		//ʹ����ǿfor����
		for(String s:array){
			System.out.println(s);
		}
		
	}
	
	
	/**
	 * ���󣺴洢�Զ�����󲢱���
	 */
	public static void test3(){
		//�������϶���
		//JDK7�����ԣ������ƶ�. ���ǲ���������ʹ�á�
		//ArrayList<String> array=new ArrayList();
		ArrayList<Student> array=new ArrayList<Student>();
		
		//�����Զ���ѧ������
		Student s1 = new Student("�ܲ�", 40); // ��֪���
		Student s2 = new Student("����", 30); // ��֪����
		Student s3 = new Student("�����", 26);// ��֪�Ⱦ�
		
		//���Զ���ѧ��������ӵ�������
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		System.out.println("ʹ�õ���������");
		//ʹ�õ���������
		//���Ȼ�ȡ����������
		Iterator<Student> it=array.iterator();
		while(it.hasNext()){
			Student stu=it.next();
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
		
		System.out.println("ʹ����ͨfor����");
		//ʹ����ͨfor����
		for(int i=0;i<array.size();i++){
			Student stu=array.get(i);
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
		
		System.out.println("ʹ����ǿfor����");
		//ʹ����ǿfor����
		for(Student stu:array){
			System.out.println(stu.getName()+"---"+stu.getAge());			
		}
		
		
	}
	
	
	/**
	 * �����ʱ������ʹ��Object��������������͡�
	 * 
	 * ����ת����û���κ�����ģ�����������ת�͵�ʱ����ʵ����������ת�����⡣
	 * 
	 * Ҳ����˵�����ĳ�����ʵ�����ǰ�ȫ�ġ�����java��JDk5�������˷��ͣ�����˳���İ�ȫ�ԡ�
	 * 
	 */
	public static void test4(){
		ObjectTool ot=new ObjectTool();
		
		//����ʹ��
		ot.setObj(new Integer(27));
		Integer i=(Integer)ot.getObj();
		System.out.println("�����ǣ�"+i);//�����ǣ�27
		
		ot.setObj(new String("����ϼ"));
		String s=(String) ot.getObj();
		System.out.println("�����ǣ�"+s);//�����ǣ�����ϼ
		
		
		System.out.println("----");
		ot.setObj(new Integer(30));
		//ClassCastException
		//String ss=(String)ot.getObj();//���д����д�����ת���쳣
		//System.out.println("�����ǣ�"+ss);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
