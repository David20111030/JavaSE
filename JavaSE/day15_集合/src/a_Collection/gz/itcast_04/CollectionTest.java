package a_Collection.gz.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		test1();
		
		System.out.println("-------------------");
		
		test2();
		
	}
	

	/*
	 * 需求：存储字符串并遍历。
	 * 
	 * 分析：
	 * 		A:创建集合对象
	 * 		B:创建字符串对象
	 * 		C:把字符串对象添加到集合中
	 * 		D:遍历集合
	 */
	private static void test1() {
		//创建集合对象
		Collection c=new ArrayList();
		
		//创建字符串对象，
		//把字符串对象添加到集合中
		c.add("林青霞");
		c.add("风清扬");
		c.add("黑夜");
		
		//使用迭代器遍历集合
		//首先获取迭代器对象
		Iterator it=c.iterator();
		//通过迭代器对象的hasNext()方法判断有没有元素
		while(it.hasNext()){
			//通过迭代器对象的next()方法获取元素
			String s=(String)it.next();
			System.out.println(s);
		}
		
	}
	
	
	/*
	 * 需求：存储自定义对象并遍历Student(name,age)
	 *
	 * 分析：
	 * 		A:创建学生类
	 * 		B:创建集合对象
	 * 		C:创建学生对象
	 * 		D:把学生对象添加到集合对象中
	 * 		E:遍历集合
	 */
	public static void test2(){
		//创建学生对象
		Student s1=new Student("风清扬",30);
		Student s2=new Student("林青霞",32);
		
		//创建集合对象
		Collection c=new ArrayList();
		//将学生对象添加到集合中
		c.add(s1);
		c.add(s2);
		c.add(new Student("黑夜",19));//往集合中添加匿名对象
		
		//使用迭代器遍历集合
		//首先获取迭代器对象
		Iterator it=c.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			System.out.println(s.getName()+"--"+s.getAge());
		}
		/*
		遍历结果
		风清扬--30
		林青霞--32
		黑夜--19*/
	}
	
}
