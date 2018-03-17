package a_Collection.gz.List.itcast_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * List集合的特有功能：
 * A:添加功能：
 * 		void add(int index,Object element);在指定位置添加元素
 * B：获取功能：
 * 		Object get(int index);获取指定位置的元素
 * C：列表迭代器
 * 		ListIterator listIterator();List集合特有的迭代器
 * D：删除功能
 * 		Object remove(int index);根据索引删除元素，返回被删除的元素
 * E：修改功能
 * 		Object set(int index,Object element);根据索引修改元素，返回被修改该的元素
 * 
 * 
 * List集合的特有遍历功能：
 * 			size()和get()方法结合使用
 * 
 * 
 * @author 贤元
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		test1();

		System.out.println("------test2()---------");

		test2();

		System.out.println("----test3()----");

		test3();
		
		
		System.out.println("-----test4()-----");
		test4();

		
		System.out.println("------test5()------");
		test5();
		
		
		System.out.println("--------test6()--------");
		test6();
		
		
		
		System.out.println("---------test7()----------");
		test7();
		
		
		System.out.println("---------test8()----------");
		test8();
		
	}

	// List集合存储字符串并遍历 List集合是一个接口
	public static void test1() {
		// 创建List集合对象
		List list = new ArrayList();

		// 创建字符串并添加字符串
		list.add("hello");
		list.add("world");
		list.add("java");

		// 遍历集合
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

	/**
	 * List集合的特点： 有序(存储和取出的元素一致,也可以认为是先进先出)，可重复。
	 */
	public static void test2() {
		// 创建List集合对象
		List list = new ArrayList();

		// 创建字符串并添加字符串
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		list.add("hello");

		// 使用迭代器方式遍历集合
		// 首先获取迭代器对象
		Iterator it = list.iterator();
		// 遍历List集合
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		/**
		 * 遍历结果: hello world java world hello
		 */

	}

	/**
	 * 存储自定义对象并遍历
	 */
	public static void test3() {
		// 创建集合对象
		List list = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("白骨精", 30);
		Student s2 = new Student("蜘蛛精", 40);
		Student s3 = new Student("猴子", 22);

		// 把学生对象添加到集合对象中
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// 遍历
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		/**
		 遍历结果：
		 	白骨精---30
			蜘蛛精---40
			猴子---22
		 */

	}

	
	
	/**
	 * List集合特有的功能
	 */
	public static void test4(){
		/**
		 * List集合的特有功能：
		 * A:添加功能：
		 * 		void add(int index,Object element);在指定位置添加元素
		 * B：获取功能：
		 * 		Object get(int index);获取指定位置的元素
		 * C：列表迭代器
		 * 		ListIterator listIterator();List集合特有的迭代器
		 * D：删除功能
		 * 		Object remove(int index);根据索引删除元素，返回被删除的元素
		 * E：修改功能
		 * 		Object set(int index,Object element);根据索引修改元素，返回被修改该的元素
		 */
		
		//创建List集合
		List list=new ArrayList();
		
		//添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//void add(int index,Object element);在指定位置添加元素
		/*
		 * 注意：这个在指定位置添加元素的时候索引最大只能为当前集合所包含的元素个数+1，最小只能为0.集合的下标和数组一样都是从0开始算的
		 */
		//list.add(1,"android");//如果这样直接添加没有问题
		//list.add(6,"javaee");//如果这样直接添加有问题
		//list.add(4,"javame");//如果这样直接添加有问题
		//list.add(3,"java");//如果这样直接添加没有问题
		//list.add(0,"java");//如果这样直接添加没有问题

		//Object get(int index);获取指定位置的元素
		System.out.println("get:"+list.get(2));//get:java
		//System.out.println("get:"+list.get(11));//IndexOutOfBoundsException索引越界异常
		
		//Object remove(int index);根据索引删除元素，返回被删除的元素
		//System.out.println("remove:"+list.remove(2));//remove:java 表示集合中的"java"元素被删除了
		//boolean remove(Object o);删除集合中指定的元素，写哪个删哪个元素。返回值表示是否删除成功.如果集合中没有该元素，则返回false
		//System.out.println("remove:"+list.remove("hello"));//true
		//System.out.println("remove:"+list.remove("hel"));//false
		
		
		//Object set(int index,Object element);根据索引修改元素，返回被修改该的元素
		System.out.println("set:"+list.set(1, "HELLO"));//set:world
		//System.out.println("set:"+list.set(12, "HELLO"));//IndexOutOfBoundsException:索引越界异常

		
	}
	
	
	
	/**
	 * List集合特有的遍历功能：
	 * 		size()和get()方法结合使用。
	 * size();表示集合的长度。也就是集合中包含的元素个数
	 */
	public static void test5(){
		//创建集合对象
		List list = new ArrayList();

		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		
		for(int i=0;i<list.size();i++){
			//String s=(String)list.get(i);
			//System.out.println(s);
			
			//或者直接如下一句代码解决(如下代码等价于上边注释掉的两条代码)
			System.out.println(list.get(i));
		}
		/**
		  遍历结果：
		  hello
		  world
		  java
		  world
		 */
	}
	
	
	/**
	 * 存储自定义对象并遍历，用普通for循环。（size()和get()结合）
	 */
	public static void test6(){
		//创建集合对象
		List list=new ArrayList();
		
		//创建学生对象
		Student s1 = new Student("林黛玉", 18);
		Student s2 = new Student("刘姥姥", 88);
		Student s3 = new Student("王熙凤", 38);
		
		// 把学生添加到集合中
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//遍历
		for(int i=0;i<list.size();i++){
			Student s=(Student)list.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
		}
		/**
		 遍历结果:
		 	林黛玉---18
			刘姥姥---88
			王熙凤---38
		 */

		
	}
	
	
	/**
	 * List集合特有的遍历功能
	 */
	public static void test7(){
		/*
		 列表迭代器：
		 	ListIterator listIterator();List集合特有的迭代器。
		 		该迭代器继承了Iterator迭代器，所以，就可以直接使用hashNext()和next()方法。
		 		
		 	特有功能：
		 		Object previous();获取上一个元素
		 		boolean hasPrevious();判断是否有元素
		 	
		 	注意：ListIterator可以实现逆向遍历，但是必须先正向遍历，才能逆向遍历，所以一般无意义，不使用。
		 */
		
		//创建List集合对象
		List list= new ArrayList();
		//往集合中添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//ListIterator listIterator();
		ListIterator lit=list.listIterator();//子类对象
		
		
		while(lit.hasNext()){
			String s=(String)lit.next();
			System.out.println(s);
		}
		/**
		 遍历结果：
		 	hello
			world
			java
		 */
		
		//注意：如果没有先实现正向遍历的话一下三行代码是会出错的。
		/*System.out.println(lit.previous());//java  ListIterator可以实现逆向遍历，但是必须先正向遍历
		System.out.println(lit.previous());//world
		System.out.println(lit.previous());//hello
		*/
		System.out.println("用while循环实现逆向遍历");
		
		while(lit.hasPrevious()){
			String s=(String)lit.previous();
			System.out.println(s);
		}
		/**
		 遍历结果：
		 	java
			world
			hello
		 */
		
		System.out.println("用不是List集合特有的迭代器遍历");
		// 迭代器
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		/**
		 遍历结果：
		 	hello
			world
			java
		 */
	}
	
	
	/**
	 * 迭代器遍历元素的时候，通过集合是不能修改元素的。迭代器遍历元素的时候,如何修改元素呢？
	 *  如何解决呢?
	 * 		A:迭代器迭代元素，迭代器修改元素
	 * 			元素是跟在刚才迭代的元素后面的。
	 * 		B:集合遍历元素，集合修改元素(普通for)
	 * 			元素在最后添加的。
	 */
	public static void test8(){
		// 创建List集合对象
		List list = new ArrayList();
		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//迭代器遍历
		/*Iterator it=list.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			if("world".equals(s)){
				list.add("javaee");//ConcurrentModificationException
				*//**
				 * 这句代码有错：注意：迭代器遍历元素的时候，通过集合是不能修改元素的。
				 *//*
			}
		}*/
		
		
		// 方式1：迭代器迭代元素，迭代器修改元素(只能使用List集合特有的迭代器ListIterator才能实现)
		// 而Iterator迭代器却没有添加功能，所以我们使用其子接口ListIterator
		 ListIterator lit = list.listIterator();
		 while (lit.hasNext()) {
			 String s = (String) lit.next();
			 if ("world".equals(s)) {
				 lit.add("javaee");
			 }
		 }
		
		 //迭代器遍历集合中的元素
		 Iterator it1=list.iterator();
		 while(it1.hasNext()){
			 String s=(String)it1.next();
			 System.out.println(s);
		 }
		 /**
		  遍历结果：
		  hello
		  world
		  javaee
		  java
		  */
		 
		 //方式2：集合遍历元素，集合修改元素(普通for)
		 for(int x=0;x<list.size();x++){
			 String s=(String)list.get(x);
			 if("java".equals(s)){
				 list.add("lixianyuan");
			 }
		 }
		 System.out.println("--<><><><><>---");
		 //迭代器遍历集合中的元素
		 Iterator it2=list.iterator();
		 while(it2.hasNext()){
			 String s=(String)it2.next();
			 System.out.println(s);
		 }
		 /**
		  遍历结果：
		  	hello
			world
			javaee
			java
			lixianyuan
		  */
		 
		
	}
	
}
