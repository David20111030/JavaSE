package b_Map.Map_Son.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * HashMap
 * @author 贤元
 *
 */
public class HashMapDemo {
	
	/**
	 * HashMap:是基于哈希表的Map接口实现
	 * 哈希表的作用是用来保证键的唯一性的
	 * 
	 * HashMap<String,String>
	 * 键：String
	 * 值：String
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		HashMap<String,String> hm=new HashMap<String,String>();
		
		//添加元素
		hm.put("it001", "马云");
		hm.put("it002", "马化腾");
		hm.put("it003", "裘伯君");
		
		//遍历
		//第一种方式遍历
		Set<String> set=hm.keySet();//获取所有的键
		for(String key:set){
			String value=hm.get(key);//根据键获取值
			System.out.println(key+"---"+value);
		}
		/**
		 * 遍历结果：
		 * it003---裘伯君
			it002---马化腾
			it001---马云
		 */
	
		//第二种遍历方式 通过键值对对象遍历
		Set<Map.Entry<String,String>> set2=hm.entrySet();
		for(Map.Entry<String, String> s:set2){
			String key=s.getKey();//获取键
			String value=s.getValue();//获取值
			System.out.println(key+"---"+value);
		}
		/**
		 * 遍历结果：
		 * 	it003---裘伯君
			it002---马化腾
			it001---马云
		 */
		
	}
	
	/**
	 * HashMap<Integer,String>
	 * 键：Integer
	 * 值：String
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		//创建集合对象
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//创建元素并添加
		hm.put(001, "林青霞");
		hm.put(002, "风清扬");
		hm.put(03, "李贤元");
		
		//遍历 通过键值对对象遍历
		Set<Map.Entry<Integer, String>> set=hm.entrySet();
		for(Map.Entry<Integer, String> kv:set){
			int key=kv.getKey();//获取键
			String value=kv.getValue();//获取值
			System.out.println(key+"---"+value);
		}
		/**
		 * 遍历结果：
		 * 1---林青霞
		   2---风清扬
		   3---李贤元
		 */	
	}
	
	
	/**
	 * HashMap<String,Student>
	 * 键：String 学号
	 * 值：Student 学生对象
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		//创建集合对象
		HashMap<String,Student> hm=new HashMap<String,Student>();
		
		// 创建学生对象
		Student s1 = new Student("周星驰", 58);
		Student s2 = new Student("刘德华", 55);
		Student s3 = new Student("梁朝伟", 54);
		Student s4 = new Student("刘嘉玲", 50);

		// 添加元素
		hm.put("9527", s1);
		hm.put("9522", s2);
		hm.put("9524", s3);
		hm.put("9529", s4);
		
		//遍历集合 使用键值对对象遍历
		Set<Map.Entry<String, Student>> set=hm.entrySet();
		for(Map.Entry<String, Student> kv:set){
			String key=kv.getKey();//获取键
			Student value=kv.getValue();//获取值
			System.out.println(key+"---"+value.getName()+":"+value.getAge());
		}
		/**
		 * 打印结果：
		 * 9524---梁朝伟:54
			9522---刘德华:55
			9527---周星驰:58
			9529---刘嘉玲:50
		 */
		
		
		//第二种遍历方式　根据键获取值
		//首先获取所有的键
		Set<String> set2=hm.keySet();
		for(String key:set2){
			Student value=hm.get(key);//根据键获取值
			System.out.println(key+"---"+value.getName()+":"+value.getAge());
		}
		/**
		 * 打印结果：
		 * 9524---梁朝伟:54
			9522---刘德华:55
			9527---周星驰:58
			9529---刘嘉玲:50
		 */
	}
	
	
	/**
	 * HashMap<Student,String>
	 * 键：Student
	 * 		要求：如果两个对象的成员变量值都相同，则为同一个对象
	 * 值：String
	 * 
	 * Map集合特点：键唯一，值可以不唯一。也就是键不能重复，值可以重复。
	 * @throws Exception
	 */
	@Test
	public void test4() throws Exception {
		//创建集合对象
		HashMap<Student,String> hm=new HashMap<Student,String>();
		
		// 创建学生对象
		Student s1 = new Student("貂蝉", 27);
		Student s2 = new Student("王昭君", 30);
		Student s3 = new Student("西施", 33);
		Student s4 = new Student("杨玉环", 35);
		Student s5 = new Student("貂蝉", 27);

		// 添加元素
		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "5555");
		hm.put(s4, "7777");
		hm.put(s5, "9999");
		
		//遍历  通过键值对对象的方式遍历
		Set<Map.Entry<Student, String>> set=hm.entrySet();
		for(Map.Entry<Student, String> kv:set){
			Student key=kv.getKey();//获取键
			String value=kv.getValue();//获取值
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		/**
		 * 遍历结果：
		 * 貂蝉:27---9999
			西施:33---5555
			杨玉环:35---7777
			王昭君:30---6666
		 */
		
		//第二种遍历方式  通过键获取值
		//首先得获取所有的键
		Set<Student> set2=hm.keySet();
		for(Student key:set2){
			String value=hm.get(key);//根据键获取值
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		/**
		 * 遍历结果：
		 * 貂蝉:27---9999
			西施:33---5555
			杨玉环:35---7777
			王昭君:30---6666
		 */
		
	}
	
	/**
	 * 集合嵌套之后的遍历
	 * 
	 * 为了更符合要求：
	 * 		这次的数据就看成是学生对象。
	 * 
	 * 传智播客
	 * 		sh	上海校区
	 * 			jc	基础班
	 * 					郭美美		20
	 * 					犀利哥		22
	 * 			jy	就业班	
	 * 					罗玉凤		21
	 * 					马征		23
	 * 		gz	广州校区
	 * 			jc	基础班
	 * 					王力宏		30
	 * 					李静磊		32
	 * 			jy	就业班	
	 * 					郎朗		31
	 * 					柳岩		33
	 * 		xa	西安校区
	 * 			jc	基础班
	 * 					范冰冰		27
	 * 					刘意		30
	 * 			jy	就业班	
	 * 					李冰冰		28
	 * 					张志豪		29
	 * 		bj	北京校区
	 * 			jc	基础班
	 * 					林青霞		27
	 * 					风清扬		30
	 * 			jy	就业班	
	 * 					赵雅芝		28
	 * 					武鑫		29
	 */
	@Test
	public void test5() throws Exception {
		//创建传智播客大集合
		HashMap<String,HashMap<String,ArrayList<Student2>>> czbkMap=new HashMap<String,HashMap<String,ArrayList<Student2>>>(); 
		
		//北京校区数据
		HashMap<String,ArrayList<Student2>> bjMap=new HashMap<String,ArrayList<Student2>>();
		//北京校区学生
		ArrayList<Student2> bjArray=new ArrayList<Student2>();
		//添加北京校区学生
		Student2 s1 = new Student2("林青霞", 27);
		Student2 s2 = new Student2("风清扬", 30);
		bjArray.add(s1);
		bjArray.add(s2);
		
		bjMap.put("基础班", bjArray);
		//将北京校区的的数据添加到传智播客大集合中
		czbkMap.put("北京校区", bjMap);
		
		//遍历传智播客大集合中的数据
		//第一种遍历方式，根据键获取值
		Set<String> set=czbkMap.keySet();//获取所有的键
		for(String key:set){
			HashMap<String,ArrayList<Student2>> hmValue=czbkMap.get(key);//根据键获取值
			//遍历HashMap
			//根据键获取值
			//获取所有的键
			Set<String> hmSet=hmValue.keySet();//获取所有的键
			for(String hmKey:hmSet){
				ArrayList<Student2> valueList=hmValue.get(hmKey);//根据键获取值
				//遍历ArrayList<Student2>集合
				Iterator<Student2> it=valueList.iterator();
				while(it.hasNext()){
					Student2 stu=it.next();
					System.out.println(key+"--"+hmKey+"--"+stu.getName()+":"+stu.getAge());
				}
			}
		}
		/**
		 * 遍历结果：
		 * 北京校区--基础班--林青霞:27
			北京校区--基础班--风清扬:30
		 */
		
		System.out.println("第二种遍历方式");
		
		//第二种遍历方式  通过键值对对象遍历
		//首先得获取所有的键值对对象
		Set<Map.Entry<String, HashMap<String,ArrayList<Student2>>>> set2=czbkMap.entrySet();
		for(Map.Entry<String, HashMap<String,ArrayList<Student2>>> hmKv:set2){
			//获取键 校区
			String hmKey=hmKv.getKey();
			//获取值  HashMap集合
			HashMap<String,ArrayList<Student2>> hmValue=hmKv.getValue();
			//遍历HashMap集合
			Set<Map.Entry<String, ArrayList<Student2>>> hmSet=hmValue.entrySet();
			for(Map.Entry<String, ArrayList<Student2>> hm:hmSet){
				//获取键  基础班
				String key=hm.getKey();//获取键
				//获取值 ArrayList<Student2>
				ArrayList<Student2> value=hm.getValue();
				//遍历ArrayList集合
				for(Student2 stu:value){
					String name=stu.getName();
					int age=stu.getAge();
					//打印全部结果
					System.out.println(hmKey+"--"+key+"--"+name+":"+age);
				}
			}
		}
		/**
		 * 遍历结果：
		 * 北京校区--基础班--林青霞:27
			北京校区--基础班--风清扬:30
		 */

		
	}
	
	
}
