package a_Collection.gz.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator iterator();�����������ϵ�ר�ñ�����ʽ Object next();��ȡԪ�أ����ƶ�����һ��λ��
 * 
 * NoSucnElementException��û��������Ԫ�أ���Ϊ���Ѿ��ҵ������
 * 
 * boolean hasNext();�������Ԫ�ؿ��Ե�������Ϊtrue��
 * 
 * 
 * 
 * @author ��Ԫ
 * 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		// ���ϵı�����ʽ
		 //test1();
		
		// ���ϵ�һ����ϰ
		test2();

	}

	/**
	 * ���ϵı�����ʽ
	 */
	private static void test1() {
		// �������϶���
		Collection c = new ArrayList();

		// ���������Ԫ��
		String s = "hello";
		c.add(s);
		c.add("world");
		c.add("java");

		// Iterator iterator();�����������ϵ�ר�ñ�����ʽ
		Iterator it = c.iterator();// ʵ�ʷ��صĿ϶���������������Ƕ�̬

		// ��һ�ֱ�����ʽ������ͨ�ķ�ʽ���������е�Ԫ�أ�������ȱ��������׳���NoSucnElementException�쳣
		/*
		 * Object obj=it.next(); System.out.println(obj);//hello
		 * System.out.println(it.next());//world
		 * System.out.println(it.next());//java
		 * //System.out.println(it.next());//NoSucnElementException
		 * ���һ����Ӧ��д�����ԣ�����Ӧ����ÿ�λ�ȡǰ�������һ���жϾͺ���
		 */

		System.out.println("---------------");

		// �ڶ��ֱ�����ʽ ���ֱ�����ʽ�ϵ�һ�ַ�ʽ�ĺô��ǣ��������NoSuchElementException�쳣
		/*
		 * if(it.hasNext()){ System.out.println(it.next()); } if(it.hasNext()){
		 * System.out.println(it.next()); } if(it.hasNext()){
		 * System.out.println(it.next()); } if(it.hasNext()){
		 * System.out.println(it.next()); } if(it.hasNext()){
		 * System.out.println(it.next()); }
		 */

		// ������õı�����ʽ ʹ�õ��������� ���հ������ʽ
		while (it.hasNext()) {
			// System.out.println(it.next());
			String str = (String) it.next();
			System.out.println(str);
		}
	}

	/**
	 * ���ϵ���ϰ
	 */
	private static void test2() {
		/*
		 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ�����������
		 * 
		 * ע�⣺ A:�Լ���������Ҫ������ѧϰ��Ҫʹ�õ�API�е�������ͬ��
		 * B:���ƴ����ʱ�򣬺����װ��Ǹ������ڵİ�Ҳ������������׳��ֲ����������⡣
		 */

		// ��������
		Collection c = new ArrayList();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 18);
		Student s2 = new Student("������", 19);
		Student s3 = new Student("��ҹ", 21);
		Student s4 = new Student("����", 22);
		Student s5 = new Student("�ޱ�", 23);

		//��ѧ��������ӵ�������
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		// ʹ�õ������������м���
		// ���ȵû�ȡ����������
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "--" + s.getAge());
		}

		
		System.out.println("-----------");
		
		/*
		 * ����1:����whileѭ��д����������ܲ�����forѭ����?
		 * ����2:��Ҫ���ʹ��it.next()��������Ϊÿ��ʹ�ö��Ƿ���һ������
		 */
		//��forѭ������
		for(Iterator it2=c.iterator();it.hasNext();){
			Student stu=(Student)it.next();
			System.out.println(stu.getName()+"--"+stu.getAge());
		}
		
	}

}
