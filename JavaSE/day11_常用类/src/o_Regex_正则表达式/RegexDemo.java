package o_Regex_������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexDemo {

	/**
	 * ��ȡ���ܣ� 
	 * 		Pattern �� Matcher���ʹ��
	 * 
	 * 		ģʽ��ƥ�����Ļ���ʹ��˳��
	 * 			���裺
	 * 				1����������ʽ�����ģʽ����
	 * 				    Pattern p = Pattern.compile(String regex);����regex����������ʽ
	 * 				2��ͨ��ģʽ����õ�ƥ�����������ʱ����Ҫ���Ǳ�ƥ����ַ���
	 * 					Matcher m =	p.matcher(CharSequence input);����input����ƥ����ַ���
	 * 				3������ƥ��������Ĺ���
	 * 					boolean b = m.matches();��ʾƥ������ս��
	 * 		
	 * 		���ֻ�ǵõ�booleanֵ����������һ�����
	 * 			boolean flag = Pattern.matches(String regex,CharSequence input);
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		
		// ģʽ��ƥ�����ĵ��͵���˳��
		// ��������ʽ�����ģʽ����
		Pattern p = Pattern.compile("a*b");
		// ͨ��ģʽ����õ�ƥ�����������ʱ����Ҫ���Ǳ�ƥ����ַ���
		p.matcher("");
		Matcher m = p.matcher("aaaab");
		// ����ƥ��������Ĺ���
		boolean b = m.matches();
		System.out.println(b);// true

		// ������жϹ��ܣ�����������жϣ����������е��鷳�ˣ�����ֱ�����ַ����ķ�����
		String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);

	}
	
	
	/**
	 * 	һ��������
	 * 
	 * 	��ȡ���ܣ�
	 * 		��ȡ��������ַ������������ַ���ɵĵ���
	 *			 da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
	 *
	 *Matcher�������������
	 *  boolean find();// ���Բ������ģʽƥ����������е���һ�������С�
		String group();//��������ǰƥ�������ƥ������������С�
	 */
	@Test
	public void test2() throws Exception {
		// �����ַ���
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		//�������
		String regex = "\\b\\w{3}\\b";
		
		//�ѹ�������ģʽ����
		Pattern p = Pattern.compile(regex);
		//ͨ��ģʽ����õ�ƥ��������
		Matcher m = p.matcher(s);
		

		while(m.find()){
			System.out.println(m.group());
		}
		// ע�⣺һ��Ҫ��find()��Ȼ�����group()
		// IllegalStateException: No match found
		// String ss = m.group();
		// System.out.println(ss);
		
		
	}
	
}
