package n_System;

import org.junit.Test;

public class SystemDemo {
	
	/*
	 * System类包含一些有用的类字段和方法。它不能被实例化。 
	 * 
	 * 方法：
	 * 		public static void gc()：运行垃圾回收器。 
	 *		public static void exit(int status);//终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止
	 *		public static long currentTimeMillis();//返回当前时间距离1970年8点的毫秒值
	 *		
	 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)；从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
	 */
	@Test
	public void test1() throws Exception {
		Person p = new Person("赵雅芝", 60);
		System.out.println(p);

		p = null; // 让p不再指定堆内存
		System.gc();
		
		/**
		 * Person [name=赵雅芝, age=60]
			当前的对象被回收了Person [name=赵雅芝, age=60]
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
