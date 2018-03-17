package a_Collection.gz.List.List_Son.ArrayList_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * List的子类特点：
 * 		ArrayList：
 * 			底层数据结构是数据，查询快，增删慢。
 * 			线程不安全，效率高。
 * 		
 * 		Vector：
 * 			底层数据结构是数组，查询快，增删慢。
 * 			线程安全，效率低。
 * 		
 * 		LinkedList：
 * 			底层数据结构是链表，查询慢，增删快
 * 			线程不安全，效率高。
 * 
 * 
 * 
 * 
 * 
 * 
 * ArrayList的使用。存储字符串并遍历
 *
 *ClassCastException：类型转换异常，注意，千万要搞清楚类型。
 * @author 贤元
 *
 */
public class ArrayListDemo01 {
	public static void main(String[] args) {
		
		test1();
		
		System.out.println("----test2()----");
		
		test2();
		
		System.out.println("----test3()-----");
		test3();
		
		System.out.println("---test4()----");
		test4();
		
		System.out.println("------test5()------");
		test5();
		
		
		
	}
	
	/**
	 * ArrayList的使用。存储字符串并遍历
	 */
	public static void test1(){
		//创建集合对象
		ArrayList array=new ArrayList();
		
		//创建元素对象，并添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//使用迭代器遍历集合
		//首先得获取迭代器对象
		Iterator it=array.iterator();
		while(it.hasNext()){//判断集合是否还有元素
			String s=(String)it.next();//获取元素
			System.out.println(s);
		}
		/**
		 遍历结果：
		 	hello
			world		
			java
		 */
		
		//使用for循环遍历
		for(int i=0;i<array.size();i++){
			String s=(String)array.get(i);
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * 	hello
		 *  world
		 *  java
		 */
	}
	
	
	/**
	 * ArrayList存储自定义对象并遍历
	 */
	public static void test2(){
		//创建集合对象
		ArrayList array=new ArrayList();
		
		//创建学生对象
		Student s1 = new Student("武松", 30);
		Student s2 = new Student("鲁智深", 40);
		Student s3 = new Student("林冲", 36);
		Student s4 = new Student("杨志", 38);
			
		//将学生对象添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		//使用迭代器遍历
		//首先获取迭代器对象
		Iterator it=array.iterator();
		//遍历
		while(it.hasNext()){
			Student stu=(Student)it.next();
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
		/**
		 * 遍历结果：
		 * 	武松---30
			鲁智深---40
			林冲---36
			杨志---38
		 */
		
		
		//使用for循环遍历
		for(int i=0;i<array.size();i++){
			Student stu=(Student)array.get(i);
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
		/**
		 * 遍历结果：
		 * 	鲁智深---40
			林冲---36
			杨志---38
		 */
		
		
	}

	
	/*
	 * ArrayList去除集合中字符串的重复值(字符串的内容相同)
	 * 
	 * 分析：
	 * 		A:创建集合对象
	 * 		B:添加多个字符串元素(包含内容相同的)
	 * 		C:创建新集合
	 * 		D:遍历旧集合,获取得到每一个元素
	 * 		E:拿这个元素到新集合去找，看有没有
	 * 			有：不搭理它
	 * 			没有：就添加到新集合
	 * 		F:遍历新集合
	 */
	public static void test3(){
		//创建集合对象
		ArrayList array=new ArrayList();
		
		//添加多个字符串元素(包含内容相同的)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		
		//创建新集合
		ArrayList newArray=new ArrayList();
		
		//遍历旧集合，获取每一个元素
		//获取迭代器对象
		Iterator it=array.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			// 拿这个元素到新集合去找，看有没有
			if(!newArray.contains(s)){
				newArray.add(s);
			}
		}
		
		//遍历新集合
		for(int x=0;x<newArray.size();x++){
			String s=(String)newArray.get(x);
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * 	hello
			world
			java
		 */
		
		
	}
	
	
	
	
	/*
	 * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
	 * 要求：不能创建新的集合，就在以前的集合上做。
	 */
	public static void test4(){
		//创建集合对象
		ArrayList array=new ArrayList();
		
		//添加多个字符串元素(包含内容相同的)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		
		//因为List集合在使用迭代器遍历的时候是不能修改集合中的元素的，所以应该用普通for去遍历集合
		// 由选择排序思想引入，我们就可以通过这种思想做这个题目
		// 拿0索引的依次和后面的比较，有就把后的干掉
		// 同理，拿1索引...
		for(int x=0;x<array.size()-1;x++){
			for(int y=x+1;y<array.size();y++){
				if(array.get(x).equals(array.get(y))){
					array.remove(y);
					y--;
				}
			}
		}
		
		//使用迭代器遍历集合
		Iterator it=array.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}		
	}
	
	
	
	/*
	 * 需求：去除集合中自定义对象的重复值(对象的成员变量值都相同)
	 * 
	 * 我们按照和字符串一样的操作，发现出问题了。
	 * 为什么呢?
	 * 		我们必须思考哪里会出问题?
	 * 		通过简单的分析，我们知道问题出现在了判断上。
	 * 		而这个判断功能是集合自己提供的，所以我们如果想很清楚的知道它是如何判断的，就应该去看源码。
	 * contains()方法的底层依赖的是equals()方法。
	 * 而我们的学生类中没有equals()方法，这个时候，默认使用的是它父亲Object的equals()方法
	 * Object()的equals()默认比较的是地址值，所以，它们进去了。因为new的东西，地址值都不同。
	 * 按照我们自己的需求，比较成员变量的值，重写equals()即可。
	 * 自动生成即可。
	 */
	public static void test5(){
		// 创建集合对象
		ArrayList array = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("林志玲", 40);
		Student s3 = new Student("凤姐", 35);
		Student s4 = new Student("芙蓉姐姐", 18);
		Student s5 = new Student("翠花", 16);
		Student s6 = new Student("林青霞", 27);
		Student s7 = new Student("林青霞", 18);

		// 添加元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		array.add(s4);
		array.add(s5);
		array.add(s6);
		array.add(s7);

		// 创建新集合
		ArrayList newArray = new ArrayList();

		// 遍历旧集合,获取得到每一个元素
		Iterator it = array.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();

			// 拿这个元素到新集合去找，看有没有
			if (!newArray.contains(s)) {
				newArray.add(s);
			}
		}

		// 遍历新集合
		for (int x = 0; x < newArray.size(); x++) {
			Student s = (Student) newArray.get(x);
			System.out.println(s.getName() + "---" + s.getAge());
		}		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
