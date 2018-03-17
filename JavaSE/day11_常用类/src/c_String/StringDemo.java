package c_String;

import org.junit.Test;

public class StringDemo {
	
	/*
	 * �ַ����������ɶ���ַ���ɵ�һ�����ݡ�Ҳ���Կ�����һ���ַ����顣
	 * ͨ���鿴API�����ǿ���֪��
	 * 		A:�ַ�������ֵ"abc"Ҳ���Կ�����һ���ַ�������
	 * 		B:�ַ����ǳ�����һ������ֵ���Ͳ��ܱ��ı䡣
	 * 
	 * ���췽����
	 * 		public String():�չ���
	 *		public String(byte[] bytes):���ֽ�����ת���ַ���
	 *		public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
	 *		public String(char[] value):���ַ�����ת���ַ���
	 *		public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
	 *		public String(String original):���ַ�������ֵת���ַ���
	 *
	 * �ַ����ķ�����
	 * 		public int length()�����ش��ַ����ĳ��ȡ�
	 */	
	@Test
	public void test1() throws Exception {
		// public String():�չ���
		String s1 = new String();
		System.out.println("s1:" + s1);//s1:
		System.out.println("s1.length():" + s1.length());//s1.length():0
		System.out.println("--------------------------");

		// public String(byte[] bytes):���ֽ�����ת���ַ���
		byte[] bys = { 97, 98, 99, 100, 101 };
		String s2 = new String(bys);
		System.out.println("s2:" + s2);//s2:abcde
		System.out.println("s2.length():" + s2.length());//s2.length():5
		System.out.println("--------------------------");

		// public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
		// ����õ��ַ���"bcd"
		String s3 = new String(bys, 1, 3);
		System.out.println("s3:" + s3);//s3:bcd
		System.out.println("s3.length():" + s3.length());//s3.length():3
		System.out.println("--------------------------");

		// public String(char[] value):���ַ�����ת���ַ���
		char[] chs = { 'a', 'b', 'c', 'd', 'e', '��', '��', '��' };
		String s4 = new String(chs);
		System.out.println("s4:" + s4);//s4:abcde������
		System.out.println("s4.length():" + s4.length());//s4.length():8
		System.out.println("--------------------------");

		// public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
		String s5 = new String(chs, 2, 4);
		System.out.println("s5:" + s5);//s5:cde��
		System.out.println("s5.length():" + s5.length());//s5.length():4
		System.out.println("--------------------------");
		
		//public String(String original):���ַ�������ֵת���ַ���
		String s6 = new String("abcde");
		System.out.println("s6:" + s6);//s6:abcde
		System.out.println("s6.length():" + s6.length());//s6.length():5
		System.out.println("--------------------------");
		
		//�ַ�������ֵ"abc"Ҳ���Կ�����һ���ַ�������
		String s7 = "abcde";
		System.out.println("s7:"+s7);//s7:abcde
		System.out.println("s7.length():"+s7.length());//s7.length():5
		
	}
	
	
	/*
	 * �ַ������ص㣺һ������ֵ���Ͳ��ܸı䣬��ֵָ���ܸı䡣
	 */
	@Test
	public void test2() throws Exception {
		String s = "hello";
		s += "world";
		System.out.println("s:" + s); // helloworld
	}
	
	
	/*
	 * String s = new String(��hello��)��String s = ��hello��;������?
	 * �С�ǰ�߻ᴴ��2�����󣬺��ߴ���1������
	 * 
	 * ==:�Ƚ��������ͱȽϵ��ǵ�ֵַ�Ƿ���ͬ
	 * equals:�Ƚ���������Ĭ��Ҳ�ǱȽϵ�ֵַ�Ƿ���ͬ����String����д��equals()�������Ƚϵ��������Ƿ���ͬ��
	 */
	@Test
	public void test3() throws Exception {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
	}
	
	
	//������д���
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
		System.out.println(s5 == s6);//false ������Ǵ��ˣ�Ӧ����true
		/**
		 * ԭ���ַ���ֱ�Ӹ��Ƶķ�ʽ���ȵ��ַ�������������ȥ�ң�����о�ֱ�ӷ��أ�û�У��ʹ���������
		 */
		System.out.println(s5.equals(s6));//true 
	}
	
	
	/*
	 * ������д���
	 * 		�ַ�������Ǳ�����ӣ��ȿ��ռ䣬��ƴ�ӡ�
	 * 		�ַ�������ǳ�����ӣ����ȼӣ�Ȼ���ڳ������ң�����о�ֱ�ӷ��أ����򣬾ʹ���,�����ء�
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


		// ͨ�������뿴Դ�룬����֪�������Ѿ������˴���
		// System.out.println(s3 == "helloworld");
		// System.out.println(s3.equals("helloworld"));

	}
	
	
	/*
	 * String����жϹ��ܣ�
	 *	 boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
	 *	 boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
	 *	 boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
	 *	 boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
	 *	 boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
	 *	 boolean isEmpty():�ж��ַ��������Ƿ�Ϊ�ա�
	 * 
	 * ע�⣺
	 * 		�ַ�������Ϊ�պ��ַ�������Ϊ�ա�
	 * 		String s = "";//�ַ�������Ϊ��
	 * 		String s = null;//�ַ�������Ϊ��
	 */
	@Test
	public void testBoolean() throws Exception {
		// �����ַ�������
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "HelloWorld";

		// boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
		System.out.println("equals:" + s1.equals(s2));//true
		System.out.println("equals:" + s1.equals(s3));//false
		System.out.println("-----------------------");

		// boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		System.out.println("equals:" + s1.equalsIgnoreCase(s2));//true
		System.out.println("equals:" + s1.equalsIgnoreCase(s3));//true
		System.out.println("-----------------------");

		// boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
		System.out.println("contains:" + s1.contains("hello"));//true
		System.out.println("contains:" + s1.contains("hw"));//false
		System.out.println("-----------------------");

		// boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
		System.out.println("startsWith:" + s1.startsWith("h"));//true
		System.out.println("startsWith:" + s1.startsWith("hello"));//true
		System.out.println("startsWith:" + s1.startsWith("world"));//false
		System.out.println("-----------------------");

		// ��ϰ��boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β����Լ���

		// boolean isEmpty():�ж��ַ��������Ƿ�Ϊ�ա�
		System.out.println("isEmpty:" + s1.isEmpty());//false

		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty:" + s4.isEmpty());//true
		// NullPointerException
		// s5���󶼲����ڣ����Բ��ܵ��÷�������ָ���쳣
		//System.out.println("isEmpty:" + s5.isEmpty());		
	}
	
	
	
	
	
	/*
	 * String��Ļ�ȡ����
	 * 		int length():��ȡ�ַ����ĳ��ȡ�
	 * 		char charAt(int index):��ȡָ������λ�õ��ַ�
	 * 		int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
	 * 				Ϊʲô������int���ͣ�������char����?
	 * 				ԭ���ǣ�'a'��97��ʵ�����Դ���'a'
	 * 		int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ��������� �Ǵ�0��ʼ������
	 * 		int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ��������� �Ǵ�0��ʼ�����ġ����û�и��ַ����򷵻�-1
	 * 		int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ��������� �Ǵ�0��ʼ������.���û�и��ַ����򷵻�-1
	 * 		String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
	 * 		String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ�����
	 */
	@Test 
	public void testN()throws Exception{
		String ids = "6,7,";
		//ȥ�����߿ո�
		ids = ids.trim();
		//ȥ�����һ��","����
		ids = ids.substring(0, ids.length()-1);//"6,7"
		String[] trainIds = ids.split(",");
		for(String id:trainIds){
			System.out.println(id);
		}
		//System.out.println(ids);
	}
	
	@Test
	public void testString_Get() throws Exception {
		// ����һ���ַ�������
		String s = "helloworld";

		// int length():��ȡ�ַ����ĳ��ȡ�
		System.out.println("s.length:" + s.length());//10
		System.out.println("----------------------");

		// char charAt(int index):��ȡָ������λ�õ��ַ�  �Ǵ�0��ʼ������
		System.out.println("charAt:" + s.charAt(7));//r
		System.out.println("----------------------");

		// int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ��������� �Ǵ�0��ʼ������
		System.out.println("indexOf:" + s.indexOf('l'));//2
		System.out.println("----------------------");

		// int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ��������� �Ǵ�0��ʼ������
		System.out.println("indexOf:" + s.indexOf("owo"));//4
		System.out.println("----------------------");

		// int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ������������û�и��ַ����򷵻�-1
		System.out.println("indexOf:" + s.indexOf('l', 4));//8
		System.out.println("indexOf:" + s.indexOf('k', 4)); // -1
		System.out.println("indexOf:" + s.indexOf('l', 40)); // -1
		System.out.println("----------------------");

		// �Լ���ϰ��int indexOf(String str,int
		// fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������

		// String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ������start�������
		System.out.println("substring:" + s.substring(5));//world
		System.out.println("substring:" + s.substring(0));//helloworld
		System.out.println("----------------------");

		// String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ���������start�������ǲ���end����
		System.out.println("substring:" + s.substring(3, 8));//lowor     Ҳ�������ұ� [3,8)
		System.out.println("substring:" + s.substring(0, s.length()));// helloworld Ҳ����[0,10)	 	
	}
	
	
	/*
	 * ���󣺱�����ȡ�ַ����е�ÿһ���ַ�
	 * 
	 * ������
	 * 		A:����ܹ��õ�ÿһ���ַ���?
	 * 			char charAt(int index)
	 * 		B:����ô֪���ַ������ж��ٸ���?
	 * 			int length()
	 */
	@Test
	public void test6() throws Exception {
		// �����ַ���
		String s = "helloworld";

		// ԭʼ�汾
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

		// ֻ��Ҫ���Ǵ�0ȡ��9
		// for (int x = 0; x < 10; x++) {
		// System.out.println(s.charAt(x));
		// }

		// ��������ر𳤣��Ҳ�����ȥ������������Ҫ�ó��ȹ���
		for (int x = 0; x < s.length(); x++) {
			// char ch = s.charAt(x);
			// System.out.println(ch);
			// ������������Ҿ�ֱ�������
			System.out.println(s.charAt(x));
		}
	}
	
	
	
	/*
	 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
	 * ������
	 * 		"Hello123World"
	 * �����
	 * 		��д�ַ���2��
	 * 		Сд�ַ���8��
	 * 		�����ַ���3��
	 * 
	 * ������
	 * 		ǰ�᣺�ַ���Ҫ����
	 * 		A:��������ͳ�Ʊ���
	 * 			bigCount=0
	 * 			smallCount=0
	 * 			numberCount=0
	 * 		B:�����ַ������õ�ÿһ���ַ���
	 * 			length()��charAt()���
	 * 		C:�жϸ��ַ������������������͵�
	 * 			��bigCount++
	 * 			С��smallCount++
	 * 			���֣�numberCount++
	 * 
	 * 			�����Ŀ���ѵ��������ж�ĳ���ַ��Ǵ�ģ�����С�ģ��������ֵġ�
	 * 			ASCII���
	 * 				0	48
	 * 				A	65
	 * 				a	97
	 * 			��Ȼ�����ǰ������ֵ����ֱȽ��ǿ��Եģ���������ˣ��б��⻹�򵥵�
	 * 				char ch = s.charAt(x);
	 * 
	 * 				if(ch>='0' && ch<='9') numberCount++
	 * 				if(ch>='a' && ch<='z') smallCount++
	 * 				if(ch>='A' && ch<='Z') bigCount++
	 *		D:��������
	 *
	 * ��ϰ���Ѹ����ַ����ķ�ʽ���Ľ�Ϊ����¼���ַ����ķ�ʽ��
	 */
	@Test
	public void test7() throws Exception {
		//����һ���ַ���
		String s = "Hello123World";
		
		//��������ͳ�Ʊ���
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		
		//�����ַ������õ�ÿһ���ַ���
		for(int x=0; x<s.length(); x++){
			char ch = s.charAt(x);
			
			//�жϸ��ַ������������������͵�
			if(ch>='a' && ch<='z'){
				smallCount++;
			}else if(ch>='A' && ch<='Z'){
				bigCount++;
			}else if(ch>='0' && ch<='9'){
				numberCount++;
			}
		}
		
		//��������
		System.out.println("��д��ĸ"+bigCount+"��");
		System.out.println("Сд��ĸ"+smallCount+"��");
		System.out.println("����"+numberCount+"��");
		/**
		 * ��ӡ�����
		 * ��д��ĸ2��
			Сд��ĸ8��
			����3��
		 */
	}
	
	
	/*
	 * String��ת�����ܣ�
	 *		 byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
	 *		 char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
	 *		 static String valueOf(char[] chs):���ַ�����ת���ַ�����
	 *		 static String valueOf(int i):��int���͵�����ת���ַ�����
	 * 				ע�⣺String���valueOf�������԰��������͵�����ת���ַ�����
	 *		 String toLowerCase():���ַ���ת��Сд��
	 *		 String toUpperCase():���ַ���ת�ɴ�д��
	 *		 String concat(String str):���ַ���ƴ�ӡ�
	 */
	@Test
	public void testString_convert() throws Exception {
		// ����һ���ַ�������
		String s = "JavaSE";

		// byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
		byte[] bys = s.getBytes();
		for (int x = 0; x < bys.length; x++) {
			System.out.print(bys[x]+" ");
		}
		//���������74 97 118 97 83 69      Ҳ���Ǳ�̸��ַ���Ӧ��ASCII����
		System.out.println("----------------");

		// char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {
			System.out.println(chs[x]);
		}
		System.out.println("----------------");

		// static String valueOf(char[] chs):���ַ�����ת���ַ�����
		String ss = String.valueOf(chs);
		System.out.println(ss);
		System.out.println("----------------");

		// static String valueOf(int i):��int���͵�����ת���ַ�����
		int i = 100;
		String sss = String.valueOf(i);
		System.out.println(sss);
		System.out.println("----------------");

		// String toLowerCase():���ַ���ת��Сд��
		System.out.println("toLowerCase:" + s.toLowerCase());
		System.out.println("s:" + s);
		// System.out.println("----------------");
		// String toUpperCase():���ַ���ת�ɴ�д��
		System.out.println("toUpperCase:" + s.toUpperCase());
		System.out.println("----------------");

		// String concat(String str):���ַ���ƴ�ӡ�
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
	 * String����������ܣ�
	 * 
	 * �滻���ܣ�
	 * 		String replace(char old,char new);
	 *		String replace(String old,String new);
	 *
	 * ȥ���ַ������ո�:	
	 *		String trim();
	 * 
	 * ���ֵ�˳��Ƚ������ַ���:  
	 * 		int compareTo(String str);
	 * 		int compareToIgnoreCase(String str);//���ֵ�˳��Ƚ������ַ��������Դ�Сд
	 * 	 	 
	 * 		  �ȽϹ���			
	 * 			�����ͬ�Ļ����򷵻� 0��
	 *  		�������ͬ�Ļ�:
	 *  			���Ҫ���бȽϵ������ַ����ĳ��Ȳ���ͬ:	
	 *  					�򷵻ص�һ������ͬ���ַ���ASCII��ֵ�Ĳ�.
	 *  			���Ҫ���бȽϵ������ַ����ĳ��Ȳ���ͬ:
     *  					����s1.length>s2.length:
	 *  						��s2�����ݶ���s1�Ķ�Ӧλ�õ��ַ�������ͬ���򷵻صıȽϽ��Ϊ����֮����ַ�����֮��(Ҳ����s1.length-s2.length)
	 *  						��s2�����ݶ���s1�Ķ�Ӧλ�õ��ַ����ݲ�����ͬ���򷵻ص�һ������ͬ���ַ���ASCII��ֵ�Ĳ�.
	 *  	
	 * 
	 */
	@Test
	public void testString_replace() throws Exception {
		// �滻����
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		String s3 = s1.replace("owo", "ak47");
		System.out.println("s1:" + s1);//helloworld
		System.out.println("s2:" + s2);//hekkoworkd
		System.out.println("s3:" + s3);//hellak47rld
		System.out.println("---------------");

		// ȥ���ַ������ո�
		String s4 = " hello world  ";
		String s5 = s4.trim();
		System.out.println("s4:" + s4 + "---");//s4: hello world ---
		System.out.println("s5:" + s5 + "---");//s5:hello world---

		// ���ֵ�˳��Ƚ������ַ���
		// 
		/*
		 * 	�����ͬ�Ļ����򷵻� 0��
		 *  �������ͬ�Ļ�:
		 *  	���Ҫ���бȽϵ������ַ����ĳ���:	
		 *  			�򷵻ص�һ������ͬ���ַ���ASCII��ֵ�Ĳ�.
		 *  	���Ҫ���бȽϵ������ַ����ĳ��Ȳ���ͬ:
		 *  			����s1.length>s2.length:
		 *  				��s2�����ݶ���s1�Ķ�Ӧλ�õ��ַ�������ͬ���򷵻صıȽϽ��Ϊ����֮����ַ�����֮��(Ҳ����s1.length-s2.length)
		 *  				��s2�����ݶ���s1�Ķ�Ӧλ�õ��ַ����ݲ�����ͬ���򷵻ص�һ������ͬ���ַ���ASCII��ֵ�Ĳ�.
		 *  	���Ҫ���бȽϵ������ַ����ĳ��Ȳ���ͬ:
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
		System.out.println(str1.compareTo(str2)); // 4   str1�ĳ��ȼ�ȥstr2�ĳ���
		
		System.out.println("-----------");
		
		String str3 = "hello";
		String str4 = "hwl";
		System.out.println(str3.compareTo(str4)); // -18   e��ASCII��ֵ��ȥw��ASCII��ֵ
	}
	
	
}
