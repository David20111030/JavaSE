package i_Math;

import java.util.Scanner;

import org.junit.Test;

public class MathDemo {

	/*
	 * Math:������ѧ������ࡣMath ���������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ����� 
	 * ��Ա������
	 * 		public static final double PI  ����Բ���ʵ��Ǹ���
	 * 		public static final double E    ���κ�����ֵ�����ӽ� e������Ȼ�����ĵ������� double ֵ��
	 * ��Ա������
	 *		public static double random():����� [0.0,1.0)  ���������һ��Ŷ���е���Ҫ   
	 *
	 * 		public static int abs(int a)������ֵ
	 *		public static double ceil(double a):����ȡ��
	 *		public static double floor(double a):����ȡ��
	 *		public static int max(int a,int b):���ֵ (min��ѧ)
	 *		public static double pow(double a,double b):a��b����
	 *		public static int round(float a) ��������(����Ϊdouble����ѧ)
	 *		public static double sqrt(double a):��ƽ����
	 */
	@Test
	public void testname() throws Exception {
		// public static final double PI
		System.out.println("PI:" + Math.PI);//PI:3.141592653589793
		// public static final double E
		System.out.println("E:" + Math.E);//E:2.718281828459045
		System.out.println("--------------");

		// public static int abs(int a)������ֵ
		System.out.println("abs:" + Math.abs(10));
		System.out.println("abs:" + Math.abs(-10));
		System.out.println("--------------");

		// public static double ceil(double a):����ȡ��
		System.out.println("ceil:" + Math.ceil(12.34));
		System.out.println("ceil:" + Math.ceil(12.56));
		System.out.println("--------------");

		// public static double floor(double a):����ȡ��
		System.out.println("floor:" + Math.floor(12.34));
		System.out.println("floor:" + Math.floor(12.56));
		System.out.println("--------------");

		// public static int max(int a,int b):���ֵ
		System.out.println("max:" + Math.max(12, 23));
		// ������Ҫ��ȡ���������е����ֵ
		// ������Ƕ�׵���
		System.out.println("max:" + Math.max(Math.max(12, 23), 18));
		// ������Ҫ��ȡ�ĸ������е����ֵ
		System.out.println("max:"
				+ Math.max(Math.max(12, 78), Math.max(34, 56)));
		System.out.println("--------------");

		// public static double pow(double a,double b):a��b����
		System.out.println("pow:" + Math.pow(2, 3));
		System.out.println("--------------");

		// public static double random():����� [0.0,1.0)
		System.out.println("random:" + Math.random());//[0,1) ֮���С��
		// ��ȡһ��1-100֮��������
		System.out.println("random:" + ((int) (Math.random() * 100) + 1));
		System.out.println("--------------");

		// public static int round(float a) ��������(����Ϊdouble����ѧ)
		System.out.println("round:" + Math.round(12.34f));
		System.out.println("round:" + Math.round(12.56f));
		System.out.println("--------------");
		
		//public static double sqrt(double a):��ƽ����
		System.out.println("sqrt:"+Math.sqrt(4));
	}
	
	
	
	
	/**
	 * һ������
	 *
	 * ���������һ������������ʵ�ֻ�ȡ���ⷶΧ�ڵ��������
	 * 
	 * ������
	 * 		A:����¼���������ݡ�
	 * 			int strat;
	 * 			int end;
	 * 		B:��취��ȡ��start��end֮��������
	 * 			��дһ������ʵ�����Ч�����õ�һ���������(int)
	 * 		C:�����������
	 */
	@Test
	public void test2() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ����");
		int start = sc.nextInt();
		System.out.println("�������������");
		int end = sc.nextInt();

		for (int x = 0; x < 100; x++) {
			// ���ù���
			int num = getRandom(start, end);
			// ������
			System.out.println(num);
		}
	}
	/*
	 * дһ������ ������ȷ�� ����ֵ���ͣ�int �����б�int start,int end
	 */
	public static int getRandom(int start, int end) {
		// �������ǽ�����1-100֮��������
		// int number = (int) (Math.random() * 100) + 1;
		// int number = (int) (Math.random() * end) + start;
		// �����������ˣ���ô����?
		int number = (int) (Math.random() * (end - start + 1)) + start;
		return number;
	}
	
}
