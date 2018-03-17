package c_java_IO.s_Properties属性集合类_可以和IO流结合使用;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class PropertiesDemo {
	
	/**
	 * Properties:属性集合类。是一个可以和IO流结合使用的集合类。
	 * Properties可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
	 * Properties是Hashtable的子类，说明是一个Map集合。
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//作为Map集合的使用
		//下面这种用法是错误的，一定要看API，如果没有<>,就说明该类不是一个泛型类，在使用的时候就不能加泛型。
		//Properties<String, String> prop = new Properties<String, String>();
		
		//创建集合属性类对象
		Properties prop = new Properties();
		
		// 添加元素
		prop.put("it002", "hello");
		prop.put("it001", "world");
		prop.put("it003", "java");
		
		
		//遍历集合
		Set<Object> set = prop.keySet();//获取所有的键
		for(Object key: set){
			Object value = prop.get(key);
			System.out.println(key+"--"+value);
		}
		/**
		 * it003--java
			it002--hello
			it001--world
		 */
		
	}
	
	
	/**
	 * 特殊功能：
	 * public Object setProperty(String key,String value)：添加元素
	 * public String getProperty(String key):获取元素
	 * public Set<String> stringPropertyNames():获取所有的键的集合
	 */
	@Test
	public void test2() throws Exception {
		// 创建集合对象
		Properties prop = new Properties();

		// 添加元素
		prop.setProperty("张三", "30");
		prop.setProperty("李四", "40");
		prop.setProperty("王五", "50");

		// public Set<String> stringPropertyNames():获取所有的键的集合
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key + "---" + value);
		}
		
		/**
		 * 王五---50
			张三---30
			李四---40
		 */
	}
	
	
	
	
	
	
	
}
