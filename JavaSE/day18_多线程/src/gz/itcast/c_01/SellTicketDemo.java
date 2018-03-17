package gz.itcast.c_01;
/**
 * 虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们并没有看到在哪里加上了所，在哪里释放了锁。
 * 
 * 为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象Lock.
 * 
 * Lock:
 * 		void lock();获取锁
 * 		void unlock();释放锁
 * ReentrantLock是Lock的实现类
 * 
 * @author 贤元
 *
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		// 创建资源对象 自定义线程类
		MyRunnable my = new MyRunnable();
		
		// 创建线程对象
		Thread t1 = new Thread(my,"窗口1");
		Thread t2 = new Thread(my,"窗口2");
		Thread t3 = new Thread(my,"窗口3");
		
		// 启动线程
		t1.start();
		t2.start();
		t3.start();
		
	}
}
