package g_StringBuffer;

import org.junit.Test;

public class StringBufferDemo {

	
	/*
	 * �̰߳�ȫ(���߳̽���)
	 * ��ȫ -- ͬ�� -- �����ǰ�ȫ��
	 * ����ȫ -- ��ͬ�� -- Ч�ʸ�һЩ
	 * ��ȫ��Ч����������Զ�������ǵ����⡣
	 * ��ȫ��ҽԺ����վ��������վ
	 * Ч�ʣ�������վ����̳֮���
	 * 
	 * StringBuffer:
	 * 		�̰߳�ȫ�Ŀɱ��ַ�����
	 * 
	 * StringBuffer��String������?
	 * ǰ�߳��Ⱥ����ݿɱ䣬���߲��ɱ䡣
	 * ���ʹ��ǰ�����ַ�����ƴ�ӣ������˷�̫�����Դ��
	 * 
	 * StringBuffer�Ĺ��췽����
	 * 		public StringBuffer():�޲ι��췽��
	 *		public StringBuffer(int capacity):ָ���������ַ�������������
	 *		public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
	 *
	 * StringBuffer�ķ�����
	 *		public int capacity()�����ص�ǰ������	����ֵ.����ֵĬ����16�����ʵ��ֵ��������ֵ��ʱ������ֵ�ͻ���������֮������ֵ��Զ���Ǵ���ʵ��ֵ�ġ���ʵ��ֵ���ڵ�ǰ������ʱ�򣬵�ǰ������������ٿռ䣬������ǰ��������Ҫ����ʵ��ֵ�ġ�
	 *		public int length():���س��ȣ��ַ������� ʵ��ֵ
	 */
	@Test
	public void test1() throws Exception {
		/*
		String s = "1234e";
		s+="qwe";
		System.out.println(s.length());//8
		System.out.println(s);//1234eqwe
		*/
		
		
		// public StringBuffer():�޲ι��췽��
		StringBuffer sb = new StringBuffer();
		System.out.println("sb:" + sb);//sb:
		System.out.println("sb.capacity():" + sb.capacity());//sb.capacity():16
		System.out.println("sb.length():" + sb.length());//sb.length():0
		System.out.println("--------------------------");

		// public StringBuffer(int capacity):ָ���������ַ�������������
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb2:" + sb2);//sb2:
		System.out.println("sb2.capacity():" + sb2.capacity());//sb2.capacity():50
		System.out.println("sb2.length():" + sb2.length());//sb2.length():0
		System.out.println("--------------------------");

		// public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
		StringBuffer sb3 = new StringBuffer("hell0");
		System.out.println("sb3:" + sb3);//sb3:hello
		System.out.println("sb3.capacity():" + sb3.capacity());//sb3.capacity():21  ��һ�ε�ʱ�����ʵ�ʳ���С������ֵ��������ֵ�ͱ�Ϊ��Ĭ��ֵ16���ϵ�ǰʵ�ʳ��ȡ�
		System.out.println("sb3.length():" + sb3.length());//sb3.length():5
		//sb3+=sb3+"erer";���󣬲�������ƴ��
		sb3.append("world22222222122www1");
		System.out.println("sb3.capacity():" + sb3.capacity());//sb3.capacity():21   ������ǵ�һ�Σ����ʵ�ʳ���С������ֵ��������ֵ���ı䣬��ʵ�ʳ��ȴ�������ֵʱ������ֵ�ͻ����ڴ�������ٿռ䡣
		System.out.println("sb3.length():" + sb3.length());//sb3.length():10
		
	}
	
	
	/*
	 * StringBuffer����ӹ��ܣ�
	 * 		public StringBuffer append(String str):���԰���������������ӵ��ַ�������������,�������ַ�������������
	 * 
	 * 		public StringBuffer insert(int offset,String str):��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ���������������0��ʼ�����ġ�
	 */
	@Test
	public void test_insert() throws Exception {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// public StringBuffer append(String str)
		// StringBuffer sb2 = sb.append("hello");
		// System.out.println("sb:" + sb);
		// System.out.println("sb2:" + sb2);
		// System.out.println(sb == sb2); // true

		// һ��һ�����������
		// sb.append("hello");
		// sb.append(true);
		// sb.append(12);
		// sb.append(34.56);

		// ��ʽ���
		sb.append("hello").append(true).append(12).append(34.56);
		System.out.println("sb:" + sb);//sb:hellotrue1234.56

		// public StringBuffer insert(int offset,String str):��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ���������������0��ʼ������
		sb.insert(5, "world");
		System.out.println("sb:" + sb);//sb:helloworldtrue1234.56
	}
	
	
	
	/*
	 * StringBuffer��ɾ������
	 * 		public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
	 * 		public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼ��ָ��λ�ý��������ݣ������ر�����0��ʼ������
	 */
	@Test
	public void test_delete() throws Exception {
		// ��������
		StringBuffer sb = new StringBuffer();
		
		// ��ӹ���
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);//sb:helloworldjava

		// public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
		// ������Ҫɾ��e����ַ�����ô��?
		//sb.deleteCharAt(1);
		//System.out.println("sb:" + sb);//sb:hlloworldjava
		
		// ����:��Ҫɾ����һ��l����ַ�����ô��?
		//sb.deleteCharAt(2);
		//System.out.println("sb:" + sb);//sb:heloworldjava
		
		// public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
		// ������Ҫɾ��world����ַ�������ô��?
	    //sb.delete(5, 10);
	   // System.out.println("sb:" + sb);//sb:hellojava
	    
		// ����:��Ҫɾ�����е�����
		sb.delete(0, sb.length());

		System.out.println("sb:" + sb);//sb:
	}
	
	
	/*
	 * StringBuffer���滻���ܣ�
	 * 		public StringBuffer replace(int start,int end,String str):��start��ʼ��end��str�滻
	 */
	@Test
	public void test_replace() throws Exception {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// �������
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		System.out.println("sb:" + sb);//sb:helloworldjava

		// public StringBuffer replace(int start,int end,String
		// str):��start��ʼ��end��str�滻
		// ������Ҫ��world��������滻Ϊ"���տ���"
		sb.replace(5, 10, "���տ���");
		System.out.println("sb:" + sb);//sb:hello���տ���java
	}
	
	
	
	/*
	 * StringBuffer�ķ�ת���ܣ�
	 * 	 public StringBuffer reverse();
	 */
	@Test
	public void test_reverse() throws Exception {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// �������
		sb.append("ϼ���ְ���");
		System.out.println("sb:" + sb);//sb:ϼ���ְ���

		// public StringBuffer reverse()
		sb.reverse();
		System.out.println("sb:" + sb);//sb:�Ұ�����ϼ
	}
	
	
	
	/*
	 * StringBuffer�Ľ�ȡ����:ע�ⷵ��ֵ���Ͳ�����StringBuffer������
	 * 		public String substring(int start);//��ָ��λ��start��ʼ��ȡ�����ַ�����ĩβ(��β)
	 * 		public String substring(int start,int end); //��ָ��λ��start��ʼ��ȡ��endλ��
	 */
	@Test
	public void test_sub() throws Exception {
		// �����ַ�������������
		StringBuffer sb = new StringBuffer();

		// ���Ԫ��
		sb.append("hello").append("world").append("java");
		System.out.println("sb:" + sb);//sb:helloworldjava

		// ��ȡ����
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
	 * Ϊʲô����Ҫ������֮���ת����(����˼��)
	 * 	A -- B��ת��
	 * 		���ǰ�Aת��ΪB����ʵ��Ϊ��ʹ��B�Ĺ��ܡ�
	 * 	B -- A��ת��
	 *		 ���ǿ���Ҫ�Ľ����A���ͣ����Ի���ת������
	 * 
	 * String��StringBuffer���໥ת��?
	 */
	@Test
	public void testConvert() throws Exception {
		// String --> StringBuffer
		String s = "hello";
		// ע�⣺���ܰ��ַ�����ֱֵ�Ӹ�ֵ��StringBuffer
		// StringBuffer sb = "hello";
		// StringBuffer sb = s;
		// ��ʽ1:ͨ�����췽��
		StringBuffer sb = new StringBuffer(s);
		// ��ʽ2��ͨ��append()����
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb:" + sb);
		System.out.println("sb2:" + sb2);
		System.out.println("---------------");

		// StringBuffer --> String
		StringBuffer buffer = new StringBuffer("java");
		// String(StringBuffer buffer)
		// ��ʽ1:ͨ�����췽��
		String str = new String(buffer);
		//String str4 = buffer;ע�⣺����ֱ�Ӱ�StringBuffer��ֱֵ�Ӹ�ֵ��String
		// ��ʽ2��ͨ��toString()����
		String str2 = buffer.toString();
		System.out.println("str:" + str);
		System.out.println("str2:" + str2);
	}
	
	
	
	
	
	
	
	
	
	/*
	 * �����⣺
	 * 1��String,StringBuffer,StringBuilder������?
	 * 		A:String�����ݲ��ɱ�ģ���StringBuffer,StringBuilder�������ݿɱ�ġ�
	 * 		B:StringBuffer��ͬ���ģ����ݰ�ȫ,Ч�ʵ�;StringBuilder�ǲ�ͬ����,���ݲ���ȫ,Ч�ʸ�
	 * 
	 * 2��StringBuffer�����������?
	 * 		���߶����Կ�����һ��������װ���������ݡ�
	 * 		������,StringBuffer������������һ���ַ������ݡ�
	 * 		��������Է��ö������ݣ���������ͬһ���������͵ġ�
	 * 
	 * 3:��ʽ��������
	 * 		String��Ϊ��������
	 * 		StringBuffer��Ϊ�������� 
	 * 
	 * ��ʽ������
	 * 		�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ���
	 * 		�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ���
	 * 
	 * ע�⣺
	 * 		String��Ϊ�������ݣ�Ч���ͻ���������Ϊ����������һ���ġ�
	 * 		StringBuffer��Ϊ�������ݣ�Ч��������������Ϊ����������һ���ġ�
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
