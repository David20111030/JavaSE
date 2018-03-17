package gz.itcast.b_02一个案例;
/**
 * 实现Runnable接口，并实现run方法。
 * @author 贤元
 *
 */
public class MyRunnable implements Runnable{
	public static int ticket = 100;
	
	// Object obj = new Object();//用作锁对象,为什么用这个作为锁对象就会出现一个错误呢，票会变成负数了？？？？
	
	/**
	 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)， 
	 * 共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
	 */
	@Override
	public void run() {
		while(true){
			if(ticket!=0){
				//把需要共享的数据锁起来，
				synchronized (this) {
					System.out.println(Thread.currentThread().getName()+"正在出售第："+(ticket--)+"张票");//获取当前线程对象Thread.currentThread()
				}
			}else{
				return;//如果ticket==0，就退出循环
			}
		}
	}
}
