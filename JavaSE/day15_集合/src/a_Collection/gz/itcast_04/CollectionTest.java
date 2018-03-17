package a_Collection.gz.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		test1();
		
		System.out.println("-------------------");
		
		test2();
		
	}
	

	/*
	 * ���󣺴洢�ַ�����������
	 * 
	 * ������
	 * 		A:�������϶���
	 * 		B:�����ַ�������
	 * 		C:���ַ���������ӵ�������
	 * 		D:��������
	 */
	private static void test1() {
		//�������϶���
		Collection c=new ArrayList();
		
		//�����ַ�������
		//���ַ���������ӵ�������
		c.add("����ϼ");
		c.add("������");
		c.add("��ҹ");
		
		//ʹ�õ�������������
		//���Ȼ�ȡ����������
		Iterator it=c.iterator();
		//ͨ�������������hasNext()�����ж���û��Ԫ��
		while(it.hasNext()){
			//ͨ�������������next()������ȡԪ��
			String s=(String)it.next();
			System.out.println(s);
		}
		
	}
	
	
	/*
	 * ���󣺴洢�Զ�����󲢱���Student(name,age)
	 *
	 * ������
	 * 		A:����ѧ����
	 * 		B:�������϶���
	 * 		C:����ѧ������
	 * 		D:��ѧ��������ӵ����϶�����
	 * 		E:��������
	 */
	public static void test2(){
		//����ѧ������
		Student s1=new Student("������",30);
		Student s2=new Student("����ϼ",32);
		
		//�������϶���
		Collection c=new ArrayList();
		//��ѧ��������ӵ�������
		c.add(s1);
		c.add(s2);
		c.add(new Student("��ҹ",19));//�������������������
		
		//ʹ�õ�������������
		//���Ȼ�ȡ����������
		Iterator it=c.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			System.out.println(s.getName()+"--"+s.getAge());
		}
		/*
		�������
		������--30
		����ϼ--32
		��ҹ--19*/
	}
	
}
