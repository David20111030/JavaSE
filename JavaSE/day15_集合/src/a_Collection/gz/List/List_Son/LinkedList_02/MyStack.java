package a_Collection.gz.List.List_Son.LinkedList_02;

import java.util.LinkedList;

/**
 * �Զ����ջ����
 * @author ��Ԫ
 *
 */
public class MyStack {
	private LinkedList link;
	
	public MyStack(){
		link=new LinkedList();
	}
	
	//ѹջ
	public void add(Object obj){
		link.addFirst(obj);
	}
	
	//��ջ
	public Object get(){
		return link.removeFirst();//removeFirst();�ķ���ֵ���ص��Ǳ�ɾ�����Ǹ�Ԫ��
	}
	
	public boolean isEmpty(){
		return link.isEmpty();
	}
	
	
	
	
}
