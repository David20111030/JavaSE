package a_Collection.gz.JDK5News;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.max;

/**
 * JDK5������
 * @author ��Ԫ
 * 
 */
public class JDK5News {
	public static void main(String[] args) {
		test1();
		
		System.out.println("-----test2()----");
		test2();
		
		System.out.println("---test3()---");
		test3();
		
		System.out.println("---test4()---");
		test4();
		
		System.out.println("---test5()---");
		test5();
		
	}

	/**
	 * JDK5�������ԣ�
	 * 		�Զ���װ�䣬���ͣ���ǿfor����̬���룬�ɱ������ö�١�
	 * 	��ǿfor����forѭ����һ��
	 * 		��ʽ��
	 * 			for(Ԫ���������� ���� : Ҫ�������������Collection����){
	 * 				ʹ�ñ������ɣ��ñ�������Ԫ��
	 * 			}
	 * 
	 *   �ô�����������ͼ��ϵı�����
	 *   �׶ˣ���ǿfor��Ŀ�겻��Ϊnull��
	 *   ��ν���أ�����ǿfor��Ĺ���Ƚ��в�Ϊnull���жϣ�Ȼ����ʹ�á�
	 */
	public static void test1(){
		//����һ��int����
		int[] arr={1,2,3,4,5};
		//ʹ����ͨfor����
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println("--------");
		//ʹ����ǿfor����
		for(int x:arr){
			System.out.println(x);
		}
		
		// ����һ���ַ�������
		String[] strArray = { "����ϼ", "������", "��������", "����" };
		//ʹ����ǿfor����
		for(String s:strArray){
			System.out.println(s);
		}
		
		//����һ������
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add(".Net");
		//ʹ����ǿfor����
		for(String s: array){
			System.out.println(s);
		}
		/**
		 * ���������
		 * 	hello
		 * 	.Net
		 */
		
		List<String> list = null;
		// NullPointerException
		// ���s�����Ǵ�list�����ȡ�����ģ��ڻ�ȡǰ�����϶�������һ���ж�
		// ˵���ˣ�����ǵ������Ĺ���
		if (list != null) {
			for (String s : list) {
				System.out.println(s);
			}
		}
		
		// ��ǿfor��ʵ�����������������
		
		
	}
	
	
	/**
	 * ArrayList�洢�ַ�����������Ҫ����뷺�ͣ�������ǿfor����
	 * 	A��������
	 * 	B����ͨfor
	 *  C����ǿfor
	 *  
	 *  ��ǿfor�����������������Ŷ����
	 *  LinkedList,Vector,Colleciton,List�ȴ洢�һ�����?�������ˣ�����Ҫ��������ϰ��
	 */
	public static void test2(){
		//�������϶���
		ArrayList<String> array=new ArrayList<String>();
		
		//���Ԫ��
		array.add("hello");
		array.add("world");
		
		//�������ϡ�
		//������
		Iterator it=array.iterator();
		while(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s);
		}
		
		//��ͨfor
		for(int i=0;i<array.size();i++){
			String s=(String)array.get(i);
			System.out.println(s);
		}
		
		//��ǿfor
		for(String s:array){
			System.out.println(s);
		}
	}
	
	
	
	/**
	 * ��̬���룺
	 * 	��ʽ��import static ����...����.������;
	 *  ����ֱ�ӵ��뵽�����ļ���
	 *  
	 *  ��̬�����ע������:
	 *  	A:���������Ǿ�̬�ġ�
	 *  	B������ж��ͬ�����Ⱦ�̬���������ײ�֪��ʹ��˭��
	 *  			���ʱ��Ҫʹ�ã������ǰ׺���ɴ˿ɼ������岻������һ�㲻�ã�����Ҫ�ܿ�����
	 * 
	 */
	public static void test3(){
		// System.out.println(java.lang.Math.abs(-100));
		// System.out.println(java.lang.Math.pow(2, 3));
		// System.out.println(java.lang.Math.max(20, 30));
		// ̫���ӣ����Ǿ����뵽import
		
		// System.out.println(Math.abs(-100));
		// System.out.println(Math.pow(2, 3));
		// System.out.println(Math.max(20, 30));
		// ̫���ӣ��и���
		
		System.out.println(pow(2,3));
		System.out.println(max(20, 30));
		//System.out.println(abs(-100));//���д����д���Ϊû�о�̬����import static java.lang.Math.abs;
		
	}
	
	
	
	/**
	 * �ɱ����:���ڽ�����巽����ʱ��֪��Ӧ�ö�����ٸ�������
	 * 	��ʽ��
	 * 		���η� ����ֵ���� ������(��������... ������){
	 * 		
	 * 		}
	 * 	ע�⣺
	 * 		����ı�����ʵ��һ�����顣	
	 * 	���һ�������пɱ�����������ж����������ô���ɱ�����϶������һ����
	 */
	public static void test4(){
		// 2���������
		int a = 10;
		int b = 20;
		int result = test4_sum(a, b);
		System.out.println("result:" + result);

		// 3�����ݵ����
		int c = 30;
		result = test4_sum(a, b, c);
		System.out.println("result:" + result);

		// 4�����ݵ����
		int d = 30;
		result = test4_sum(a, b, c, d);
		System.out.println("result:" + result);

		// ������Ҫдһ����͵Ĺ��ܣ������Ǽ�����������أ��Ҳ�̫�����������֪���ڵ��õ�ʱ���ҿ϶���֪����
		// Ϊ�˽��������⣬Java���ṩ��һ���������ɱ����
		result = test4_sum(a, b, c, d, 40);
		System.out.println("result:" + result);

		result = test4_sum(a, b, c, d, 40, 50);
		System.out.println("result:" + result);
		
		
		
	}
	
	public static int test4_sum(int...  a){
		int s=0;
		
		for(int x:a){
			s+=x;
		}
		
		return s;
	}
	
	
	/**
	 * public static <T> List<T> asList(T... a);������ת��List����
	 * 
	 * ע�����	
	 * 		��Ȼ���԰�����ת�ɼ��ϣ����Ǽ��ϵĳ��Ȳ��ܸı䡣
	 * 
	 */
	public static void test5(){
		//����һ������
		String[] strArray={"hello","world","hava"};
		List<String> list=Arrays.asList(strArray);
		//ʹ����ǿ����
		for(String str:list){
			System.out.println(str);
		}
		/**
		 * ���������
		 * 	hello
		 *  world
		 *  hava
		 */
		
		List<String> list1=Arrays.asList("hello","world","java");
		//ע�⣺��Ȼ���԰�����ת�ɼ��ϣ����Ǽ��ϵĳ��Ȳ��ܸı䡣
		// UnsupportedOperationException
	    // list.add("javaee");
		// UnsupportedOperationException
		// list.remove(1);
		
		list1.set(0, "javaee");
		
		
		for(String s:list1){
			System.out.println(s);
		}
		/**
		 * ���������
		 * javaee
			world
			java
		 */
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
