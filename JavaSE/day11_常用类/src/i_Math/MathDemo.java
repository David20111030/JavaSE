package i_Math;

import java.util.Scanner;

import org.junit.Test;

public class MathDemo {

	/*
	 * Math:用于数学运算的类。Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
	 * 成员变量：
	 * 		public static final double PI  代表圆周率的那个π
	 * 		public static final double E    比任何其他值都更接近 e（即自然对数的底数）的 double 值。
	 * 成员方法：
	 *		public static double random():随机数 [0.0,1.0)  这个方法记一下哦！有点重要   
	 *
	 * 		public static int abs(int a)：绝对值
	 *		public static double ceil(double a):向上取整
	 *		public static double floor(double a):向下取整
	 *		public static int max(int a,int b):最大值 (min自学)
	 *		public static double pow(double a,double b):a的b次幂
	 *		public static int round(float a) 四舍五入(参数为double的自学)
	 *		public static double sqrt(double a):正平方根
	 */
	@Test
	public void testname() throws Exception {
		// public static final double PI
		System.out.println("PI:" + Math.PI);//PI:3.141592653589793
		// public static final double E
		System.out.println("E:" + Math.E);//E:2.718281828459045
		System.out.println("--------------");

		// public static int abs(int a)：绝对值
		System.out.println("abs:" + Math.abs(10));
		System.out.println("abs:" + Math.abs(-10));
		System.out.println("--------------");

		// public static double ceil(double a):向上取整
		System.out.println("ceil:" + Math.ceil(12.34));
		System.out.println("ceil:" + Math.ceil(12.56));
		System.out.println("--------------");

		// public static double floor(double a):向下取整
		System.out.println("floor:" + Math.floor(12.34));
		System.out.println("floor:" + Math.floor(12.56));
		System.out.println("--------------");

		// public static int max(int a,int b):最大值
		System.out.println("max:" + Math.max(12, 23));
		// 需求：我要获取三个数据中的最大值
		// 方法的嵌套调用
		System.out.println("max:" + Math.max(Math.max(12, 23), 18));
		// 需求：我要获取四个数据中的最大值
		System.out.println("max:"
				+ Math.max(Math.max(12, 78), Math.max(34, 56)));
		System.out.println("--------------");

		// public static double pow(double a,double b):a的b次幂
		System.out.println("pow:" + Math.pow(2, 3));
		System.out.println("--------------");

		// public static double random():随机数 [0.0,1.0)
		System.out.println("random:" + Math.random());//[0,1) 之间的小数
		// 获取一个1-100之间的随机数
		System.out.println("random:" + ((int) (Math.random() * 100) + 1));
		System.out.println("--------------");

		// public static int round(float a) 四舍五入(参数为double的自学)
		System.out.println("round:" + Math.round(12.34f));
		System.out.println("round:" + Math.round(12.56f));
		System.out.println("--------------");
		
		//public static double sqrt(double a):正平方根
		System.out.println("sqrt:"+Math.sqrt(4));
	}
	
	
	
	
	/**
	 * 一个案例
	 *
	 * 需求：请设计一个方法，可以实现获取任意范围内的随机数。
	 * 
	 * 分析：
	 * 		A:键盘录入两个数据。
	 * 			int strat;
	 * 			int end;
	 * 		B:想办法获取在start到end之间的随机数
	 * 			我写一个功能实现这个效果，得到一个随机数。(int)
	 * 		C:输出这个随机数
	 */
	@Test
	public void test2() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始数：");
		int start = sc.nextInt();
		System.out.println("请输入结束数：");
		int end = sc.nextInt();

		for (int x = 0; x < 100; x++) {
			// 调用功能
			int num = getRandom(start, end);
			// 输出结果
			System.out.println(num);
		}
	}
	/*
	 * 写一个功能 两个明确： 返回值类型：int 参数列表：int start,int end
	 */
	public static int getRandom(int start, int end) {
		// 回想我们讲过的1-100之间的随机数
		// int number = (int) (Math.random() * 100) + 1;
		// int number = (int) (Math.random() * end) + start;
		// 发现有问题了，怎么办呢?
		int number = (int) (Math.random() * (end - start + 1)) + start;
		return number;
	}
	
}
