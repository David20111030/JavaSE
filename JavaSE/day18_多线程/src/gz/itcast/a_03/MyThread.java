package gz.itcast.a_03;
/**
 * ���裺
 * 	1�����Զ������м̳�Thread��
 * 	2����дrun����
 * @author ��Ԫ
 *
 */
public class MyThread extends Thread{
	
	public MyThread(){
		
	}
	
	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int x = 0;x<100;x++){
			System.out.println(getName() + ":" + x);//��ȡ��ǰ�߳�����
		}
	}
}
