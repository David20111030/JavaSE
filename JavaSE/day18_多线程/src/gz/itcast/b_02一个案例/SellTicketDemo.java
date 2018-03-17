package gz.itcast.b_02一个案例;

import org.junit.Test;

public class SellTicketDemo {

	/**
	 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
	 * 继承Thread类来实现。
	 */
	@Test
	public void testThread() throws Exception {
		// 创建线程对象
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		MyThread my3 = new MyThread();

		// 给线程命名名称
		my1.setName("窗口1");
		my2.setName("窗口2");
		my3.setName("窗口3");

		// 启动线程
		my1.start();
		my2.start();
		my3.start();

	}
	
	
	/**
	 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
	 * 用实现Runnable接口的方式来做
	 */
	@Test
	public void testRunnable() throws Exception {
		// 创建自定义线程类对象
		MyRunnable my = new MyRunnable();


		//创建线程对象 并把自定义线程类对象作为构造参数传递
		Thread th1 = new Thread(my,"窗口1");
		Thread th2 = new Thread(my,"窗口2");
		Thread th3 = new Thread(my,"窗口3");
		// 启动线程
		th1.start();
		th2.start();
		th3.start();

	}
}
