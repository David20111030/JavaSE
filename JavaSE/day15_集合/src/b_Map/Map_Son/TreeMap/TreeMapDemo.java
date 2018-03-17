package b_Map.Map_Son.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap:�ǻ��ں������Map�ӿڵ�ʵ��
 * 
 * HashMap<String,String>
 * ����String 
 * ֵ��String
 * 
 * @author ��Ԫ
 *
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		test1();
		
		System.out.println("---test2()---");
		test2();
	}

	/**
	 * ����TreeMap����
	 */
	private static void test1() {
		//�������϶���
		TreeMap<String,String>tm=new TreeMap<String,String>();
		
		// ����Ԫ�ز����Ԫ��
		tm.put("hello", "���");
		tm.put("world", "����");
		tm.put("java", "צ��");
		tm.put("world", "����2");
		tm.put("javaee", "צ��EE");

		//�������� ���ݼ���ȡֵ
		//��ȡ���еļ�
		Set<String> set=tm.keySet();
		for(String key:set){
			String value=tm.get(key);//���ݼ���ȡֵ
			System.out.println(key+"---"+value);
		}
		/**
		 * hello---���
			java---צ��
			javaee---צ��EE
			world---����2
		 */
		
		//�ڶ��ֱ�����ʽ�����ݼ�ֵ�Զ������
		Set<Map.Entry<String,String>> set2=tm.entrySet();
		for(Map.Entry<String, String> kv:set2){
			String key=kv.getKey();//��ȡ��
			String value=kv.getValue();//��ȡֵ
			System.out.println(key+"---"+value);
		}
		/**
		 * hello---���
			java---צ��
			javaee---צ��EE
			world---����2
		 */
	}


	
	/**
	 * ����TreeMap����
	 */
	public static void test2(){
		//�������϶���
		TreeMap<Student,String> tm=new TreeMap<Student,String>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				//��Ҫ����������
				int num=s1.getAge()-s2.getAge();
				//������ͬ��������һ����ͬ
				int num2= num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
		});
		
		
		// ����ѧ������
		Student s1 = new Student("�˰�", 30);
		Student s2 = new Student("���»�", 35);
		Student s3 = new Student("�Ʋ���", 33);
		Student s4 = new Student("����", 32);
		Student s5 = new Student("�Ʋ���", 33);

		// �洢Ԫ��
		tm.put(s1, "�γ�");
		tm.put(s2, "Ԫ��");
		tm.put(s3, "����");
		tm.put(s4, "�峯");
		tm.put(s5, "����");

		
		//����  ���ݼ�ֵ�Զ������
		Set<Map.Entry<Student, String>> set=tm.entrySet();
		for(Map.Entry<Student, String> kv:set){
			Student key=kv.getKey();//��ȡ��
			String value=kv.getValue();//��ȡֵ
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		/**
		 * ���������
		 	�˰�:30---�γ�
			����:32---�峯
			�Ʋ���:33---����
			���»�:35---Ԫ��
		 */
		
		//�ڶ��ֱ�����ʽ�����ݼ���ȡֵ
		Set<Student> set2=tm.keySet();//��ȡ���еļ�
		for(Student key:set2){
			String value=tm.get(key);//���ݼ���ȡֵ
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		/**
		 * ���������
		 	�˰�:30---�γ�
			����:32---�峯
			�Ʋ���:33---����
			���»�:35---Ԫ��
		 */
			
	}
	
}
