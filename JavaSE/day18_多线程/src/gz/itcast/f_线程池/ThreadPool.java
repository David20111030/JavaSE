package gz.itcast.f_�̳߳�;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * �̳߳صĺô����̳߳����ÿһ���̴߳�������󣬲�����������
 * 				�����ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
 * 
 * ������̳߳���ʵ���̵߳Ĵ����أ�
 * 		A������һ���̳߳ض��󣬿���Ҫ���������̶߳���
 * 		  public static ExecutorService newFixedThreadPool(int nThreads);
 * 		B:�����̳߳ص��߳̿���ִ�У�
 * 			����ִ��Runnable�������Callable���������߳� 
 * 			��һ����ʵ��Runnable�ӿ�
 *		C���������·������ɣ�
 *			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:�Ҿ�Ҫ������������?
 *			����
 * 
 * @author ��Ԫ
 *
 */
public class ThreadPool {
	public static void main(String[] args) {
		//����һ���̳߳ض��󣬿���Ҫ���������̶߳���
		//public static ExecutorService newFixedThreadPool(int nThreads);
	    ExecutorService pool =   Executors.newFixedThreadPool(2);
		
		//����ִ��Runnable�������Callable���������߳�
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		//�����̳߳�
		pool.shutdown();
	}
	
}
