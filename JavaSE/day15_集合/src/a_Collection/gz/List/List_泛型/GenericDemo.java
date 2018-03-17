package a_Collection.gz.List.List_泛型;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型。 
 * 		参数化类型，吧类型当作参数一样的传递。
 * 	  格式：
 * 		<数据类型>
 * 		次数的数据类型只能是引用类型。	
 * 	好处：
 * 		A：把运行时期的问题提前到了编译期间
 * 		B：避免了强制类型转换
 * 		C：优化了程序设计，解决了黄色警告线
 * 		
 * 		
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author 贤元
 *
 */
public class GenericDemo {
	public static void main(String[] args) {
		test1();
		
		System.out.println("---test2()--");
		test2();
		
		System.out.println("---test3()---");
		test3();
		
		System.out.println("---test4()---");
		test4();
		
		
	
	}
	
	
	public static void test1(){
		//创建集合
		ArrayList<String> array=new ArrayList<String>();
		
		//添加元素
		// 添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		//array.add(new Integer(100));这样代码出错
		//array.add(10);//JDK5以后的自动装箱，等价于：array.add(Integer.valueOf(10));
		
		//遍历
		Iterator<String> it=array.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * 	hello
			world
			java
		 */
		
		// 看下面这个代码
		 String[] strArray = new String[3];
		 strArray[0] = "hello";
		 strArray[1] = "world";
		// strArray[2] = 10;//这样代码有错
		
	}
	
	/**
	 * 泛型在那些地方使用呢？
	 * 		看API，如果类，接口，抽象类后面跟的有<E>就是活命要使用泛型。一般来说就是在集合中使用。
	 */
	public static void test2(){
		//用ArrayList存储字符串元素，并遍历。用泛型改进代码
		ArrayList<String> array=new ArrayList<String>();
		
		//添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		System.out.println("迭代器遍历");
		//使用迭代器遍历
		Iterator<String> it=array.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
		
		System.out.println("普通for遍历");
		//使用普通for循环遍历  size()  get()
		for(int i=0;i<array.size();i++){
			String s=array.get(i);
			System.out.println(s);
		}
		
		System.out.println("增强for遍历");
		//使用增强for遍历
		for(String s:array){
			System.out.println(s);
		}
		
	}
	
	
	/**
	 * 需求：存储自定义对象并遍历
	 */
	public static void test3(){
		//创建集合对象
		//JDK7新特性：泛型推断. 但是不建议这样使用。
		//ArrayList<String> array=new ArrayList();
		ArrayList<Student> array=new ArrayList<Student>();
		
		//创建自定义学生对象
		Student s1 = new Student("曹操", 40); // 后知后觉
		Student s2 = new Student("蒋干", 30); // 不知不觉
		Student s3 = new Student("诸葛亮", 26);// 先知先觉
		
		//将自定义学生对象添加到集合中
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		System.out.println("使用迭代器遍历");
		//使用迭代器遍历
		//首先获取迭代器对象
		Iterator<Student> it=array.iterator();
		while(it.hasNext()){
			Student stu=it.next();
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
		
		System.out.println("使用普通for遍历");
		//使用普通for遍历
		for(int i=0;i<array.size();i++){
			Student stu=array.get(i);
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
		
		System.out.println("使用增强for遍历");
		//使用增强for遍历
		for(Student stu:array){
			System.out.println(stu.getName()+"---"+stu.getAge());			
		}
		
		
	}
	
	
	/**
	 * 早起的时候，我们使用Object来代表任意的类型。
	 * 
	 * 向上转型是没有任何问题的，但是在向下转型的时候其实隐含了类型转换问题。
	 * 
	 * 也就是说这样的程序其实并不是安全的。所以java在JDk5后引入了泛型，提高了程序的安全性。
	 * 
	 */
	public static void test4(){
		ObjectTool ot=new ObjectTool();
		
		//正常使用
		ot.setObj(new Integer(27));
		Integer i=(Integer)ot.getObj();
		System.out.println("年龄是："+i);//年龄是：27
		
		ot.setObj(new String("林青霞"));
		String s=(String) ot.getObj();
		System.out.println("姓名是："+s);//姓名是：林青霞
		
		
		System.out.println("----");
		ot.setObj(new Integer(30));
		//ClassCastException
		//String ss=(String)ot.getObj();//这行代码有错，类型转换异常
		//System.out.println("姓名是："+ss);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
