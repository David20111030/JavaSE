package e_���͸߼�_ͨ���;

import java.util.ArrayList;
import java.util.Collection;
/**
	 ���͸߼�(ͨ���)��
		    ����ͨ���<?>
		   	�������ͣ����û����ȷ���Ǿ���Object�Լ������Java����
		   	
		 ?extends E
			�����޶�,E��������
			
		 ?super E
			 �����޶���E������
			 
		  //ע�⣺�����������ȷд��ʱ��ǰ�����һ�� �磺Collection<object> c1=new ArrayList<Object>();	 
			 
		 ? ���������ͣ����û����ȷ����ô����Object�Լ������Java����
		 ?extends E:�����޶���E��������
		 ?extends E:�����޶���E���丸��
	
 * @author ��Ԫ
 *
 */
public class Demo01 {
	public static void main(String[] args) {

		// ? ��ʾ��������Ͷ��ǿ��Ե�
		Collection<?> c5 = new ArrayList<Object>();
		Collection<?> c6 = new ArrayList<Annimal>();
		Collection<?> c7 = new ArrayList<Dog>();

		// ?extends E�������޶���E��������
		// Collection<?extends Annimal> c9=new ArrayList<Object>();//����
		Collection<? extends Annimal> c10 = new ArrayList<Annimal>();
		Collection<? extends Annimal> c11 = new ArrayList<Dog>();

		// ?super E:�����޶���E���丸��
		Collection<? super Annimal> c12 = new ArrayList<Object>();
		Collection<? super Annimal> c13 = new ArrayList<Annimal>();
		// Collection<?super Annimal> c14=new ArrayList<Dog>();//����

	}
}
