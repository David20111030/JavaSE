package a_Collection.gz.List.List_Son.LinkedList_01;

import java.util.LinkedList;

/**
 * LinkedList�����й��ܣ�
 * 		A:���Ԫ�أ�	
 * 			public void addFirst(Object e);//��ָ��Ԫ�ز�����б�Ŀ�ͷ��
 * 			public void addLast(Object e);// ��ָ��Ԫ����ӵ����б�Ľ�β��
 * 		B:��ȡ����
 * 			public Object getFirst();// ���ش��б�ĵ�һ��Ԫ�ء�
 * 			public Object getLast();//���ش��б�����һ��Ԫ�ء�
 * 		C:ɾ������
 * 			public Object removeFirst();//����ֵ��ʾ���Ƴ���Ԫ��
 * 			public Object removeLast();////����ֵ��ʾ���Ƴ���Ԫ��	
 * 
 * @author ��Ԫ
 *
 */
public class LinkedListDemo01 {

	public static void main(String[] args){
		
		test1();
		
	}
	
	public static void test1(){
		//�������϶���
		LinkedList link=new LinkedList();
		
		//���Ԫ��
		link.add("hello");
		link.add("world");
		link.add("java");
		
		//public void addFirst(Object e);
		link.addFirst("one");
		//public void addLast(Object e);
		link.addLast("four");
		
		//public Object getFirst();
		System.out.println("getFirst:"+link.getFirst());//getFirst:one
		//public Object getlast();
		System.out.println("getLast:"+link.getLast());//getLast:four
		
		//public Object removeFirst();
		System.out.println("removeFirst:"+link.removeFirst());//removeFirst:one
		//public Object removeLast();
		System.out.println("removeLast:"+link.removeLast());//removeLast:four
		
		//���������  ע�⣺���һ�����϶����������൱������ü����е�����Ԫ��
		System.out.println("link:"+link);//link:[hello, world, java]

	}
	
}
