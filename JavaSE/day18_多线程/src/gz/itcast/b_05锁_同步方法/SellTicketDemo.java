package gz.itcast.b_05��_ͬ������;
/**
 * A��ͬ����������������˭�أ�
 * 		�������
 * 
 * B��ͬ�������ĸ�ʽ�����������⣿
 * 		��ͬ���ؼ��ּ��ڷ����ϡ�
 * 	  ͬ��������˭�أ�
 * 		this
 * 
 * C:��̬���������������⣿
 * 	 ��̬��������������˭�أ�
 * 		����ֽ����ļ�����
 * @author ��Ԫ
 *
 */
public class SellTicketDemo {
	//������Ʊ����
	public static void main(String[] args) {
		//������Դ����  Ҳ�����Զ��������
		MyRunnable my = new MyRunnable();
		
		//���������̶߳��󣬲�����Դ������Ϊ�����������
		Thread t1 = new Thread(my, "����1");
		Thread t2 = new Thread(my, "����2");
		Thread t3 = new Thread(my, "����3");
		
		
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
		
	}
}
