package b_Map.Map_Son;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * java提供了一种新的集合:Map键值对集合。
 * 通过查看API，我们知道Map集合的一个最大的特点，就是它可以存储键值对的元素
 * 
 * Map集合的特点：
 * 		将键映射到值得对象。一个映射不能包含重复的键，每个键最多只能映射到一个值。
 * 
 * Map集合和Collection集合的区别？
 * 		Map集合存储元素是成对出现的，Map集合的键是唯一的，值是可以重复的。可以把这个理解为:夫妻对
 * 
 * 		Collection集合存储元素是单独出现的，Collection的儿子Set是唯一的，List是有序、可重复的。可以把这个理解为:光棍(11.11)
 * 
 * 	注意：
 * 		Map集合的数据结构针对键有效，跟值无关。
 * 		Collection集合的数据结构是针对元素有效。
 * 
 * Map集合的功能概述：
 * 	1、添加功能
 * 		V put(K key,V value);添加元素。
 * 				如果键是第一次存储，就直接存储元素，返回null。
 * 				如果键不是第一次存在，就用值吧以前的值替换掉，返回以前的值。
 * 	2、删除功能
 * 		void clear();移除所有的键值对元素
 * 		V remove(Object key); 根据键删除键值对元素，并把值返回
 * 	3、判断功能
 * 		boolean containsKey(Object key);判断集合是否包含指定的键
 * 		boolean containsValue(Object value);判断集合是否包含指定的值
 * 		boolean isEmpty();判断集合是否为空
 * 	4、获取功能
 * 		Set<Map.Entry<K,V>> entrySet();//获取所有键值对对象
 * 		V get(Object key);根据键获取值
 * 		Set<K> keySet();获取集合中所有键的集合
 * 		Collection<V> values();获取集合中所有值的集合
 * 	5、长度功能
 * 		int size();返回集合中的键值对的对数
 * 
 * 
 * 
 * 
 * 
 * @author 贤元
 *
 */
public class MapDemo {
	
	@Test
	public void test1() throws Exception {
		//创建集合对象
		Map<String,String> map=new HashMap<String,String>();
		
		//添加元素
		//V put(K key,V value);如果键是第一次存储，就直接存储元素，返回null。如果键不是第一次存在，就用值吧以前的值替换掉，返回以前的值。
		String zs=map.put("张三", "zhangsan");
		String ls=map.put("李四", "lisi");
		String ZS=map.put("张三", "ZhangSan");
		
		System.out.println(zs+"\t"+ls+"\t"+"ZS");//输出结果：null	null	ZS
		//打印集合
		System.out.println("map:"+map);//打印结果： map:{张三=ZhangSan, 李四=lisi}
		
		//V remove(Object key);根据键删除键值对元素，并把值返回
		String r1=map.remove("张三");
		System.out.println(r1);//输出结果：ZhangSan
		
		//void clear();移除所有的键值对元素
		//map.clear();
		
		
		//boolean containsKey(Object key);判断集合是否包含指定的键
		boolean ct=map.containsKey("李四");
		System.out.println(ct);//true
		
		//boolean containsValue(Object value);判断集合是否包含指定的值
		boolean ct2=map.containsValue("lisi");
		System.out.println(ct2);//true
		
		//boolean isEmpty();判断集合是否为空
		boolean isempty=map.isEmpty();
		System.out.println(isempty);//false
		
		//int size();返回集合中的键值对的对数
		int duiShu=map.size();
		System.out.println(duiShu);//打印结果：1   因为前面删除了一个键值对元素，所以只剩下一个了
		
		//Set<K> keySet();获取集合中所有键的集合   K:代表键的类型
		Set<String> set=map.keySet();
		for(String key:set){
			System.out.println(key);
		}
		//打印结果：李四
		
		//Collection<V> values();获取集合中所有值的集合  V:代表值的类型
		Collection<String> con=map.values();
		for(String value:con){
			System.out.println(value);
		}
		//打印结果：lisi
		
		System.out.println("=========");
		Set<Map.Entry<String, String>> kvSet = map.entrySet();//获取所有键值对对象
		for(Map.Entry<String, String> kv:kvSet){
			//获取键
			String key = kv.getKey();
			//获取值
			String value = kv.getValue();
			System.out.println(key+":"+value);
		}
	}
	
	/**
	 * Map集合的遍历
	 * Map---夫妻对
	 * 思路：
	 * 	A：把所有的丈夫给集中起来
	 *  B：遍历丈夫的集合，获取得到每一个丈夫
	 *  C：让丈夫去找自己的妻子
	 * 
	 * 转换：
	 * 	A：获取所有的键
	 *  B：遍历键的集合，获取得到每一个键
	 *  C:根据键去找值
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		//创建集合对象
		Map<String,String> map=new HashMap<String,String>();
		
		//添加元素
		map.put("张三·", "zhangsan");
		map.put("李四", "lisi");
		map.put("王五", "wangwu");
		
		//遍历Map集合
		//获取所有的键
		Set<String> set=map.keySet();
		//根据键获取值
		for(String key:set){
			String value=map.get(key);//根据键获取值
			System.out.println(key+"----"+value);
		}
		/**
		 * 遍历结果：
		 *张三·----zhangsan
		李四----lisi
		王五----wangwu

		 */
		
	}
	
	
	/**
	 * Map集合的遍历
	 * 思路：
	 * 	A：获取所有键值对对象的集合
	 *  B：遍历键值对对象的集合，得到每一个键值对对象
	 *  C：根据键值对对象获取键和值
	 *  
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		//创建集合对象
		Map<String,String> map=new HashMap<String,String>();
		
		//添加元素
		map.put("张三·", "zhangsan");
		map.put("李四", "lisi");
		map.put("王五", "wangwu");

		//遍历集合
		//首先得获取所有的键
		Set<String> set=map.keySet();
		//根据键获取值
		for(String key:set){
			String value=map.get(key);
			System.out.println(key+"---"+value);
		}
		/**
		 * 遍历结果：
		 * 	张三·---zhangsan
			李四---lisi
			王五---wangwu
		 */
		
		//第二种遍历方式  通过键值对对象来遍历Map集合   返回一个键值对队对象的Set集合
		Set<Map.Entry<String, String>> set2=map.entrySet();//返回此映射中包含的映射关系的 Set 视图。
		//遍历键值对对象的集合，得到每一个键值对对象
		for(Map.Entry<String, String> me:set2){
			//根据键值对对象获取键和值
			String key=me.getKey();
			String value=me.getValue();
			System.out.println(key+"---"+value);
		}
		/**
		 * 遍历结果：
		 * 张三·---zhangsan
			李四---lisi
			王五---wangwu
		 */
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
