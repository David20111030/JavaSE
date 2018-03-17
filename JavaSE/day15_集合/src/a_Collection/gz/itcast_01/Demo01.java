package a_Collection.gz.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 ���ϵ�������
 	����ѧϰ��������������ԣ�������������Զ������������ͨ���������ֵģ�Ϊ�˷���Զ��������в��������Ǿͱ��������������д洢��
 	
 	����Ҫ�洢������󣬾Ͳ�����һ�������ı�������Ӧ����һ���������͵ı�����������Ŀǰ��ѧ��֪ʶ���棬����Щ���������͵��أ�
 		�����StringBuffer�����ǣ�StringBuffer�Ľ����һ���ַ�������һ���������ǵ�Ҫ����������ֻ��ѡ�����飬����Ƕ������顣
 		�����������в�����Ӧ�仯��������Ϊ����ĳ����ǹ̶��ģ����ʱ��Ϊ����Ӧ�仯������java���ṩ�˼����๩����ʹ�á�
 		
 ����ͼ��ϵ�����:
 	A:��������
 		����ĳ��ȹ̶���
 		���ϵĳ��ȿɱ䡣
 	B:���ݲ�ͬ
 		����洢����ͬһ�����͵�Ԫ��
 		�����Ͽ��Դ洢��ͬ���͵�Ԫ��
 	C:Ԫ�ص�������������
 
 ע�⣺������Դ洢�����������ͣ�Ҳ���Դ洢�����������ͣ����Ǽ���ֻ�ܴ洢��������
 
 ���ݽṹ�����ݵĴ洢��ʽ��
 	
 	Collection�Ĺ��ܸ�����
 	1����ӹ��ܣ�
 		boolean add(Object obj);���һ��Ԫ��
 		boolean addAll(Collection c);���һ�����ϵ�Ԫ��
 	2��ɾ�����ܣ�
 		void clear();�Ƴ�����Ԫ��
 		boolean remove(Object o);�Ƴ�һ��Ԫ��
 		boolean removeAll(Collection c);���һ�����ϵ�Ԫ�ء�(ֻҪ��һ��Ԫ�ر��Ƴ��ˣ��ͷ���true)
 	3���жϹ��ܣ�
 		boolean contains(Object o);�жϼ������Ƿ����ָ����Ԫ��
 		boolean containsAll(Collection coll);�жϼ������Ƿ����һ��ָ���ļ���coll��ֻ�а������е�Ԫ�أ��Žа���
 		boolean isEmpty();�жϼ����Ƿ�Ϊ��
 	4����ȡ����
 		Iterator<E> iterator()  ���ص㣬��������
 	5�����ȹ��ܣ�
 		int size();Ԫ�صĸ���
 
 �����⣺������û��length()�����أ��ַ�����û��length()�����أ�������û��legth()�����أ�
 		������ַ�������length()����������û��length()����,���Ǽ�����size()����.
 	
 	6���������ܣ�
 		boolean retainAll(Collection c);�������϶��е�Ԫ�ء�˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼�أ�
 		
 	7���Ѽ���ת��Ϊ����	
 		Object[] toArray();
 	
 	ע�⣺ֱ�����һ�����Ͼ��൱�ڰѸü����е�����Ԫ��ȫ�����.
 		Collection�����ǵ��м��ϵĶ���ӿڣ�Ҳ���ǵ��м��ϵĳ��ࡣ
 */
public class Demo01 {
	public static void main(String[] args) {
	//test1();
	
	//test2();
		
	test3();
}



private static void test1() {
	//�������϶���
	//Collection c=new Collection();
	//������ΪCollection�ǵ��м��ϵĽӿڣ����ӿڲ���ʵ����
	Collection c=new ArrayList();
	
	//boolean add(Object obj);���һ��Ԫ��
	//System.out.println("add:"+c.add("hello"));//add:true
	
	c.add("world");
	c.add("java");
	
	//void clear();�Ƴ�����Ԫ��
	//c.clear();
	
	//boolean remove(Object o);�Ƴ�һ��Ԫ��
	//System.out.println("remove:"+c.remove("world"));//remove:true
	//System.out.println("remove:"+c.remove("javaee"));//remove:false ��Ϊ�ü����о�û��"javaee"���Ԫ��
	
	//�жϼ������Ƿ����ָ����Ԫ��
	System.out.println("contains:"+c.contains("java"));//contains:true
	System.out.println("contains:"+c.contains("javaee"));//contains:false
	
	Collection coll=new ArrayList();
	coll.add("java");
	//�ж��Ƿ����һ������
	System.out.println("c is contarinsAll coll?"+c.containsAll(coll));//c is contarinsAll coll?true
	
	//int size();Ԫ�ظ���
	System.out.println("size:"+c.size());//size:2
	
	//ֱ�����һ������  ע�⣺ֱ�����һ�����Ͼ��൱�ڰѸü����е�����Ԫ��ȫ�����
	System.out.println("c:"+c);//c:[world, java]
}


private static void test2() {
	//��������1
	Collection c1=new ArrayList();
	c1.add("abc1");
	c1.add("abc2");
	c1.add("abc3");
	c1.add("abc4");
	
	//��������2
	Collection c2=new ArrayList();
	c2.add("abc1");
	c2.add("abc2");
	c2.add("abc3");
	c2.add("abc4");
	c2.add("abc5");
	c2.add("abc6");
	c2.add("abc7");
	
	//boolean addAll(Collection c);���һ�����ϵ�Ԫ��
	System.out.println("addAll:"+c1.addAll(c2));//addAll:true
	
	//boolean removeAll(Collection c);�Ƴ�һ�����ϵ�Ԫ��(��һ���������У�)
	//ֻҪ��һ��Ԫ�ر��Ƴ��ˣ��ͷ���true
	//System.out.println("removeAll:"+c1.removeAll(c2));//removeAll:true
	
	//boolean contarinsAll(Collection c);�жϼ������Ƿ����ָ���ļ���Ԫ��(��һ���������У�)
	//ֻ�а������е�Ԫ�أ��Žа���
	System.out.println("containsAll:"+c2.containsAll(c1));//containsAll:true
	System.out.println("contrainsAll:"+c1.containsAll(c2));//containsAll:true
	
	System.out.println("c1:"+c1);//c1:[abc1, abc2, abc3, abc4, abc1, abc2, abc3, abc4, abc5, abc6, abc7]
	System.out.println("c2:"+c2);//c2:[abc1, abc2, abc3, abc4, abc5, abc6, abc7]
}

/**
 * ���ϵı���
 */
private static void test3(){
	//���ϵı�������ʵ�������λ�ȡ�����е�ÿһ��Ԫ��
	//Object[] toArray();�Ѽ���ת�����飬����ʵ�ּ��ϵı���
	
	//�������϶���
	Collection c=new ArrayList();
	
	//���Ԫ�� add(Object obj);
	c.add("hello");// Object obj="hello";����ת��
	c.add("world");
	c.add("java");
	
	//����
	//Object[] toArray();�Ѽ���ת�����飬����ʵ�ּ��ϵı���
	Object[] objs=c.toArray();
	for(int i=0;i<objs.length;i++){
		//System.out.println(objs[i]);
		
		//��֪��Ԫ�����ַ��������ڻ�ȡ��Ԫ�ص�ͬʱ������֪����Ԫ�صĳ��ȡ�
		//System.out.println(objs[x]+"---"+objs[x].length);//����
		//��һ�����ʵ�ֲ��ˣ�ԭ����Object��û��length()����
		//����Ҫ��ʹ���ַ����ķ������ͱ����Ԫ�ػ�ԭ���ַ���
		//����ת��
		String s=(String) objs[i];//����ת��
		System.out.println(s+"---"+s.length());
	}
	
	
}


}
