package k_BigInteger;

import java.math.BigInteger;

import org.junit.Test;

public class BigIntegerDemo {

	/**
	 * ������
	 * BigInteger:�����ó���Integer��Χ�ڵ����ݽ�������
	 * 
	 * ���췽����
	 * 	BigInteger(String val);
	 * 	
	 * ���������÷�����
	 * 		public BigInteger add(BigInteger val):��
	 * 		public BigInteger subtract(BigInteger val):��
	 * 		public BigInteger multiply(BigInteger val):��
	 * 		public BigInteger divide(BigInteger val):��
	 * 		public BigInteger[] divideAndRemainder(BigInteger val):�����̺�����������
	 */
	@Test
	public void test1() throws Exception {
		//System.out.println(Integer.MAX_VALUE);//2147483647
		
		//ͨ������������������
		BigInteger bi = new BigInteger("2147483648");
		System.out.println("bi:"+bi);//bi:2147483648
		
		System.out.println("===============");
		
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("50");

		// public BigInteger add(BigInteger val):��
		System.out.println("add:" + bi1.add(bi2));//150
		// public BigInteger subtract(BigInteger val):��
		System.out.println("subtract:" + bi1.subtract(bi2));//50
		// public BigInteger multiply(BigInteger val):��
		System.out.println("multiply:" + bi1.multiply(bi2));//5000
		// public BigInteger divide(BigInteger val):��
		System.out.println("divide:" + bi1.divide(bi2));//divide:2

		// public BigInteger[] divideAndRemainder(BigInteger val):�����̺�����������
		BigInteger[] bis = bi1.divideAndRemainder(bi2);
		System.out.println("�̣�" + bis[0]);//�̣�2
		System.out.println("������" + bis[1]);//������0
		//System.out.println(bis[2]);//����java.lang.ArrayIndexOutOfBoundsException: 2  



	}
	
	
	
	
	
	
	
}
