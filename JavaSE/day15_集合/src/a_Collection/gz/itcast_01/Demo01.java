package a_Collection.gz.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 集合的由来：
 	我们学习的是面向对象语言，而面向对象语言对事物的描述是通过对象体现的，为了方便对多个对象进行操作，我们就必须把这多个对象进行存储。
 	
 	而想要存储多个对象，就不能是一个基本的变量，而应该是一个容器类型的变量，在我们目前所学过知识里面，有哪些是容器类型的呢？
 		数组和StringBuffer。但是，StringBuffer的结果是一个字符串，不一定满足我们的要求，所以我们只能选择数组，这就是对象数组。
 		而对象数组有不能适应变化的需求，因为数组的长度是固定的，这个时候，为了适应变化的需求，java就提供了集合类供我们使用。
 		
 数组和集合的区别:
 	A:长度区别
 		数组的长度固定。
 		集合的长度可变。
 	B:内容不同
 		数组存储的是同一种类型的元素
 		而集合可以存储不同类型的元素
 	C:元素的数据类型问题
 
 注意：数组可以存储基本数据类型，也可以存储引用数据类型，但是集合只能存储引用类型
 
 数据结构：数据的存储方式。
 	
 	Collection的功能概述：
 	1、添加功能：
 		boolean add(Object obj);添加一个元素
 		boolean addAll(Collection c);添加一个集合的元素
 	2、删除功能：
 		void clear();移除所有元素
 		boolean remove(Object o);移除一个元素
 		boolean removeAll(Collection c);溢出一个集合的元素。(只要有一个元素被移除了，就返回true)
 	3、判断功能：
 		boolean contains(Object o);判断集合中是否包含指定的元素
 		boolean containsAll(Collection coll);判断集合中是否包含一个指定的集合coll。只有包含所有的元素，才叫包含
 		boolean isEmpty();判断集合是否为空
 	4、获取功能
 		Iterator<E> iterator()  （重点，迭代器）
 	5、长度功能：
 		int size();元素的个数
 
 面试题：数组有没有length()方法呢？字符串有没有length()方法呢？集合有没有legth()方法呢？
 		数组和字符串都有length()方法，集合没有length()方法,但是集合有size()方法.
 	
 	6、交集功能：
 		boolean retainAll(Collection c);两个集合都有的元素。思考元素去哪了，返回的boolean又是什么意思呢？
 		
 	7、把集合转换为数组	
 		Object[] toArray();
 	
 	注意：直接输出一个集合就相当于把该集合中的所有元素全部输出.
 		Collection集合是单列集合的顶层接口，也就是单列集合的超类。
 */
public class Demo01 {
	public static void main(String[] args) {
	//test1();
	
	//test2();
		
	test3();
}



private static void test1() {
	//创建集合对象
	//Collection c=new Collection();
	//错误，因为Collection是单列集合的接口，而接口不能实例化
	Collection c=new ArrayList();
	
	//boolean add(Object obj);添加一个元素
	//System.out.println("add:"+c.add("hello"));//add:true
	
	c.add("world");
	c.add("java");
	
	//void clear();移除所有元素
	//c.clear();
	
	//boolean remove(Object o);移除一个元素
	//System.out.println("remove:"+c.remove("world"));//remove:true
	//System.out.println("remove:"+c.remove("javaee"));//remove:false 因为该集合中就没有"javaee"这个元素
	
	//判断集合中是否包含指定的元素
	System.out.println("contains:"+c.contains("java"));//contains:true
	System.out.println("contains:"+c.contains("javaee"));//contains:false
	
	Collection coll=new ArrayList();
	coll.add("java");
	//判断是否包含一个集合
	System.out.println("c is contarinsAll coll?"+c.containsAll(coll));//c is contarinsAll coll?true
	
	//int size();元素个数
	System.out.println("size:"+c.size());//size:2
	
	//直接输出一个集合  注意：直接输出一个集合就相当于把该集合中的所有元素全部输出
	System.out.println("c:"+c);//c:[world, java]
}


private static void test2() {
	//创建集合1
	Collection c1=new ArrayList();
	c1.add("abc1");
	c1.add("abc2");
	c1.add("abc3");
	c1.add("abc4");
	
	//创建集合2
	Collection c2=new ArrayList();
	c2.add("abc1");
	c2.add("abc2");
	c2.add("abc3");
	c2.add("abc4");
	c2.add("abc5");
	c2.add("abc6");
	c2.add("abc7");
	
	//boolean addAll(Collection c);添加一个集合的元素
	System.out.println("addAll:"+c1.addAll(c2));//addAll:true
	
	//boolean removeAll(Collection c);移除一个集合的元素(是一个还是所有？)
	//只要有一个元素被移除了，就返回true
	//System.out.println("removeAll:"+c1.removeAll(c2));//removeAll:true
	
	//boolean contarinsAll(Collection c);判断集合中是否包含指定的集合元素(是一个还是所有？)
	//只有包含所有的元素，才叫包含
	System.out.println("containsAll:"+c2.containsAll(c1));//containsAll:true
	System.out.println("contrainsAll:"+c1.containsAll(c2));//containsAll:true
	
	System.out.println("c1:"+c1);//c1:[abc1, abc2, abc3, abc4, abc1, abc2, abc3, abc4, abc5, abc6, abc7]
	System.out.println("c2:"+c2);//c2:[abc1, abc2, abc3, abc4, abc5, abc6, abc7]
}

/**
 * 集合的遍历
 */
private static void test3(){
	//集合的遍历。其实就是依次获取集合中的每一个元素
	//Object[] toArray();把集合转成数组，可以实现集合的遍历
	
	//创建集合对象
	Collection c=new ArrayList();
	
	//添加元素 add(Object obj);
	c.add("hello");// Object obj="hello";向上转型
	c.add("world");
	c.add("java");
	
	//遍历
	//Object[] toArray();把集合转成数组，可以实现集合的遍历
	Object[] objs=c.toArray();
	for(int i=0;i<objs.length;i++){
		//System.out.println(objs[i]);
		
		//我知道元素是字符串，我在获取到元素的同时，还想知道该元素的长度。
		//System.out.println(objs[x]+"---"+objs[x].length);//错误
		//上一句代码实现不了，原因是Object中没有length()方法
		//我们要想使用字符串的方法，就必须吧元素还原成字符串
		//向下转型
		String s=(String) objs[i];//向下转型
		System.out.println(s+"---"+s.length());
	}
	
	
}


}
