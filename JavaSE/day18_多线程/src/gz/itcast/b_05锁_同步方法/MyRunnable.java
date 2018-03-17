package gz.itcast.b_05锁_同步方法;

public class MyRunnable implements Runnable{
	
	//定义100张票
	private static int tickets = 100;
	
	//定义同一把锁
	private Object obj = new Object();
	private Demo d = new Demo();
	
	private int x = 0;

	/**
	 * 同步代码块用obj做锁
	 */
//	@Override
//	public void run() {
//		while (true) {
//			synchronized (obj) {
//				if (tickets > 0) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()
//							+ "正在出售第" + (tickets--) + "张票 ");
//				}
//			}
//		}
//	}
	
	
	
	
	
	/**
	 * 同步代码块用任意对象做锁
	 */
//	@Override
//	public void run() {
//		while (true) {
//			synchronized (d) {
//				if (tickets > 0) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()
//							+ "正在出售第" + (tickets--) + "张票 ");
//				}
//			}
//		}
//	}
	
	
	
	
	@Override
	public void run() {
		while(true){
//			synchronized (d) {
//			if (tickets > 0) {
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.println(Thread.currentThread().getName()
//						+ "正在出售第" + (tickets--) + "张票 ");
//			}
//		}
			sellTicket();
		}
	}
	
	//同步方法：把需要同步的代码写到同步方法上   同步方法加上synchronized关键字
	private static synchronized void sellTicket(){
		if (tickets > 0) {
		try {
				Thread.sleep(100);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
					+ "正在出售第" + (tickets--) + "张票 ");
		}
	}
}



class Demo{}
