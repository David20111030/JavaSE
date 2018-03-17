package gz.itcast.exception.a;

import org.junit.Test;

/**
 * ������쳣��Throwable
 * 		�������⣺Error
 * ������ǲ�������������һ�㶼�Ǻ����صģ�����˵�ڴ������
 * 		���⣺Exception
 * 		  ���������⣺����RuntimeException���쳣  ���봦��ģ���Ϊ�㲻��������Ͳ���ͨ����
 * 		 ���������⣺RuntimeException ������������Ҳ��������Ϊ��������⣬�������������ֿ϶������ǵĴ��벻���Ͻ�����Ҫ��������ġ�
 * 
 * ���������������⣬����û�����κδ�������jvm������Ĭ�ϵĴ���----�����쳣�����ƣ�ԭ�򼰳��ֵ��������Ϣ����ڿ���̨��ͬʱ���������
 * 		
 * @author ��Ԫ
 *
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		//test1();
		System.out.println("---test2()---");
		
		test2();
	
		
	}
	
	
	public static void test1(){
		//��һ�׶�
		int a=10;
		int b=0;
		System.out.println(a/b);//������ᱨ��
		
		//�ڶ��׶�
		System.out.println("over");
	}
	
	
	/**
	 * �����Լ���δ����쳣�أ�
	 * A��try...catch...finally
	 * B: throws �׳�
	   try...catch...finally�Ĵ����ʽ:
	   		try{
	   			���ܳ�������Ĵ���;
	   		}catch(�쳣�� ����){
	   			�������Ĵ���;
	   		}finally{
	   			�ͷ���Դ;
	   		}
	 
	   ���θ�ʽ��
	   	try{
	   		���ܳ�������Ĵ���;
	   	}catch(�쳣�� ����){
	   		�������Ĵ���;
	   	}
	 ע�⣺
	 	A��try����Ĵ���Խ��Խ��
	 	B��catch������������ݣ������Ǹ���һ���򵥵���ʾ��
	 
	 * 
	 */
	public static void test2(){
		//��һ�׶�
		int a=10;
		int b=0;
		
		try{
			System.out.println(a/b);
		}catch(ArithmeticException ae){
			System.out.println("��������Ϊ0");
		}
		
		//�ڶ��׶�
		System.out.println("over");
		
		/**
		 * ��ӡ�����
		 * 	��������Ϊ0
		 *  over
		 */
		
	}
}
