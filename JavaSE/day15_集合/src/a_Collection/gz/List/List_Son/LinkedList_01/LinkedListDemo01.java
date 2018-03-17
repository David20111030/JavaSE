package a_Collection.gz.List.List_Son.LinkedList_01;

import java.util.LinkedList;

/**
 * LinkedList的特有功能：
 * 		A:添加元素：	
 * 			public void addFirst(Object e);//将指定元素插入此列表的开头。
 * 			public void addLast(Object e);// 将指定元素添加到此列表的结尾。
 * 		B:获取功能
 * 			public Object getFirst();// 返回此列表的第一个元素。
 * 			public Object getLast();//返回此列表的最后一个元素。
 * 		C:删除功能
 * 			public Object removeFirst();//返回值表示被移除的元素
 * 			public Object removeLast();////返回值表示被移除的元素	
 * 
 * @author 贤元
 *
 */
public class LinkedListDemo01 {

	public static void main(String[] args){
		
		test1();
		
	}
	
	public static void test1(){
		//创建集合对象
		LinkedList link=new LinkedList();
		
		//添加元素
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
		
		//输出对象名  注意：输出一个集合对象名，就相当于输出该集合中的所有元素
		System.out.println("link:"+link);//link:[hello, world, java]

	}
	
}
