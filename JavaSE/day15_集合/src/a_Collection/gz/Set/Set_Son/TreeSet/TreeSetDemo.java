package a_Collection.gz.Set.Set_Son.TreeSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * TreeSet:�ܹ���Ԫ�ذ���ĳ�ֹ����������
 * ���������ַ�ʽ��
 * 		A:��Ȼ����  
 * 			ʵ��Comparable�ӿ�
 * 		B:�Ƚ�������
 * 			ʵ��Comparator�ӿ�.������ͨ�������ڲ�����ʵ�ֱȽ�������
 * TreeSet���ϵ��ص㣺�����Ψһ��
 * 	ͨ���۲�TreeSet��add()����������֪������Ҫ��TreeMap��put����
 * @author ��Ԫ
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		test1();
		
		System.out.println("---test2()----");
		
		test2();
		
		System.out.println("---test3()---");
		test3();
		
		System.out.println("---test4()---");
		test4();
		
		System.out.println("---test5()---");
		test5();
		
	}
	
	/**
	 * ��Ȼ����
	 */
	public static void test1(){
		//�������϶���
		//��Ȼ˳���������
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		//����Ԫ�ز����
		// 20,18,23,22,17,24,19,18,24
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18);
		ts.add(24);
		
		//ʹ����ǿfor��������
		for(Integer i:ts){
			System.out.print(i+" ");
		}
		//���������17 18 19 20 22 23 24 
		
	}
	
	
	/**
	 * TreeSet�洢�Զ�����󲢱�֤�����Ψһ��
	 *	
	 *	A����û�и���������ô����
	 *			��Ȼ���򣬰��������С��������
	 *	B��Ԫ��ʲô�����Ψһ��Ҳû������
	 *			��Ա����ֵ����ͬ��Ϊͬһ��Ԫ��
	 *
	 * 
	 */
	public static void test2(){
		//�������϶���
		TreeSet<Student> ts=new TreeSet<Student>();
		
		//����Ԫ��
		// ����Ԫ��
		Student s1 = new Student("linqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("linqingxia", 27);
		Student s5 = new Student("liushishi", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingy", 22);

		// ���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		
		
		//����
		for(Student s:ts){
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
		/**
		 * ���������
		 * 	fengqingy---22
			liushishi---22
			wanglihong---23
			linqingxia---27
			zhangguorong---29
			wuqilong---40
		 */
		
		
	}
	
	
	
	/**
	 * ���󣺰��������ĳ���������Ȼ����
	 */
	public static void test3(){
		//�������϶���
		TreeSet<Student> ts=new TreeSet<Student>();
		
		//����Ԫ��
		Student s1 = new Student("linqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("linqingxia", 27);
		Student s5 = new Student("liushishi", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingy", 22);
		Student s8 = new Student("linqingxia", 29);

		//���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		//ʹ����ǿfor����
		for(Student s:ts){
			System.out.println(s.getName()+"--"+s.getAge());
		}
		/**
		 * ���������
		 * fengqingy--22
			liushishi--22
			wanglihong--23
			linqingxia--27
			linqingxia--29
			zhangguorong--29
			wuqilong--40
		 */
		
	}
	
	
	/**
	 * �����밴�������ĳ�������
	 * 
	 * TreeSet���ϱ�֤Ԫ�������Ψһ�Ե�ԭ��
	 * Ψһ�ԣ��Ǹ��ݱȽϵķ���ʱ����0������.��������ص���0����Ϊͬһ��Ԫ�أ�
	 * ����
	 * 		A����Ȼ����(Ԫ�ؾ߱��Ƚ���)
	 * 			��Ԫ����������ʵ����Ȼ����ӿ� Comparable��
	 * 		B���Ƚ�������(���Ͼ߱��Ƚ���)
	 * 			�ü��ϵĹ��췽������һ���Ƚ����ӿڵ��������Comparator
	 * 
	 */			
	public static void test4(){
		//�������϶���
		// public TreeSet(Comparator comparator) //�Ƚ�������
		//�Ƚ�������ĵ�һ��ʵ�ַ�ʽ
		//TreeSet<Student2> ts=new TreeSet<Student2>(new MyComparator());//�Ƚ�������
		
		
		//�Ƚ�������ĵڶ���ʵ�ַ�ʽ
		//���һ�������Ĳ����ǽӿڣ���ô����Ҫ���ǽӿڵ�ʵ����Ķ���
		//�������ڲ�����ǿ���ʵ���������
		TreeSet<Student2> ts=new TreeSet<Student2>(new Comparator<Student2>() {

			@Override
			public int compare(Student2 s1,  Student2 s2) {
				//��������
				int num=s1.getName().length()-s2.getName().length();
				//��������
				int num2= num==0?s1.getName().compareTo(s2.getName()):num;
				//����
				int num3= num2==0?s1.getAge()-s2.getAge():num2;
						
				return num3;
			}
		});
		
		
		// ����Ԫ��
		Student2 s1 = new Student2("linqingxia", 27);
		Student2 s2 = new Student2("zhangguorong", 29);
		Student2 s3 = new Student2("wanglihong", 23);
		Student2 s4 = new Student2("linqingxia", 27);
		Student2 s5 = new Student2("liushishi", 22);
		Student2 s6 = new Student2("wuqilong", 40);
		Student2 s7 = new Student2("fengqingy", 22);
		Student2 s8 = new Student2("linqingxia", 29);

		// ���Ԫ��
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// ʹ����ǿfor��������
		for (Student2 s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
		/**
		 * ���������
			wuqilong---40
			fengqingy---22
			liushishi---22
			linqingxia---27
			linqingxia---29
			wanglihong---23
			zhangguorong---29
		 */

	}

	
	/*
	 * ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ������������̨
	 * 
	 * ������
	 * 		A:����ѧ����
	 * 		B:����һ��TreeSet����
	 * 		C:�ִܷӸߵ������ʵ����?		
	 * 		D:����¼��5��ѧ����Ϣ
	 * 		E:����TreeSet����
	 * 
	 * ʹ�ñȽ�������(��ʵ�ֱȽ�������ӿ�Comparator)
	 */
	public static void test5(){
		//����һ��TreeSet����  ʹ�ñȽ�������(�ڶ���ʵ�ַ�ʽ)
		TreeSet<Student3> ts=new TreeSet<Student3>(new Comparator<Student3>() {

			@Override
			public int compare(Student3 s1, Student3 s2) {
				//�ִܷӸߵ���
				int num= s1.getSum()-s2.getSum();
				//�ܷ���ͬ�����ĳɼ���һ����ͬ
				int num2= num==0?s1.getChinese()-s1.getChinese():num;
				//���ĳɼ���ͬ����ѧ�ɼ���һ����ͬ
				int num3= num2==0?s1.getMath()-s2.getMath():num2;
				//��ѧ�ɼ���ͬ��Ӣ��ɼ���һ����ͬ
				int num4= num3==0?s1.getEnglish()-s2.getEnglish():num3;
				//Ӣ��ɼ���ͬ��������һ����ͬ
				int num5= num4==0?s1.getName().compareTo(s2.getName()):num4;
				
				return num5;//�������ֵΪ0�������Ԫ����ͬ������ӵ�������
			}
		});
		
		System.out.println("ѧ����Ϣ¼�뿪ʼ��");
		//����¼��5��ѧ����Ϣ
		for(int x=1;x<=5;x++){
			Scanner sc=new Scanner(System.in);
			System.out.println("�������"+x+"��ѧ��������");
			String name=sc.nextLine();
			System.out.println("�������" + x + "��ѧ�������ĳɼ�:");
			String chineseString = sc.nextLine();
			System.out.println("�������" + x + "��ѧ������ѧ�ɼ�:");
			String mathString = sc.nextLine();
			System.out.println("�������" + x + "��ѧ����Ӣ��ɼ�:");
			String englishString = sc.nextLine();
			
			//�����ݷ�װ��ѧ��������
			Student3 s=new Student3();
			s.setName(name);
			s.setChinese(Integer.parseInt(chineseString));
			s.setMath(Integer.parseInt(mathString));
			s.setEnglish(Integer.parseInt(englishString));
			
			//��ѧ��������ӵ�������
			ts.add(s);
		}
		
		System.out.println("ѧ����Ϣ¼����ϣ�");
		
		System.out.println("ѧ����Ϣ�Ӹߵ����������£�");
		System.out.println("����\t���ĳɼ�\t��ѧ�ɼ�\tӢ��ɼ�");
		
		//ʹ����ǿfor��������
		for(Student3 s:ts){
			System.out.println(s.getName() + "\t" + s.getChinese() + "\t"
					+ s.getMath() + "\t" + s.getEnglish());
		}
		
		
	}
	
	
	
	
	
	
	
	
}
