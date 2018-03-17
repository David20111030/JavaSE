package a_Collection.gz.List.itcast_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * List���ϵ����й��ܣ�
 * A:��ӹ��ܣ�
 * 		void add(int index,Object element);��ָ��λ�����Ԫ��
 * B����ȡ���ܣ�
 * 		Object get(int index);��ȡָ��λ�õ�Ԫ��
 * C���б������
 * 		ListIterator listIterator();List�������еĵ�����
 * D��ɾ������
 * 		Object remove(int index);��������ɾ��Ԫ�أ����ر�ɾ����Ԫ��
 * E���޸Ĺ���
 * 		Object set(int index,Object element);���������޸�Ԫ�أ����ر��޸ĸõ�Ԫ��
 * 
 * 
 * List���ϵ����б������ܣ�
 * 			size()��get()�������ʹ��
 * 
 * 
 * @author ��Ԫ
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		test1();

		System.out.println("------test2()---------");

		test2();

		System.out.println("----test3()----");

		test3();
		
		
		System.out.println("-----test4()-----");
		test4();

		
		System.out.println("------test5()------");
		test5();
		
		
		System.out.println("--------test6()--------");
		test6();
		
		
		
		System.out.println("---------test7()----------");
		test7();
		
		
		System.out.println("---------test8()----------");
		test8();
		
	}

	// List���ϴ洢�ַ��������� List������һ���ӿ�
	public static void test1() {
		// ����List���϶���
		List list = new ArrayList();

		// �����ַ���������ַ���
		list.add("hello");
		list.add("world");
		list.add("java");

		// ��������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

	/**
	 * List���ϵ��ص㣺 ����(�洢��ȡ����Ԫ��һ��,Ҳ������Ϊ���Ƚ��ȳ�)�����ظ���
	 */
	public static void test2() {
		// ����List���϶���
		List list = new ArrayList();

		// �����ַ���������ַ���
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		list.add("hello");

		// ʹ�õ�������ʽ��������
		// ���Ȼ�ȡ����������
		Iterator it = list.iterator();
		// ����List����
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		/**
		 * �������: hello world java world hello
		 */

	}

	/**
	 * �洢�Զ�����󲢱���
	 */
	public static void test3() {
		// �������϶���
		List list = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("�׹Ǿ�", 30);
		Student s2 = new Student("֩�뾫", 40);
		Student s3 = new Student("����", 22);

		// ��ѧ��������ӵ����϶�����
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// ����
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		/**
		 ���������
		 	�׹Ǿ�---30
			֩�뾫---40
			����---22
		 */

	}

	
	
	/**
	 * List�������еĹ���
	 */
	public static void test4(){
		/**
		 * List���ϵ����й��ܣ�
		 * A:��ӹ��ܣ�
		 * 		void add(int index,Object element);��ָ��λ�����Ԫ��
		 * B����ȡ���ܣ�
		 * 		Object get(int index);��ȡָ��λ�õ�Ԫ��
		 * C���б������
		 * 		ListIterator listIterator();List�������еĵ�����
		 * D��ɾ������
		 * 		Object remove(int index);��������ɾ��Ԫ�أ����ر�ɾ����Ԫ��
		 * E���޸Ĺ���
		 * 		Object set(int index,Object element);���������޸�Ԫ�أ����ر��޸ĸõ�Ԫ��
		 */
		
		//����List����
		List list=new ArrayList();
		
		//���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//void add(int index,Object element);��ָ��λ�����Ԫ��
		/*
		 * ע�⣺�����ָ��λ�����Ԫ�ص�ʱ���������ֻ��Ϊ��ǰ������������Ԫ�ظ���+1����Сֻ��Ϊ0.���ϵ��±������һ�����Ǵ�0��ʼ���
		 */
		//list.add(1,"android");//�������ֱ�����û������
		//list.add(6,"javaee");//�������ֱ�����������
		//list.add(4,"javame");//�������ֱ�����������
		//list.add(3,"java");//�������ֱ�����û������
		//list.add(0,"java");//�������ֱ�����û������

		//Object get(int index);��ȡָ��λ�õ�Ԫ��
		System.out.println("get:"+list.get(2));//get:java
		//System.out.println("get:"+list.get(11));//IndexOutOfBoundsException����Խ���쳣
		
		//Object remove(int index);��������ɾ��Ԫ�أ����ر�ɾ����Ԫ��
		//System.out.println("remove:"+list.remove(2));//remove:java ��ʾ�����е�"java"Ԫ�ر�ɾ����
		//boolean remove(Object o);ɾ��������ָ����Ԫ�أ�д�ĸ�ɾ�ĸ�Ԫ�ء�����ֵ��ʾ�Ƿ�ɾ���ɹ�.���������û�и�Ԫ�أ��򷵻�false
		//System.out.println("remove:"+list.remove("hello"));//true
		//System.out.println("remove:"+list.remove("hel"));//false
		
		
		//Object set(int index,Object element);���������޸�Ԫ�أ����ر��޸ĸõ�Ԫ��
		System.out.println("set:"+list.set(1, "HELLO"));//set:world
		//System.out.println("set:"+list.set(12, "HELLO"));//IndexOutOfBoundsException:����Խ���쳣

		
	}
	
	
	
	/**
	 * List�������еı������ܣ�
	 * 		size()��get()�������ʹ�á�
	 * size();��ʾ���ϵĳ��ȡ�Ҳ���Ǽ����а�����Ԫ�ظ���
	 */
	public static void test5(){
		//�������϶���
		List list = new ArrayList();

		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		
		for(int i=0;i<list.size();i++){
			//String s=(String)list.get(i);
			//System.out.println(s);
			
			//����ֱ������һ�������(���´���ȼ����ϱ�ע�͵�����������)
			System.out.println(list.get(i));
		}
		/**
		  ���������
		  hello
		  world
		  java
		  world
		 */
	}
	
	
	/**
	 * �洢�Զ�����󲢱���������ͨforѭ������size()��get()��ϣ�
	 */
	public static void test6(){
		//�������϶���
		List list=new ArrayList();
		
		//����ѧ������
		Student s1 = new Student("������", 18);
		Student s2 = new Student("������", 88);
		Student s3 = new Student("������", 38);
		
		// ��ѧ����ӵ�������
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//����
		for(int i=0;i<list.size();i++){
			Student s=(Student)list.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
		}
		/**
		 �������:
		 	������---18
			������---88
			������---38
		 */

		
	}
	
	
	/**
	 * List�������еı�������
	 */
	public static void test7(){
		/*
		 �б��������
		 	ListIterator listIterator();List�������еĵ�������
		 		�õ������̳���Iterator�����������ԣ��Ϳ���ֱ��ʹ��hashNext()��next()������
		 		
		 	���й��ܣ�
		 		Object previous();��ȡ��һ��Ԫ��
		 		boolean hasPrevious();�ж��Ƿ���Ԫ��
		 	
		 	ע�⣺ListIterator����ʵ��������������Ǳ�������������������������������һ�������壬��ʹ�á�
		 */
		
		//����List���϶���
		List list= new ArrayList();
		//�����������Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//ListIterator listIterator();
		ListIterator lit=list.listIterator();//�������
		
		
		while(lit.hasNext()){
			String s=(String)lit.next();
			System.out.println(s);
		}
		/**
		 ���������
		 	hello
			world
			java
		 */
		
		//ע�⣺���û����ʵ����������Ļ�һ�����д����ǻ����ġ�
		/*System.out.println(lit.previous());//java  ListIterator����ʵ��������������Ǳ������������
		System.out.println(lit.previous());//world
		System.out.println(lit.previous());//hello
		*/
		System.out.println("��whileѭ��ʵ���������");
		
		while(lit.hasPrevious()){
			String s=(String)lit.previous();
			System.out.println(s);
		}
		/**
		 ���������
		 	java
			world
			hello
		 */
		
		System.out.println("�ò���List�������еĵ���������");
		// ������
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		/**
		 ���������
		 	hello
			world
			java
		 */
	}
	
	
	/**
	 * ����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�صġ�����������Ԫ�ص�ʱ��,����޸�Ԫ���أ�
	 *  ��ν����?
	 * 		A:����������Ԫ�أ��������޸�Ԫ��
	 * 			Ԫ���Ǹ��ڸղŵ�����Ԫ�غ���ġ�
	 * 		B:���ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
	 * 			Ԫ���������ӵġ�
	 */
	public static void test8(){
		// ����List���϶���
		List list = new ArrayList();
		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//����������
		/*Iterator it=list.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			if("world".equals(s)){
				list.add("javaee");//ConcurrentModificationException
				*//**
				 * �������д�ע�⣺����������Ԫ�ص�ʱ��ͨ�������ǲ����޸�Ԫ�صġ�
				 *//*
			}
		}*/
		
		
		// ��ʽ1������������Ԫ�أ��������޸�Ԫ��(ֻ��ʹ��List�������еĵ�����ListIterator����ʵ��)
		// ��Iterator������ȴû����ӹ��ܣ���������ʹ�����ӽӿ�ListIterator
		 ListIterator lit = list.listIterator();
		 while (lit.hasNext()) {
			 String s = (String) lit.next();
			 if ("world".equals(s)) {
				 lit.add("javaee");
			 }
		 }
		
		 //���������������е�Ԫ��
		 Iterator it1=list.iterator();
		 while(it1.hasNext()){
			 String s=(String)it1.next();
			 System.out.println(s);
		 }
		 /**
		  ���������
		  hello
		  world
		  javaee
		  java
		  */
		 
		 //��ʽ2�����ϱ���Ԫ�أ������޸�Ԫ��(��ͨfor)
		 for(int x=0;x<list.size();x++){
			 String s=(String)list.get(x);
			 if("java".equals(s)){
				 list.add("lixianyuan");
			 }
		 }
		 System.out.println("--<><><><><>---");
		 //���������������е�Ԫ��
		 Iterator it2=list.iterator();
		 while(it2.hasNext()){
			 String s=(String)it2.next();
			 System.out.println(s);
		 }
		 /**
		  ���������
		  	hello
			world
			javaee
			java
			lixianyuan
		  */
		 
		
	}
	
}
