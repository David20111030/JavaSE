package gz.itcast.a_06;

/**
 * public void interrupt():中断线程。 把线程的状态终止，并抛出一个InterruptedException。
 * @author 贤元
 *
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread ts = new MyThread();
		//启动线程
		ts.start();
		
		//如果线程超过三秒不醒过来，就干死他
		try{
			Thread.sleep(3000);//让线程休眠3秒
			ts.interrupt();//中断线程。
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		/**
		 * 开始执行：Mon Mar 13 21:49:35 CST 2017
			线程被终止了
			结束时间：Mon Mar 13 21:49:38 CST 2017

		 */
	}
	
}
