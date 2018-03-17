package a_Collection.gz.List.List_Son.ArrayList_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * List�������ص㣺
 * 		ArrayList��
 * 			�ײ����ݽṹ�����ݣ���ѯ�죬��ɾ����
 * 			�̲߳���ȫ��Ч�ʸߡ�
 * 		
 * 		Vector��
 * 			�ײ����ݽṹ�����飬��ѯ�죬��ɾ����
 * 			�̰߳�ȫ��Ч�ʵ͡�
 * 		
 * 		LinkedList��
 * 			�ײ����ݽṹ��������ѯ������ɾ��
 * 			�̲߳���ȫ��Ч�ʸߡ�
 * 
 * 
 * 
 * 
 * 
 * 
 * ArrayList��ʹ�á��洢�ַ���������
 *
 *ClassCastException������ת���쳣��ע�⣬ǧ��Ҫ��������͡�
 * @author ��Ԫ
 *
 */
public class ArrayListDemo01 {
	public static void main(String[] args) {
		
		test1();
		
		System.out.println("----test2()----");
		
		test2();
		
		System.out.println("----test3()-----");
		test3();
		
		System.out.println("---test4()----");
		test4();
		
		System.out.println("------test5()------");
		test5();
		
		
		
	}
	
	/**
	 * ArrayList��ʹ�á��洢�ַ���������
	 */
	public static void test1(){
		//�������϶���
		ArrayList array=new ArrayList();
		
		//����Ԫ�ض��󣬲����Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//ʹ�õ�������������
		//���ȵû�ȡ����������
		Iterator it=array.iterator();
		while(it.hasNext()){//�жϼ����Ƿ���Ԫ��
			String s=(String)it.next();//��ȡԪ��
			System.out.println(s);
		}
		/**
		 ���������
		 	hello
			world		
			java
		 */
		
		//ʹ��forѭ������
		for(int i=0;i<array.size();i++){
			String s=(String)array.get(i);
			System.out.println(s);
		}
		/**
		 * ���������
		 * 	hello
		 *  world
		 *  java
		 */
	}
	
	
	/**
	 * ArrayList�洢�Զ�����󲢱���
	 */
	public static void test2(){
		//�������϶���
		ArrayList array=new ArrayList();
		
		//����ѧ������
		Student s1 = new Student("����", 30);
		Student s2 = new Student("³����", 40);
		Student s3 = new Student("�ֳ�", 36);
		Student s4 = new Student("��־", 38);
			
		//��ѧ��������ӵ�������
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		//ʹ�õ���������
		//���Ȼ�ȡ����������
		Iterator it=array.iterator();
		//����
		while(it.hasNext()){
			Student stu=(Student)it.next();
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
		/**
		 * ���������
		 * 	����---30
			³����---40
			�ֳ�---36
			��־---38
		 */
		
		
		//ʹ��forѭ������
		for(int i=0;i<array.size();i++){
			Student stu=(Student)array.get(i);
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
		/**
		 * ���������
		 * 	³����---40
			�ֳ�---36
			��־---38
		 */
		
		
	}

	
	/*
	 * ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
	 * 
	 * ������
	 * 		A:�������϶���
	 * 		B:��Ӷ���ַ���Ԫ��(����������ͬ��)
	 * 		C:�����¼���
	 * 		D:�����ɼ���,��ȡ�õ�ÿһ��Ԫ��
	 * 		E:�����Ԫ�ص��¼���ȥ�ң�����û��
	 * 			�У���������
	 * 			û�У�����ӵ��¼���
	 * 		F:�����¼���
	 */
	public static void test3(){
		//�������϶���
		ArrayList array=new ArrayList();
		
		//��Ӷ���ַ���Ԫ��(����������ͬ��)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		
		//�����¼���
		ArrayList newArray=new ArrayList();
		
		//�����ɼ��ϣ���ȡÿһ��Ԫ��
		//��ȡ����������
		Iterator it=array.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			// �����Ԫ�ص��¼���ȥ�ң�����û��
			if(!newArray.contains(s)){
				newArray.add(s);
			}
		}
		
		//�����¼���
		for(int x=0;x<newArray.size();x++){
			String s=(String)newArray.get(x);
			System.out.println(s);
		}
		/**
		 * ���������
		 * 	hello
			world
			java
		 */
		
		
	}
	
	
	
	
	/*
	 * ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
	 * Ҫ�󣺲��ܴ����µļ��ϣ�������ǰ�ļ���������
	 */
	public static void test4(){
		//�������϶���
		ArrayList array=new ArrayList();
		
		//��Ӷ���ַ���Ԫ��(����������ͬ��)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		
		//��ΪList������ʹ�õ�����������ʱ���ǲ����޸ļ����е�Ԫ�صģ�����Ӧ������ͨforȥ��������
		// ��ѡ������˼�����룬���ǾͿ���ͨ������˼���������Ŀ
		// ��0���������κͺ���ıȽϣ��оͰѺ�ĸɵ�
		// ͬ����1����...
		for(int x=0;x<array.size()-1;x++){
			for(int y=x+1;y<array.size();y++){
				if(array.get(x).equals(array.get(y))){
					array.remove(y);
					y--;
				}
			}
		}
		
		//ʹ�õ�������������
		Iterator it=array.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}		
	}
	
	
	
	/*
	 * ����ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
	 * 
	 * ���ǰ��պ��ַ���һ���Ĳ��������ֳ������ˡ�
	 * Ϊʲô��?
	 * 		���Ǳ���˼������������?
	 * 		ͨ���򵥵ķ���������֪��������������ж��ϡ�
	 * 		������жϹ����Ǽ����Լ��ṩ�ģ��������������������֪����������жϵģ���Ӧ��ȥ��Դ�롣
	 * contains()�����ĵײ���������equals()������
	 * �����ǵ�ѧ������û��equals()���������ʱ��Ĭ��ʹ�õ���������Object��equals()����
	 * Object()��equals()Ĭ�ϱȽϵ��ǵ�ֵַ�����ԣ����ǽ�ȥ�ˡ���Ϊnew�Ķ�������ֵַ����ͬ��
	 * ���������Լ������󣬱Ƚϳ�Ա������ֵ����дequals()���ɡ�
	 * �Զ����ɼ��ɡ�
	 */
	public static void test5(){
		// �������϶���
		ArrayList array = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("��־��", 40);
		Student s3 = new Student("���", 35);
		Student s4 = new Student("ܽ�ؽ��", 18);
		Student s5 = new Student("�仨", 16);
		Student s6 = new Student("����ϼ", 27);
		Student s7 = new Student("����ϼ", 18);

		// ���Ԫ��
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);

		// �����¼���
		ArrayList newArray = new ArrayList();

		// �����ɼ���,��ȡ�õ�ÿһ��Ԫ��
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();

			// �����Ԫ�ص��¼���ȥ�ң�����û��
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		// �����¼���
		for (int x = 0; x < newArray.size(); x++) {
			Student s = (Student) newArray.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
