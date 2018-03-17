package l_Calendar;

import java.util.Calendar;
import java.util.Scanner;

import org.junit.Test;

public class CalendarDemo {
	
	/**���������ࣺ
	 * 		ע�⣺�����·��Ǵ�0��ʼ�����ġ���ΧΪ0~11.���������õ�ʱ���·�Ӧ�ü���1.
	 * 	
	 * Calendar:��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �� �����ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
	 * 
	 * public int get(int field):���ظ��������ֶε�ֵ���������е�ÿ�������ֶζ��Ǿ�̬�ĳ�Ա������������int���͡�
	 * 			 ����field���������ֶ�
	 * 
	 * �����ֶΣ�
	 * 		Calendar.YEAR	 ָʾ��� get �� set ���ֶ����֡�
	 * 		Calendar.MONTH   ָʾ�·ݵ� get �� set ���ֶ����֡�
	 *		Calendar.DATE    get �� set ���ֶ����֣�ָʾһ�����е�ĳ�졣
	 */
	@Test
	public void test1() throws Exception {
		//�������ֶ��Ѿ��ɵ�ǰ���ں�ʱ���ʼ��
		//ʹ��Ĭ��ʱ�������Ի������һ����������
		//Calendar ringhtNow = new Calendar();����Calendar��һ�������࣬����ʵ����
		//ʹ��Ĭ��ʱ�������Ի������һ����������
		Calendar rightNow = Calendar.getInstance();
		
		//��ȡ��
		int year = rightNow.get(Calendar.YEAR);
		// ��ȡ��
		int month = rightNow.get(Calendar.MONTH);
		// ��ȡ��
		int date = rightNow.get(Calendar.DATE);
		
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");
	}
	
	
	
	/*
	 * public void add(int field,int amount):���ݸ����������ֶκͶ�Ӧ��ʱ�䣬���Ե�ǰ���������в�����
	 * 
	 * public final void set(int year,int month,int date):���õ�ǰ������������
	 */
	@Test
	public void test2() throws Exception {
		//��ȡ��ǰ������ʱ��
		Calendar c = Calendar.getInstance();
		
		//��ȡ��
		int year = c.get(Calendar.YEAR);
		//��ȡ��
		int month = c.get(Calendar.MONTH);
		//��ȡ��
		int date = c.get(Calendar.DATE);
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");//2017��3��1��

		 // ����ǰ�Ľ���
		 c.add(Calendar.YEAR, -3);
		 // ��ȡ��
		 year = c.get(Calendar.YEAR);
		 // ��ȡ��
		 month = c.get(Calendar.MONTH);
		 // ��ȡ��
		 date = c.get(Calendar.DATE);
		 System.out.println(year + "��" + (month + 1) + "��" + date + "��");//2014��3��1��	
	
		 // 5����10��ǰ
		 c.add(Calendar.YEAR, 5);
		 c.add(Calendar.DATE, -10);
		// ��ȡ��
		 year = c.get(Calendar.YEAR);
		// ��ȡ��
		 month = c.get(Calendar.MONTH);
		// ��ȡ��
		 date = c.get(Calendar.DATE);
		 System.out.println(year + "��" + (month + 1) + "��" + date + "��");
		 System.out.println("--------------");

		 //���õ�ǰ������������
		 c.set(2011, 11, 11);
		 
		// ��ȡ��		 
		 year = c.get(Calendar.YEAR);
		// ��ȡ��
		 month = c.get(Calendar.MONTH);
		// ��ȡ��
		 date = c.get(Calendar.DATE);
		 System.out.println(year + "��" + (month + 1) + "��" + date + "��");//2011��12��11��
	
	}
	
	
	/**
	 * һ��������
	 * 	
	 * ��ȡ����һ��Ķ����ж�����
	 * 
	 * ������
	 * 		A:����¼����������
	 * 		B:�������������������
	 * 			�����A���������
	 * 			����2
	 * 			����1
	 * 		C:��ʱ����ǰ��һ�죬����2�µ����һ��
	 * 		D:��ȡ��һ���������
	 */
	@Test
	public void testname() throws Exception {
		//����¼����������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		
		//�������������������
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);//��ʵ����һ���3��1��   ע�⣺�����·��Ǵ�0��ʼ�����ġ���ΧΪ0~11.���������õ�ʱ���·�Ӧ�ü���1.
		System.out.println(c.get(Calendar.YEAR)+"��  "+(c.get(Calendar.MONTH)+1)+"��  "+c.get(Calendar.DATE)+"��");
		//��ʱ����ǰ��һ�죬����2�µ����һ��
		c.add(Calendar.DATE, -1);
		
		//��ȡ��һ���������
		System.out.println(c.get(Calendar.DATE));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
