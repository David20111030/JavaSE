package a_Collection.gz.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator iterator();迭代器，集合的专用遍历方式 Object next();获取元素，并移动到下一个位置
 * 
 * NoSucnElementException：没有这样的元素，因为你已经找到最后了
 * 
 * boolean hasNext();如果仍有元素可以迭代，则为true。
 * 
 * 
 * 
 * @author 贤元
 * 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		// 集合的遍历方式
		 //test1();
		
		// 集合的一个练习
		test2();

	}

	/**
	 * 集合的遍历方式
	 */
	private static void test1() {
		// 创建集合对象
		Collection c = new ArrayList();

		// 创建并添加元素
		String s = "hello";
		c.add(s);
		c.add("world");
		c.add("java");

		// Iterator iterator();迭代器，集合的专用遍历方式
		Iterator it = c.iterator();// 实际返回的肯定是子类对象，这里是多态

		// 第一种遍历方式：用普通的方式遍历集合中的元素，这样的缺点就是容易出现NoSucnElementException异常
		/*
		 * Object obj=it.next(); System.out.println(obj);//hello
		 * System.out.println(it.next());//world
		 * System.out.println(it.next());//java
		 * //System.out.println(it.next());//NoSucnElementException
		 * 最后一个不应该写，所以，我们应该在每次获取前，如果有一个判断就好了
		 */

		System.out.println("---------------");

		// 第二种遍历方式 这种遍历方式较第一种方式的好处是，不会出现NoSuchElementException异常
		/*
		 * if(it.hasNext()){ System.out.println(it.next()); } if(it.hasNext()){
		 * System.out.println(it.next()); } if(it.hasNext()){
		 * System.out.println(it.next()); } if(it.hasNext()){
		 * System.out.println(it.next()); } if(it.hasNext()){
		 * System.out.println(it.next()); }
		 */

		// 集合最好的遍历方式 使用迭代器遍历 最终版遍历方式
		while (it.hasNext()) {
			// System.out.println(it.next());
			String str = (String) it.next();
			System.out.println(str);
		}
	}

	/**
	 * 集合的练习
	 */
	private static void test2() {
		/*
		 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
		 * 
		 * 注意： A:自己的类名不要和我们学习的要使用的API中的类名相同。
		 * B:复制代码的时候，很容易把那个类所在的包也导入过来，容易出现不能理解的问题。
		 */

		// 创建集合
		Collection c = new ArrayList();

		// 创建学生对象
		Student s1 = new Student("林青霞", 18);
		Student s2 = new Student("风清扬", 19);
		Student s3 = new Student("黑夜", 21);
		Student s4 = new Student("漫漫", 22);
		Student s5 = new Student("无边", 23);

		//把学生对象添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		// 使用迭代器遍历单列集合
		// 首先得获取迭代器对象
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "--" + s.getAge());
		}

		
		System.out.println("-----------");
		
		/*
		 * 问题1:能用while循环写这个程序，我能不能用for循环呢?
		 * 问题2:不要多次使用it.next()方法，因为每次使用都是访问一个对象。
		 */
		//用for循环遍历
		for(Iterator it2=c.iterator();it.hasNext();){
			Student stu=(Student)it.next();
			System.out.println(stu.getName()+"--"+stu.getAge());
		}
		
	}

}
