package b_Map.Map_Son.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * LinkedHashMap:是Map结构的哈希表和链表实现，具有可预知的迭代性。
 * 			由哈希表保证键的唯一性。由链表保证键的有序(存储区取出的顺序一致)
 * 
 * 
 * 
 * @author 贤元
 *
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		//创建集合对象
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		
		// 创建并添加元素
		hm.put("2345", "hello");
		hm.put("1234", "world");
		hm.put("3456", "java");
		hm.put("1234", "javaee");
		hm.put("3456", "android");

		
		//遍历 通过键值对对象的方式遍历
		Set<Map.Entry<String, String>> set=hm.entrySet();
		for(Map.Entry<String, String> kv:set){
			String key=kv.getKey();//获取键
			String value=kv.getValue();
			System.out.println(key+"--"+value);
		}
		/**
		 * 遍历结果：
		 * 2345--hello
			1234--javaee
			3456--android
		 */
		
		//第二种遍历方式  根据键获取值
		Set<String> set2=hm.keySet();//获取所有的键
		for(String key:set2){
			String value=hm.get(key);//根据键获取值
			System.out.println(key+"--"+value);
		}
		/**
		 * 遍历结果：
		 * 2345--hello
			1234--javaee
			3456--android
		 */
		
		
	}
}
