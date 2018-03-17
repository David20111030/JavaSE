package l_Calendar;

import java.util.Calendar;
import java.util.Scanner;

import org.junit.Test;

public class CalendarDemo {
	
	/**日历抽象类：
	 * 		注意：它的月份是从0开始计数的。范围为0~11.所以我们用的时候月份应该加上1.
	 * 	
	 * Calendar:它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
	 * 
	 * public int get(int field):返回给定日历字段的值。日历类中的每个日历字段都是静态的成员变量，并且是int类型。
	 * 			 参数field代表日历字段
	 * 
	 * 日历字段：
	 * 		Calendar.YEAR	 指示年的 get 和 set 的字段数字。
	 * 		Calendar.MONTH   指示月份的 get 和 set 的字段数字。
	 *		Calendar.DATE    get 和 set 的字段数字，指示一个月中的某天。
	 */
	@Test
	public void test1() throws Exception {
		//其日历字段已经由当前日期和时间初始化
		//使用默认时区和语言环境获得一个日历对象
		//Calendar ringhtNow = new Calendar();错误，Calendar是一个抽象类，不能实例化
		//使用默认时区和语言环境获得一个日历对象
		Calendar rightNow = Calendar.getInstance();
		
		//获取年
		int year = rightNow.get(Calendar.YEAR);
		// 获取月
		int month = rightNow.get(Calendar.MONTH);
		// 获取日
		int date = rightNow.get(Calendar.DATE);
		
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");
	}
	
	
	
	/*
	 * public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作。
	 * 
	 * public final void set(int year,int month,int date):设置当前日历的年月日
	 */
	@Test
	public void test2() throws Exception {
		//获取当前的日历时间
		Calendar c = Calendar.getInstance();
		
		//获取年
		int year = c.get(Calendar.YEAR);
		//获取月
		int month = c.get(Calendar.MONTH);
		//获取日
		int date = c.get(Calendar.DATE);
		System.out.println(year + "年" + (month + 1) + "月" + date + "日");//2017年3月1日

		 // 三年前的今天
		 c.add(Calendar.YEAR, -3);
		 // 获取年
		 year = c.get(Calendar.YEAR);
		 // 获取月
		 month = c.get(Calendar.MONTH);
		 // 获取日
		 date = c.get(Calendar.DATE);
		 System.out.println(year + "年" + (month + 1) + "月" + date + "日");//2014年3月1日	
	
		 // 5年后的10天前
		 c.add(Calendar.YEAR, 5);
		 c.add(Calendar.DATE, -10);
		// 获取年
		 year = c.get(Calendar.YEAR);
		// 获取月
		 month = c.get(Calendar.MONTH);
		// 获取日
		 date = c.get(Calendar.DATE);
		 System.out.println(year + "年" + (month + 1) + "月" + date + "日");
		 System.out.println("--------------");

		 //设置当前日历的年月日
		 c.set(2011, 11, 11);
		 
		// 获取年		 
		 year = c.get(Calendar.YEAR);
		// 获取月
		 month = c.get(Calendar.MONTH);
		// 获取日
		 date = c.get(Calendar.DATE);
		 System.out.println(year + "年" + (month + 1) + "月" + date + "日");//2011年12月11日
	
	}
	
	
	/**
	 * 一个案例：
	 * 	
	 * 获取任意一年的二月有多少天
	 * 
	 * 分析：
	 * 		A:键盘录入任意的年份
	 * 		B:设置日历对象的年月日
	 * 			年就是A输入的数据
	 * 			月是2
	 * 			日是1
	 * 		C:把时间往前推一天，就是2月的最后一天
	 * 		D:获取这一天输出即可
	 */
	@Test
	public void testname() throws Exception {
		//键盘录入任意的年份
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		
		//设置日历对象的年月日
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);//其实这是一年的3月1号   注意：它的月份是从0开始计数的。范围为0~11.所以我们用的时候月份应该加上1.
		System.out.println(c.get(Calendar.YEAR)+"年  "+(c.get(Calendar.MONTH)+1)+"月  "+c.get(Calendar.DATE)+"日");
		//把时间往前推一天，就是2月的最后一天
		c.add(Calendar.DATE, -1);
		
		//获取这一个输出即可
		System.out.println(c.get(Calendar.DATE));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
