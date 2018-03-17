package a_Collection.gz.List.List_Son.LinkedList_02;

public class MyStackDemo {
	public static void main(String[] args) {
		//创建集合对象
		MyStack ms=new MyStack();
		
		//压栈
		ms.add("hello");
		ms.add("world");
		ms.add("java");
		
		//弹栈
		//System.out.println(ms.get());//java
		//System.out.println(ms.get());//world
		//System.out.println(ms.get());//hello
		// NoSuchElementException
		// System.out.println(ms.get());
		
		//弹栈
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
		/**
		 * 遍历结果：
		 * 	java
			world	
			hello

		 */
		
	}

}
