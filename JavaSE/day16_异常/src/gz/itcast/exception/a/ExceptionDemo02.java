package gz.itcast.exception.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A��һ���쳣
 * B�������쳣�Ĵ���
 * 		a:ÿһ��дһ��try...catch
 * 		b:дһ��try�����catch
 * 			try{
 * 			  ...
 * 			}catch(�쳣���� ������){
 * 			  ...
 * 			}catch(�쳣����  ������){
 * 			  ...
 * 			}
 * 			...
 * 	  ע�����
 * 		1������ȷ�ľ�����ȷ����Ҫ�ô��������
 * 		2��ƽ����ϵ���쳣˭Ƿ˭������ν������������Ӹ���ϵ���������ں��档
 * ע�⣺
 * 		һ��try����������⣬�ͻ��������������ܳ�ȥ��Ȼ���catch������������ƥ�䣬
 * 				һ����ƥ��ģ���ִ��catch����Ĵ���Ȼ�������try...catch,֮�����ִ�к������䡣
 * 
 * 
 * 
 */	
public class ExceptionDemo02 {
	public static void main(String[] args) {
		// method1();

		// method2();

		// method3();

		//method4();
		
		//method5();
		
		//method6();
		
		
		method7();
	}
	
	/**
	 * ��try���淢�������jvm�����������һ���쳣����Ȼ�����������׳���Ȼ���catch����������ƥ�䡣
	 * 	����ö�����ĳ�����͵ģ��ͻ�ִ�и�catch����Ĵ�����Ϣ��
	 * 
	 * �쳣��ҩ�˽�ļ���������
	 * 	public String getMessage();�쳣����Ϣ�ַ���
	 *  public String toString();�����쳣�ļ���Ϣ����
	 *  		�˶�������  name(ȫ·����)
	 *  		": " (ð�ź�һ���ո�)
	 *  		���ô˶��� getLocalizedMessage()�����Ľ����Ĭ�Ϸ��ص���getMessage()�����ݣ�
	 *  printStackTrace();��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�á�����ֵvoid������Ϣ����ڿ���̨��
	 *  
	 */
	public static void method7(){
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d = sdf.parse(s); // ������һ��ParseException����Ȼ���׳�ȥ����catch�������ƥ��
			System.out.println(d);
		} catch (ParseException e) { // ParseException e = new ParseException();
			// ParseException
			// e.printStackTrace();

			// getMessage();//�쳣����Ϣ�ַ���
			 //System.out.println(e.getMessage());
			//��һ�д����ִ�н���� Unparseable date: "2014-11-20"

			// toString();�����쳣�ļ���Ϣ����
			// System.out.println(e.toString());//�����쳣�ļ���Ϣ����
			// ��һ�д����ִ�н����java.text.ParseException: Unparseable date: "2014-11-20"
			
			e.printStackTrace();//��ȡ�쳣�������쳣��Ϣ 
			 /**��һ�д���Ľ����
			  * java.text.ParseException: Unparseable date: "2014-11-20"
				at java.text.DateFormat.parse(DateFormat.java:357)
				at gz.itcast.exception.a.ExceptionDemo02.method7(ExceptionDemo02.java:65)
				at gz.itcast.exception.a.ExceptionDemo02.main(ExceptionDemo02.java:45)
			  */
		}
		
		System.out.println("over");
			
		
	}
	
	
	
	/**
	 * ����ʱ�쳣������ʱ�쳣������
	 * 	�������쳣��Java���������ʾ�����������ͻᷢ�������޷�ͨ�����롣
	 *  �������쳣��������ʾ����Ҳ���Ժͱ���ʱ�쳣һ������
	 */
	public static void method6(){
		String s="2017-02-15";
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//���ʹ�����д���ͻ�����쳣
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date d=sdf.parse(s);//����ֱ������쳣
			System.out.println(d);//Wed Feb 15 00:00:00 CST 2017
		}catch(ParseException e){
			System.out.println("�������ڳ�������");
		}
	}
	
	

	/**
	 * JDK7������һ���µ��쳣��������
	 * 		try{
	 * 		 ...
	 * 		}catch(�쳣��1 | �쳣��2 |...  ����){
	 * 		  ...
	 * 		}
	 * 		
	 * 	ע�⣺�����ʽ��Ȼ��࣬����Ҳ�����á�
	 * 	ע�������쳣����ʽ��
	 * 		A������ʽ��һ�µġ���ʵ�ʿ����У��ö�ʱ����ܾ������ͬ���͵����⣬Ҳ����һ������
	 * 		B:����쳣�������ƽ����ϵ
	 * 
	 * 
	 * 
	 * 
	 */
	public static void method5(){
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

//		 try {
//			 System.out.println(a / b);
//			 System.out.println(arr[3]);
//			 System.out.println("���������һ���쳣���㲻̫�����˭������ô����?");
//		 } catch (ArithmeticException e) {
//			 System.out.println("��������Ϊ0");
//		 } catch (ArrayIndexOutOfBoundsException e) {
//			 System.out.println("������˲��õķ��ʵ�����");
//		 } catch (Exception e) {
//			 System.out.println("��������");
//		 }
		 /**
		  * �����
		  * ��������Ϊ0
		  */
		 
		 
		// JDK7�Ĵ�����
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("��������");
		}
		/**
		 * ��ӡ�����
		 * 	��������
		 */
		
		System.out.println("over");
	}
		
		
	
	
	
	//����쳣�Ĵ���ʽ
	public static void method4() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		// үү�����
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println("���������һ���쳣���㲻̫�����˭������ô����?");
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��õķ��ʵ�����");
		} catch (Exception e) {
			System.out.println("��������");
		}

		// үү��ǰ���ǲ����Ե� ���ַ�ʽ�Ǵ���ģ�Ӧ�ðѾ�ȷ�ķ���ǰ��
//		 try {
//			 System.out.println(a / b);
//			 System.out.println(arr[3]);
//			 System.out.println("���������һ���쳣���㲻̫�����˭������ô����?");
//		 } catch (Exception e) {
//			 System.out.println("��������");
//		 } catch (ArithmeticException e) {
//			 System.out.println("��������Ϊ0");
//		 } catch (ArrayIndexOutOfBoundsException e) {
//			 System.out.println("������˲��õķ��ʵ�����");
//		 }

		System.out.println("over");
	}

	// �����쳣�Ĵ���   �ڶ��ִ���ʽ
	public static void method3() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(arr[3]);
			System.out.println(a / b);
			// System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��õķ��ʵ�����");
		}

		System.out.println("over");
	}

	// �����쳣   ��һ�ִ���ʽ
	public static void method2() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		}

		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������˲��õķ��ʵ�����");
		}

		System.out.println("over");
	}

	// һ���쳣
	public static void method1() {
		// ��һ�׶�
		int a = 10;
		// int b = 2;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("��������Ϊ0");
		}

		// �ڶ��׶�
		System.out.println("over");
	}
}