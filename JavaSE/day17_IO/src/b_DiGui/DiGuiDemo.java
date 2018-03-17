package b_DiGui;

import org.junit.Test;

public class DiGuiDemo {
	
	/**
	 * 递归：方法定义中调用方法本身的现象.
	 * 
	 * 方法的嵌套调用，这不是递归。
	 * 		Math.max(Math.max(a,b),c);
	 * 
	 * public void show(int n) {
	 * 		if(n <= 0) {
	 * 			System.exit(0);
	 * 		}
	 * 		System.out.println(n);
	 * 		show(--n);
	 * }
	 * 
	 * 注意事项：
	 * 		A:递归一定要有出口，否则就是死递归
	 * 		B:递归的次数不能太多，否则就内存溢出
	 * 		C:构造方法不能递归使用
	 * 
	 */
	@Test
	public void test1() throws Exception {
		/*
		 * 需求：请用代码实现求5的阶乘。
		 * 下面的知识要知道：
		 * 		5! = 1*2*3*4*5
		 * 		5! = 5*4!
		 * 
		 * 有几种方案实现呢?
		 * 		A:循环实现
		 * 		B:递归实现
		 * 			a:做递归要写一个方法
		 * 			b:出口条件
		 * 			c:规律
		 */
		//用递归实现
		System.out.println("5的阶乘是:"+ jieCheng(543535345));//5的阶乘是:120
	}
	public static int jieCheng(int n){
		/*
		 * 做递归要写一个方法:
		 * 		返回值类型：int
		 * 		参数列表：int n
		 * 出口条件:
		 * 		if(n == 1) {return 1;}
		 * 规律:
		 * 		if(n != 1) {return n*方法名(n-1);}
		 */
		if (n == 1) {
			return 1;
		} else {
			return n * jieCheng(n - 1);
		}
	}
	
	
	
	
	
	
	
	
	
	/** 一个案例：
	 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个月的兔子对数为多少？
	 * 分析：我们要想办法找规律
	 * 			兔子对数
	 * 第一个月： 	1
	 * 第二个月：	1
	 * 第三个月：	2
	 * 第四个月：	3	
	 * 第五个月：	5
	 * 第六个月：	8
	 * ...
	 * 
	 * 由此可见兔子对象的数据是：
	 * 		1,1,2,3,5,8...
	 * 规则：
	 * 		A:从第三项开始，每一项是前两项之和
	 * 		B:而且说明前两项是已知的
	 * 
	 * 如何实现这个程序呢?
	 * 		A:数组实现
	 * 		B:变量的变化实现
	 * 		C:递归实现
	 * 
	 * 假如相邻的两个月的兔子对数是a,b
	 * 第一个相邻的数据：a=1,b=1
	 * 第二个相邻的数据：a=1,b=2
	 * 第三个相邻的数据：a=2,b=3
	 * 第四个相邻的数据：a=3,b=5
	 * 看到了：下一次的a是以前的b，下一次是以前的a+b	
	 */
	@Test
	public void test2() throws Exception {
		
		System.out.println(fib(20));//6765

		
	}
	public static int fib(int n) {
		/*
		 * 方法： 返回值类型：int 
		 * 参数列表：int n 
		 * 出口条件： 第一个月是1，第二个月是1 规律： 从第三个月开始，每一个月是前两个月之和
		 */
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	
	
}
