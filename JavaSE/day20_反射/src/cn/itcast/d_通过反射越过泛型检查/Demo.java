package cn.itcast.d_ͨ������Խ�����ͼ��;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * �Ҹ���ArrayList<Integer>��һ������������������������һ���ַ������ݣ����ʵ���أ�
 * @author ��Ԫ
 *
 */
public class Demo {
	public static void main(String[] args) throws Exception{
		//�������϶���
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1520);
		//��ȡArrayList���Class�ֽ����ļ�����
		Class arrayClazz = array.getClass();
		//ͨ�������ȡArrayList���е�add()��������
		Method m = arrayClazz.getMethod("add", Object.class);
		 
		//ִ�е���array��add����  ����һ����ֵ���ĸ����󣬲���������ֵ
		m.invoke(array, "hello");
		m.invoke(array, "world");
		m.invoke(array, "java");
		
		System.out.println(array);//[1520, hello, world, java]
		
	}
}
