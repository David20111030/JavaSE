package c_java_IO.s_Properties���Լ�����_���Ժ�IO�����ʹ��;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

/*
 * ����ļ��ϱ�����Properties���ϣ�
 * public void load(Reader reader):���ļ��е����ݶ�ȡ��������
 * public void store(Writer writer,String comments):�Ѽ����е����ݴ洢���ļ�
 * 
 * ��������Ϸ��
 * 		���ȱ���ͼ��ء�
 * 		����ȺӢ��������־���ɽ�������...
 * 
 * 		����=1
 * 		���컭�=1
 */
public class PropertiesDemo3 {

	@Test
	public  void myStore() throws IOException {
		// �������϶���
		Properties prop = new Properties();

		prop.setProperty("����ϼ", "27");
		prop.setProperty("����", "30");
		prop.setProperty("������", "18");
		
		//public void store(Writer writer,String comments):�Ѽ����е����ݴ洢���ļ�
		Writer w = new FileWriter("name.txt");
		prop.store(w, "helloworld");
		w.close();
	}

	@Test
	public void myLoad() throws IOException {
		Properties prop = new Properties();

		// public void load(Reader reader):���ļ��е����ݶ�ȡ��������
		// ע�⣺����ļ������ݱ����Ǽ�ֵ����ʽ
		Reader r = new FileReader("prop.txt");
		prop.load(r);
		
		//��ȡ�����ļ��е�����   ��һ�ֶ�ȡ���ݵķ�ʽ
		String name = prop.getProperty("zhangsan");
		String name2 = prop.getProperty("lisi");
		String name3 = prop.getProperty("wangwu");
		System.out.println(name);//����
		System.out.println(name2);//����
		System.out.println(name3);//����
		
		//�����ֶ�ȡ���ݵķ�ʽ
		System.out.println("prop:" + prop);//prop:{zhangsan=30, lisi=40, wangwu=50}

		//ֱ�ӱ��������ص�������  �ڶ��ֶ�ȡ���ݵķ�ʽ
		Set<Object> set = prop.keySet();
		for(Object key : set){
			String value = (String) prop.get(key);
			System.out.println(key+"--"+value);
			/**
			 * forѭ����ȡ��������
			 * zhangsan--����
				lisi--����
				wangwu--����
			 */
		}
		r.close();
	}
}
