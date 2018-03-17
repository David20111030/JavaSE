package h_BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;

import org.junit.Test;

public class BigDecimalDemo {
	
	
	/*
	 * 看程序写结果：结果和我们想的有一点点不一样，这是因为float类型的数据存储和整数不一样导致的。它们大部分的时候，都是带有有效数字位。
	 * 
	 * 由于在运算的时候，float类型和double很容易丢失精度，演示案例。所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
	 * 
	 * BigDecimal类：不可变的、任意精度的有符号十进制数,可以解决数据丢失问题。
	 */
	@Test
	public void test1() throws Exception {
		System.out.println(0.09 + 0.01);
		System.out.println(1.0 - 0.32);
		System.out.println(1.015 * 100);
		System.out.println(1.301 / 100);

		System.out.println(1.0 - 0.12);
		
		/**结果：
		 * 0.09999999999999999
			0.6799999999999999
			101.49999999999999
			0.013009999999999999
			0.88
		 */
	}
	
	/*
	 * 构造方法：
	 * 		public BigDecimal(String val);将val转换成大十进制数据类型
	 * 
	 * public BigDecimal add(BigDecimal augend);加
	 * public BigDecimal subtract(BigDecimal subtrahend);减
	 * public BigDecimal multiply(BigDecimal multiplicand);乘
	 * public BigDecimal divide(BigDecimal divisor);除
	 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
	 */
	@Test
	public void test2() throws Exception {
		BigDecimal bd1 = new BigDecimal("0.09");
		BigDecimal bd2 = new BigDecimal("0.01");
		System.out.println("add:" + bd1.add(bd2));//add:0.10
		System.out.println("-------------------");

		BigDecimal bd3 = new BigDecimal("1.0");
		BigDecimal bd4 = new BigDecimal("0.32");
		System.out.println("subtract:" + bd3.subtract(bd4));//subtract:0.68
		System.out.println("-------------------");

		BigDecimal bd5 = new BigDecimal("1.015");
		BigDecimal bd6 = new BigDecimal("100");
		System.out.println("multiply:" + bd5.multiply(bd6));//multiply:101.500
		System.out.println("-------------------");

		BigDecimal bd7 = new BigDecimal("1.301");
		BigDecimal bd8 = new BigDecimal("100");
		System.out.println("divide:" + bd7.divide(bd8));//divide:0.01301
		System.out.println("divide:"
				+ bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP));//divide:0.013
		System.out.println("divide:"
				+ bd7.divide(bd8, 8, BigDecimal.ROUND_HALF_UP));//divide:0.01301000
	}
}
