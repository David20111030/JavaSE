package gz.itcast.b_05锁_同步方法;
/**
 * A：同步代码块的锁对象是谁呢？
 * 		任意对象
 * 
 * B：同步方法的格式及所对象问题？
 * 		把同步关键字加在方法上。
 * 	  同步方法是谁呢？
 * 		this
 * 
 * C:静态方法及锁对象问题？
 * 	 静态方法的锁对象是谁呢？
 * 		类的字节码文件对象。
 * @author 贤元
 *
 */
public class SellTicketDemo {
	//还是售票问题
	public static void main(String[] args) {
		//创建资源对象  也就是自定义类对象
		MyRunnable my = new MyRunnable();
		
		//创建三个线程对象，并将资源对象作为构造参数传递
		Thread t1 = new Thread(my, "窗口1");
		Thread t2 = new Thread(my, "窗口2");
		Thread t3 = new Thread(my, "窗口3");
		
		
		//启动线程
		t1.start();
		t2.start();
		t3.start();
		
	}
}
