package e_Test01.cn;
/*
��Ա�ڲ�������η���
private��Ϊ�˱�֤���ݵİ�ȫ��
static��Ϊ�˷����������
ע�⣺��̬�ڲ�������ⲿ�����ݱ����þ�̬���η� 
*/
public class Outer {

	private static int num2=100;
	//�ڲ����þ�̬��������Ϊ�ڲ�����Կ������ⲿ��ĳ�Ա
	public static class Inner{
		public void show3(){
			System.out.println(num2);
		}
		//�ڲ���ľ�̬����
		public static void show4(){
			System.out.println(num2);
		}
	}
}
