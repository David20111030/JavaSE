package gz.itcast.b_01;
/**
 * �Զ�����ʵ��Runnable�ӿڣ�����дrun()����
 * @author ��Ԫ
 *
 */
public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int x = 0;x<100;x++){
			//�������Ƚӿڵķ�ʽ�Ͳ���ֱ��ʹ��Thread��ķ����ˣ����ǿ��Լ�ӵ�ʹ�ð�
			//Thread.currentThread() ����һ����ǰ�̵߳Ķ���  ������
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
