package gz.itcast.a_03;
/**
 * ��λ�ȡ�̶߳���������أ�
 * 	public final String getName();��ȡ�̵߳�����
 * ��������̶߳���������أ�
 * 	public final void setName(String name);�����̵߳�����
 * 
 * ��Բ���Thread�����������λ�ȡ�̶߳��������أ�
 * 	public static Thread currentThread();���ص�ǰ����ִ�е��̶߳���
 *  Thread.currentThread.getName();�����س�����
 * @author ��Ԫ
 *
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		/**
		 * ��ʽ1
		 */
		/*//�����̶߳���
		//�޲ι���+setXxx()
		 MyThread my1 = new MyThread();
		 MyThread my2 = new MyThread();
		 //���÷�����������
		 my1.setName("����ϼ");
		 my2.setName("����");
		 my1.start();
		 my2.start();
		*/
		
		/**
		 * ��ʽ2
		 */
		//�����̶߳���
		/*//���ι��췽�����߳�������
		MyThread my1 = new MyThread("����ϼ");
		MyThread my2 = new MyThread("����Ԫ");
		//�����߳�
		my1.start();
		my2.start();
		*/
		
		
		/**
		 * ��ʽ3
		 */
		//��Ҫ��ȡmain�������ڵ��̶߳�������ƣ�������أ�
		Thread mainThread = Thread.currentThread();//���ص�ǰ����ִ�е��̶߳���  Ҳ����main�������̶߳���
		System.out.println(mainThread.getName());//��ȡ����   main

		
	}
}
