package gz.itcast.e_线程组01;

import org.junit.Test;

/**
 * 线程组:把多个线程组合到一起
 * 
 * 他可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
 * 		
 * @author 贤元
 *
 */
public class ThreadGroupDemo {
	
	
	
	
	//目的：线程默认是属于main线程组的
	@Test
	public void test1() throws Exception {
		//创建自定义线程类(也叫资源类)
		MyRunnable mr = new MyRunnable();
		
		//创建线程
		Thread th1 = new Thread(mr,"李贤元");
		Thread th2 = new Thread(mr,"脸生");
		
		//我不知道他们属于哪个线程组，我想知道，怎么办？
		//线程类里面的方法：public final ThreadGroup getThreadGroup();
		ThreadGroup tg1 = th1.getThreadGroup();
		ThreadGroup tg2 = th2.getThreadGroup();
		
		//线程组里卖弄的方法：public final String getName();//得到线程组的名字
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);//main
		System.out.println(name2);//main
		
		//通过结果我们知道了：线程默认情况下属于main线程组
		
		//通过下main的测试，你应该能够看到，默认情况下，所有的线程都属于同一个组
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main
		
	}
	
	
	@Test
	public void test2() throws Exception {
		//ThreadGroup(String name);
		//创建一个新的线程组
		ThreadGroup tg = new ThreadGroup("这是一个新的线程组");
		
		MyRunnable my = new MyRunnable();
		//Thread(ThreadGroup group,Runnable target,String name);
		//分配新的 Thread 对象，以便将 target 作为其运行对象，将指定的 name 作为其名称，并作为 group 所引用的线程组的一员。
		Thread t1 = new Thread(tg,my,"李贤元");
		Thread t2 = new Thread(tg,my,"脸生");
		
		System.out.println(t1.getThreadGroup().getName());//这是一个新的线程组
		System.out.println(t2.getThreadGroup().getName());//这是一个新的线程组

		
		//通过线程组对象设置后台线程，表示该组的线程都是后台线程
		tg.setDaemon(true);
	}
	
	
	
	
}
