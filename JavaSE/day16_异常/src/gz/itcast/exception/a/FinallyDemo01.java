package gz.itcast.exception.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * finally����finally���Ƶ������һ����ִ��
 * ע�⣺�����ִ�е�finally֮ǰjvm�Ƴ��ˣ�finally���Ƶ������Ͳ���ִ���ˡ�
 * 
 * A����ʽ
 * 		try...catch...finally...
 * B:�����ͷ���Դ����IO�����������ݿ�����л����
 * @author ��Ԫ
 *
 */
public class FinallyDemo01 {
	public static void main(String[] args) {
		//testFinally01();
		
		System.out.println(testFinally02());
	}
	
	
	
	/*
	 * �����⣺
	 * 1:final,finally��finalize������
	 * final�����յ���˼�����������࣬��Ա��������Ա����
	 * 		�����࣬�಻�ܱ��̳�
	 * 		���α����������ǳ���
	 * 		���η������������ܱ���д
	 * finally�����쳣�����һ���֣������ͷ���Դ��
	 * 		һ����˵������϶���ִ�У������������ִ�е�finally֮ǰjvm�˳���
	 * finalize����Object���һ��������������������
	 * 
	 * 2:���catch������return��䣬����finally����Ĵ��뻹��ִ����?
	 *   ����ᣬ��������returnǰ������return��
	 * 	   	�ᡣǰ��
	 * 
	 * 	 ׼ȷ��˵��Ӧ�������м䡣
	 * 
	 * 3:try...catch...finally�ĸ�ʽ����
	 * 		A:try...catch...finally
	 * 		B:try...catch
	 * 		C:try...catch...catch...
	 * 		D:try...catch...catch...finally
	 * 		E:try...finally
	 * 			����������Ŀǰ��Ϊ���ͷ���Դ��
	 */
	public static int testFinally02() {
		int a = 10;
		try {
			System.out.println(a / 0);
			a = 20;
		} catch (ArithmeticException e) {
			a = 30;
			return a;
			/*
			 * return a�ڳ���ִ�е���һ����ʱ�����ﲻ��return a����return 30;�������·�����γ��ˡ�
			 * �����أ������ֺ��滹��finally�����Լ���ִ��finally�����ݣ�a=40
			 * �ٴλص���ǰ�ķ���·����������return 30;
			 */
		} finally {
			a = 40;
			return a;//��������������40�ˡ����ﷵ�صĲ���return a.
		}
		 //return a;
	}
	

	private static void testFinally01() {
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date d = null;
		try {
			// System.out.println(10 / 0);
			d = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
			//System.exit(0);//�����������jvm�˳���ֻҪjvmһ�˳���finally���Ƶ������Ͳ���ִ���ˡ�
		} finally {
			System.out.println("����Ĵ����ǿ���ִ�е�");
		}

		System.out.println(d);
	}

}
