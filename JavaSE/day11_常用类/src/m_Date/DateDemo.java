package m_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class DateDemo {
	
	/**
	 * Date:表示特定的瞬间，精确到毫秒。 
	 * 
	 * 构造方法：
	 * 		Date():根据当前的默认毫秒值创建日期对象
	 * 		Date(long date)：根据给定的毫秒值创建日期对象。 创建的日期是1970年上午8点加上给定的毫秒值所创建的日期对象
	 * 
	 * 
	 */
	@Test
	public void test1() throws Exception {
		//创建对象   根据当前的默认毫秒值创建日期对象
		Date d = new Date();
		System.out.println("d:" + d);//d:Wed Mar 01 22:05:03 CST 2017
		
		//创建对象
		long time = 1000 * 60 * 60;//1小时
		Date d2 = new Date(time);//根据给定的毫秒值创建日期对象  创建的日期是1970年上午8点加上给定的毫秒值所创建的日期对象
		System.out.println("d2:"+d2);//d2:Thu Jan 01 09:00:00 CST 1970
		
		//System.currentTimeMillis();//表示1970年距离当前日期的毫秒值
		System.out.println(new Date(System.currentTimeMillis()));//Wed Mar 01 22:05:03 CST 2017
		
		System.out.println("==========================");
		
	}
	
	
	
	
	
	/**
	 * public long getTime():获取时间，以毫秒为单位
	 * public void setTime(long time):设置时间
	 * 
	 * 从Date得到一个毫秒值
	 * 		long getTime()
	 * 把一个毫秒值转换为Date
	 * 		构造方法
	 * 		setTime(long time)
	 */
	@Test
	public void test2() throws Exception {
		//创建日期对象
		Date d = new Date();
		
		//获取时间
		long time = d.getTime();
		System.out.println(time);//1488377580261  1970年上午8点到当前的毫秒值
		System.out.println(System.currentTimeMillis());//1488377580261  1970年上午8点到当前的毫秒值
		System.out.println(d);//Wed Mar 01 22:13:00 CST 2017
		
		System.out.println("==================");
		
		//设置时间
		d.setTime(1000*60*60);//1000*60*60 一小时   是1970年上午8点加上给定的毫秒值所创建的日期对象
		System.out.println(d);//Thu Jan 01 09:00:00 CST 1970   是1970年上午8点加上给定的毫秒值所创建的日期对象
		
	}
	
	
	
	/**
	 * 
	 * Date	 --》	 String(格式化)
	 * 		public final String format(Date date)
	 * 
	 * String --》 Date(解析)
	 * 		public Date parse(String source)
	 * 
	 * DateForamt:可以进行日期和字符串的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat。
	 * 
	 * SimpleDateFormat的构造方法：
	 * 		SimpleDateFormat():默认模式
	 * 		SimpleDateFormat(String pattern):给定的模式
	 * 			这个模式字符串该如何写呢?
	 * 			通过查看API，我们就找到了对应的模式
	 * 			年 y
	 * 			月 M	
	 * 			日 d
	 * 			时 H
	 * 			分 m
	 * 			秒 s
	 * 
	 * 			2014年12月12日 12:12:12
	 */
	@Test
	public void test_Format() throws Exception {
		// Date -- String
		// 创建日期对象
		Date d = new Date();
		// 创建格式化对象
		// SimpleDateFormat sdf = new SimpleDateFormat();
		// 给定模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		// public final String format(Date date)
		String s = sdf.format(d);
		System.out.println(s);//2017年03月01日 22:20:21
		
		
		
		//将字符串解析为日期
		//String --》 Date
		String str = "2008-08-08 12:12:12";
		//在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);//Fri Aug 08 12:12:12 CST 2008
	}
	
	
	
	/**
	 * 一个案例：
	 * 
	 * 算一下你来到这个世界多少天?
	 * 
	 * 分析：
	 * 		A:键盘录入你的出生的年月日
	 * 		B:把该字符串转换为一个日期
	 * 		C:通过该日期得到一个毫秒值
	 * 		D:获取当前时间的毫秒值
	 * 		E:用D-C得到一个毫秒值
	 * 		F:把E的毫秒值转换为年
	 * 			/1000/60/60/24
	 */
	@Test
	public void testname() throws Exception {
		// 键盘录入你的出生的年月日
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的出生年月日:");
		String line = sc.nextLine();

		// 把该字符串转换为一个日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);

		// 通过该日期得到一个毫秒值
		long myTime = d.getTime();

		// 获取当前时间的毫秒值
		long nowTime = System.currentTimeMillis();

		// 用D-C得到一个毫秒值
		long time = nowTime - myTime;

		// 把E的毫秒值转换为年
		long day = time / 1000 / 60 / 60 / 24;

		System.out.println("你来到这个世界：" + day + "天");
	}
	
	
}
