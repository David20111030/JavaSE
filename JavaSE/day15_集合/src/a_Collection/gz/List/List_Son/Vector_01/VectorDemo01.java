package a_Collection.gz.List.List_Son.Vector_01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Vector�����й��ܣ�
 * 	1����ӹ��ܣ�
 * 		public void addElement(Object obj);  -- �ȼ���add();
 * 	2����ȡ���ܣ�
 * 		public Object elementAt(int index);  --�ȼ���get();
 * 		public Enumeration elements(); -- �ȼ��� Iterator iterator();
 *  	boolean hasMoreElements();  -- �ȼ���hasNext();
 *  	Object nextElement(); -- �ȼ���next();
 *  	
 * 	JDK������ԭ��
 * 		A:��ȫ
 * 		B:Ч��
 * 		C:����д
 * 
 * 
 * @author ��Ԫ
 *
 */
public class VectorDemo01 {
	public static void main(String[] args){
		
		test1();
	}
	
	public static void test1(){
		//�������϶���
		Vector v=new Vector();
		
		//���Ԫ�� һ�����ַ�ʽ���Ԫ�صķ�ʽ��һ��
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		v.add("javaee");
		//����
		for(int i=0;i<v.size();i++){
			String s=(String)v.elementAt(i);//�ȼ��� String s=(String)v.get(i);
			System.out.println(s);
		}
		/**
		 * ���������
		 * 	hello
			world
			java
			javaee
		 */
		
		//ʹ��Vector�������еı�����ʽ����
		Enumeration en=v.elements();//���ص���ʵ����Ķ���
		while(en.hasMoreElements()){//�жϼ������Ƿ���Ԫ��
			String s=(String)en.nextElement();
			System.out.println(s);
		}
		/**
		 * ���������
		 * 	hello
			world
			java
			javaee
		 */
		
		//ʹ�õ���������
		Iterator it=v.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		/**
		 * ���������
		 * 	hello
			world
			java
			javaee
		 */
	}
	
	
	
}
