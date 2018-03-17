package a_Collection.gz.JDK5News;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.max;

/**
 * JDK5新特性
 * @author 贤元
 * 
 */
public class JDK5News {
	public static void main(String[] args) {
		test1();
		
		System.out.println("-----test2()----");
		test2();
		
		System.out.println("---test3()---");
		test3();
		
		System.out.println("---test4()---");
		test4();
		
		System.out.println("---test5()---");
		test5();
		
	}

	/**
	 * JDK5的新特性：
	 * 		自动拆装箱，泛型，增强for，静态导入，可变参数，枚举。
	 * 	增强for：是for循环的一种
	 * 		格式：
	 * 			for(元素数据类型 变量 : 要遍历的数组或者Collection集合){
	 * 				使用变量即可，该变量就是元素
	 * 			}
	 * 
	 *   好处：简化了数组和集合的遍历。
	 *   弊端：增强for的目标不能为null。
	 *   如何解决呢？对增强for的墓边先进行不为null的判断，然后再使用。
	 */
	public static void test1(){
		//定义一个int数组
		int[] arr={1,2,3,4,5};
		//使用普通for遍历
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println("--------");
		//使用增强for遍历
		for(int x:arr){
			System.out.println(x);
		}
		
		// 定义一个字符串数组
		String[] strArray = { "林青霞", "风清扬", "东方不败", "刘意" };
		//使用增强for遍历
		for(String s:strArray){
			System.out.println(s);
		}
		
		//定义一个集合
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add(".Net");
		//使用增强for遍历
		for(String s: array){
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * 	hello
		 * 	.Net
		 */
		
		List<String> list = null;
		// NullPointerException
		// 这个s是我们从list里面获取出来的，在获取前，它肯定还好做一个判断
		// 说白了，这就是迭代器的功能
		if (list != null) {
			for (String s : list) {
				System.out.println(s);
			}
		}
		
		// 增强for其实是用来替代迭代器的
		
		
	}
	
	
	/**
	 * ArrayList存储字符串并遍历。要求加入泛型，并用增强for遍历
	 * 	A：迭代器
	 * 	B：普通for
	 *  C：增强for
	 *  
	 *  增强for是用来代替迭代器的哦！！
	 *  LinkedList,Vector,Colleciton,List等存储我还讲吗?不讲解了，但是要求你们练习。
	 */
	public static void test2(){
		//创建集合对象
		ArrayList<String> array=new ArrayList<String>();
		
		//添加元素
		array.add("hello");
		array.add("world");
		
		//遍历集合、
		//迭代器
		Iterator it=array.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		
		//普通for
		for(int i=0;i<array.size();i++){
			String s=(String)array.get(i);
			System.out.println(s);
		}
		
		//增强for
		for(String s:array){
			System.out.println(s);
		}
	}
	
	
	
	/**
	 * 静态导入：
	 * 	格式：import static 包名...类名.方法名;
	 *  可以直接导入到方法的级别。
	 *  
	 *  静态导入的注意事项:
	 *  	A:方法鄙视是静态的。
	 *  	B：如果有多个同名大热静态方法，容易不知道使用谁？
	 *  			这个时候要使用，必须加前缀，由此可见，意义不大，所以一般不用，但是要能看懂。
	 * 
	 */
	public static void test3(){
		// System.out.println(java.lang.Math.abs(-100));
		// System.out.println(java.lang.Math.pow(2, 3));
		// System.out.println(java.lang.Math.max(20, 30));
		// 太复杂，我们就引入到import
		
		// System.out.println(Math.abs(-100));
		// System.out.println(Math.pow(2, 3));
		// System.out.println(Math.max(20, 30));
		// 太复杂，有更简单
		
		System.out.println(pow(2,3));
		System.out.println(max(20, 30));
		//System.out.println(abs(-100));//这行代码有错，因为没有静态导入import static java.lang.Math.abs;
		
	}
	
	
	
	/**
	 * 可变参数:用于解决定义方法的时候不知道应该定义多少个参数。
	 * 	格式：
	 * 		修饰符 返回值类型 方法名(数据类型... 变量名){
	 * 		
	 * 		}
	 * 	注意：
	 * 		这里的变量其实是一个数组。	
	 * 	如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个。
	 */
	public static void test4(){
		// 2个数据求和
		int a = 10;
		int b = 20;
		int result = test4_sum(a, b);
		System.out.println("result:" + result);

		// 3个数据的求和
		int c = 30;
		result = test4_sum(a, b, c);
		System.out.println("result:" + result);

		// 4个数据的求和
		int d = 30;
		result = test4_sum(a, b, c, d);
		System.out.println("result:" + result);

		// 需求：我要写一个求和的功能，到底是几个数据求和呢，我不太清楚，但是我知道在调用的时候我肯定就知道了
		// 为了解决这个问题，Java就提供了一个东西：可变参数
		result = test4_sum(a, b, c, d, 40);
		System.out.println("result:" + result);

		result = test4_sum(a, b, c, d, 40, 50);
		System.out.println("result:" + result);
		
		
		
	}
	
	public static int test4_sum(int...  a){
		int s=0;
		
		for(int x:a){
			s+=x;
		}
		
		return s;
	}
	
	
	/**
	 * public static <T> List<T> asList(T... a);把数组转成List集合
	 * 
	 * 注意事项：	
	 * 		虽然可以把数组转成集合，但是集合的长度不能改变。
	 * 
	 */
	public static void test5(){
		//定义一个数组
		String[] strArray={"hello","world","hava"};
		List<String> list=Arrays.asList(strArray);
		//使用增强遍历
		for(String str:list){
			System.out.println(str);
		}
		/**
		 * 遍历结果：
		 * 	hello
		 *  world
		 *  hava
		 */
		
		List<String> list1=Arrays.asList("hello","world","java");
		//注意：虽然可以把数组转成集合，但是集合的长度不能改变。
		// UnsupportedOperationException
	    // list.add("javaee");
		// UnsupportedOperationException
		// list.remove(1);
		
		list1.set(0, "javaee");
		
		
		for(String s:list1){
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * javaee
			world
			java
		 */
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
