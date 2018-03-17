package h_BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;

import org.junit.Test;

public class BigDecimalDemo {
	
	
	/*
	 * ������д�������������������һ��㲻һ����������Ϊfloat���͵����ݴ洢��������һ�����µġ����Ǵ󲿷ֵ�ʱ�򣬶��Ǵ�����Ч����λ��
	 * 
	 * �����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ���������ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal
	 * 
	 * BigDecimal�ࣺ���ɱ�ġ����⾫�ȵ��з���ʮ������,���Խ�����ݶ�ʧ���⡣
	 */
	@Test
	public void test1() throws Exception {
		System.out.println(0.09 + 0.01);
		System.out.println(1.0 - 0.32);
		System.out.println(1.015 * 100);
		System.out.println(1.301 / 100);

		System.out.println(1.0 - 0.12);
		
		/**�����
		 * 0.09999999999999999
			0.6799999999999999
			101.49999999999999
			0.013009999999999999
			0.88
		 */
	}
	
	/*
	 * ���췽����
	 * 		public BigDecimal(String val);��valת���ɴ�ʮ������������
	 * 
	 * public BigDecimal add(BigDecimal augend);��
	 * public BigDecimal subtract(BigDecimal subtrahend);��
	 * public BigDecimal multiply(BigDecimal multiplicand);��
	 * public BigDecimal divide(BigDecimal divisor);��
	 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):�̣���λС���������ȡ
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
