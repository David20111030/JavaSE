package j_Random;

import java.util.Random;

import org.junit.Test;

public class RandomDemo {
	
	/**
	 * Random:�������������
	 * 	   ���췽��:
	 * 		public Random();û�и����ӣ��õ���Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
	 * 		public Random(long seed);����ָ�������ӡ�
	 * 				�������Ӻ�ÿ�εõ������������ͬ�ġ�
	 * 	  ��Ա������
	 * 		public int nextInt();���ص���int��Χ�ڵ�α�������
	 * 		public int nextInt(int n);���ص���[0,n)��Χ��α�������
	 * 		�������������͵�����������Ƶ�
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//����α���������
		Random r = new Random();//û�и����ӣ��õ���Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
		
		for(int x = 0;x<10;x++){
			int num = r.nextInt();
			int num2 = r.nextInt();
			System.out.print(num+"  ");
		}
		
		System.out.println("-------");
		
		//����α���������  ��������
		Random r2 = new Random(1111);
		
		for(int x = 0;x<5;x++){
			int num = r2.nextInt(100)+1;
			System.out.print(num+" ");//27 7 6 70 51 �������Ӻ���ʱ���еĳ����������������Щ
		}
		
	}
}
