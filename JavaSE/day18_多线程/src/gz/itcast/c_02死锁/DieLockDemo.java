package gz.itcast.c_02死锁;
/**
 * 同步的弊端：
 * 	A：效率低
 *  B：容易产生死锁
 *  
 * 死锁：
 * 	  就是两个或两个以上的线程在争夺资源的过程中，发生的一种互相等待的现象。
 * 
 * @author 贤元
 *
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);
		
		dl1.start();
		dl2.start();
		/**
		 * 运行结果：
		 * if objA
			else objB
		 */
	}
}
