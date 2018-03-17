package b_Scanner;

import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;

/**
 * Scanner:���ڽ��ռ���¼������
 * ǰ���ʱ��
 * 	A������
 * 	B����������
 *  C�����÷���
 *  
 * System������һ����̬���ֶΣ�
 * 		public static final InputStream in;
 * ��׼������������Ӧ�ż���¼��
 * 		InputStream is=System.in;
 * 
 * ���췽����
 * 		Scanner(InputStream source);
 * @author ��Ԫ
 *
 */
public class ScannerDemo {
//	public static void main(String[] args) {
//		//test1();
//		
//		//test2();
//	}
//	
	
	/**
	 * ���õ���������
	 * 		public int nextInt();��ȡһ��int���͵�ֵ
	 * 		public String nextLine();��ȡһ��String���͵�ֵ
	 * 
	 * ���������ˣ�
	 * 		�Ȼ�ȡһ����ֵ���ٻ�ȡһ���ַ�������������⡣
	 * 		��Ҫԭ�򣺾����Ǹ����з��ŵ����⡣
	 * ��ν���أ�(���ֽ����ʽ)
	 * 	A:�Ȼ�ȡһ����ֵ���ڴ���һ���µļ���¼������ȡ�ַ�����
	 *  B:�����е����ݶ��Ȱ����ַ�����ȡ��Ȼ��Ҫʲô����Ͷ�Ӧ��ת��Ϊʲô��
	 * 
	 * @throws Exception
	 */
	@Test
	public void testname() throws Exception {
		// ��������
		Scanner sc = new Scanner(System.in);

		// ��ȡ����int���͵�ֵ  �������� 
//		 int a1 = sc.nextInt();
//		 int b1 = sc.nextInt();
//		 System.out.println("a1:" + a1 + ",b1:" + b1);
//		 System.out.println("-------------------");

		// ��ȡ����String���͵�ֵ  ��������
		// String s1 = sc.nextLine();//��ȡ�û����������
		// String s2 = sc.nextLine();
		// System.out.println("s1:" + s1 + ",s2:" + s2);
		// System.out.println("-------------------");

		// �Ȼ�ȡһ���ַ������ڻ�ȡһ��intֵ   ����������
		// String s1 = sc.nextLine();//��ȡ�û�������ַ���
		// int b = sc.nextInt();//��ȡ�û������int���͵�����
		// System.out.println("s1:" + s1 + ",b:" + b);
		// System.out.println("-------------------");

		// �Ȼ�ȡһ��intֵ���ڻ�ȡһ���ַ���    �е������ˣ�71�еĴ����ִ�У�����72�еĴ��뱻ֱ������ִ����
		//int a = sc.nextInt();
		//String s2 = sc.nextLine();//���е�ʱ�򲻻�ִ��������䣬����ֱ��������������ֱ��ִ����������֮������
		// System.out.println("a:" + a + ",s2:" + s2);
		// System.out.println("-------------------");

		//��һ�ֽ����ʽ��A:�Ȼ�ȡһ����ֵ���ڴ���һ���µļ���¼������ȡ�ַ�����
		//int a = sc.nextInt();
		//Scanner sc2 = new Scanner(System.in);
		//String s = sc2.nextLine();
		//System.out.println("a:" + a + ",s:" + s);	
		
		//�ڶ��ֽ����ʽ    ����Ҫ��һ������������֣��ڶ������ַ���������ӡ����
		//B:�����е����ݶ��Ȱ����ַ�����ȡ��Ȼ��Ҫʲô����Ͷ�Ӧ��ת��Ϊʲô��
		int a = Integer.parseInt(sc.nextLine());
		String s =sc.nextLine(); 
		System.out.println("a:" + a + ",s:" + s);	
	}
	
	
	/**
	 * ������ʽ��
	 * 		public boolean hasNextXxx();�ж��Ƿ���ĳ�����͵�Ԫ��
	 * 		public Xxx nextXxx();��ȡ��Ԫ��
	 * 
	 * ��������int�����͵ķ�������
	 * 		public boolean hasNextInt();
	 * 		public int nextInt();
	 * 
	 * ע�⣺
	 * 		InputMismatchExceptiion:����ĺ�����Ҫ�Ĳ�ƥ��
	 * 
	 */
	public static void test2(){
		//��������
		Scanner sc=new Scanner(System.in);
		
		//��ȡ����
		if(sc.hasNextInt()){//�ж�����ĵ������Ƿ�Ϊint���͵�
			int x=sc.nextInt();//��ȡ���������
			System.out.println("x:"+x);
		}else{
			System.out.println("���������������");
		}
		
	}
	
	
	
	public static void test1(){
		//��������
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("x:"+x);
	}
	
}
