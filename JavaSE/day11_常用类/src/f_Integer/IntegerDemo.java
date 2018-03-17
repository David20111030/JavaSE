package f_Integer;

import org.junit.Test;

public class IntegerDemo {
	
	/*
	 * ����1����Ҫ���Ұ�100������ݵĶ����ƣ��˽��ƣ�ʮ�����Ƽ������
	 * ����2����Ҫ�����ж�һ�������Ƿ���int��Χ�ڵġ�
	 * 		�������֪��int�ķ�Χ�Ƕ��?
	 * 
	 * Ϊ�˶Ի����������ͽ��и���Ĳ�����������Ĳ�����Java�����ÿһ�ֻ������������ṩ�˶�Ӧ�������͡���װ�����͡�
	 * byte 			Byte
	 * short			Short
	 * int				Integer
	 * long				Long
	 * float			Float
	 * double			Double
	 * char				Character
	 * boolean			Boolean
	 * 
	 * ���ڻ��������������ַ���֮���ת����
	 */
	@Test
	public void test1() throws Exception {
		// ���鷳�ľ�����
		// public static String toBinaryString(int i)  ������
		System.out.println(Integer.toBinaryString(100));//1100100
		// public static String toOctalString(int i)  �˽���
		System.out.println(Integer.toOctalString(100));//144
		// public static String toHexString(int i)  ʮ������
		System.out.println(Integer.toHexString(100));//64
		
		// public static final int MAX_VALUE  Integer���͵��������ܱ�ʾ�����ֵ
		System.out.println(Integer.MAX_VALUE);//2147483647
		// public static final int MIN_VALUE   Integer���͵��������ܱ�ʾ����Сֵ
		System.out.println(Integer.MIN_VALUE);//-2147483648
		
		//public static String toString(int i,int radix);�����õڶ�������ָ��������ʾ�ĵ�һ���������ַ�����ʾ��ʽ��
		System.out.println(Integer.toString(8, 2));//1000    �����ʾ��8��2����������ʽ��ʾ���ַ���
	}
	
	
	/*
	 * Integer�Ĺ��췽����
	 * 		public Integer(int value);
	 * 		public Integer(String s);���ַ���ת����Integer���͵����ݡ�ע�⣺����ַ����������������ַ����
	 */
	@Test
	public void test2() throws Exception {
		//��ʽ1
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii��"+ii);//ii:100
		
		//��ʽ2��
		String s="100";
		// NumberFormatException   ע�⣺����ַ����������������ַ����
		//s = "abc";
		Integer iii = new Integer(s);
		System.out.println("iii:"+(iii+1));//iii:101
		
	}
	
	/*
	 * int���ͺ�String���͵��໥ת��
	 * 
	 * int --> String   ��int���͵�����ת����String���͵�����
	 * 		String.valueOf(number);
	 * 
	 * String --> int   ��String���͵�����ת��Ϊint���͵�����
	 * 		Integer.parseInt(s);
	 */
	@Test
	public void test3() throws Exception {
		// int --> String
		int number = 100;
		// ��ʽ1
		String s1 = "" + number;
		System.out.println("s1:" + s1);
		// ��ʽ2
		String s2 = String.valueOf(number);
		System.out.println("s2:" + s2);
		// ��ʽ3
		// int --> Integer --> String
		Integer i = new Integer(number);
		String s3 = i.toString();
		System.out.println("s3:" + s3);
		// ��ʽ4
		// public static String toString(int i)
		String s4 = Integer.toString(number);
		System.out.println("s4:" + s4);
		System.out.println("-----------------");

		// String --> int
		String s = "100";
		// ��ʽ1
		// String --> Integer --> int
		Integer ii = new Integer(s);
		// public int intValue()
		int x = ii.intValue();
		System.out.println("x:" + x);
		//��ʽ2
		//public static int parseInt(String s)
		int y = Integer.parseInt(s);
		System.out.println("y:"+y);
	}
	
	
	
	/**
	 * ���õĻ�������ת��:ͨ��Integer����ʵ��
	 * 		public static String toBinaryString(int i);  ������
	 * 		public static String toOctalString(int i);�˽���
	 * 		public static String toHexString(int i); ʮ������ 
	 * 
	 * ʮ���Ƶ���������
	 * 		public static String toString(int i,int radix);��һ������i��ʾ��Ҫת�������֣��ڶ�������radix��ʾ��Ҫת���ĸ�����
	 * ���������Ҳ�����˽��Ƶķ�Χ��2-36
	 * Ϊʲô��?0,...9,a...z
	 * 
	 * �������Ƶ�ʮ����
	 * 		public static int parseInt(String s,int radix);����s��ʾ��Ҫת����ʮ���Ƶ�����radix��ʾ����s�Ǽ�������
	 */
	@Test
	public void test_convert() throws Exception {
		// ʮ���Ƶ������ƣ��˽��ƣ�ʮ������
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("-------------------------");

		// ʮ���Ƶ���������
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, 7));
		System.out.println(Integer.toString(100, -7));
		System.out.println(Integer.toString(100, 70));
		System.out.println(Integer.toString(100, 1));
		System.out.println(Integer.toString(100, 17));
		System.out.println(Integer.toString(100, 32));
		System.out.println(Integer.toString(100, 37));
		System.out.println(Integer.toString(100, 36));
		System.out.println("-------------------------");
		
		System.out.println("�������Ƶ�ʮ����-----------------");
		//�������Ƶ�ʮ����
		System.out.println(Integer.parseInt("100", 10));//100    ��ʾ10������"100"ת����10������
		System.out.println(Integer.parseInt("100", 2));//4 ��ʾ��������100ת����ʮ������
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("100", 23));
		//NumberFormatException
		//System.out.println(Integer.parseInt("123", 2));
	}
	
	
	/*
	 * JDK5��������
	 * 		�Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
	 * 		�Զ����䣺�Ѱ�װ������ת��Ϊ��������
	 * 
	 * ע��һ��С���⣺
	 * 		��ʹ��ʱ��Integer  x = null;����ͻ����NullPointerException��
	 * 		�������ж��Ƿ�Ϊnull��Ȼ����ʹ�á�
	 */
	@Test
	public void test_chai_zhuang() throws Exception {
		// ������һ��int���͵İ�װ�����ͱ���i
		// Integer i = new Integer(100);
		Integer ii = 100;
		ii += 200;
		System.out.println("ii:" + ii);

		// ͨ���������Ĵ���
		// Integer ii = Integer.valueOf(100); //�Զ�װ��
		// ii = Integer.valueOf(ii.intValue() + 200);//=�� ii=ii+20 //���Զ����䣬���Զ�װ��
		// System.out.println((new StringBuilder("ii:")).append(ii).toString());

		Integer iii = null;
		// NullPointerException
		if (iii != null) {
			iii += 1000;
			System.out.println(iii);
		}
	}
	
	
	/**
	 * һ����Ҫ��֪ʶ�㣺
	 * ������д���
	 * 
	 * ע�⣺Integer������ ֱ�Ӹ�ֵ�������-128��127֮�䣬��ֱ�Ӵӻ�������ȡ����
	 */
	@Test
	public void test_App() throws Exception {
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);//false
		System.out.println(i1.equals(i2));//true
		System.out.println("-----------");

		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);//false
		System.out.println(i3.equals(i4));//true
		System.out.println("-----------");

		//ע�⣺Integer������ ֱ�Ӹ�ֵ�������-128��127֮�䣬��ֱ�Ӵӻ�������ȡ����
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);//false
		System.out.println(i5.equals(i6));//true
		System.out.println("-----------");

		Integer i7 = 127;
		Integer i8 = 127;
		System.out.println(i7 == i8);//true
		System.out.println(i7.equals(i8));//true

		// ͨ���鿴Դ�룬���Ǿ�֪���ˣ����-128��127֮������ݣ�����һ�����ݻ���أ���������Ǹ÷�Χ�ڵģ�ÿ�β��������µĿռ�
		// Integer ii = Integer.valueOf(127);
	}
}
