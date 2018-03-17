package b_Scanner;

import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;

/**
 * Scanner:用于接收键盘录入数据
 * 前面的时候：
 * 	A：导包
 * 	B：创建方法
 *  C：调用方法
 *  
 * System类下有一个静态的字段：
 * 		public static final InputStream in;
 * 标准的输入流，对应着键盘录入
 * 		InputStream is=System.in;
 * 
 * 构造方法：
 * 		Scanner(InputStream source);
 * @author 贤元
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
	 * 常用的两个方法
	 * 		public int nextInt();获取一个int类型的值
	 * 		public String nextLine();获取一个String类型的值
	 * 
	 * 出现问题了：
	 * 		先获取一个数值，再获取一个字符串，会出现问题。
	 * 		主要原因：就是那个换行符号的问题。
	 * 如何解决呢？(两种解决方式)
	 * 	A:先获取一个数值后，在创建一个新的键盘录入对象获取字符串。
	 *  B:把所有的数据都先按照字符串获取，然后要什么，你就对应的转换为什么。
	 * 
	 * @throws Exception
	 */
	@Test
	public void testname() throws Exception {
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 获取两个int类型的值  正常运行 
//		 int a1 = sc.nextInt();
//		 int b1 = sc.nextInt();
//		 System.out.println("a1:" + a1 + ",b1:" + b1);
//		 System.out.println("-------------------");

		// 获取两个String类型的值  正常运行
		// String s1 = sc.nextLine();//获取用户输入的数据
		// String s2 = sc.nextLine();
		// System.out.println("s1:" + s1 + ",s2:" + s2);
		// System.out.println("-------------------");

		// 先获取一个字符串，在获取一个int值   能正常运行
		// String s1 = sc.nextLine();//获取用户输入的字符串
		// int b = sc.nextInt();//获取用户输入的int类型的数据
		// System.out.println("s1:" + s1 + ",b:" + b);
		// System.out.println("-------------------");

		// 先获取一个int值，在获取一个字符串    有点问题了，71行的代码会执行，但是72行的代码被直接跳过执行了
		//int a = sc.nextInt();
		//String s2 = sc.nextLine();//运行的时候不会执行这条语句，而会直接跳过这条代码直接执行这条代码之后的语句
		// System.out.println("a:" + a + ",s2:" + s2);
		// System.out.println("-------------------");

		//第一种解决方式：A:先获取一个数值后，在创建一个新的键盘录入对象获取字符串。
		//int a = sc.nextInt();
		//Scanner sc2 = new Scanner(System.in);
		//String s = sc2.nextLine();
		//System.out.println("a:" + a + ",s:" + s);	
		
		//第二种解决方式    我想要第一个输入的是数字，第二个是字符串，并打印出来
		//B:把所有的数据都先按照字符串获取，然后要什么，你就对应的转换为什么。
		int a = Integer.parseInt(sc.nextLine());
		String s =sc.nextLine(); 
		System.out.println("a:" + a + ",s:" + s);	
	}
	
	
	/**
	 * 基本格式：
	 * 		public boolean hasNextXxx();判断是否是某种类型的元素
	 * 		public Xxx nextXxx();获取该元素
	 * 
	 * 举例：用int类类型的方法举例
	 * 		public boolean hasNextInt();
	 * 		public int nextInt();
	 * 
	 * 注意：
	 * 		InputMismatchExceptiion:输入的和你想要的不匹配
	 * 
	 */
	public static void test2(){
		//创建对象
		Scanner sc=new Scanner(System.in);
		
		//获取数据
		if(sc.hasNextInt()){//判断输入的的数据是否为int类型的
			int x=sc.nextInt();//获取输入的数据
			System.out.println("x:"+x);
		}else{
			System.out.println("你输入的数据有误");
		}
		
	}
	
	
	
	public static void test1(){
		//创建对象
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("x:"+x);
	}
	
}
