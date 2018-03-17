package k_BigInteger;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerDemo {

	/**
	 * 大整型
	 * BigInteger:可以让超过Integer范围内的数据进行运算
	 * 
	 * 构造方法：
	 * 	BigInteger(String val);
	 * 	
	 * 大整数常用方法：
	 * 		public BigInteger add(BigInteger val):加
	 * 		public BigInteger subtract(BigInteger val):减
	 * 		public BigInteger multiply(BigInteger val):乘
	 * 		public BigInteger divide(BigInteger val):除
	 * 		public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
	 */
	@Test
	public void test1() throws Exception {
		//System.out.println(Integer.MAX_VALUE);//2147483647
		
		//通过大整数来创建对象
		BigInteger bi = new BigInteger("2147483648");
		System.out.println("bi:"+bi);//bi:2147483648
		
		System.out.println("===============");
		
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("50");

		// public BigInteger add(BigInteger val):加
		System.out.println("add:" + bi1.add(bi2));//150
		// public BigInteger subtract(BigInteger val):减
		System.out.println("subtract:" + bi1.subtract(bi2));//50
		// public BigInteger multiply(BigInteger val):乘
		System.out.println("multiply:" + bi1.multiply(bi2));//5000
		// public BigInteger divide(BigInteger val):除
		System.out.println("divide:" + bi1.divide(bi2));//divide:2

		// public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
		BigInteger[] bis = bi1.divideAndRemainder(bi2);
		System.out.println("商：" + bis[0]);//商：2
		System.out.println("余数：" + bis[1]);//余数：0
		//System.out.println(bis[2]);//报错：java.lang.ArrayIndexOutOfBoundsException: 2  



	}
	
	
	
	
	
	
	
}
