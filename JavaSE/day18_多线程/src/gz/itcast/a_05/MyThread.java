package gz.itcast.a_05;

import java.util.Date;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int x = 0;x<100;x++){
			System.out.println(getName()+":"+x+",���ڣ�"+new Date());
			
			//���ˣ����߳���΢��Ϣ1����
			try{
				Thread.sleep(1000);//�����߳�����ʱ��Ϊ1�� ��ָ���ĺ��������õ�ǰ����ִ�е��߳����ߣ���ִͣ�У���
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
