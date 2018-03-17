package o_Regex_正则表达式;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;


public class RegexDemo_字符串的正则表达式 {
	
	/**
	 * 正则表达式：符合一定规则的字符串
	 *  
	 *  String类的一个方法:
	 *  	public boolean matches(String regex);注意：regex代表正则表达式啊！不是普通的字符串啊！告知此字符串是否匹配给定的正则表达式。
	 *  
	 *  正则表达式校验qq号码.
	 * 		1:要求必须是5-15位数字
 	 * 		2:0不能开头
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的QQ号码");
		String qq = sc.nextLine();
		
		System.out.println("checkQQ:"+chechQQ(qq));
	}
	public boolean chechQQ(String qq) {
		//public boolean matches(String regex);告知此字符串是否匹配给定的正则表达式。
		//String regex = "[1-9]{1}[0-9]{4,14}";//定义规则
		String regex = "[1-9]\\d{4,14}";//定义规则
		boolean flag = qq.matches(regex);
		
		
		return flag;
	}
	
	
	
	
	
	/**
	 * 需求：判断手机号码是否满足要求
	 * 		手机号必须以1开头，长度必须为11位
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个手机号码，我们将会验证您输入的是不是手机号码");
		String tel = sc.nextLine();
		
		//验证规则
		String regex = "[1][0-9]{10}";//或者 String regex = "[1]\\d{10}";
		
		boolean flag = tel.matches(regex);
		
		System.out.println("phoneNumber?:"+flag);
	}
	
	
	
	
	/*
	 * 校验邮箱
	 * 
	 * 分析：
	 * 		A:键盘录入邮箱
	 * 		B:定义邮箱的规则
	 * 			1517806580@qq.com
	 * 			liuyi@163.com
	 * 			linqingxia@126.com
	 * 			fengqingyang@sina.com.cn
	 * 			fqy@itcast.cn
	 * 		C:调用功能，判断即可
	 * 		D:输出结果
	 * 		@前面的单词字符有一个或者多个
	 * 		@后面有2~6个单词字符
	 * 	
	 */
	@Test
	public void test3() throws Exception {
		//键盘录入邮箱
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String email = sc.nextLine();	
	
		//定义邮箱规则
		//String regex = "[a-zA-Z_0-9]+@[a-zA-z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
		
		
		System.out.println("email?:"+email.matches(regex));
	
	}
	
	
	
	/**
	 * 分割功能
	 *		String类的public String[] split(String regex);根据给定的regex来拆分此字符串，将该字符串拆分成要给字符串数组
	 *		根据给定正则表达式的匹配拆分此字符串。 
	 *
	 * 举例：
	 * 		百合网，世纪佳缘,珍爱网,QQ
	 * 		搜索好友
	 * 			性别：女
	 * 			范围："18-24"
	 * 
	 * 		age>=18 && age<=24
	 */
	@Test
	public void test4() throws Exception {
		//定义一个年龄搜索字符串
		String ages = "18-24";
		
		//定义拆分规则
		//String regex = "-";
		//String[] strArray =  ages.split(regex);//根据regex来拆分此字符串，将该字符串拆分成要给字符串数组
		//或者直接一行代码
		String[] strArray = ages.split("-");//根据 - 来拆分此字符串，将该字符串拆分成要给字符串数组
		
		//如何得到int类型的呢?
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age = sc.nextInt();
		
		if(age>=startAge && age<=endAge) {
			System.out.println("你就是我想找的");
		}else {
			System.out.println("不符合我的要求，gun");
		}
	}
	
	
	
	
	/**
	 * 分割功能练习
	 */
	@Test
	public void test6() throws Exception {
		// 定义一个字符串
		String s1 = "aa,bb,cc";
		// 直接分割
		String[] str1Array = s1.split(",");
		for (int x = 0; x < str1Array.length; x++) {
			System.out.println(str1Array[x]);
		}
		System.out.println("---------------------");

		String s2 = "aa.bb.cc";
		String[] str2Array = s2.split("\\.");
		for (int x = 0; x < str2Array.length; x++) {
			System.out.println(str2Array[x]);
		}
		System.out.println("---------------------");

		String s3 = "aa    bb                cc";
		String[] str3Array = s3.split(" +");
		for (int x = 0; x < str3Array.length; x++) {
			System.out.println(str3Array[x]);
		}
		System.out.println("---------------------");
		
		//硬盘上的路径，我们应该用\\替代\
		String s4 = "E:\\JavaSE\\day14\\avi";
		String[] str4Array = s4.split("\\\\");
		for (int x = 0; x < str4Array.length; x++) {
			System.out.println(str4Array[x]);
		}
		System.out.println("---------------------");
	}
	
	
	
	/**
	 * 我有如下一个字符串:"91 27 46 38 50"
	 * 请写代码实现最终输出结果是："27 38 46 50 91"
	 * 
	 * 分析：
	 * 		A:定义一个字符串
	 * 		B:把字符串进行分割，得到一个字符串数组
	 * 		C:把字符串数组变换成int数组
	 * 		D:对int数组排序
	 * 		E:把排序后的int数组在组装成一个字符串
	 * 		F:输出字符串
	 */
	@Test
	public void test7() throws Exception {
		//定义一个字符串
		String s = "91 27 46 38 50";
		
		//把该字符串进行分割
		String[] strArray = s.split(" ");
		
		//把字符串数组转换成int数组
		//定义一个int数组
		int[] arr = new int[strArray.length];
		
		for(int i = 0;i<strArray.length;i++){
			arr[i] = Integer.parseInt(strArray[i]);//赋值之前得将字符串转换成int类型的数据
		}
		
		//对数组进行排序
		Arrays.sort(arr);
		
		//再将排序好的int数组转换成String数组
		for(int i = 0;i<strArray.length;i++){
			strArray[i] = String.valueOf(arr[i]);
		}
		
		s = "";
		//再将字符串数组拼接成一个字符串
		for(int i = 0;i<strArray.length;i++){
			s = s+strArray[i]+" ";
		}
		
		System.out.println(s);//27 38 46 50 91 
		
	}
	
	
	
	/**
	 * 替换功能
	 *  String类的public String replaceAll(String regex,String replacement);regex代表正则表达式
	 *  	使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 
	 */
	@Test
	public void test8() throws Exception {
		// 定义一个字符串
		String s = "helloqq12345worldkh622112345678java";

		// 直接把数字干掉
		//String regex = "\\d+";//result:helloqqworldkhjava
		//String ss = "";

		
		// 我要去除所有的数字,用*给替换掉
		//String regex = "[0-9]+";//String regex = "\\d+";//替换规则        result:helloqq*worldkh*java
		String regex = "[0-9]";//String regex = "\\d";//result:helloqq*****worldkh************java
		String ss = "*";//要替换成的字符串
		
		
		
		String result = s.replaceAll(regex, ss);
		
		System.out.println("result:"+result);
		
	}
	
	
	
}
