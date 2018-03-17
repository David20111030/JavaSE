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
public class MyLock {
	//创建两把锁对象
	public static final Object objA = new Object();
	public static final Object objB = new Object();
}
