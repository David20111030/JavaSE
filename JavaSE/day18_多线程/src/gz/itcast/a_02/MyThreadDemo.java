package gz.itcast.a_02;
/**
 * 需求：我们需要实现多线程的程序。
 * 	  那么java提供的类是什么呢？
 * 		Thread
 * 		通过查看API，我们知道了有2种方式实现多线程程序。
 * 
 * 方式1：继承Thread类
 * 	步骤：
 * 		1、自定义MyThread类继承Thread类。
 * 		2、MyThread类里面重写run()。
 * 				为什么是run()方法呢？
 * 				不是类中的所有代码都需要被线程执行的。
 * 				而这个时候，为了区分哪些代码能够被线程执行，java提供了Thread类中的run()用来包含那些被线程执行的代码。
 * 		3、创建对象
 * 		4、启动线程
 * 
 * @author 贤元
 *
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		// 创建线程对象
		// MyThread my = new MyThread();
		// // 启动线程
		// my.run();
		// my.run();
		// 调用run()方法为什么是单线程的呢?
		// 因为run()方法直接调用其实就相当于普通的方法调用,所以你看到的是单线程的效果
		// 要想看到多线程的效果，就必须说说另一个方法：start()
		/**
		 * 面试题：run()和start()的区别?
		 * 	run():仅仅是封装被线程执行的代码，直接调用是普通方法.
		 *  start():首先启动了线程，然后再由jvm去调用该线程的run()方法。
		 */

		// MyThread my = new MyThread();
		// my.start();
		// // IllegalThreadStateException:非法的线程状态异常
		// // 为什么呢?因为这个相当于是my线程被调用了两次。而不是两个线程启动。
		// my.start();
		
		
		//创建两个线程对象
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		//创建另外一个自定义线程类的对象
		MThread mt = new MThread();
		
		
		//启动线程
		my1.start();
		my2.start();
		mt.start();
		
		/**
		 * 这是一部分的运行结果：
		 * 0
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
你是傻逼:0
你是傻逼:1
你是傻逼:2
你是傻逼:3
你是傻逼:4
0
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
你是傻逼:5
你是傻逼:6
你是傻逼:7
你是傻逼:8
你是傻逼:9
你是傻逼:10
你是傻逼:11
你是傻逼:12
23
24
25
26
27
28
29
30
31
		 */
	}
}
