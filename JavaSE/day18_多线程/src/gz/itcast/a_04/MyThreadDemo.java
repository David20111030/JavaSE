package gz.itcast.a_04;

import org.junit.Test;

public class MyThreadDemo {
	
	/**
	 * public final void setDaemon(boolean on);�����̱߳��Ϊ�ػ��̻߳��û��̡߳�
	 * 	���������е��߳����ػ��߳�ʱ��java������˳����÷��������������߳�ǰ���ã�������ǵĻ���ᱨ��
	 * @throws Exception
	 */
	@Test
	public void ThreadDaemon() throws Exception {
		//�����̶߳���
		MyThread1 td1 = new MyThread1();
		MyThread1 td2 = new MyThread1();
		
		td1.setName("����Ԫ");
		td2.setName("��־��");
		
		//�����ػ��߳�
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		//�����߳�
		td1.start();
		td2.start();
		
		Thread.currentThread().setName("Java����ʦ");//��ȡ��ǰ�������е��̣߳���Ϊ����������
		for(int x = 0;x<5;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
		
	}
	
	
	/**????????????
	 * public final void join(); �ȴ����߳���ֹ��
	 * public final void join(long millis); �ȴ����߳���ֹ��ʱ���Ϊ millis ���롣��ʱΪ 0 ��ζ��Ҫһֱ����ȥ�� 
	 * @throws Exception
	 */
	@Test
	public void ThreadJoin1() throws Exception {
		MyThread1 tj1 = new MyThread1();
		MyThread1 tj2 = new MyThread1();
		MyThread1 tj3 = new MyThread1();

		tj1.setName("��Ԩ");
		tj2.setName("������");
		tj3.setName("��Ԫ��");
		
		//����tj1�߳�
		tj1.start();
		
		try{
			tj1.join(1L);
		}catch(InterruptedException e){
		//����κ��߳��ж��˵�ǰ�̡߳����׳����쳣ʱ����ǰ�̵߳��ж�״̬ �������
			System.out.println("���̱߳���ֹ��");
			e.printStackTrace();
		}
		
		tj2.start();
		tj3.start();
	}
	
	
	
	/**
	 * ���ǵ��߳�û���������ȼ�,�϶���Ĭ�����ȼ���
	 * ��ô��Ĭ�����ȼ��Ƕ�����?
	 * ��λ�ȡ�̶߳�������ȼ�?
	 * 		public final int getPriority():�����̶߳�������ȼ�
	 * ��������̶߳�������ȼ���?
	 * 		public final void setPriority(int newPriority)�������̵߳����ȼ��� 
	 * 
	 * ע�⣺
	 * 		�߳�Ĭ�����ȼ���5��
	 * 		�߳����ȼ��ķ�Χ�ǣ�1-10��
	 * 		�߳����ȼ��߽�����ʾ�̻߳�ȡ�� CPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�ڴ����Ƚ϶࣬���߶�����е�ʱ����ܿ����ȽϺõ�Ч����
	 * 		
	 * IllegalArgumentException:�Ƿ������쳣��
	 * �׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ����� 
	 * 
	 */
	@Test
	public void testThreadPriority() throws Exception {
		//�����̶߳���
		MyThread1 tp1 = new MyThread1();
		MyThread1 tp2 = new MyThread1();
		MyThread1 tp3 = new MyThread1();
		
		//Ϊ�߳���������
		tp1.setName("��������");
		tp2.setName("����Ⱥ");
		tp3.setName("��ƽ֮");
		// ��ȡĬ�����ȼ�
		 System.out.println(tp1.getPriority());//5
		 System.out.println(tp2.getPriority());//5
		 System.out.println(tp3.getPriority());//5
		
		//������ȷ���߳����ȼ�  �̵߳����ȼ�Ϊ1��10
		//�߳����ȼ��߽�����ʾ�̻߳�ȡ�� CPUʱ��Ƭ�ļ��ʸߣ�����Ҫ�ڴ����Ƚ϶࣬���߶�����е�ʱ����ܿ����ȽϺõ�Ч����
		tp1.setPriority(10);
		tp2.setPriority(1);

		tp1.start();
		tp2.start();
		tp3.start(); 
	}
	
	
	/**
	 * public static void yield():��ͣ��ǰ����ִ�е��̶߳���(ע�⣺ֻ���̶߳��󣬶������̰߳���)����ִ�������̡߳�
	 * �ö���̵߳�ִ�и���г�����ǲ��ܿ�����֤һ��һ�Ρ� 
	 * @throws Exception
	 */
	@Test
	public void testYield() throws Exception {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();

		ty1.setName("����ϼ");
		ty2.setName("����");

		ty1.start();
		ty2.start();
	}
	
}
