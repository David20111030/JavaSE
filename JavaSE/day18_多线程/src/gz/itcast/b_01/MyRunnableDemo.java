package gz.itcast.b_01;
/**
 * �ڶ���ʵ�ֶ��̵߳ķ�ʽ��
 * 	��ʽ2��ʵ��Runnable�ӿ�
 * 		���裺
 * 			1���Զ�����MyRunnableʵ��Runnable�ӿ�
 * 			2����дrun()����
 *  		3������MyRunnable��Ķ���
 *  		4������Thread��Ķ��󣬲���c����Ķ�����Ϊ�����������
 * @author ��Ԫ
 *
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		//3������MyRunnable��Ķ���
		MyRunnable mr = new MyRunnable();
		
		//4������Thread��Ķ��󣬲����Զ����߳���Ķ�����Ϊ�����������
		//Thread(Runnable target,String name); Thread��Ĺ��췢Ŷ�Ǹ��� �ڶ���������ʾ�̵߳�����
		Thread th1 = new Thread(mr,"����Ԫ");
		Thread th2 = new Thread(mr,"��־��");
		
		//�����߳�
		th1.start();
		th2.start();
	}
	
	
}
