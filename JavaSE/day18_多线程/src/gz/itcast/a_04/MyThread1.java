package gz.itcast.a_04;
/**
 * �Զ�����̳�Thread�࣬��дrun����������дҪ�����̷߳�ʽִ�еĴ���
 * @author ��Ԫ
 *
 */
public class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int x = 0;x<=100; x++){
			System.out.println(getName()+":"+x);//��ȡ��ǰ�̵߳�����
		}
	}
}
