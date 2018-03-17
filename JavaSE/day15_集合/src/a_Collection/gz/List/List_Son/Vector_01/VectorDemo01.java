package a_Collection.gz.List.List_Son.Vector_01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Vector的特有功能：
 * 	1：添加功能：
 * 		public void addElement(Object obj);  -- 等价于add();
 * 	2、获取功能：
 * 		public Object elementAt(int index);  --等价于get();
 * 		public Enumeration elements(); -- 等价于 Iterator iterator();
 *  	boolean hasMoreElements();  -- 等价于hasNext();
 *  	Object nextElement(); -- 等价于next();
 *  	
 * 	JDK升级的原因：
 * 		A:安全
 * 		B:效率
 * 		C:简化书写
 * 
 * 
 * @author 贤元
 *
 */
public class VectorDemo01 {
	public static void main(String[] args){
		
		test1();
	}
	
	public static void test1(){
		//创建集合对象
		Vector v=new Vector();
		
		//添加元素 一下两种方式添加元素的方式都一样
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		v.add("javaee");
		//遍历
		for(int i=0;i<v.size();i++){
			String s=(String)v.elementAt(i);//等价于 String s=(String)v.get(i);
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * 	hello
			world
			java
			javaee
		 */
		
		//使用Vector集合特有的遍历方式遍历
		Enumeration en=v.elements();//返回的是实现类的对象
		while(en.hasMoreElements()){//判断集合中是否还有元素
			String s=(String)en.nextElement();
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * 	hello
			world
			java
			javaee
		 */
		
		//使用迭代器遍历
		Iterator it=v.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * 	hello
			world
			java
			javaee
		 */
	}
	
	
	
}
