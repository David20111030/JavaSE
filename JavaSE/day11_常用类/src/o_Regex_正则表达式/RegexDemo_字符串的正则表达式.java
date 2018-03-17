package o_Regex_������ʽ;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;


public class RegexDemo_�ַ�����������ʽ {
	
	/**
	 * ������ʽ������һ��������ַ���
	 *  
	 *  String���һ������:
	 *  	public boolean matches(String regex);ע�⣺regex����������ʽ����������ͨ���ַ���������֪���ַ����Ƿ�ƥ�������������ʽ��
	 *  
	 *  ������ʽУ��qq����.
	 * 		1:Ҫ�������5-15λ����
 	 * 		2:0���ܿ�ͷ
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("����������QQ����");
		String qq = sc.nextLine();
		
		System.out.println("checkQQ:"+chechQQ(qq));
	}
	public boolean chechQQ(String qq) {
		//public boolean matches(String regex);��֪���ַ����Ƿ�ƥ�������������ʽ��
		//String regex = "[1-9]{1}[0-9]{4,14}";//�������
		String regex = "[1-9]\\d{4,14}";//�������
		boolean flag = qq.matches(regex);
		
		
		return flag;
	}
	
	
	
	
	
	/**
	 * �����ж��ֻ������Ƿ�����Ҫ��
	 * 		�ֻ��ű�����1��ͷ�����ȱ���Ϊ11λ
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ֻ����룬���ǽ�����֤��������ǲ����ֻ�����");
		String tel = sc.nextLine();
		
		//��֤����
		String regex = "[1][0-9]{10}";//���� String regex = "[1]\\d{10}";
		
		boolean flag = tel.matches(regex);
		
		System.out.println("phoneNumber?:"+flag);
	}
	
	
	
	
	/*
	 * У������
	 * 
	 * ������
	 * 		A:����¼������
	 * 		B:��������Ĺ���
	 * 			1517806580@qq.com
	 * 			liuyi@163.com
	 * 			linqingxia@126.com
	 * 			fengqingyang@sina.com.cn
	 * 			fqy@itcast.cn
	 * 		C:���ù��ܣ��жϼ���
	 * 		D:������
	 * 		@ǰ��ĵ����ַ���һ�����߶��
	 * 		@������2~6�������ַ�
	 * 	
	 */
	@Test
	public void test3() throws Exception {
		//����¼������
		Scanner sc = new Scanner(System.in);
		System.out.println("���������䣺");
		String email = sc.nextLine();	
	
		//�����������
		//String regex = "[a-zA-Z_0-9]+@[a-zA-z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
		String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
		
		
		System.out.println("email?:"+email.matches(regex));
	
	}
	
	
	
	/**
	 * �ָ��
	 *		String���public String[] split(String regex);���ݸ�����regex����ִ��ַ����������ַ�����ֳ�Ҫ���ַ�������
	 *		���ݸ���������ʽ��ƥ���ִ��ַ����� 
	 *
	 * ������
	 * 		�ٺ��������ͼ�Ե,�䰮��,QQ
	 * 		��������
	 * 			�Ա�Ů
	 * 			��Χ��"18-24"
	 * 
	 * 		age>=18 && age<=24
	 */
	@Test
	public void test4() throws Exception {
		//����һ�����������ַ���
		String ages = "18-24";
		
		//�����ֹ���
		//String regex = "-";
		//String[] strArray =  ages.split(regex);//����regex����ִ��ַ����������ַ�����ֳ�Ҫ���ַ�������
		//����ֱ��һ�д���
		String[] strArray = ages.split("-");//���� - ����ִ��ַ����������ַ�����ֳ�Ҫ���ַ�������
		
		//��εõ�int���͵���?
		int startAge = Integer.parseInt(strArray[0]);
		int endAge = Integer.parseInt(strArray[1]);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������");
		int age = sc.nextInt();
		
		if(age>=startAge && age<=endAge) {
			System.out.println("����������ҵ�");
		}else {
			System.out.println("�������ҵ�Ҫ��gun");
		}
	}
	
	
	
	
	/**
	 * �ָ����ϰ
	 */
	@Test
	public void test6() throws Exception {
		// ����һ���ַ���
		String s1 = "aa,bb,cc";
		// ֱ�ӷָ�
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
		
		//Ӳ���ϵ�·��������Ӧ����\\���\
		String s4 = "E:\\JavaSE\\day14\\avi";
		String[] str4Array = s4.split("\\\\");
		for (int x = 0; x < str4Array.length; x++) {
			System.out.println(str4Array[x]);
		}
		System.out.println("---------------------");
	}
	
	
	
	/**
	 * ��������һ���ַ���:"91 27 46 38 50"
	 * ��д����ʵ�������������ǣ�"27 38 46 50 91"
	 * 
	 * ������
	 * 		A:����һ���ַ���
	 * 		B:���ַ������зָ�õ�һ���ַ�������
	 * 		C:���ַ�������任��int����
	 * 		D:��int��������
	 * 		E:��������int��������װ��һ���ַ���
	 * 		F:����ַ���
	 */
	@Test
	public void test7() throws Exception {
		//����һ���ַ���
		String s = "91 27 46 38 50";
		
		//�Ѹ��ַ������зָ�
		String[] strArray = s.split(" ");
		
		//���ַ�������ת����int����
		//����һ��int����
		int[] arr = new int[strArray.length];
		
		for(int i = 0;i<strArray.length;i++){
			arr[i] = Integer.parseInt(strArray[i]);//��ֵ֮ǰ�ý��ַ���ת����int���͵�����
		}
		
		//�������������
		Arrays.sort(arr);
		
		//�ٽ�����õ�int����ת����String����
		for(int i = 0;i<strArray.length;i++){
			strArray[i] = String.valueOf(arr[i]);
		}
		
		s = "";
		//�ٽ��ַ�������ƴ�ӳ�һ���ַ���
		for(int i = 0;i<strArray.length;i++){
			s = s+strArray[i]+" ";
		}
		
		System.out.println(s);//27 38 46 50 91 
		
	}
	
	
	
	/**
	 * �滻����
	 *  String���public String replaceAll(String regex,String replacement);regex����������ʽ
	 *  	ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ����� 
	 */
	@Test
	public void test8() throws Exception {
		// ����һ���ַ���
		String s = "helloqq12345worldkh622112345678java";

		// ֱ�Ӱ����ָɵ�
		//String regex = "\\d+";//result:helloqqworldkhjava
		//String ss = "";

		
		// ��Ҫȥ�����е�����,��*���滻��
		//String regex = "[0-9]+";//String regex = "\\d+";//�滻����        result:helloqq*worldkh*java
		String regex = "[0-9]";//String regex = "\\d";//result:helloqq*****worldkh************java
		String ss = "*";//Ҫ�滻�ɵ��ַ���
		
		
		
		String result = s.replaceAll(regex, ss);
		
		System.out.println("result:"+result);
		
	}
	
	
	
}
