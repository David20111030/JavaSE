package gz.itcast.c_01;
/**
 * ��Ȼ���ǿ������ͬ��������ͬ�����������������⣬�������ǲ�û�п�������������������������ͷ�������
 * 
 * Ϊ�˸������ı����μ������ͷ�����JDK5�Ժ��ṩ��һ���µ�������Lock.
 * 
 * Lock:
 * 		void lock();��ȡ��
 * 		void unlock();�ͷ���
 * ReentrantLock��Lock��ʵ����
 * 
 * @author ��Ԫ
 *
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// ������Դ���� �Զ����߳���
		MyRunnable my = new MyRunnable();
		
		// �����̶߳���
		Thread t1 = new Thread(my,"����1");
		Thread t2 = new Thread(my,"����2");
		Thread t3 = new Thread(my,"����3");
		
		// �����߳�
		t1.start();
		t2.start();
		t3.start();
		
	}
}
