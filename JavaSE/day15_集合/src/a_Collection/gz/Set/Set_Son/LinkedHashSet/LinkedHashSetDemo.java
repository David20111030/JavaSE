package a_Collection.gz.Set.Set_Son.LinkedHashSet;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet: �ײ����ݽṹ�й�ϣ���������ɡ�
 * ��ϣ��֤Ԫ�ص�Ψһ�ԡ�
 * ����֤Ԫ������(��ȡ��ȡ����һ�µ�)
 * @author ��Ԫ
 *
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//�������϶���
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		// ���������Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		hs.add("java");

		// ����
		for (String s : hs) {
			System.out.println(s);
		}		
		/**
		 * �����������
		 * hello
		 * world
		 * java
		 */
		
	}
}
