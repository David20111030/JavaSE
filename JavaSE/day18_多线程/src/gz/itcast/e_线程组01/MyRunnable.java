package gz.itcast.e_�߳���01;

//ʵ�ֶ��̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿ�
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int x = 0;x<100;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
			
		}

		
	}
}
