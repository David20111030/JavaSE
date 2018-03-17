package c_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections:是针对集合进行操作的工具类，都是静态方法。
 * 
 * 面试题：
 * Collection和Collections的区别？
 * Collection:是单列集合的顶层接口，有子接口List 和 Set。
 * Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法
 * 
 * 要知道的方法：
 * 	public static <T> void sort(List<T> list);默认情况下是自然排序 对指定列表按升序进行排序。
 * 
 *  
 * public static <T> int binarySearch(List<?> list,T key):二分查找   使用二分搜索法搜索指定列表，以获得指定对象。
 * 	              注意：使用二分查找的前提是要该集合按从小到到的顺序已经排序好了的才能使用该 二分查找的方法

 * public static <T> T max(Collection<?> coll):最大值   根据指定比较器产生的顺序，返回给定 collection 的最大元素。
 * public static void reverse(List<?> list):反转      反转指定列表中元素的顺序。
 * public static void shuffle(List<?> list):随机置换     使用默认随机源对指定列表进行置换。
 * 
 * 
 * @author 贤元
 *
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		test1();
		System.out.println("---test2()---");
		test2();
	}

	public static void test1() {
		//创建集合对象
		List<Integer> list=new ArrayList<Integer>();
		
		//添加元素
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("list:"+list);//list:[30, 20, 50, 10, 40]
		
		// public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
		 Collections.sort(list);
		 System.out.println("list:" + list);// [10, 20, 30, 40, 50]
		 
		 
		// public static <T> int binarySearch(List<?> list,T key):二分查找   使用二分搜索法搜索指定列表，以获得指定对象。
		//注意：使用二分查找的前提是要该集合按从小到到的顺序已经排序好了的才能使用该 二分查找的方法
		int count=Collections.binarySearch(list, 10);
		int getResult=list.get(count);
		System.out.println(count);//0
		System.out.println(getResult);//10
		
		// public static <T> T max(Collection<?> coll):最大值
		System.out.println("max:"+Collections.max(list));//max:50

		// public static void reverse(List<?> list):反转
		Collections.reverse(list);
	    System.out.println("list:" + list);//list:[50, 40, 30, 20, 10]
		
		//public static void shuffle(List<?> list):随机置换
		Collections.shuffle(list);
		System.out.println("list:" + list);//这个结果是随机的
		
		
		
	}
	
	
	/**
	 * Collections可以针对ArrayList存储基本包装类的元素排序，存储自定义对象可不可以排序呢？
	 */
	private static void test2() {
		//创建集合对象
		List<Student> list=new ArrayList<Student>();
		

		// 创建学生对象
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("风清扬", 30);
		Student s3 = new Student("刘晓曲", 28);
		Student s4 = new Student("武鑫", 29);
		Student s5 = new Student("林青霞", 27);

		// 添加元素对象
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		// 排序
		// 自然排序  实现自然排序，必须要实现Comparable<T>接口  T：代表你要实现自然排序的类
		Collections.sort(list);
		for(Student stu:list){
			System.out.println(stu.getName()+":"+stu.getAge());
		}
		/**
	          林青霞:27
		林青霞:27
		刘晓曲:28
		武鑫:29
		风清扬:30
		*/
		
		//比较器排序 必须实现Comparator接口
		//如果同时有自然排序和比较器排序，以比较器排序为主
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				//按年龄从大到小排序
				int num=s2.getAge()-s1.getAge();
				int num2= num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
		});
		//遍历
		for(Student s:list){
			System.out.println(s.getName()+"--"+s.getAge());
		}
		/**
		风清扬--30
		武鑫--29
		刘晓曲--28
		林青霞--27
		 林青霞--27
		*/
		
		
	}
	
	

	
	
}
