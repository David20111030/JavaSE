package b_Map.Map_Son.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap:是基于红黑树的Map接口的实现
 * 
 * HashMap<String,String>
 * 键：String 
 * 值：String
 * 
 * @author 贤元
 *
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		test1();
		
		System.out.println("---test2()---");
		test2();
	}

	/**
	 * 遍历TreeMap集合
	 */
	private static void test1() {
		//创建集合对象
		TreeMap<String,String>tm=new TreeMap<String,String>();
		
		// 创建元素并添加元素
		tm.put("hello", "你好");
		tm.put("world", "世界");
		tm.put("java", "爪哇");
		tm.put("world", "世界2");
		tm.put("javaee", "爪哇EE");

		//遍历集合 根据键获取值
		//获取所有的键
		Set<String> set=tm.keySet();
		for(String key:set){
			String value=tm.get(key);//根据键获取值
			System.out.println(key+"---"+value);
		}
		/**
		 * hello---你好
			java---爪哇
			javaee---爪哇EE
			world---世界2
		 */
		
		//第二种遍历方式，根据键值对对象遍历
		Set<Map.Entry<String,String>> set2=tm.entrySet();
		for(Map.Entry<String, String> kv:set2){
			String key=kv.getKey();//获取键
			String value=kv.getValue();//获取值
			System.out.println(key+"---"+value);
		}
		/**
		 * hello---你好
			java---爪哇
			javaee---爪哇EE
			world---世界2
		 */
	}


	
	/**
	 * 遍历TreeMap集合
	 */
	public static void test2(){
		//创建集合对象
		TreeMap<Student,String> tm=new TreeMap<Student,String>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				//主要条件，年龄
				int num=s1.getAge()-s2.getAge();
				//年龄相同，姓名不一定相同
				int num2= num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
		});
		
		
		// 创建学生对象
		Student s1 = new Student("潘安", 30);
		Student s2 = new Student("柳下惠", 35);
		Student s3 = new Student("唐伯虎", 33);
		Student s4 = new Student("燕青", 32);
		Student s5 = new Student("唐伯虎", 33);

		// 存储元素
		tm.put(s1, "宋朝");
		tm.put(s2, "元朝");
		tm.put(s3, "明朝");
		tm.put(s4, "清朝");
		tm.put(s5, "汉朝");

		
		//遍历  根据键值对对象遍历
		Set<Map.Entry<Student, String>> set=tm.entrySet();
		for(Map.Entry<Student, String> kv:set){
			Student key=kv.getKey();//获取键
			String value=kv.getValue();//获取值
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		/**
		 * 遍历结果：
		 	潘安:30---宋朝
			燕青:32---清朝
			唐伯虎:33---汉朝
			柳下惠:35---元朝
		 */
		
		//第二种遍历方式，根据键获取值
		Set<Student> set2=tm.keySet();//获取所有的键
		for(Student key:set2){
			String value=tm.get(key);//根据键获取值
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		/**
		 * 遍历结果：
		 	潘安:30---宋朝
			燕青:32---清朝
			唐伯虎:33---汉朝
			柳下惠:35---元朝
		 */
			
	}
	
}
