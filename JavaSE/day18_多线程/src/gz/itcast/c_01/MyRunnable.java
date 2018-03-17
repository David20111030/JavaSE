package gz.itcast.c_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {

	// ����100��Ʊ
	private int tickets = 100;

	// ����������
	private Lock lock = new ReentrantLock();// ReentrantLock���ǽӿ�Lock��ʵ����

	@Override
	public void run() {
		while (true) {
			// ����
			lock.lock();
			try {
				if (tickets > 0) {
					try {
						Thread.sleep(100);// ���߳�˯��100����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName()
							+ "���ڳ��۵ڣ�" + (tickets--) + "��Ʊ");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// �ͷ���
				lock.unlock();
			}
		}

	}

}
