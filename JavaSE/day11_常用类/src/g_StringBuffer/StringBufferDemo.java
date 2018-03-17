package g_StringBuffer;

import org.junit.Test;

public class StringBufferDemo {

	
	/*
	 * 线程安全(多线程讲解)
	 * 安全 -- 同步 -- 数据是安全的
	 * 不安全 -- 不同步 -- 效率高一些
	 * 安全和效率问题是永远困扰我们的问题。
	 * 安全：医院的网站，银行网站
	 * 效率：新闻网站，论坛之类的
	 * 
	 * StringBuffer:
	 * 		线程安全的可变字符串。
	 * 
	 * StringBuffer和String的区别?
	 * 前者长度和内容可变，后者不可变。
	 * 如果使用前者做字符串的拼接，不会浪费太多的资源。
	 * 
	 * StringBuffer的构造方法：
	 * 		public StringBuffer():无参构造方法
	 *		public StringBuffer(int capacity):指定容量的字符串缓冲区对象
	 *		public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
	 *
	 * StringBuffer的方法：
	 *		public int capacity()：返回当前容量。	理论值.理论值默认是16，如果实际值大于理论值的时候，理论值就会继续变大，总之，理论值永远都是大于实际值的。当实际值大于当前容量的时候，当前容量会继续开辟空间，反正当前容量必须要大于实际值的。
	 *		public int length():返回长度（字符数）。 实际值
	 */
	@Test
	public void test1() throws Exception {
		/*
		String s = "1234e";
		s+="qwe";
		System.out.println(s.length());//8
		System.out.println(s);//1234eqwe
		*/
		
		
		// public StringBuffer():无参构造方法
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);//sb:
		System.out.println("sb.capacity():" + sb.capacity());//sb.capacity():16
		System.out.println("sb.length():" + sb.length());//sb.length():0
		System.out.println("--------------------------");

		// public StringBuffer(int capacity):指定容量的字符串缓冲区对象
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2:" + sb2);//sb2:
		System.out.println("sb2.capacity():" + sb2.capacity());//sb2.capacity():50
		System.out.println("sb2.length():" + sb2.length());//sb2.length():0
		System.out.println("--------------------------");

		// public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
		StringBuffer sb3 = new StringBuffer("hell0");
		System.out.println("sb3:" + sb3);//sb3:hello
		System.out.println("sb3.capacity():" + sb3.capacity());//sb3.capacity():21  第一次的时候，如果实际长度小于理论值，则理论值就变为：默认值16加上当前实际长度。
		System.out.println("sb3.length():" + sb3.length());//sb3.length():5
		//sb3+=sb3+"erer";错误，不能这样拼接
		sb3.append("world22222222122www1");
		System.out.println("sb3.capacity():" + sb3.capacity());//sb3.capacity():21   如果不是第一次，如果实际长度小于理论值，则理论值不改变，当实际长度大于理论值时，理论值就会向内存继续开辟空间。
		System.out.println("sb3.length():" + sb3.length());//sb3.length():10
		
	}
	
	
	/*
	 * StringBuffer的添加功能：
	 * 		public StringBuffer append(String str):可以把任意类型数据添加到字符串缓冲区里面,并返回字符串缓冲区本身
	 * 
	 * 		public StringBuffer insert(int offset,String str):在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身。从0开始计数的。
	 */
	@Test
	public void test_insert() throws Exception {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		// public StringBuffer append(String str)
		// StringBuffer sb2 = sb.append("hello");
		// System.out.println("sb:" + sb);
		// System.out.println("sb2:" + sb2);
		// System.out.println(sb == sb2); // true

		// 一步一步的添加数据
		// sb.append("hello");
		// sb.append(true);
		// sb.append(12);
		// sb.append(34.56);

		// 链式编程
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println("sb:" + sb);//sb:hellotrue1234.56

		// public StringBuffer insert(int offset,String str):在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身。从0开始计数的
		sb.insert(5, "world");
		System.out.println("sb:" + sb);//sb:helloworldtrue1234.56
	}
	
	
	
	/*
	 * StringBuffer的删除功能
	 * 		public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
	 * 		public StringBuffer delete(int start,int end):删除从指定位置开始到指定位置结束的内容，并返回本身。从0开始计数的
	 */
	@Test
	public void test_delete() throws Exception {
		// 创建对象
		StringBuffer sb = new StringBuffer();
		
		// 添加功能
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);//sb:helloworldjava

		// public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
		// 需求：我要删除e这个字符，肿么办?
		//sb.deleteCharAt(1);
		//System.out.println("sb:" + sb);//sb:hlloworldjava
		
		// 需求:我要删除第一个l这个字符，肿么办?
		//sb.deleteCharAt(2);
		//System.out.println("sb:" + sb);//sb:heloworldjava
		
		// public StringBuffer delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
		// 需求：我要删除world这个字符串，肿么办?
	    //sb.delete(5, 10);
	   // System.out.println("sb:" + sb);//sb:hellojava
	    
		// 需求:我要删除所有的数据
		sb.delete(0, sb.length());

		System.out.println("sb:" + sb);//sb:
	}
	
	
	/*
	 * StringBuffer的替换功能：
	 * 		public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
	 */
	@Test
	public void test_replace() throws Exception {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		// 添加数据
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		System.out.println("sb:" + sb);//sb:helloworldjava

		// public StringBuffer replace(int start,int end,String
		// str):从start开始到end用str替换
		// 需求：我要把world这个数据替换为"节日快乐"
		sb.replace(5, 10, "节日快乐");
		System.out.println("sb:" + sb);//sb:hello节日快乐java
	}
	
	
	
	/*
	 * StringBuffer的反转功能：
	 * 	 public StringBuffer reverse();
	 */
	@Test
	public void test_reverse() throws Exception {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		// 添加数据
		sb.append("霞青林爱我");
		System.out.println("sb:" + sb);//sb:霞青林爱我

		// public StringBuffer reverse()
		sb.reverse();
		System.out.println("sb:" + sb);//sb:我爱林青霞
	}
	
	
	
	/*
	 * StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
	 * 		public String substring(int start);//从指定位置start开始截取到该字符串的末尾(结尾)
	 * 		public String substring(int start,int end); //从指定位置start开始截取到end位置
	 */
	@Test
	public void test_sub() throws Exception {
		// 创建字符串缓冲区对象
		StringBuffer sb = new StringBuffer();

		// 添加元素
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);//sb:helloworldjava

		// 截取功能
		// public String substring(int start)
		String s = sb.substring(5);
		System.out.println("s:" + s);//s:worldjava
		System.out.println("sb:" + sb);//sb:helloworldjava

		// public String substring(int start,int end)
		String ss = sb.substring(5, 10);
		System.out.println("ss:" + ss);//ss:world
		System.out.println("sb:" + sb);//sb:helloworldjava
	}
	
	
	
	
	
	/*
	 * 为什么我们要讲解类之间的转换：(核心思想)
	 * 	A -- B的转换
	 * 		我们把A转换为B，其实是为了使用B的功能。
	 * 	B -- A的转换
	 *		 我们可能要的结果是A类型，所以还得转回来。
	 * 
	 * String和StringBuffer的相互转换?
	 */
	@Test
	public void testConvert() throws Exception {
		// String --> StringBuffer
		String s = "hello";
		// 注意：不能把字符串的值直接赋值给StringBuffer
		// StringBuffer sb = "hello";
		// StringBuffer sb = s;
		// 方式1:通过构造方法
		StringBuffer sb = new StringBuffer(s);
		// 方式2：通过append()方法
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb:" + sb);
		System.out.println("sb2:" + sb2);
		System.out.println("---------------");

		// StringBuffer --> String
		StringBuffer buffer = new StringBuffer("java");
		// String(StringBuffer buffer)
		// 方式1:通过构造方法
		String str = new String(buffer);
		//String str4 = buffer;注意：不能直接把StringBuffer的值直接赋值给String
		// 方式2：通过toString()方法
		String str2 = buffer.toString();
		System.out.println("str:" + str);
		System.out.println("str2:" + str2);
	}
	
	
	
	
	
	
	
	
	
	/*
	 * 面试题：
	 * 1：String,StringBuffer,StringBuilder的区别?
	 * 		A:String是内容不可变的，而StringBuffer,StringBuilder都是内容可变的。
	 * 		B:StringBuffer是同步的，数据安全,效率低;StringBuilder是不同步的,数据不安全,效率高
	 * 
	 * 2：StringBuffer和数组的区别?
	 * 		二者都可以看出是一个容器，装其他的数据。
	 * 		但是呢,StringBuffer的数据最终是一个字符串数据。
	 * 		而数组可以放置多种数据，但必须是同一种数据类型的。
	 * 
	 * 3:形式参数问题
	 * 		String作为参数传递
	 * 		StringBuffer作为参数传递 
	 * 
	 * 形式参数：
	 * 		基本类型：形式参数的改变不影响实际参数
	 * 		引用类型：形式参数的改变直接影响实际参数
	 * 
	 * 注意：
	 * 		String作为参数传递，效果和基本类型作为参数传递是一样的。
	 * 		StringBuffer作为参数传递，效果和引用类型作为参数传递是一样的。
	 */
	@Test
	public void test_different() throws Exception {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);// hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);// hello---world

		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);// hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);// hello---worldworld
	}
	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;
		sb2.append(sb1);
	}
	public static void change(String s1, String s2) {
		s1 = s2;
		s2 = s1 + s2;
	}
	
	
	
}
