package gz.itcast.c_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {

	// 定义100张票
	private int tickets = 100;

	// 定义锁对象
	private Lock lock = new ReentrantLock();// ReentrantLock类是接口Lock的实现类

	@Override
	public void run() {
		while (true) {
			// 加锁
			lock.lock();
			try {
				if (tickets > 0) {
					try {
						Thread.sleep(100);// 让线程睡眠100毫秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName()
							+ "正在出售第：" + (tickets--) + "张票");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 释放锁
				lock.unlock();
			}
		}

	}

}
