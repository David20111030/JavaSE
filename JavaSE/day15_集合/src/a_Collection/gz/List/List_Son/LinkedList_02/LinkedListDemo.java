package a_Collection.gz.List.List_Son.LinkedList_02;

import java.util.Iterator;
import java.util.LinkedList;

/*
 *����LinkedListģ��ջ���ݽṹ�ļ��ϣ�������
 *��Ŀ����˼�ǣ�
 *		���Լ��Ķ���һ�������࣬������������ڲ�����ʹ��LinkedListģ�⡣
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		// A: LinkedList��������ӹ���addFirst()
		// B:ջ���ص��Ƚ����
		// �������϶���
		LinkedList link = new LinkedList();

		// ���Ԫ��
		link.addFirst("hello");
		link.addFirst("world");
		link.addFirst("java");

		// ����
		Iterator it = link.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		/**
		 ���������
		java
		world
		hello
		 */

		// Ϊʲô��?
	}
}
