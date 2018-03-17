package a_Collection.gz.Set.Set_Son;

import java.util.HashSet;
import java.util.Set;

/**
 * Collection:
 * 		|--List:
 * 			有序(存储顺序和取出顺序一致)，可重复
 * 		|--Set: 
 * 			无序(存储顺序和取出顺序不一致),唯一
 * 
 * 			
 * 			
 * 		  HashSet:她不保证Set的迭代顺序，特别是她不保证该顺序恒久不变：
 * 
 * 		注意：虽然Set集合的元素无序，但是，作为集合来说，他肯定有她自己的存储顺序。
 * 			而你的顺序巧合和她的存储顺序一致，这代表不了有序，你可以多存储一些数据，就能看到效果。
 * 
 * 
 * @author 贤元
 *
 */
public class SetDemo {
	public static void main(String[] args) {
		//创建集合对象
		Set<String> set=new HashSet<String>();
		
		//创建并添加元素
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");
		
		
		//用增强for遍历
		for(String s:set){
			System.out.println(s);
		}
		/**
		 * 遍历结果：
		 * 	hello
		 * 	java
		 *  world
		 */
		
	}
}
