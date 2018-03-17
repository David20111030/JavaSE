package b_Map.Map_Son.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * LinkedHashMap:��Map�ṹ�Ĺ�ϣ�������ʵ�֣����п�Ԥ֪�ĵ����ԡ�
 * 			�ɹ�ϣ��֤����Ψһ�ԡ�������֤��������(�洢��ȡ����˳��һ��)
 * 
 * 
 * 
 * @author ��Ԫ
 *
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		//�������϶���
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		
		// ���������Ԫ��
		hm.put("2345", "hello");
		hm.put("1234", "world");
		hm.put("3456", "java");
		hm.put("1234", "javaee");
		hm.put("3456", "android");

		
		//���� ͨ����ֵ�Զ���ķ�ʽ����
		Set<Map.Entry<String, String>> set=hm.entrySet();
		for(Map.Entry<String, String> kv:set){
			String key=kv.getKey();//��ȡ��
			String value=kv.getValue();
			System.out.println(key+"--"+value);
		}
		/**
		 * ���������
		 * 2345--hello
			1234--javaee
			3456--android
		 */
		
		//�ڶ��ֱ�����ʽ  ���ݼ���ȡֵ
		Set<String> set2=hm.keySet();//��ȡ���еļ�
		for(String key:set2){
			String value=hm.get(key);//���ݼ���ȡֵ
			System.out.println(key+"--"+value);
		}
		/**
		 * ���������
		 * 2345--hello
			1234--javaee
			3456--android
		 */
		
		
	}
}
