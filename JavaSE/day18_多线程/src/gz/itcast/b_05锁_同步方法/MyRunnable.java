package gz.itcast.b_05��_ͬ������;

public class MyRunnable implements Runnable{
	
	//����100��Ʊ
	private static int tickets = 100;
	
	//����ͬһ����
	private Object obj = new Object();
	private Demo d = new Demo();
	
	private int x = 0;

	/**
	 * ͬ���������obj����
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
//							+ "���ڳ��۵�" + (tickets--) + "��Ʊ ");
//				}
//			}
//		}
//	}
	
	
	
	
	
	/**
	 * ͬ��������������������
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
//							+ "���ڳ��۵�" + (tickets--) + "��Ʊ ");
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
//						+ "���ڳ��۵�" + (tickets--) + "��Ʊ ");
//			}
//		}
			sellTicket();
		}
	}
	
	//ͬ������������Ҫͬ���Ĵ���д��ͬ��������   ͬ����������synchronized�ؼ���
	private static synchronized void sellTicket(){
		if (tickets > 0) {
		try {
				Thread.sleep(100);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
					+ "���ڳ��۵�" + (tickets--) + "��Ʊ ");
		}
	}
}



class Demo{}
