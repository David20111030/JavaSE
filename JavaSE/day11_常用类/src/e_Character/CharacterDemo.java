package e_Character;

import java.util.Scanner;

import org.junit.Test;

public class CharacterDemo {

	/**
	 * Character ���ڶ����а�װһ���������� char ��ֵ.
	 * 	���⣬�����ṩ�˼��ַ�������ȷ���ַ������Сд��ĸ�����֣��ȵȣ��������ַ��Ӵ�дת����Сд����֮��Ȼ
	 * 
	 * ���췽����
	 * 		Character(char value)
	 */
	@Test
	public void test1() throws Exception {
		//��������
		//Character ch = new Character((char)97);
		Character ch = new Character('a');
		System.out.println("ch:"+ch);//ch:a
	}
	
	
	/**
	 * Character���һЩ������
	 * 		public static boolean isUpperCase(char ch):�жϸ������ַ��Ƿ��Ǵ�д�ַ�
	 * 		public static boolean isLowerCase(char ch):�жϸ������ַ��Ƿ���Сд�ַ�
	 * 		public static boolean isDigit(char ch):�жϸ������ַ��Ƿ��������ַ�
	 * 		public static char toUpperCase(char ch):�Ѹ������ַ�ת��Ϊ��д�ַ�
	 * 		public static char toLowerCase(char ch):�Ѹ������ַ�ת��ΪСд�ַ�
	 */
	@Test
	public void testMethod() throws Exception {
		// public static boolean isUpperCase(char ch):�жϸ������ַ��Ƿ��Ǵ�д�ַ�
		System.out.println("isUpperCase:" + Character.isUpperCase('A'));
		System.out.println("isUpperCase:" + Character.isUpperCase('a'));
		System.out.println("isUpperCase:" + Character.isUpperCase('0'));//false
		System.out.println("-----------------------------------------");
		// public static boolean isLowerCase(char ch):�жϸ������ַ��Ƿ���Сд�ַ�
		System.out.println("isLowerCase:" + Character.isLowerCase('A'));
		System.out.println("isLowerCase:" + Character.isLowerCase('a'));
		System.out.println("isLowerCase:" + Character.isLowerCase('0'));//false
		System.out.println("-----------------------------------------");
		// public static boolean isDigit(char ch):�жϸ������ַ��Ƿ��������ַ�
		System.out.println("isDigit:" + Character.isDigit('A'));//false
		System.out.println("isDigit:" + Character.isDigit('a'));//false
		System.out.println("isDigit:" + Character.isDigit('0'));//true
		System.out.println("-----------------------------------------");
		// public static char toUpperCase(char ch):�Ѹ������ַ�ת��Ϊ��д�ַ�
		System.out.println("toUpperCase:" + Character.toUpperCase('A'));//A
		System.out.println("toUpperCase:" + Character.toUpperCase('a'));//A
		System.out.println("-----------------------------------------");
		// public static char toLowerCase(char ch):�Ѹ������ַ�ת��ΪСд�ַ�
		System.out.println("toLowerCase:" + Character.toLowerCase('A'));//a
		System.out.println("toLowerCase:" + Character.toLowerCase('a'));//a
	}
	
	
	
	
	
	/**
	 * һ������:����������Բ��ÿ�
	 * 
	 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
	 * 
	 * ������
	 * 		A:��������ͳ�Ʊ�����
	 * 			int bigCont=0;
	 * 			int smalCount=0;
	 * 			int numberCount=0;
	 * 		B:����¼��һ���ַ�����
	 * 		C:���ַ���ת��Ϊ�ַ����顣
	 * 		D:�����ַ������ȡ��ÿһ���ַ�
	 * 		E:�жϸ��ַ���
	 * 			��д	bigCount++;
	 * 			Сд	smalCount++;
	 * 			����	numberCount++;
	 * 		F:����������
	 */
	@Test
	public void test_eg() throws Exception {
		// ��������ͳ�Ʊ�����
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;

		// ����¼��һ���ַ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String line = sc.nextLine();

		// ���ַ���ת��Ϊ�ַ����顣
		char[] chs = line.toCharArray();

		// ���ַ������ȡ��ÿһ���ַ�
		for (int x = 0; x < chs.length; x++) {
			char ch = chs[x];

			// �жϸ��ַ�
			if (Character.isUpperCase(ch)) {
				bigCount++;
			} else if (Character.isLowerCase(ch)) {
				smallCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			}
		}

		// ����������
		System.out.println("��д��ĸ��" + bigCount + "��");
		System.out.println("Сд��ĸ��" + smallCount + "��");
		System.out.println("�����ַ���" + numberCount + "��");
	}
}
