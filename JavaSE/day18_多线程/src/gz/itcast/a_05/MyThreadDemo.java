package gz.itcast.a_05;
/**
 * 线程休眠
 *		public static void sleep(long millis);在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），也就是让线程休眠指定的毫秒数
 */
public class MyThreadDemo {
	
	public static void main(String[] args) {
		MyThread ts1 = new MyThread();
		MyThread ts2 = new MyThread();
		MyThread ts3 = new MyThread();
		
		//为线程设置名称
		ts1.setName("林青霞");
		ts2.setName("林志玲");
		ts3.setName("林志颖");
		
		//启动线程
		ts1.start();
		ts2.start();
		ts3.start();		
		/**
		 * 这是部分的截图：
		 * 	线程每隔1秒运行一次:
		 * 
		 * 林青霞:0,日期：Mon Mar 13 21:39:52 CST 2017
林志玲:0,日期：Mon Mar 13 21:39:52 CST 2017
林志颖:0,日期：Mon Mar 13 21:39:52 CST 2017
林志玲:1,日期：Mon Mar 13 21:39:53 CST 2017
林志颖:1,日期：Mon Mar 13 21:39:53 CST 2017
林青霞:1,日期：Mon Mar 13 21:39:53 CST 2017
林志颖:2,日期：Mon Mar 13 21:39:54 CST 2017
林青霞:2,日期：Mon Mar 13 21:39:54 CST 2017
林志玲:2,日期：Mon Mar 13 21:39:54 CST 2017
林青霞:3,日期：Mon Mar 13 21:39:55 CST 2017
林志玲:3,日期：Mon Mar 13 21:39:55 CST 2017
林志颖:3,日期：Mon Mar 13 21:39:55 CST 2017
林志颖:4,日期：Mon Mar 13 21:39:56 CST 2017
林志玲:4,日期：Mon Mar 13 21:39:56 CST 2017
林青霞:4,日期：Mon Mar 13 21:39:56 CST 2017
林志颖:5,日期：Mon Mar 13 21:39:57 CST 2017
林青霞:5,日期：Mon Mar 13 21:39:57 CST 2017
林志玲:5,日期：Mon Mar 13 21:39:57 CST 2017
林志颖:6,日期：Mon Mar 13 21:39:58 CST 2017
林青霞:6,日期：Mon Mar 13 21:39:58 CST 2017
林志玲:6,日期：Mon Mar 13 21:39:58 CST 2017
林青霞:7,日期：Mon Mar 13 21:39:59 CST 2017
林志玲:7,日期：Mon Mar 13 21:39:59 CST 2017
林志颖:7,日期：Mon Mar 13 21:39:59 CST 2017
林志颖:8,日期：Mon Mar 13 21:40:00 CST 2017
林青霞:8,日期：Mon Mar 13 21:40:00 CST 2017
林志玲:8,日期：Mon Mar 13 21:40:00 CST 2017
林青霞:9,日期：Mon Mar 13 21:40:01 CST 2017
林志颖:9,日期：Mon Mar 13 21:40:01 CST 2017
林志玲:9,日期：Mon Mar 13 21:40:01 CST 2017
林志颖:10,日期：Mon Mar 13 21:40:02 CST 2017
林志玲:10,日期：Mon Mar 13 21:40:02 CST 2017
林青霞:10,日期：Mon Mar 13 21:40:02 CST 2017
林志颖:11,日期：Mon Mar 13 21:40:03 CST 2017
林青霞:11,日期：Mon Mar 13 21:40:03 CST 2017
林志玲:11,日期：Mon Mar 13 21:40:03 CST 2017
林青霞:12,日期：Mon Mar 13 21:40:04 CST 2017
林志玲:12,日期：Mon Mar 13 21:40:04 CST 2017
林志颖:12,日期：Mon Mar 13 21:40:04 CST 2017
林志玲:13,日期：Mon Mar 13 21:40:05 CST 2017
林志颖:13,日期：Mon Mar 13 21:40:05 CST 2017
林青霞:13,日期：Mon Mar 13 21:40:05 CST 2017
林青霞:14,日期：Mon Mar 13 21:40:06 CST 2017
林志颖:14,日期：Mon Mar 13 21:40:06 CST 2017
林志玲:14,日期：Mon Mar 13 21:40:06 CST 2017
林志玲:15,日期：Mon Mar 13 21:40:07 CST 2017
林青霞:15,日期：Mon Mar 13 21:40:07 CST 2017
林志颖:15,日期：Mon Mar 13 21:40:07 CST 2017

		 */
	}
	
}
