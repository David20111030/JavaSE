package o_Regex_正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexDemo {

	/**
	 * 获取功能： 
	 * 		Pattern 和 Matcher类的使用
	 * 
	 * 		模式和匹配器的基本使用顺序
	 * 			步骤：
	 * 				1、把正则表达式编译成模式对象
	 * 				    Pattern p = Pattern.compile(String regex);参数regex代表正则表达式
	 * 				2、通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
	 * 					Matcher m =	p.matcher(CharSequence input);参数input代表被匹配的字符串
	 * 				3、调用匹配器对象的功能
	 * 					boolean b = m.matches();表示匹配的最终结果
	 * 		
	 * 		如果只是得到boolean值，可以用这一行替代
	 * 			boolean flag = Pattern.matches(String regex,CharSequence input);
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		
		// 模式和匹配器的典型调用顺序
		// 把正则表达式编译成模式对象
		Pattern p = Pattern.compile("a*b");
		// 通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
		p.matcher("");
		Matcher m = p.matcher("aaaab");
		// 调用匹配器对象的功能
		boolean b = m.matches();
		System.out.println(b);// true

		// 这个是判断功能，但是如果做判断，这样做就有点麻烦了，我们直接用字符串的方法做
		String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);

	}
	
	
	/**
	 * 	一个案例：
	 * 
	 * 	获取功能：
	 * 		获取下面这个字符串中由三个字符组成的单词
	 *			 da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
	 *
	 *Matcher类的两个方法：
	 *  boolean find();// 尝试查找与该模式匹配的输入序列的下一个子序列。
		String group();//返回由以前匹配操作所匹配的输入子序列。
	 */
	@Test
	public void test2() throws Exception {
		// 定义字符串
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		//定义规则
		String regex = "\\b\\w{3}\\b";
		
		//把规则编译成模式对象
		Pattern p = Pattern.compile(regex);
		//通过模式对象得到匹配器对象
		Matcher m = p.matcher(s);
		

		while(m.find()){
			System.out.println(m.group());
		}
		// 注意：一定要先find()，然后才能group()
		// IllegalStateException: No match found
		// String ss = m.group();
		// System.out.println(ss);
		
		
	}
	
}
