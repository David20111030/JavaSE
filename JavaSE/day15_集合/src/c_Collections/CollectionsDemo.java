package c_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections:����Լ��Ͻ��в����Ĺ����࣬���Ǿ�̬������
 * 
 * �����⣺
 * Collection��Collections������
 * Collection:�ǵ��м��ϵĶ���ӿڣ����ӽӿ�List �� Set��
 * Collections:����Լ��ϲ����Ĺ����࣬�жԼ��Ͻ�������Ͷ��ֲ��ҵķ���
 * 
 * Ҫ֪���ķ�����
 * 	public static <T> void sort(List<T> list);Ĭ�����������Ȼ���� ��ָ���б������������
 * 
 *  
 * public static <T> int binarySearch(List<?> list,T key):���ֲ���   ʹ�ö�������������ָ���б��Ի��ָ������
 * 	              ע�⣺ʹ�ö��ֲ��ҵ�ǰ����Ҫ�ü��ϰ���С������˳���Ѿ�������˵Ĳ���ʹ�ø� ���ֲ��ҵķ���

 * public static <T> T max(Collection<?> coll):���ֵ   ����ָ���Ƚ���������˳�򣬷��ظ��� collection �����Ԫ�ء�
 * public static void reverse(List<?> list):��ת      ��תָ���б���Ԫ�ص�˳��
 * public static void shuffle(List<?> list):����û�     ʹ��Ĭ�����Դ��ָ���б�����û���
 * 
 * 
 * @author ��Ԫ
 *
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		test1();
		System.out.println("---test2()---");
		test2();
	}

	public static void test1() {
		//�������϶���
		List<Integer> list=new ArrayList<Integer>();
		
		//���Ԫ��
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("list:"+list);//list:[30, 20, 50, 10, 40]
		
		// public static <T> void sort(List<T> list)������ Ĭ�����������Ȼ˳��
		 Collections.sort(list);
		 System.out.println("list:" + list);// [10, 20, 30, 40, 50]
		 
		 
		// public static <T> int binarySearch(List<?> list,T key):���ֲ���   ʹ�ö�������������ָ���б��Ի��ָ������
		//ע�⣺ʹ�ö��ֲ��ҵ�ǰ����Ҫ�ü��ϰ���С������˳���Ѿ�������˵Ĳ���ʹ�ø� ���ֲ��ҵķ���
		int count=Collections.binarySearch(list, 10);
		int getResult=list.get(count);
		System.out.println(count);//0
		System.out.println(getResult);//10
		
		// public static <T> T max(Collection<?> coll):���ֵ
		System.out.println("max:"+Collections.max(list));//max:50

		// public static void reverse(List<?> list):��ת
		Collections.reverse(list);
	    System.out.println("list:" + list);//list:[50, 40, 30, 20, 10]
		
		//public static void shuffle(List<?> list):����û�
		Collections.shuffle(list);
		System.out.println("list:" + list);//�������������
		
		
		
	}
	
	
	/**
	 * Collections�������ArrayList�洢������װ���Ԫ�����򣬴洢�Զ������ɲ����������أ�
	 */
	private static void test2() {
		//�������϶���
		List<Student> list=new ArrayList<Student>();
		

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 30);
		Student s3 = new Student("������", 28);
		Student s4 = new Student("����", 29);
		Student s5 = new Student("����ϼ", 27);

		// ���Ԫ�ض���
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		// ����
		// ��Ȼ����  ʵ����Ȼ���򣬱���Ҫʵ��Comparable<T>�ӿ�  T��������Ҫʵ����Ȼ�������
		Collections.sort(list);
		for(Student stu:list){
			System.out.println(stu.getName()+":"+stu.getAge());
		}
		/**
	          ����ϼ:27
		����ϼ:27
		������:28
		����:29
		������:30
		*/
		
		//�Ƚ������� ����ʵ��Comparator�ӿ�
		//���ͬʱ����Ȼ����ͱȽ��������ԱȽ�������Ϊ��
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				//������Ӵ�С����
				int num=s2.getAge()-s1.getAge();
				int num2= num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
		});
		//����
		for(Student s:list){
			System.out.println(s.getName()+"--"+s.getAge());
		}
		/**
		������--30
		����--29
		������--28
		����ϼ--27
		 ����ϼ--27
		*/
		
		
	}
	
	

	
	
}
