package gz.itcast.b_02һ������;

import org.junit.Test;

public class SellTicketDemo {

	/**
	 * ĳ��ӰԺĿǰ������ӳ�����Ƭ(�����,�����´���ؾ���)������100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
	 * �̳�Thread����ʵ�֡�
	 */
	@Test
	public void testThread() throws Exception {
		// �����̶߳���
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		MyThread my3 = new MyThread();

		// ���߳���������
		my1.setName("����1");
		my2.setName("����2");
		my3.setName("����3");

		// �����߳�
		my1.start();
		my2.start();
		my3.start();

	}
	
	
	/**
	 * ĳ��ӰԺĿǰ������ӳ�����Ƭ(�����,�����´���ؾ���)������100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
	 * ��ʵ��Runnable�ӿڵķ�ʽ����
	 */
	@Test
	public void testRunnable() throws Exception {
		// �����Զ����߳������
		MyRunnable my = new MyRunnable();


		//�����̶߳��� �����Զ����߳��������Ϊ�����������
		Thread th1 = new Thread(my,"����1");
		Thread th2 = new Thread(my,"����2");
		Thread th3 = new Thread(my,"����3");
		// �����߳�
		th1.start();
		th2.start();
		th3.start();

	}
}
