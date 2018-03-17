package j_Random;

import java.util.Random;

import org.junit.Test;

public class RandomDemo {
	
	/**
	 * Random:产生随机数的类
	 * 	   构造方法:
	 * 		public Random();没有给种子，用的是默认种子，是当前时间的毫秒值
	 * 		public Random(long seed);给出指定的种子。
	 * 				给出种子后，每次得到的随机数是相同的。
	 * 	  成员方法：
	 * 		public int nextInt();返回的是int范围内的伪随机数。
	 * 		public int nextInt(int n);返回的是[0,n)范围的伪随机数。
	 * 		。。。其他类型的随机数都类似的
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//创建伪随机数对象
		Random r = new Random();//没有给种子，用的是默认种子，是当前时间的毫秒值
		
		for(int x = 0;x<10;x++){
			int num = r.nextInt();
			int num2 = r.nextInt();
			System.out.print(num+"  ");
		}
		
		System.out.println("-------");
		
		//创建伪随机数对象  给出种子
		Random r2 = new Random(1111);
		
		for(int x = 0;x<5;x++){
			int num = r2.nextInt(100)+1;
			System.out.print(num+" ");//27 7 6 70 51 给定种子后这时运行的出来的随机数都是这些
		}
		
	}
}
