package gz.itcast.a_02;
/**
 * ��ʽ1���̳�Thread��
 * 	���裺
 * 		1���Զ���MyThread��̳�Thread�ࡣ
 * 		2��MyThread��������дrun()��
 * 				Ϊʲô��run()�����أ�
 * 					�������е����д��붼��Ҫ���߳�ִ�еġ�
 * 					�����ʱ��Ϊ��������Щ�����ܹ����߳�ִ�У�java�ṩ��Thread���е�run()����������Щ���߳�ִ�еĴ��롣
 * 		3����������
 * 		4�������߳�
 * 
 * @author ��Ԫ
 *
 */
public class MyThread extends Thread{
	
	//��дrun����
	@Override
	public void run() {
		// �Լ�д����
		// System.out.println("�ú�ѧϰ����������");
		// һ����˵�����߳�ִ�еĴ���϶��ǱȽϺ�ʱ�ġ�����������ѭ���Ľ�
		for(int x = 0;x<200;x++){
			System.out.println(x);
		}
	}
}
