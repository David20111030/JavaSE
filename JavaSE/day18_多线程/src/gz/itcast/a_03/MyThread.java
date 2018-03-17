package gz.itcast.a_03;
/**
 * 步骤：
 * 	1、在自定义类中继承Thread类
 * 	2、重写run方法
 * @author 贤元
 *
 */
public class MyThread extends Thread{
	
	public MyThread(){
		
	}
	
	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int x = 0;x<100;x++){
			System.out.println(getName() + ":" + x);//获取当前线程名称
		}
	}
}
