package n_System;

import org.junit.Test;

public class SystemDemo {
	
	/*
	 * System�����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
	 * 
	 * ������
	 * 		public static void gc()������������������ 
	 *		public static void exit(int status);//��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ
	 *		public static long currentTimeMillis();//���ص�ǰʱ�����1970��8��ĺ���ֵ
	 *		
	 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)����ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
	 */
	@Test
	public void test1() throws Exception {
		Person p = new Person("����֥", 60);
		System.out.println(p);

		p = null; // ��p����ָ�����ڴ�
		System.gc();
		
		/**
		 * Person [name=����֥, age=60]
			��ǰ�Ķ��󱻻�����Person [name=����֥, age=60]
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
