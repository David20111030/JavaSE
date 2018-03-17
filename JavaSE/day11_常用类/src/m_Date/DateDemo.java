package m_Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class DateDemo {
	
	/**
	 * Date:��ʾ�ض���˲�䣬��ȷ�����롣 
	 * 
	 * ���췽����
	 * 		Date():���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
	 * 		Date(long date)�����ݸ����ĺ���ֵ�������ڶ��� ������������1970������8����ϸ����ĺ���ֵ�����������ڶ���
	 * 
	 * 
	 */
	@Test
	public void test1() throws Exception {
		//��������   ���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
		Date d = new Date();
		System.out.println("d:" + d);//d:Wed Mar 01 22:05:03 CST 2017
		
		//��������
		long time = 1000 * 60 * 60;//1Сʱ
		Date d2 = new Date(time);//���ݸ����ĺ���ֵ�������ڶ���  ������������1970������8����ϸ����ĺ���ֵ�����������ڶ���
		System.out.println("d2:"+d2);//d2:Thu Jan 01 09:00:00 CST 1970
		
		//System.currentTimeMillis();//��ʾ1970����뵱ǰ���ڵĺ���ֵ
		System.out.println(new Date(System.currentTimeMillis()));//Wed Mar 01 22:05:03 CST 2017
		
		System.out.println("==========================");
		
	}
	
	
	
	
	
	/**
	 * public long getTime():��ȡʱ�䣬�Ժ���Ϊ��λ
	 * public void setTime(long time):����ʱ��
	 * 
	 * ��Date�õ�һ������ֵ
	 * 		long getTime()
	 * ��һ������ֵת��ΪDate
	 * 		���췽��
	 * 		setTime(long time)
	 */
	@Test
	public void test2() throws Exception {
		//�������ڶ���
		Date d = new Date();
		
		//��ȡʱ��
		long time = d.getTime();
		System.out.println(time);//1488377580261  1970������8�㵽��ǰ�ĺ���ֵ
		System.out.println(System.currentTimeMillis());//1488377580261  1970������8�㵽��ǰ�ĺ���ֵ
		System.out.println(d);//Wed Mar 01 22:13:00 CST 2017
		
		System.out.println("==================");
		
		//����ʱ��
		d.setTime(1000*60*60);//1000*60*60 һСʱ   ��1970������8����ϸ����ĺ���ֵ�����������ڶ���
		System.out.println(d);//Thu Jan 01 09:00:00 CST 1970   ��1970������8����ϸ����ĺ���ֵ�����������ڶ���
		
	}
	
	
	
	/**
	 * 
	 * Date	 --��	 String(��ʽ��)
	 * 		public final String format(Date date)
	 * 
	 * String --�� Date(����)
	 * 		public Date parse(String source)
	 * 
	 * DateForamt:���Խ������ں��ַ����ĸ�ʽ���ͽ��������������ǳ����࣬����ʹ�þ�������SimpleDateFormat��
	 * 
	 * SimpleDateFormat�Ĺ��췽����
	 * 		SimpleDateFormat():Ĭ��ģʽ
	 * 		SimpleDateFormat(String pattern):������ģʽ
	 * 			���ģʽ�ַ��������д��?
	 * 			ͨ���鿴API�����Ǿ��ҵ��˶�Ӧ��ģʽ
	 * 			�� y
	 * 			�� M	
	 * 			�� d
	 * 			ʱ H
	 * 			�� m
	 * 			�� s
	 * 
	 * 			2014��12��12�� 12:12:12
	 */
	@Test
	public void test_Format() throws Exception {
		// Date -- String
		// �������ڶ���
		Date d = new Date();
		// ������ʽ������
		// SimpleDateFormat sdf = new SimpleDateFormat();
		// ����ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		// public final String format(Date date)
		String s = sdf.format(d);
		System.out.println(s);//2017��03��01�� 22:20:21
		
		
		
		//���ַ�������Ϊ����
		//String --�� Date
		String str = "2008-08-08 12:12:12";
		//�ڰ�һ���ַ�������Ϊ���ڵ�ʱ����ע���ʽ����͸������ַ�����ʽƥ��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);//Fri Aug 08 12:12:12 CST 2008
	}
	
	
	
	/**
	 * һ��������
	 * 
	 * ��һ��������������������?
	 * 
	 * ������
	 * 		A:����¼����ĳ�����������
	 * 		B:�Ѹ��ַ���ת��Ϊһ������
	 * 		C:ͨ�������ڵõ�һ������ֵ
	 * 		D:��ȡ��ǰʱ��ĺ���ֵ
	 * 		E:��D-C�õ�һ������ֵ
	 * 		F:��E�ĺ���ֵת��Ϊ��
	 * 			/1000/60/60/24
	 */
	@Test
	public void testname() throws Exception {
		// ����¼����ĳ�����������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ���������:");
		String line = sc.nextLine();

		// �Ѹ��ַ���ת��Ϊһ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(line);

		// ͨ�������ڵõ�һ������ֵ
		long myTime = d.getTime();

		// ��ȡ��ǰʱ��ĺ���ֵ
		long nowTime = System.currentTimeMillis();

		// ��D-C�õ�һ������ֵ
		long time = nowTime - myTime;

		// ��E�ĺ���ֵת��Ϊ��
		long day = time / 1000 / 60 / 60 / 24;

		System.out.println("������������磺" + day + "��");
	}
	
	
}
