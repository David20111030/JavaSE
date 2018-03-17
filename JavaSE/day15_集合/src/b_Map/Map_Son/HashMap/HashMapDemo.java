package b_Map.Map_Son.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * HashMap
 * @author ��Ԫ
 *
 */
public class HashMapDemo {
	
	/**
	 * HashMap:�ǻ��ڹ�ϣ���Map�ӿ�ʵ��
	 * ��ϣ���������������֤����Ψһ�Ե�
	 * 
	 * HashMap<String,String>
	 * ����String
	 * ֵ��String
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		HashMap<String,String> hm=new HashMap<String,String>();
		
		//���Ԫ��
		hm.put("it001", "����");
		hm.put("it002", "����");
		hm.put("it003", "�ò���");
		
		//����
		//��һ�ַ�ʽ����
		Set<String> set=hm.keySet();//��ȡ���еļ�
		for(String key:set){
			String value=hm.get(key);//���ݼ���ȡֵ
			System.out.println(key+"---"+value);
		}
		/**
		 * ���������
		 * it003---�ò���
			it002---����
			it001---����
		 */
	
		//�ڶ��ֱ�����ʽ ͨ����ֵ�Զ������
		Set<Map.Entry<String,String>> set2=hm.entrySet();
		for(Map.Entry<String, String> s:set2){
			String key=s.getKey();//��ȡ��
			String value=s.getValue();//��ȡֵ
			System.out.println(key+"---"+value);
		}
		/**
		 * ���������
		 * 	it003---�ò���
			it002---����
			it001---����
		 */
		
	}
	
	/**
	 * HashMap<Integer,String>
	 * ����Integer
	 * ֵ��String
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		//�������϶���
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//����Ԫ�ز����
		hm.put(001, "����ϼ");
		hm.put(002, "������");
		hm.put(03, "����Ԫ");
		
		//���� ͨ����ֵ�Զ������
		Set<Map.Entry<Integer, String>> set=hm.entrySet();
		for(Map.Entry<Integer, String> kv:set){
			int key=kv.getKey();//��ȡ��
			String value=kv.getValue();//��ȡֵ
			System.out.println(key+"---"+value);
		}
		/**
		 * ���������
		 * 1---����ϼ
		   2---������
		   3---����Ԫ
		 */	
	}
	
	
	/**
	 * HashMap<String,Student>
	 * ����String ѧ��
	 * ֵ��Student ѧ������
	 * @throws Exception
	 */
	@Test
	public void test3() throws Exception {
		//�������϶���
		HashMap<String,Student> hm=new HashMap<String,Student>();
		
		// ����ѧ������
		Student s1 = new Student("���ǳ�", 58);
		Student s2 = new Student("���»�", 55);
		Student s3 = new Student("����ΰ", 54);
		Student s4 = new Student("������", 50);

		// ���Ԫ��
		hm.put("9527", s1);
		hm.put("9522", s2);
		hm.put("9524", s3);
		hm.put("9529", s4);
		
		//�������� ʹ�ü�ֵ�Զ������
		Set<Map.Entry<String, Student>> set=hm.entrySet();
		for(Map.Entry<String, Student> kv:set){
			String key=kv.getKey();//��ȡ��
			Student value=kv.getValue();//��ȡֵ
			System.out.println(key+"---"+value.getName()+":"+value.getAge());
		}
		/**
		 * ��ӡ�����
		 * 9524---����ΰ:54
			9522---���»�:55
			9527---���ǳ�:58
			9529---������:50
		 */
		
		
		//�ڶ��ֱ�����ʽ�����ݼ���ȡֵ
		//���Ȼ�ȡ���еļ�
		Set<String> set2=hm.keySet();
		for(String key:set2){
			Student value=hm.get(key);//���ݼ���ȡֵ
			System.out.println(key+"---"+value.getName()+":"+value.getAge());
		}
		/**
		 * ��ӡ�����
		 * 9524---����ΰ:54
			9522---���»�:55
			9527---���ǳ�:58
			9529---������:50
		 */
	}
	
	
	/**
	 * HashMap<Student,String>
	 * ����Student
	 * 		Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ������
	 * ֵ��String
	 * 
	 * Map�����ص㣺��Ψһ��ֵ���Բ�Ψһ��Ҳ���Ǽ������ظ���ֵ�����ظ���
	 * @throws Exception
	 */
	@Test
	public void test4() throws Exception {
		//�������϶���
		HashMap<Student,String> hm=new HashMap<Student,String>();
		
		// ����ѧ������
		Student s1 = new Student("����", 27);
		Student s2 = new Student("���Ѿ�", 30);
		Student s3 = new Student("��ʩ", 33);
		Student s4 = new Student("����", 35);
		Student s5 = new Student("����", 27);

		// ���Ԫ��
		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "5555");
		hm.put(s4, "7777");
		hm.put(s5, "9999");
		
		//����  ͨ����ֵ�Զ���ķ�ʽ����
		Set<Map.Entry<Student, String>> set=hm.entrySet();
		for(Map.Entry<Student, String> kv:set){
			Student key=kv.getKey();//��ȡ��
			String value=kv.getValue();//��ȡֵ
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		/**
		 * ���������
		 * ����:27---9999
			��ʩ:33---5555
			����:35---7777
			���Ѿ�:30---6666
		 */
		
		//�ڶ��ֱ�����ʽ  ͨ������ȡֵ
		//���ȵû�ȡ���еļ�
		Set<Student> set2=hm.keySet();
		for(Student key:set2){
			String value=hm.get(key);//���ݼ���ȡֵ
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		/**
		 * ���������
		 * ����:27---9999
			��ʩ:33---5555
			����:35---7777
			���Ѿ�:30---6666
		 */
		
	}
	
	/**
	 * ����Ƕ��֮��ı���
	 * 
	 * Ϊ�˸�����Ҫ��
	 * 		��ε����ݾͿ�����ѧ������
	 * 
	 * ���ǲ���
	 * 		sh	�Ϻ�У��
	 * 			jc	������
	 * 					������		20
	 * 					Ϭ����		22
	 * 			jy	��ҵ��	
	 * 					�����		21
	 * 					����		23
	 * 		gz	����У��
	 * 			jc	������
	 * 					������		30
	 * 					���		32
	 * 			jy	��ҵ��	
	 * 					����		31
	 * 					����		33
	 * 		xa	����У��
	 * 			jc	������
	 * 					������		27
	 * 					����		30
	 * 			jy	��ҵ��	
	 * 					�����		28
	 * 					��־��		29
	 * 		bj	����У��
	 * 			jc	������
	 * 					����ϼ		27
	 * 					������		30
	 * 			jy	��ҵ��	
	 * 					����֥		28
	 * 					����		29
	 */
	@Test
	public void test5() throws Exception {
		//�������ǲ��ʹ󼯺�
		HashMap<String,HashMap<String,ArrayList<Student2>>> czbkMap=new HashMap<String,HashMap<String,ArrayList<Student2>>>(); 
		
		//����У������
		HashMap<String,ArrayList<Student2>> bjMap=new HashMap<String,ArrayList<Student2>>();
		//����У��ѧ��
		ArrayList<Student2> bjArray=new ArrayList<Student2>();
		//��ӱ���У��ѧ��
		Student2 s1 = new Student2("����ϼ", 27);
		Student2 s2 = new Student2("������", 30);
		bjArray.add(s1);
		bjArray.add(s2);
		
		bjMap.put("������", bjArray);
		//������У���ĵ�������ӵ����ǲ��ʹ󼯺���
		czbkMap.put("����У��", bjMap);
		
		//�������ǲ��ʹ󼯺��е�����
		//��һ�ֱ�����ʽ�����ݼ���ȡֵ
		Set<String> set=czbkMap.keySet();//��ȡ���еļ�
		for(String key:set){
			HashMap<String,ArrayList<Student2>> hmValue=czbkMap.get(key);//���ݼ���ȡֵ
			//����HashMap
			//���ݼ���ȡֵ
			//��ȡ���еļ�
			Set<String> hmSet=hmValue.keySet();//��ȡ���еļ�
			for(String hmKey:hmSet){
				ArrayList<Student2> valueList=hmValue.get(hmKey);//���ݼ���ȡֵ
				//����ArrayList<Student2>����
				Iterator<Student2> it=valueList.iterator();
				while(it.hasNext()){
					Student2 stu=it.next();
					System.out.println(key+"--"+hmKey+"--"+stu.getName()+":"+stu.getAge());
				}
			}
		}
		/**
		 * ���������
		 * ����У��--������--����ϼ:27
			����У��--������--������:30
		 */
		
		System.out.println("�ڶ��ֱ�����ʽ");
		
		//�ڶ��ֱ�����ʽ  ͨ����ֵ�Զ������
		//���ȵû�ȡ���еļ�ֵ�Զ���
		Set<Map.Entry<String, HashMap<String,ArrayList<Student2>>>> set2=czbkMap.entrySet();
		for(Map.Entry<String, HashMap<String,ArrayList<Student2>>> hmKv:set2){
			//��ȡ�� У��
			String hmKey=hmKv.getKey();
			//��ȡֵ  HashMap����
			HashMap<String,ArrayList<Student2>> hmValue=hmKv.getValue();
			//����HashMap����
			Set<Map.Entry<String, ArrayList<Student2>>> hmSet=hmValue.entrySet();
			for(Map.Entry<String, ArrayList<Student2>> hm:hmSet){
				//��ȡ��  ������
				String key=hm.getKey();//��ȡ��
				//��ȡֵ ArrayList<Student2>
				ArrayList<Student2> value=hm.getValue();
				//����ArrayList����
				for(Student2 stu:value){
					String name=stu.getName();
					int age=stu.getAge();
					//��ӡȫ�����
					System.out.println(hmKey+"--"+key+"--"+name+":"+age);
				}
			}
		}
		/**
		 * ���������
		 * ����У��--������--����ϼ:27
			����У��--������--������:30
		 */

		
	}
	
	
}
