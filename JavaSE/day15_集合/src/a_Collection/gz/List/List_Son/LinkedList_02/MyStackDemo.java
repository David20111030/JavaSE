package a_Collection.gz.List.List_Son.LinkedList_02;

public class MyStackDemo {
	public static void main(String[] args) {
		//�������϶���
		MyStack ms=new MyStack();
		
		//ѹջ
		ms.add("hello");
		ms.add("world");
		ms.add("java");
		
		//��ջ
		//System.out.println(ms.get());//java
		//System.out.println(ms.get());//world
		//System.out.println(ms.get());//hello
		// NoSuchElementException
		// System.out.println(ms.get());
		
		//��ջ
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
		/**
		 * ���������
		 * 	java
			world	
			hello

		 */
		
	}

}
