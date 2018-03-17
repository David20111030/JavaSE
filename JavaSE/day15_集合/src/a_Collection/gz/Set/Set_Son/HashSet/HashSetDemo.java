package a_Collection.gz.Set.Set_Son.HashSet;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		test1();
		
		System.out.println("---test2()---");
		
		test2();
		
		System.out.println("----test3()----");
		
		test3();
		
	}
	
	
	/**
	 * HashSet:存储字符串并遍历。
	 * 问题：为什么存储字符串的时候，字符串内容相同的只存储了一个呢？
	 * 	通过查看add方法的源码，我们知道这个方法底层依赖两个方法：
	 * 			依赖：HashCode()和equals()方法
	 * 	
	 * 	步骤：
	 * 		首先比较哈希值。
	 * 			如果相同，继续走，比较地址值或者走equals();
	 * 			如果不同，就直接添加到集合中。
	 *  按照方法的步骤来说：
	 *  	先看hashCode()值是否相同：	
	 *  			相同:继续走equals()方法
	 *  				返回true:说明元素重复，就不添加。
	 *  				返回false:说明元素不重复，就添加到集合中。
	 * 				不同:就直接把元素添加到集合中。
	 * 如果类没有重写这两个方法，默认使用的Object()中的hashCode()和equals()方法。一般来说不会相同。
	 * 
	 * 而String类重写了hashCode()和equals()方法,所以她就可以把内容相同的字符串去掉，只留下一个。
	 * 
	 */
	public static void test1(){
		//创建集合对象
		HashSet<String> hs=new HashSet<String>();
		
		//创建并添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		
		//使用增强for遍历集合
		for(String s:hs){
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * 	hello
		 * 	java
		 * 	world
		 */
		
	}
	
	
	
	/**
	 * 需求：存储自定义对象，并保证元素的唯一性。
	 * 要求：如果两个对象的成员变量值都相同，则为同一个元素。
	 * 
	 * 目前是不符合我们要求的:因为我们知道HashSet底层依赖hashCode()和equals()方法。
	 * 而这两个方法我们在学生类中没有重写，所以默认使用的是Object类的。
	 * 这个时候他们的哈希值是不会一样的，根本就不会继续判断，而执行了添加操作
	 *  	
	 *
	 * 
	 */
	public static void test2(){
		// 创建集合对象
		HashSet<Student> hs = new HashSet<Student>();

		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 22);
		Student s3 = new Student("王祖贤", 30);
		Student s4 = new Student("林青霞", 27);
		Student s5 = new Student("林青霞", 20);
		Student s6 = new Student("范冰冰", 22);

		// 添加元素
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);		
		
		// 遍历集合
		for (Student s : hs) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
		/**
		 * 遍历结果：
		 * 	王祖贤---30
			范冰冰---22
			林青霞---27
			林青霞---20
			风清扬---22
		 */
		
	}
	
	
	
	/**
	 * HashSet集合存储自定义对象并遍历。如果对象的成员变量值相同即为同一个对象
	 * 
	 * 注意了：	
	 * 		你是用的是HashSet集合，这个集合的底层是Hash表结构。
	 * 		而哈希表结构底层依赖:hashCode()和equals()方法
	 * 如果你认为对象的成员变量值形同即为同一个对象的话，你就应该重写这两个方法。
	 * 	如何重写这两个方法呢？不必担心，自动生成即可。
	 * 
	 */
	public static void test3(){
		//创建集合对象
		HashSet<Dog> hs=new HashSet<Dog>();
		
		// 创建狗对象
		Dog d1 = new Dog("秦桧", 25, "红色", '男');
		Dog d2 = new Dog("高俅", 22, "黑色", '女');
		Dog d3 = new Dog("秦桧", 25, "红色", '男');
		Dog d4 = new Dog("秦桧", 20, "红色", '女');
		Dog d5 = new Dog("魏忠贤", 28, "白色", '男');
		Dog d6 = new Dog("李莲英", 23, "黄色", '女');
		Dog d7 = new Dog("李莲英", 23, "黄色", '女');
		Dog d8 = new Dog("李莲英", 23, "黄色", '男');

		// 添加元素
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);
		hs.add(d8);

		//用增强for遍历遍历
		for(Dog d:hs){
			System.out.println(d.getName() + "---" + d.getAge() + "---"
					+ d.getColor() + "---" + d.getSex());
		}
		
		/**
		 * 遍历结果：
		 * 	魏忠贤---28---白色---男
			秦桧---20---红色---女
			高俅---22---黑色---女
			李莲英---23---黄色---女
			李莲英---23---黄色---男
			秦桧---25---红色---男
		 */
		
		
	}
	
}
