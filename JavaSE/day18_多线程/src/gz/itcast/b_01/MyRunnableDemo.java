package gz.itcast.b_01;
/**
 * 第二种实现多线程的方式：
 * 	方式2：实现Runnable接口
 * 		步骤：
 * 			1、自定义类MyRunnable实现Runnable接口
 * 			2、重写run()方法
 *  		3、创建MyRunnable类的对象
 *  		4、创建Thread类的对象，并把c步骤的对象作为构造参数传递
 * @author 贤元
 *
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		//3、创建MyRunnable类的对象
		MyRunnable mr = new MyRunnable();
		
		//4、创建Thread类的对象，并把自定义线程类的对象作为构造参数传递
		//Thread(Runnable target,String name); Thread类的构造发哦那个发 第二个参数表示线程的名称
		Thread th1 = new Thread(mr,"李贤元");
		Thread th2 = new Thread(mr,"侯志民");
		
		//启动线程
		th1.start();
		th2.start();
	}
	
	
}
