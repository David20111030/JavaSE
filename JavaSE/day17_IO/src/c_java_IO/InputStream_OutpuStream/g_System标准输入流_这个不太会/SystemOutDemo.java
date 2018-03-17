package c_java_IO.InputStream_OutpuStream.g_System��׼������_�����̫��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

import org.junit.Test;

public class SystemOutDemo {
	
	/**
	 * ��׼�����������
	 * 	System���е�������Ա������
	 * 		public static final InputStream in "��׼"������
	 * 		public static final PrintStream out "��׼"�����
	 * 
	 * 
	 * 		InputStream is = System.in;
	 * 		PrintStream ps = System.out;	
	 * 
	 * 
	 * 
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		// ������Ľ������Ǿ�֪���ˣ�����������䱾����IO�����������������������̨��
		System.out.println("helloworld");
		
		//��ȡ��׼���������
		PrintStream ps = System.out;
		ps.print("hello");//�ȼ���System.out.println("hello");
		
		ps.println();
		//ps.print();����޲εķ��������ڣ���Ҫ���ϲ����ĲŴ���
		
		System.out.println();
		
		
		
	}
	
	
	/**
	 * ת������Ӧ�ã�
	 * 		
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		// ��ȡ��׼������
		 // PrintStream ps = System.out;
		 // OutputStream os = ps;
		// OutputStream os = System.out; // ��̬
		 // ���ܲ��ܰ��ող�ʹ�ñ�׼�������ķ�ʽһ�����������������̨��?
		// OutputStreamWriter osw = new OutputStreamWriter(os);
		// BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("hello");
		bw.newLine();
		// bw.flush();
		bw.write("world");
		bw.newLine();
		// bw.flush();
		bw.write("java");
		bw.newLine();
		bw.flush();
		
		bw.close();	
		
	}
	
	
	/**
	 * System.in ��׼���������ǴӼ��̻�ȡ���ݵ�
	 * 
	 * ����¼�����ݣ�
	 * 		A:main������args���ղ�����
	 * 			java HelloWorld hello world java
	 * 		B:Scanner(JDK5�Ժ��)
	 * 			Scanner sc = new Scanner(System.in);
	 * 			String s = sc.nextLine();
	 * 			int x = sc.nextInt()
	 * 		C:ͨ���ַ���������װ��׼������ʵ��
	 * 			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 */
	@Test
	public void test4() throws Exception {
		// //��ȡ��׼������
		// InputStream is = System.in;
		// //��Ҫһ�λ�ȡһ���в�����?
		// //�С�
		// //��ôʵ����?
		// //Ҫ��ʵ�֣��������֪��һ�ζ�ȡһ�����ݵķ������ĸ���?
		// //readLine()
		// //������������ĸ�������?
		// //BufferedReader
		// //���ԣ������Ӧ�ô���BufferedReader�Ķ��󣬵��ǵײ㻹�ǵ�ʹ�ñ�׼������
		// // BufferedReader br = new BufferedReader(is);
		// //�������ǵ����룬����Ӧ�ÿ����ˣ�����ȴ������
		// //ԭ���ǣ��ַ�������ֻ������ַ��������������������ֽ��������Բ�������?
		// //��ô���һ�����ʹ���ˣ����Ҹ���һ���������?
		// //���ֽ���ת��Ϊ�ַ�����Ȼ����ͨ���ַ�����������
		// InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader br= new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������һ���ַ�����");
		String line = br.readLine();
		System.out.println("��������ַ����ǣ�" + line);

		System.out.println("������һ��������");
		// int i = Integer.parseInt(br.readLine());
		line = br.readLine();
		int i = Integer.parseInt(line);
		System.out.println("������������ǣ�" + i);
	}
	
	
}
