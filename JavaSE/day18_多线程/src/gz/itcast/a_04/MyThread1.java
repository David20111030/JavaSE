package gz.itcast.a_04;
/**
 * 自定义类继承Thread类，重写run方法，里面写要进行线程方式执行的代码
 * @author 贤元
 *
 */
public class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int x = 0;x<=100; x++){
			System.out.println(getName()+":"+x);//获取当前线程的名称
		}
	}
}
