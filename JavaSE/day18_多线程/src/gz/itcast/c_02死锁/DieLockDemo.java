package gz.itcast.c_02����;
/**
 * ͬ���ı׶ˣ�
 * 	A��Ч�ʵ�
 *  B�����ײ�������
 *  
 * ������
 * 	  �����������������ϵ��߳���������Դ�Ĺ����У�������һ�ֻ���ȴ�������
 * 
 * @author ��Ԫ
 *
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock dl1 = new DieLock(true);
		DieLock dl2 = new DieLock(false);
		
		dl1.start();
		dl2.start();
		/**
		 * ���н����
		 * if objA
			else objB
		 */
	}
}
