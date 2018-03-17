package c_String;

import org.junit.Test;

public class StringDemo {
	
	/*
	 * 字符串：就是由多个字符组成的一串数据。也可以看成是一个字符数组。
	 * 通过查看API，我们可以知道
	 * 		A:字符串字面值"abc"也可以看成是一个字符串对象。
	 * 		B:字符串是常量，一旦被赋值，就不能被改变。
	 * 
	 * 构造方法：
	 * 		public String():空构造
	 *		public String(byte[] bytes):把字节数组转成字符串
	 *		public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
	 *		public String(char[] value):把字符数组转成字符串
	 *		public String(char[] value,int index,int count):把字符数组的一部分转成字符串
	 *		public String(String original):把字符串常量值转成字符串
	 *
	 * 字符串的方法：
	 * 		public int length()：返回此字符串的长度。
	 */	
	@Test
	public void test1() throws Exception {
		// public String():空构造
		String s1 = new String();
		System.out.println("s1:" + s1);//s1:
		System.out.println("s1.length():" + s1.length());//s1.length():0
		System.out.println("--------------------------");

		// public String(byte[] bytes):把字节数组转成字符串
		byte[] bys = { 97, 98, 99, 100, 101 };
		String s2 = new String(bys);
		System.out.println("s2:" + s2);//s2:abcde
		System.out.println("s2.length():" + s2.length());//s2.length():5
		System.out.println("--------------------------");

		// public String(byte[] bytes,int index,int length):把字节数组的一部分转成字符串
		// 我想得到字符串"bcd"
		String s3 = new String(bys, 1, 3);
		System.out.println("s3:" + s3);//s3:bcd
		System.out.println("s3.length():" + s3.length());//s3.length():3
		System.out.println("--------------------------");

		// public String(char[] value):把字符数组转成字符串
		char[] chs = { 'a', 'b', 'c', 'd', 'e', '爱', '林', '亲' };
		String s4 = new String(chs);
		System.out.println("s4:" + s4);//s4:abcde爱林亲
		System.out.println("s4.length():" + s4.length());//s4.length():8
		System.out.println("--------------------------");

		// public String(char[] value,int index,int count):把字符数组的一部分转成字符串
		String s5 = new String(chs, 2, 4);
		System.out.println("s5:" + s5);//s5:cde爱
		System.out.println("s5.length():" + s5.length());//s5.length():4
		System.out.println("--------------------------");
		
		//public String(String original):把字符串常量值转成字符串
		String s6 = new String("abcde");
		System.out.println("s6:" + s6);//s6:abcde
		System.out.println("s6.length():" + s6.length());//s6.length():5
		System.out.println("--------------------------");
		
		//字符串字面值"abc"也可以看成是一个字符串对象。
		String s7 = "abcde";
		System.out.println("s7:"+s7);//s7:abcde
		System.out.println("s7.length():"+s7.length());//s7.length():5
		
	}
	
	
	/*
	 * 字符串的特点：一旦被赋值，就不能改变，是指值不能改变。
	 */
	@Test
	public void test2() throws Exception {
		String s = "hello";
		s += "world";
		System.out.println("s:" + s); // helloworld
	}
	
	
	/*
	 * String s = new String(“hello”)和String s = “hello”;的区别?
	 * 有。前者会创建2个对象，后者创建1个对象。
	 * 
	 * ==:比较引用类型比较的是地址值是否相同
	 * equals:比较引用类型默认也是比较地址值是否相同，而String类重写了equals()方法，比较的是内容是否相同。
	 */
	@Test
	public void test3() throws Exception {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
	}
	
	
	//看程序写结果
	@Test
	public void test4() throws Exception {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true

		String s3 = new String("hello");
		String s4 = "hello";
		System.out.println(s3 == s4);//false
		System.out.println(s3.equals(s4));//true 

		String s5 = "hello";
		String s6 = "hello";
		System.out.println(s5 == s6);//false 这个我们错了，应该是true
		/**
		 * 原因：字符串直接复制的方式是先到字符串常量池里面去找，如果有就直接返回，没有，就创建并返回
		 */
		System.out.println(s5.equals(s6));//true 
	}
	
	
	/*
	 * 看程序写结果
	 * 		字符串如果是变量相加，先开空间，再拼接。
	 * 		字符串如果是常量相加，是先加，然后在常量池找，如果有就直接返回，否则，就创建,并返回。
	 */
	@Test
	public void test5() throws Exception {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);//false
		System.out.println(s3.equals((s1 + s2)));//true 
		
		System.out.println(s3 == "hello" + "world");// true
		System.out.println(s3.equals("hello" + "world"));// true


		// 通过反编译看源码，我们知道这里已经做好了处理。
		// System.out.println(s3 == "helloworld");
		// System.out.println(s3.equals("helloworld"));

	}
	
	
	/*
	 * String类的判断功能：
	 *	 boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
	 *	 boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
	 *	 boolean contains(String str):判断大字符串中是否包含小字符串
	 *	 boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
	 *	 boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
	 *	 boolean isEmpty():判断字符串内容是否为空。
	 * 
	 * 注意：
	 * 		字符串内容为空和字符串对象为空。
	 * 		String s = "";//字符串内容为空
	 * 		String s = null;//字符串对象为空
	 */
	@Test
	public void testBoolean() throws Exception {
		// 创建字符串对象
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";

		// boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
		System.out.println("equals:" + s1.equals(s2));//true
		System.out.println("equals:" + s1.equals(s3));//false
		System.out.println("-----------------------");

		// boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
		System.out.println("equals:" + s1.equalsIgnoreCase(s2));//true
		System.out.println("equals:" + s1.equalsIgnoreCase(s3));//true
		System.out.println("-----------------------");

		// boolean contains(String str):判断大字符串中是否包含小字符串
		System.out.println("contains:" + s1.contains("hello"));//true
		System.out.println("contains:" + s1.contains("hw"));//false
		System.out.println("-----------------------");

		// boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
		System.out.println("startsWith:" + s1.startsWith("h"));//true
		System.out.println("startsWith:" + s1.startsWith("hello"));//true
		System.out.println("startsWith:" + s1.startsWith("world"));//false
		System.out.println("-----------------------");

		// 练习：boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾这个自己玩

		// boolean isEmpty():判断字符串内容是否为空。
		System.out.println("isEmpty:" + s1.isEmpty());//false

		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty:" + s4.isEmpty());//true
		// NullPointerException
		// s5对象都不存在，所以不能调用方法，空指针异常
		//System.out.println("isEmpty:" + s5.isEmpty());		
	}
	
	
	
	
	
	/*
	 * String类的获取功能
	 * 		int length():获取字符串的长度。
	 * 		char charAt(int index):获取指定索引位置的字符
	 * 		int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
	 * 				为什么这里是int类型，而不是char类型?
	 * 				原因是：'a'和97其实都可以代表'a'
	 * 		int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。 是从0开始计数的
	 * 		int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。 是从0开始计数的。如果没有该字符，则返回-1
	 * 		int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。 是从0开始计数的.如果没有该字符，则返回-1
	 * 		String substring(int start):从指定位置开始截取字符串,默认到末尾。
	 * 		String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。
	 */
	@Test 
	public void testN()throws Exception{
		String ids = "6,7,";
		//去掉两边空格
		ids = ids.trim();
		//去掉最后一个","逗号
		ids = ids.substring(0, ids.length()-1);//"6,7"
		String[] trainIds = ids.split(",");
		for(String id:trainIds){
			System.out.println(id);
		}
		//System.out.println(ids);
	}
	
	@Test
	public void testString_Get() throws Exception {
		// 定义一个字符串对象
		String s = "helloworld";

		// int length():获取字符串的长度。
		System.out.println("s.length:" + s.length());//10
		System.out.println("----------------------");

		// char charAt(int index):获取指定索引位置的字符  是从0开始计数的
		System.out.println("charAt:" + s.charAt(7));//r
		System.out.println("----------------------");

		// int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。 是从0开始计数的
		System.out.println("indexOf:" + s.indexOf('l'));//2
		System.out.println("----------------------");

		// int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。 是从0开始计数的
		System.out.println("indexOf:" + s.indexOf("owo"));//4
		System.out.println("----------------------");

		// int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。如果没有该字符，则返回-1
		System.out.println("indexOf:" + s.indexOf('l', 4));//8
		System.out.println("indexOf:" + s.indexOf('k', 4)); // -1
		System.out.println("indexOf:" + s.indexOf('l', 40)); // -1
		System.out.println("----------------------");

		// 自己练习：int indexOf(String str,int
		// fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。

		// String substring(int start):从指定位置开始截取字符串,默认到末尾。包含start这个索引
		System.out.println("substring:" + s.substring(5));//world
		System.out.println("substring:" + s.substring(0));//helloworld
		System.out.println("----------------------");

		// String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。包括start索引但是不包end索引
		System.out.println("substring:" + s.substring(3, 8));//lowor     也就是左开右闭 [3,8)
		System.out.println("substring:" + s.substring(0, s.length()));// helloworld 也就是[0,10)	 	
	}
	
	
	/*
	 * 需求：遍历获取字符串中的每一个字符
	 * 
	 * 分析：
	 * 		A:如何能够拿到每一个字符呢?
	 * 			char charAt(int index)
	 * 		B:我怎么知道字符到底有多少个呢?
	 * 			int length()
	 */
	@Test
	public void test6() throws Exception {
		// 定义字符串
		String s = "helloworld";

		// 原始版本
		// System.out.println(s.charAt(0));
		// System.out.println(s.charAt(1));
		// System.out.println(s.charAt(2));
		// System.out.println(s.charAt(3));
		// System.out.println(s.charAt(4));
		// System.out.println(s.charAt(5));
		// System.out.println(s.charAt(6));
		// System.out.println(s.charAt(7));
		// System.out.println(s.charAt(8));
		// System.out.println(s.charAt(9));

		// 只需要我们从0取到9
		// for (int x = 0; x < 10; x++) {
		// System.out.println(s.charAt(x));
		// }

		// 如果长度特别长，我不可能去数，所以我们要用长度功能
		for (int x = 0; x < s.length(); x++) {
			// char ch = s.charAt(x);
			// System.out.println(ch);
			// 仅仅是输出，我就直接输出了
			System.out.println(s.charAt(x));
		}
	}
	
	
	
	/*
	 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
	 * 举例：
	 * 		"Hello123World"
	 * 结果：
	 * 		大写字符：2个
	 * 		小写字符：8个
	 * 		数字字符：3个
	 * 
	 * 分析：
	 * 		前提：字符串要存在
	 * 		A:定义三个统计变量
	 * 			bigCount=0
	 * 			smallCount=0
	 * 			numberCount=0
	 * 		B:遍历字符串，得到每一个字符。
	 * 			length()和charAt()结合
	 * 		C:判断该字符到底是属于那种类型的
	 * 			大：bigCount++
	 * 			小：smallCount++
	 * 			数字：numberCount++
	 * 
	 * 			这道题目的难点就是如何判断某个字符是大的，还是小的，还是数字的。
	 * 			ASCII码表：
	 * 				0	48
	 * 				A	65
	 * 				a	97
	 * 			虽然，我们按照数字的这种比较是可以的，但是想多了，有比这还简单的
	 * 				char ch = s.charAt(x);
	 * 
	 * 				if(ch>='0' && ch<='9') numberCount++
	 * 				if(ch>='a' && ch<='z') smallCount++
	 * 				if(ch>='A' && ch<='Z') bigCount++
	 *		D:输出结果。
	 *
	 * 练习：把给定字符串的方式，改进为键盘录入字符串的方式。
	 */
	@Test
	public void test7() throws Exception {
		//定义一个字符串
		String s = "Hello123World";
		
		//定义三个统计变量
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		//遍历字符串，得到每一个字符。
		for(int x=0; x<s.length(); x++){
			char ch = s.charAt(x);
			
			//判断该字符到底是属于那种类型的
			if(ch>='a' && ch<='z'){
				smallCount++;
			}else if(ch>='A' && ch<='Z'){
				bigCount++;
			}else if(ch>='0' && ch<='9'){
				numberCount++;
			}
		}
		
		//输出结果。
		System.out.println("大写字母"+bigCount+"个");
		System.out.println("小写字母"+smallCount+"个");
		System.out.println("数字"+numberCount+"个");
		/**
		 * 打印结果：
		 * 大写字母2个
			小写字母8个
			数字3个
		 */
	}
	
	
	/*
	 * String的转换功能：
	 *		 byte[] getBytes():把字符串转换为字节数组。
	 *		 char[] toCharArray():把字符串转换为字符数组。
	 *		 static String valueOf(char[] chs):把字符数组转成字符串。
	 *		 static String valueOf(int i):把int类型的数据转成字符串。
	 * 				注意：String类的valueOf方法可以把任意类型的数据转成字符串。
	 *		 String toLowerCase():把字符串转成小写。
	 *		 String toUpperCase():把字符串转成大写。
	 *		 String concat(String str):把字符串拼接。
	 */
	@Test
	public void testString_convert() throws Exception {
		// 定义一个字符串对象
		String s = "JavaSE";

		// byte[] getBytes():把字符串转换为字节数组。
		byte[] bys = s.getBytes();
		for (int x = 0; x < bys.length; x++) {
			System.out.print(bys[x]+" ");
		}
		//遍历结果：74 97 118 97 83 69      也就是编程该字符对应的ASCII码了
		System.out.println("----------------");

		// char[] toCharArray():把字符串转换为字符数组。
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("----------------");

		// static String valueOf(char[] chs):把字符数组转成字符串。
		String ss = String.valueOf(chs);
		System.out.println(ss);
		System.out.println("----------------");

		// static String valueOf(int i):把int类型的数据转成字符串。
		int i = 100;
		String sss = String.valueOf(i);
		System.out.println(sss);
		System.out.println("----------------");

		// String toLowerCase():把字符串转成小写。
		System.out.println("toLowerCase:" + s.toLowerCase());
		System.out.println("s:" + s);
		// System.out.println("----------------");
		// String toUpperCase():把字符串转成大写。
		System.out.println("toUpperCase:" + s.toUpperCase());
		System.out.println("----------------");

		// String concat(String str):把字符串拼接。
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);		
		System.out.println("helloworld"==s4);//false
		System.out.println(s3==s4);//false
	}
	
	
	
	/*
	 * String类的其他功能：
	 * 
	 * 替换功能：
	 * 		String replace(char old,char new);
	 *		String replace(String old,String new);
	 *
	 * 去除字符串两空格:	
	 *		String trim();
	 * 
	 * 按字典顺序比较两个字符串:  
	 * 		int compareTo(String str);
	 * 		int compareToIgnoreCase(String str);//按字典顺序比较两个字符串，忽略大小写
	 * 	 	 
	 * 		  比较规则：			
	 * 			如果相同的话，则返回 0。
	 *  		如果不相同的话:
	 *  			如果要进行比较的两个字符串的长度不相同:	
	 *  					则返回第一个不相同的字符的ASCII码值的差.
	 *  			如果要进行比较的两个字符串的长度不相同:
     *  					假设s1.length>s2.length:
	 *  						若s2的内容都和s1的对应位置的字符内容相同，则返回的比较结果为他们之间的字符个数之差(也就是s1.length-s2.length)
	 *  						若s2的内容都和s1的对应位置的字符内容不尽相同，则返回第一个不相同的字符的ASCII码值的差.
	 *  	
	 * 
	 */
	@Test
	public void testString_replace() throws Exception {
		// 替换功能
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		String s3 = s1.replace("owo", "ak47");
		System.out.println("s1:" + s1);//helloworld
		System.out.println("s2:" + s2);//hekkoworkd
		System.out.println("s3:" + s3);//hellak47rld
		System.out.println("---------------");

		// 去除字符串两空格
		String s4 = " hello world  ";
		String s5 = s4.trim();
		System.out.println("s4:" + s4 + "---");//s4: hello world ---
		System.out.println("s5:" + s5 + "---");//s5:hello world---

		// 按字典顺序比较两个字符串
		// 
		/*
		 * 	如果相同的话，则返回 0。
		 *  如果不相同的话:
		 *  	如果要进行比较的两个字符串的长度:	
		 *  			则返回第一个不相同的字符的ASCII码值的差.
		 *  	如果要进行比较的两个字符串的长度不相同:
		 *  			假设s1.length>s2.length:
		 *  				若s2的内容都和s1的对应位置的字符内容相同，则返回的比较结果为他们之间的字符个数之差(也就是s1.length-s2.length)
		 *  				若s2的内容都和s1的对应位置的字符内容不尽相同，则返回第一个不相同的字符的ASCII码值的差.
		 *  	如果要进行比较的两个字符串的长度不相同:
		 */
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		System.out.println(s6.compareTo(s7));// 0
		System.out.println(s6.compareTo(s8));// 7
		System.out.println(s6.compareTo(s9));// -16		
		
		System.out.println("-------$$$-----------");
		
		String str1 = "hello";
		String str2 = "hll";
		System.out.println(str1.compareTo(str2)); // 4   str1的长度减去str2的长度
		
		System.out.println("-----------");
		
		String str3 = "hello";
		String str4 = "hwl";
		System.out.println(str3.compareTo(str4)); // -18   e的ASCII码值减去w的ASCII码值
	}
	
	
}
