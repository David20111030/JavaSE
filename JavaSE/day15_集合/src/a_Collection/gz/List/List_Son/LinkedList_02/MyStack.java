package a_Collection.gz.List.List_Son.LinkedList_02;

import java.util.LinkedList;

/**
 * 自定义的栈集合
 * @author 贤元
 *
 */
public class MyStack {
	private LinkedList link;
	
	public MyStack(){
		link=new LinkedList();
	}
	
	//压栈
	public void add(Object obj){
		link.addFirst(obj);
	}
	
	//弹栈
	public Object get(){
		return link.removeFirst();//removeFirst();的返回值返回的是被删除的那个元素
	}
	
	public boolean isEmpty(){
		return link.isEmpty();
	}
	
	
	
	
}
