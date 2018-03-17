package b_Map.Map_Son;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * java�ṩ��һ���µļ���:Map��ֵ�Լ��ϡ�
 * ͨ���鿴API������֪��Map���ϵ�һ�������ص㣬���������Դ洢��ֵ�Ե�Ԫ��
 * 
 * Map���ϵ��ص㣺
 * 		����ӳ�䵽ֵ�ö���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ��
 * 
 * Map���Ϻ�Collection���ϵ�����
 * 		Map���ϴ洢Ԫ���ǳɶԳ��ֵģ�Map���ϵļ���Ψһ�ģ�ֵ�ǿ����ظ��ġ����԰�������Ϊ:���޶�
 * 
 * 		Collection���ϴ洢Ԫ���ǵ������ֵģ�Collection�Ķ���Set��Ψһ�ģ�List�����򡢿��ظ��ġ����԰�������Ϊ:���(11.11)
 * 
 * 	ע�⣺
 * 		Map���ϵ����ݽṹ��Լ���Ч����ֵ�޹ء�
 * 		Collection���ϵ����ݽṹ�����Ԫ����Ч��
 * 
 * Map���ϵĹ��ܸ�����
 * 	1����ӹ���
 * 		V put(K key,V value);���Ԫ�ء�
 * 				������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null��
 * 				��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ��
 * 	2��ɾ������
 * 		void clear();�Ƴ����еļ�ֵ��Ԫ��
 * 		V remove(Object key); ���ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
 * 	3���жϹ���
 * 		boolean containsKey(Object key);�жϼ����Ƿ����ָ���ļ�
 * 		boolean containsValue(Object value);�жϼ����Ƿ����ָ����ֵ
 * 		boolean isEmpty();�жϼ����Ƿ�Ϊ��
 * 	4����ȡ����
 * 		Set<Map.Entry<K,V>> entrySet();//��ȡ���м�ֵ�Զ���
 * 		V get(Object key);���ݼ���ȡֵ
 * 		Set<K> keySet();��ȡ���������м��ļ���
 * 		Collection<V> values();��ȡ����������ֵ�ļ���
 * 	5�����ȹ���
 * 		int size();���ؼ����еļ�ֵ�ԵĶ���
 * 
 * 
 * 
 * 
 * 
 * @author ��Ԫ
 *
 */
public class MapDemo {
	
	@Test
	public void test1() throws Exception {
		//�������϶���
		Map<String,String> map=new HashMap<String,String>();
		
		//���Ԫ��
		//V put(K key,V value);������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null����������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ��
		String zs=map.put("����", "zhangsan");
		String ls=map.put("����", "lisi");
		String ZS=map.put("����", "ZhangSan");
		
		System.out.println(zs+"\t"+ls+"\t"+"ZS");//��������null	null	ZS
		//��ӡ����
		System.out.println("map:"+map);//��ӡ����� map:{����=ZhangSan, ����=lisi}
		
		//V remove(Object key);���ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
		String r1=map.remove("����");
		System.out.println(r1);//��������ZhangSan
		
		//void clear();�Ƴ����еļ�ֵ��Ԫ��
		//map.clear();
		
		
		//boolean containsKey(Object key);�жϼ����Ƿ����ָ���ļ�
		boolean ct=map.containsKey("����");
		System.out.println(ct);//true
		
		//boolean containsValue(Object value);�жϼ����Ƿ����ָ����ֵ
		boolean ct2=map.containsValue("lisi");
		System.out.println(ct2);//true
		
		//boolean isEmpty();�жϼ����Ƿ�Ϊ��
		boolean isempty=map.isEmpty();
		System.out.println(isempty);//false
		
		//int size();���ؼ����еļ�ֵ�ԵĶ���
		int duiShu=map.size();
		System.out.println(duiShu);//��ӡ�����1   ��Ϊǰ��ɾ����һ����ֵ��Ԫ�أ�����ֻʣ��һ����
		
		//Set<K> keySet();��ȡ���������м��ļ���   K:�����������
		Set<String> set=map.keySet();
		for(String key:set){
			System.out.println(key);
		}
		//��ӡ���������
		
		//Collection<V> values();��ȡ����������ֵ�ļ���  V:����ֵ������
		Collection<String> con=map.values();
		for(String value:con){
			System.out.println(value);
		}
		//��ӡ�����lisi
		
		System.out.println("=========");
		Set<Map.Entry<String, String>> kvSet = map.entrySet();//��ȡ���м�ֵ�Զ���
		for(Map.Entry<String, String> kv:kvSet){
			//��ȡ��
			String key = kv.getKey();
			//��ȡֵ
			String value = kv.getValue();
			System.out.println(key+":"+value);
		}
	}
	
	/**
	 * Map���ϵı���
	 * Map---���޶�
	 * ˼·��
	 * 	A�������е��ɷ����������
	 *  B�������ɷ�ļ��ϣ���ȡ�õ�ÿһ���ɷ�
	 *  C�����ɷ�ȥ���Լ�������
	 * 
	 * ת����
	 * 	A����ȡ���еļ�
	 *  B���������ļ��ϣ���ȡ�õ�ÿһ����
	 *  C:���ݼ�ȥ��ֵ
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		//�������϶���
		Map<String,String> map=new HashMap<String,String>();
		
		//���Ԫ��
		map.put("������", "zhangsan");
		map.put("����", "lisi");
		map.put("����", "wangwu");
		
		//����Map����
		//��ȡ���еļ�
		Set<String> set=map.keySet();
		//���ݼ���ȡֵ
		for(String key:set){
			String value=map.get(key);//���ݼ���ȡֵ
			System.out.println(key+"----"+value);
		}
		/**
		 * ���������
		 *������----zhangsan
		����----lisi
		����----wangwu

		 */
		
	}
	
	
	/**
	 * Map���ϵı���
	 * ˼·��
	 * 	A����ȡ���м�ֵ�Զ���ļ���
	 *  B��������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
	 *  C�����ݼ�ֵ�Զ����ȡ����ֵ
	 *  
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		//�������϶���
		Map<String,String> map=new HashMap<String,String>();
		
		//���Ԫ��
		map.put("������", "zhangsan");
		map.put("����", "lisi");
		map.put("����", "wangwu");

		//��������
		//���ȵû�ȡ���еļ�
		Set<String> set=map.keySet();
		//���ݼ���ȡֵ
		for(String key:set){
			String value=map.get(key);
			System.out.println(key+"---"+value);
		}
		/**
		 * ���������
		 * 	������---zhangsan
			����---lisi
			����---wangwu
		 */
		
		//�ڶ��ֱ�����ʽ  ͨ����ֵ�Զ���������Map����   ����һ����ֵ�ԶӶ����Set����
		Set<Map.Entry<String, String>> set2=map.entrySet();//���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ��
		//������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
		for(Map.Entry<String, String> me:set2){
			//���ݼ�ֵ�Զ����ȡ����ֵ
			String key=me.getKey();
			String value=me.getValue();
			System.out.println(key+"---"+value);
		}
		/**
		 * ���������
		 * ������---zhangsan
			����---lisi
			����---wangwu
		 */
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
