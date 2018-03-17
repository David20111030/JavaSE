package e_Character;

import java.util.Scanner;

import org.junit.Test;

public class CharacterDemo {

	/**
	 * Character 类在对象中包装一个基本类型 char 的值.
	 * 	此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然
	 * 
	 * 构造方法：
	 * 		Character(char value)
	 */
	@Test
	public void test1() throws Exception {
		//创建对象
		//Character ch = new Character((char)97);
		Character ch = new Character('a');
		System.out.println("ch:"+ch);//ch:a
	}
	
	
	/**
	 * Character类的一些方法：
	 * 		public static boolean isUpperCase(char ch):判断给定的字符是否是大写字符
	 * 		public static boolean isLowerCase(char ch):判断给定的字符是否是小写字符
	 * 		public static boolean isDigit(char ch):判断给定的字符是否是数字字符
	 * 		public static char toUpperCase(char ch):把给定的字符转换为大写字符
	 * 		public static char toLowerCase(char ch):把给定的字符转换为小写字符
	 */
	@Test
	public void testMethod() throws Exception {
		// public static boolean isUpperCase(char ch):判断给定的字符是否是大写字符
		System.out.println("isUpperCase:" + Character.isUpperCase('A'));
		System.out.println("isUpperCase:" + Character.isUpperCase('a'));
		System.out.println("isUpperCase:" + Character.isUpperCase('0'));//false
		System.out.println("-----------------------------------------");
		// public static boolean isLowerCase(char ch):判断给定的字符是否是小写字符
		System.out.println("isLowerCase:" + Character.isLowerCase('A'));
		System.out.println("isLowerCase:" + Character.isLowerCase('a'));
		System.out.println("isLowerCase:" + Character.isLowerCase('0'));//false
		System.out.println("-----------------------------------------");
		// public static boolean isDigit(char ch):判断给定的字符是否是数字字符
		System.out.println("isDigit:" + Character.isDigit('A'));//false
		System.out.println("isDigit:" + Character.isDigit('a'));//false
		System.out.println("isDigit:" + Character.isDigit('0'));//true
		System.out.println("-----------------------------------------");
		// public static char toUpperCase(char ch):把给定的字符转换为大写字符
		System.out.println("toUpperCase:" + Character.toUpperCase('A'));//A
		System.out.println("toUpperCase:" + Character.toUpperCase('a'));//A
		System.out.println("-----------------------------------------");
		// public static char toLowerCase(char ch):把给定的字符转换为小写字符
		System.out.println("toLowerCase:" + Character.toLowerCase('A'));//a
		System.out.println("toLowerCase:" + Character.toLowerCase('a'));//a
	}
	
	
	
	
	
	/**
	 * 一个案例:这个案例可以不用看
	 * 
	 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
	 * 
	 * 分析：
	 * 		A:定义三个统计变量。
	 * 			int bigCont=0;
	 * 			int smalCount=0;
	 * 			int numberCount=0;
	 * 		B:键盘录入一个字符串。
	 * 		C:把字符串转换为字符数组。
	 * 		D:遍历字符数组获取到每一个字符
	 * 		E:判断该字符是
	 * 			大写	bigCount++;
	 * 			小写	smalCount++;
	 * 			数字	numberCount++;
	 * 		F:输出结果即可
	 */
	@Test
	public void test_eg() throws Exception {
		// 定义三个统计变量。
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// 键盘录入一个字符串。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();

		// 把字符串转换为字符数组。
		char[] chs = line.toCharArray();

		// 历字符数组获取到每一个字符
		for (int x = 0; x < chs.length; x++) {
			char ch = chs[x];

			// 判断该字符
			if (Character.isUpperCase(ch)) {
				bigCount++;
			} else if (Character.isLowerCase(ch)) {
				smallCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			}
		}

		// 输出结果即可
		System.out.println("大写字母：" + bigCount + "个");
		System.out.println("小写字母：" + smallCount + "个");
		System.out.println("数字字符：" + numberCount + "个");
	}
}
