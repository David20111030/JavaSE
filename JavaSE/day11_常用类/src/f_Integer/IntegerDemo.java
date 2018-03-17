package f_Integer;

import org.junit.Test;

public class IntegerDemo {
	
	/*
	 * 需求1：我要求大家把100这个数据的二进制，八进制，十六进制计算出来
	 * 需求2：我要求大家判断一个数据是否是int范围内的。
	 * 		首先你的知道int的范围是多大?
	 * 
	 * 为了对基本数据类型进行更多的操作，更方便的操作，Java就针对每一种基本数据类型提供了对应的类类型。包装类类型。
	 * byte 			Byte
	 * short			Short
	 * int				Integer
	 * long				Long
	 * float			Float
	 * double			Double
	 * char				Character
	 * boolean			Boolean
	 * 
	 * 用于基本数据类型与字符串之间的转换。
	 */
	@Test
	public void test1() throws Exception {
		// 不麻烦的就来了
		// public static String toBinaryString(int i)  二进制
		System.out.println(Integer.toBinaryString(100));//1100100
		// public static String toOctalString(int i)  八进制
		System.out.println(Integer.toOctalString(100));//144
		// public static String toHexString(int i)  十六进制
		System.out.println(Integer.toHexString(100));//64
		
		// public static final int MAX_VALUE  Integer类型的数据所能表示的最大值
		System.out.println(Integer.MAX_VALUE);//2147483647
		// public static final int MIN_VALUE   Integer类型的数据所能表示的最小值
		System.out.println(Integer.MIN_VALUE);//-2147483648
		
		//public static String toString(int i,int radix);返回用第二个参数指定基数表示的第一个参数的字符串表示形式。
		System.out.println(Integer.toString(8, 2));//1000    这个表示将8以2进制数的形式表示成字符串
	}
	
	
	/*
	 * Integer的构造方法：
	 * 		public Integer(int value);
	 * 		public Integer(String s);将字符串转换成Integer类型的数据。注意：这个字符串必须是由数字字符组成
	 */
	@Test
	public void test2() throws Exception {
		//方式1
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii："+ii);//ii:100
		
		//方式2：
		String s="100";
		// NumberFormatException   注意：这个字符串必须是由数字字符组成
		//s = "abc";
		Integer iii = new Integer(s);
		System.out.println("iii:"+(iii+1));//iii:101
		
	}
	
	/*
	 * int类型和String类型的相互转换
	 * 
	 * int --> String   将int类型的数据转换成String类型的数据
	 * 		String.valueOf(number);
	 * 
	 * String --> int   将String类型的数据转换为int类型的数据
	 * 		Integer.parseInt(s);
	 */
	@Test
	public void test3() throws Exception {
		// int --> String
		int number = 100;
		// 方式1
		String s1 = "" + number;
		System.out.println("s1:" + s1);
		// 方式2
		String s2 = String.valueOf(number);
		System.out.println("s2:" + s2);
		// 方式3
		// int --> Integer --> String
		Integer i = new Integer(number);
		String s3 = i.toString();
		System.out.println("s3:" + s3);
		// 方式4
		// public static String toString(int i)
		String s4 = Integer.toString(number);
		System.out.println("s4:" + s4);
		System.out.println("-----------------");

		// String --> int
		String s = "100";
		// 方式1
		// String --> Integer --> int
		Integer ii = new Integer(s);
		// public int intValue()
		int x = ii.intValue();
		System.out.println("x:" + x);
		//方式2
		//public static int parseInt(String s)
		int y = Integer.parseInt(s);
		System.out.println("y:"+y);
	}
	
	
	
	/**
	 * 常用的基本进制转换:通过Integer类来实现
	 * 		public static String toBinaryString(int i);  二进制
	 * 		public static String toOctalString(int i);八进制
	 * 		public static String toHexString(int i); 十六进制 
	 * 
	 * 十进制到其他进制
	 * 		public static String toString(int i,int radix);第一个参数i表示你要转换的数字，第二个参数radix表示你要转成哪个进制
	 * 由这个我们也看到了进制的范围：2-36
	 * 为什么呢?0,...9,a...z
	 * 
	 * 其他进制到十进制
	 * 		public static int parseInt(String s,int radix);参数s表示你要转换到十进制的数，radix表示参数s是几进制数
	 */
	@Test
	public void test_convert() throws Exception {
		// 十进制到二进制，八进制，十六进制
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("-------------------------");

		// 十进制到其他进制
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
		
		System.out.println("其他进制到十进制-----------------");
		//其他进制到十进制
		System.out.println(Integer.parseInt("100", 10));//100    表示10进制数"100"转换成10进制数
		System.out.println(Integer.parseInt("100", 2));//4 表示二进制数100转换成十进制数
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("100", 23));
		//NumberFormatException
		//System.out.println(Integer.parseInt("123", 2));
	}
	
	
	/*
	 * JDK5的新特性
	 * 		自动装箱：把基本类型转换为包装类类型
	 * 		自动拆箱：把包装类类型转换为基本类型
	 * 
	 * 注意一个小问题：
	 * 		在使用时，Integer  x = null;代码就会出现NullPointerException。
	 * 		建议先判断是否为null，然后再使用。
	 */
	@Test
	public void test_chai_zhuang() throws Exception {
		// 定义了一个int类型的包装类类型变量i
		// Integer i = new Integer(100);
		Integer ii = 100;
		ii += 200;
		System.out.println("ii:" + ii);

		// 通过反编译后的代码
		// Integer ii = Integer.valueOf(100); //自动装箱
		// ii = Integer.valueOf(ii.intValue() + 200);//=》 ii=ii+20 //先自动拆箱，再自动装箱
		// System.out.println((new StringBuilder("ii:")).append(ii).toString());

		Integer iii = null;
		// NullPointerException
		if (iii != null) {
			iii += 1000;
			System.out.println(iii);
		}
	}
	
	
	/**
	 * 一个重要的知识点：
	 * 看程序写结果
	 * 
	 * 注意：Integer的数据 直接赋值，如果在-128到127之间，会直接从缓冲池里获取数据
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

		//注意：Integer的数据 直接赋值，如果在-128到127之间，会直接从缓冲池里获取数据
		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);//false
		System.out.println(i5.equals(i6));//true
		System.out.println("-----------");

		Integer i7 = 127;
		Integer i8 = 127;
		System.out.println(i7 == i8);//true
		System.out.println(i7.equals(i8));//true

		// 通过查看源码，我们就知道了，针对-128到127之间的数据，做了一个数据缓冲池，如果数据是该范围内的，每次并不创建新的空间
		// Integer ii = Integer.valueOf(127);
	}
}
