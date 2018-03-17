package gz.itcast.a_04;

import org.junit.Test;

public class MyThreadDemo {
	
	/**
	 * public final void setDaemon(boolean on);将该线程标记为守护线程或用户线程。
	 * 	当正在运行的线程是守护线程时，java虚拟机退出。该方法必须在启动线程前调用，如果不是的话则会报错。
	 * @throws Exception
	 */
	@Test
	public void ThreadDaemon() throws Exception {
		//创建线程对象
		MyThread1 td1 = new MyThread1();
		MyThread1 td2 = new MyThread1();
		
		td1.setName("李贤元");
		td2.setName("侯志民");
		
		//设置守护线程
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		//启动线程
		td1.start();
		td2.start();
		
		Thread.currentThread().setName("Java工程师");//获取当前正在运行的线程，并为其设置名称
		for(int x = 0;x<5;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
		
	}
	
	
	/**????????????
	 * public final void join(); 等待该线程终止。
	 * public final void join(long millis); 等待该线程终止的时间最长为 millis 毫秒。超时为 0 意味着要一直等下去。 
	 * @throws Exception
	 */
	@Test
	public void ThreadJoin1() throws Exception {
		MyThread1 tj1 = new MyThread1();
		MyThread1 tj2 = new MyThread1();
		MyThread1 tj3 = new MyThread1();

		tj1.setName("李渊");
		tj2.setName("李世民");
		tj3.setName("李元霸");
		
		//启动tj1线程
		tj1.start();
		
		try{
			tj1.join(1L);
		}catch(InterruptedException e){
		//如果任何线程中断了当前线程。当抛出该异常时，当前线程的中断状态 被清除。
			System.out.println("该线程被终止了");
			e.printStackTrace();
		}
		
		tj2.start();
		tj3.start();
	}
	
	
	
	/**
	 * 我们的线程没有设置优先级,肯定有默认优先级。
	 * 那么，默认优先级是多少呢?
	 * 如何获取线程对象的优先级?
	 * 		public final int getPriority():返回线程对象的优先级
	 * 如何设置线程对象的优先级呢?
	 * 		public final void setPriority(int newPriority)：更改线程的优先级。 
	 * 
	 * 注意：
	 * 		线程默认优先级是5。
	 * 		线程优先级的范围是：1-10。
	 * 		线程优先级高仅仅表示线程获取的 CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到比较好的效果。
	 * 		
	 * IllegalArgumentException:非法参数异常。
	 * 抛出的异常表明向方法传递了一个不合法或不正确的参数。 
	 * 
	 */
	@Test
	public void testThreadPriority() throws Exception {
		//创建线程对象
		MyThread1 tp1 = new MyThread1();
		MyThread1 tp2 = new MyThread1();
		MyThread1 tp3 = new MyThread1();
		
		//为线程设置名称
		tp1.setName("东方不败");
		tp2.setName("岳不群");
		tp3.setName("林平之");
		// 获取默认优先级
		 System.out.println(tp1.getPriority());//5
		 System.out.println(tp2.getPriority());//5
		 System.out.println(tp3.getPriority());//5
		
		//设置正确的线程优先级  线程的优先级为1到10
		//线程优先级高仅仅表示线程获取的 CPU时间片的几率高，但是要在次数比较多，或者多次运行的时候才能看到比较好的效果。
		tp1.setPriority(10);
		tp2.setPriority(1);

		tp1.start();
		tp2.start();
		tp3.start(); 
	}
	
	
	/**
	 * public static void yield():暂停当前正在执行的线程对象(注意：只是线程对象，而不是线程啊！)，并执行其他线程。
	 * 让多个线程的执行更和谐，但是不能靠它保证一人一次。 
	 * @throws Exception
	 */
	@Test
	public void testYield() throws Exception {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();

		ty1.setName("林青霞");
		ty2.setName("刘意");

		ty1.start();
		ty2.start();
	}
	
}
