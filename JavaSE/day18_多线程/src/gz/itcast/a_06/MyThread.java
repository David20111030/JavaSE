package gz.itcast.a_06;

import java.util.Date;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("��ʼִ�У�"+new Date());
		
		//��Ҫ��Ϣ10���ӣ��ף���Ҫ������
		try{
			Thread.sleep(10000);//���߳�����10����
		}catch(InterruptedException e){
			System.out.println("�̱߳���ֹ��");
		}
		
		System.out.println("����ʱ�䣺"+new Date());
	}	
}
