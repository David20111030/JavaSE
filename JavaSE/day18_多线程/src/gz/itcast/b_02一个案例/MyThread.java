package gz.itcast.b_02一个案例;

/**
 * 继承Thread方式， 步骤：继承Thread类，重写run方法
 * 
 * @author 贤元
 * 
 */
public class MyThread extends Thread {

	// 票数
	public static int ticket = 100;

	/**
	 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)， 共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
	 */
	@Override
	public void run() {
		// 将要共享的数据用锁锁起来，注意:所对象必须是唯一的啊
		while (true) {
			if (ticket != 0) {
				synchronized (this) {
					System.out.println(getName() + "正在出售第：" + (ticket--) + " 张票");
				}
			} else {
				return;
			}
		}
	}

}
