package gz.itcast.a_02;
/**
 * 方式1：继承Thread类
 * 	步骤：
 * 		1、自定义MyThread类继承Thread类。
 * 		2、MyThread类里面重写run()。
 * 				为什么是run()方法呢？
 * 					不是类中的所有代码都需要被线程执行的。
 * 					而这个时候，为了区分哪些代码能够被线程执行，java提供了Thread类中的run()用来包含那些被线程执行的代码。
 * 		3、创建对象
 * 		4、启动线程
 * 
 * @author 贤元
 *
 */
public class MyThread extends Thread{
	
	//重写run（）
	@Override
	public void run() {
		// 自己写代码
		// System.out.println("好好学习，天天向上");
		// 一般来说，被线程执行的代码肯定是比较耗时的。所以我们用循环改进
		for(int x = 0;x<200;x++){
			System.out.println(x);
		}
	}
}
