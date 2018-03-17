package cn.itcast.e_��̬���������ʵ��;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 	��������Ӧ���ֽ�������ȴ���˱���������������˾��Ǵ���
 	
 	��̬�����ڳ������й����в�����������󡣶�̬������ʵ����ͨ������������һ������
 	
 * @author ��Ԫ
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		/**
		 *  ��ӹ���
			ɾ������
			�޸Ĺ���
			���ҹ���
		 */
		System.out.println("===============");
		
		//����Ҫ����һ����̬�������
		//proxy�ࣺ�����ʾ������
		//Proxy������һ���������Դ�����̬�������
		/**
		 * public static Object newProxyInstance(
						  	ClassLoader loader,
				        	Class<?>[] interfaces,
				        	InvocationHandler h);
				������
					loader - �����������������
					interfaces - ������Ҫʵ�ֵĽӿ��б�
					h - ָ�ɷ������õĵ��ô������ 
					
			         ���أ�
				   һ�����д������ָ�����ô������Ĵ���ʵ��������ָ��������������壬��ʵ��ָ���Ľӿ�
		 */
		//��׼����ud������һ���������
		UserDao proxy = (UserDao) Proxy.newProxyInstance(
							ud.getClass().getClassLoader(),
							ud.getClass().getInterfaces(),
							new InvocationHandler() {
								@Override
								public Object invoke(Object proxy, Method method, Object[] args)
										throws Throwable {
									/**
									  ������
										proxy - �����ϵ��÷����Ĵ���ʵ��
										method - ��Ӧ���ڴ���ʵ���ϵ��õĽӿڷ����� Method ʵ����Method ����������ཫ�����������������Ľӿڣ��ýӿڿ����Ǵ��������Լ̳з����Ĵ���ӿڵĳ��ӿڡ�
										args - �����������ʵ���Ϸ������õĲ���ֵ�Ķ������飬����ӿڷ�����ʹ�ò�������Ϊ null���������͵Ĳ�������װ���ʵ�������װ���ࣨ�� java.lang.Integer �� java.lang.Boolean����ʵ���С� 
										
										���أ�
										�Ӵ���ʵ���ķ������÷��ص�ֵ��
									 */
									System.out.println("Ȩ��У��");
									Object result = method.invoke(new UserDaoImpl(), args);////����ֵ��Object���գ���һ��������ʾ������˭���ڶ���������ʾ���ø÷�����ʵ�ʲ���
									System.out.println("��־��¼");
									return result;//���صľ��Ǵ������
								}
							});
				
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();
		/**
		 * Ȩ��У��
			��ӹ���
			��־��¼
			Ȩ��У��
			ɾ������
			��־��¼
			Ȩ��У��
			�޸Ĺ���
			��־��¼
			Ȩ��У��
			���ҹ���
			��־��¼
		 */
		
	}//mian����������
	
	
}
