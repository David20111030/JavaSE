package cn.itcast.cͨ�������ļ��������еķ���;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 ͨ�������ļ��������еķ�����
	 ���䣺
	 	��Ҫ�������ļ����ʹ��
	 	��class.txt����
	 	������֪����������
	 	ClassName
	 	methodName

 */
public class ͨ�������ļ��������еķ��� {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// ���ؼ�ֵ������
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		// ��ȡ����
		String className = prop.getProperty("className");
		String methodName = prop.getProperty("methodName");

		System.out.println(className);//cn.itcast.cͨ�������ļ��������еķ���.Student
		System.out.println(methodName);//love
		// ����
		Class c = Class.forName(className);//��ȡ��Ӧ���Class����
		System.out.println(c);//class cn.itcast.cͨ�������ļ��������еķ���.Student
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);//cn.itcast.cͨ�������ļ��������еķ���.Student@3c0f3387 ��Ϊ���û��дtoString����
		
		// ���÷���
		Method m = c.getMethod(methodName);
		m.invoke(obj);//�������Java

	}
}
