package gz.itcast.a_06;

/**
 * public void interrupt():�ж��̡߳� ���̵߳�״̬��ֹ�����׳�һ��InterruptedException��
 * @author ��Ԫ
 *
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread ts = new MyThread();
		//�����߳�
		ts.start();
		
		//����̳߳������벻�ѹ������͸�����
		try{
			Thread.sleep(3000);//���߳�����3��
			ts.interrupt();//�ж��̡߳�
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		/**
		 * ��ʼִ�У�Mon Mar 13 21:49:35 CST 2017
			�̱߳���ֹ��
			����ʱ�䣺Mon Mar 13 21:49:38 CST 2017

		 */
	}
	
}
