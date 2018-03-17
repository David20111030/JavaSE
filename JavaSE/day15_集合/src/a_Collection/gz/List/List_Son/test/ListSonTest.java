package a_Collection.gz.List.List_Son.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ListSonTest {
	public static void main(String[] args) {
		test1();
		
		System.out.println("----test2()----");
		
		test2();
		
		System.out.println("----test3()-----");
		
		test3();
		
	}
	
	/*
	 * ���ϵ�Ƕ�ױ���
	 * ����
	 * 		���ǰ���ѧ����ÿһ��ѧ���ǲ���һ�������������ǿ���ʹ��һ�����ϱ�ʾ���ǰ༶��ѧ����ArrayList<Student>
	 * 		�����أ������Ա��ǲ��ǻ��а༶��ÿ���༶�ǲ���Ҳ��һ��ArrayList<Student>��
	 * 		���������ж��ArrayList<Student>��ҲҪ�ü��ϴ洢����ô����?
	 * 		����������ӵģ�ArrayList<ArrayList<Student>>
	 */
	public static void test1(){
		 //�����󼯺�
		ArrayList<ArrayList<Student>> bigArrayList=new ArrayList<ArrayList<Student>>();
		
		//������һ���༶��ѧ������
		ArrayList<Student> firstArrayList=new ArrayList<Student>();
		//����ѧ��
		Student s1 = new Student("��ɮ", 30);
		Student s2 = new Student("�����", 29);
		Student s3 = new Student("��˽�", 28);
		Student s4 = new Student("ɳɮ", 27);
		Student s5 = new Student("������", 26);		
		
		//ѧ������һ���༶
		firstArrayList.add(s1);
		firstArrayList.add(s2);
		firstArrayList.add(s3);
		firstArrayList.add(s4);
		firstArrayList.add(s5);
		
		//�ѵ�һ���༶�洢��ѧ��ϵͳ��
		bigArrayList.add(firstArrayList);
		
		// �����ڶ����༶��ѧ������
		ArrayList<Student> secondArrayList = new ArrayList<Student>();
		// ����ѧ��
		Student s11 = new Student("�����", 30);
		Student s22 = new Student("˾��ܲ", 28);
		Student s33 = new Student("���", 26);
		// ѧ������
		secondArrayList.add(s11);
		secondArrayList.add(s22);
		secondArrayList.add(s33);
		// �ѵڶ����༶�洢��ѧ��ϵͳ��
		bigArrayList.add(secondArrayList);

		// �����������༶��ѧ������
		ArrayList<Student> thirdArrayList = new ArrayList<Student>();
		// ����ѧ��
		Student s111 = new Student("�ν�", 40);
		Student s222 = new Student("����", 35);
		Student s333 = new Student("��ٴ", 30);
		Student s444 = new Student("��ʦʦ", 22);
		// ѧ������
		thirdArrayList.add(s111);
		thirdArrayList.add(s222);
		thirdArrayList.add(s333);
		thirdArrayList.add(s444);
		// �ѵ������༶�洢��ѧ��ϵͳ��
		bigArrayList.add(thirdArrayList);		
		
		
		//��������
		for(ArrayList<Student> stu:bigArrayList){
			for(Student s:stu){
				System.out.println(s.getName()+"---"+s.getAge());
			}
		}
		/**
		 * ���������
		 * 	��ɮ---30
			�����---29
			��˽�---28
			ɳɮ---27
			������---26
			�����---30
			˾��ܲ---28
			���---26
			�ν�---40
			����---35
			��ٴ---30
			��ʦʦ---22
		 */
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	/*
	 * ��ȡ10��1-20֮����������Ҫ�����ظ�
	 * 
	 * ������ʵ�֣���������ĳ����ǹ̶��ģ����Ȳ���ȷ����
	 * ��������ʹ�ü���ʵ�֡�
	 * 
	 * ������
	 * 		A:��������������Ķ���
	 * 		B:����һ���洢������ļ��ϡ�
	 * 		C:����һ��ͳ�Ʊ�������0��ʼ��
	 * 		D:�ж�ͳ�Ʊ����Ƿ�С��10
	 * 			��:�Ȳ���һ����������жϸ�������ڼ������Ƿ���ڡ�
	 * 					���������:����ӣ�ͳ�Ʊ���++��
	 * 					�������:�Ͳ���������
	 * 			�񣺲�������
	 * 		E:��������
	 */	
	public static void test2(){
		//��������������Ķ���
		Random r=new Random();
		
		//����һ���洢������ļ���
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		//����һ��ͳ�Ʊ�������0��ʼ
		for(int count=0;count<10;count++){
			int a=r.nextInt(21);
			if(!array.contains(a)){
				array.add(a);
			}else{
				count--;
			}
		}
		
		//��������
		Iterator it=array.iterator();
		while(it.hasNext()){
			int a=(int)it.next();
			System.out.print(a+" ");
		}
	}
	
	
	/*
	 * ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
	 * 
	 * ������
	 * 		A:��������¼�����ݶ���
	 * 		B:����¼��������,���ǲ�֪�����ٸ��������ü��ϴ洢
	 * 		C:��0����,����򵥣�ֻҪ����¼���������0���ҾͲ�����¼��������
	 * 		D:�Ѽ���ת������
	 * 		E:����������
	 * 		F:��ȡ�������е����������ֵ
	 */	
	public static void test3(){
		//��������¼�����
		Scanner sc=new Scanner(System.in);
		
		//����¼�������ݣ����ǲ�֪�����ٸ��������ü��ϴ洢
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		//��0����,����򵥣�ֻҪ����¼���������0���ҾͲ�����¼��������
		while(true){
			System.out.println("����������:");
			int number=sc.nextInt();
			if(number==0){
				break;
			}else{
				array.add(number);
			}
		}
		
		
		
		//�Ѽ���ת������
		Object[] arr=array.toArray();
		
		//���ַ���Ҳ����  ����һ��   Arrays����ר�����ڲ�������Ĺ�����
		Arrays.sort(arr);
		System.out.println("���ֵΪ:"+arr[arr.length-1]);
		
		//������
		int max=(int)arr[0];
		//�������������
		for(int i=0;i<arr.length;i++){
			if((int)arr[i]>max){
				max=(int)arr[i];
			}
		}
		
		System.out.println("����������ֵΪ��"+max);
		
		
		
		
	}
	
	
	
	
	
}
