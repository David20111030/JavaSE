package gz.itcast.e_�߳���01;

import org.junit.Test;

/**
 * �߳���:�Ѷ���߳���ϵ�һ��
 * 
 * �����Զ�һ���߳̽��з������Java�������ֱ�Ӷ��߳�����п��ơ�
 * 		
 * @author ��Ԫ
 *
 */
public class ThreadGroupDemo {
	
	
	
	
	//Ŀ�ģ��߳�Ĭ��������main�߳����
	@Test
	public void test1() throws Exception {
		//�����Զ����߳���(Ҳ����Դ��)
		MyRunnable mr = new MyRunnable();
		
		//�����߳�
		Thread th1 = new Thread(mr,"����Ԫ");
		Thread th2 = new Thread(mr,"����");
		
		//�Ҳ�֪�����������ĸ��߳��飬����֪������ô�죿
		//�߳�������ķ�����public final ThreadGroup getThreadGroup();
		ThreadGroup tg1 = th1.getThreadGroup();
		ThreadGroup tg2 = th2.getThreadGroup();
		
		//�߳�������Ū�ķ�����public final String getName();//�õ��߳��������
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);//main
		System.out.println(name2);//main
		
		//ͨ���������֪���ˣ��߳�Ĭ�����������main�߳���
		
		//ͨ����main�Ĳ��ԣ���Ӧ���ܹ�������Ĭ������£����е��̶߳�����ͬһ����
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main
		
	}
	
	
	@Test
	public void test2() throws Exception {
		//ThreadGroup(String name);
		//����һ���µ��߳���
		ThreadGroup tg = new ThreadGroup("����һ���µ��߳���");
		
		MyRunnable my = new MyRunnable();
		//Thread(ThreadGroup group,Runnable target,String name);
		//�����µ� Thread �����Ա㽫 target ��Ϊ�����ж��󣬽�ָ���� name ��Ϊ�����ƣ�����Ϊ group �����õ��߳����һԱ��
		Thread t1 = new Thread(tg,my,"����Ԫ");
		Thread t2 = new Thread(tg,my,"����");
		
		System.out.println(t1.getThreadGroup().getName());//����һ���µ��߳���
		System.out.println(t2.getThreadGroup().getName());//����һ���µ��߳���

		
		//ͨ���߳���������ú�̨�̣߳���ʾ������̶߳��Ǻ�̨�߳�
		tg.setDaemon(true);
	}
	
	
	
	
}
