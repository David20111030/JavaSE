package gz.itcast.b_02һ������;

/**
 * �̳�Thread��ʽ�� ���裺�̳�Thread�࣬��дrun����
 * 
 * @author ��Ԫ
 * 
 */
public class MyThread extends Thread {

	// Ʊ��
	public static int ticket = 100;

	/**
	 * ĳ��ӰԺĿǰ������ӳ�����Ƭ(�����,�����´���ؾ���)�� ����100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
	 */
	@Override
	public void run() {
		// ��Ҫ���������������������ע��:�����������Ψһ�İ�
		while (true) {
			if (ticket != 0) {
				synchronized (this) {
					System.out.println(getName() + "���ڳ��۵ڣ�" + (ticket--) + " ��Ʊ");
				}
			} else {
				return;
			}
		}
	}

}
