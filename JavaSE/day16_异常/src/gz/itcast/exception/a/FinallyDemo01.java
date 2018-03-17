package gz.itcast.exception.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * finally：被finally控制的与具体一定会执行
 * 注意：如果在执行到finally之前jvm推出了，finally控制的语句体就不能执行了。
 * 
 * A：格式
 * 		try...catch...finally...
 * B:用于释放资源，在IO流操作和数据库操作中会见到
 * @author 贤元
 *
 */
public class FinallyDemo01 {
	public static void main(String[] args) {
		//testFinally01();
		
		System.out.println(testFinally02());
	}
	
	
	
	/*
	 * 面试题：
	 * 1:final,finally和finalize的区别
	 * final：最终的意思，可以修饰类，成员变量，成员方法
	 * 		修饰类，类不能被继承
	 * 		修饰变量，变量是常量
	 * 		修饰方法，方法不能被重写
	 * finally：是异常处理的一部分，用于释放资源。
	 * 		一般来说，代码肯定会执行，特殊情况：在执行到finally之前jvm退出了
	 * finalize：是Object类的一个方法，用于垃圾回收
	 * 
	 * 2:如果catch里面有return语句，请问finally里面的代码还会执行吗?
	 *   如果会，请问是在return前，还是return后。
	 * 	   	会。前。
	 * 
	 * 	 准确的说，应该是在中间。
	 * 
	 * 3:try...catch...finally的格式变形
	 * 		A:try...catch...finally
	 * 		B:try...catch
	 * 		C:try...catch...catch...
	 * 		D:try...catch...catch...finally
	 * 		E:try...finally
	 * 			这种做法的目前是为了释放资源。
	 */
	public static int testFinally02() {
		int a = 10;
		try {
			System.out.println(a / 0);
			a = 20;
		} catch (ArithmeticException e) {
			a = 30;
			return a;
			/*
			 * return a在程序执行到这一步的时候，这里不是return a而是return 30;这个返回路径就形成了。
			 * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
			 * 再次回到以前的返回路径，继续走return 30;
			 */
		} finally {
			a = 40;
			return a;//如果这样结果就是40了。这里返回的才是return a.
		}
		 //return a;
	}
	

	private static void testFinally01() {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date d = null;
		try {
			// System.out.println(10 / 0);
			d = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
			//System.exit(0);//这句代码可以让jvm退出，只要jvm一退出，finally控制的语句体就不能执行了。
		} finally {
			System.out.println("这里的代码是可以执行的");
		}

		System.out.println(d);
	}

}
