package gz.itcast.b_02һ������;
/**
 * ʵ��Runnable�ӿڣ���ʵ��run������
 * @author ��Ԫ
 *
 */
public class MyRunnable implements Runnable{
	public static int ticket = 100;
	
	// Object obj = new Object();//����������,Ϊʲô�������Ϊ������ͻ����һ�������أ�Ʊ���ɸ����ˣ�������
	
	/**
	 * ĳ��ӰԺĿǰ������ӳ�����Ƭ(�����,�����´���ؾ���)�� 
	 * ����100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
	 */
	@Override
	public void run() {
		while(true){
			if(ticket!=0){
				//����Ҫ�����������������
				synchronized (this) {
					System.out.println(Thread.currentThread().getName()+"���ڳ��۵ڣ�"+(ticket--)+"��Ʊ");//��ȡ��ǰ�̶߳���Thread.currentThread()
				}
			}else{
				return;//���ticket==0�����˳�ѭ��
			}
		}
	}
}
