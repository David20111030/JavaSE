package c_java_IO.s_Properties���Լ�����_���Ժ�IO�����ʹ��;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class PropertiesDemo {
	
	/**
	 * Properties:���Լ����ࡣ��һ�����Ժ�IO�����ʹ�õļ����ࡣ
	 * Properties�ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ�����
	 * Properties��Hashtable�����࣬˵����һ��Map���ϡ�
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		//��ΪMap���ϵ�ʹ��
		//���������÷��Ǵ���ģ�һ��Ҫ��API�����û��<>,��˵�����಻��һ�������࣬��ʹ�õ�ʱ��Ͳ��ܼӷ��͡�
		//Properties<String, String> prop = new Properties<String, String>();
		
		//�����������������
		Properties prop = new Properties();
		
		// ���Ԫ��
		prop.put("it002", "hello");
		prop.put("it001", "world");
		prop.put("it003", "java");
		
		
		//��������
		Set<Object> set = prop.keySet();//��ȡ���еļ�
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
	 * ���⹦�ܣ�
	 * public Object setProperty(String key,String value)�����Ԫ��
	 * public String getProperty(String key):��ȡԪ��
	 * public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
	 */
	@Test
	public void test2() throws Exception {
		// �������϶���
		Properties prop = new Properties();

		// ���Ԫ��
		prop.setProperty("����", "30");
		prop.setProperty("����", "40");
		prop.setProperty("����", "50");

		// public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key + "---" + value);
		}
		
		/**
		 * ����---50
			����---30
			����---40
		 */
	}
	
	
	
	
	
	
	
}
