package gz.itcast.b_01;
/**
 * 自定义类实现Runnable接口，并重写run()方法
 * @author 贤元
 *
 */
public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int x = 0;x<100;x++){
			//由于事先接口的方式就不能直接使用Thread类的方法了，但是可以间接的使用啊
			//Thread.currentThread() 返回一个当前线程的对象  哈哈！
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
