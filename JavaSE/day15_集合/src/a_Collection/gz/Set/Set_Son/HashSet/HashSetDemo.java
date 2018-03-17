package a_Collection.gz.Set.Set_Son.HashSet;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		test1();
		
		System.out.println("---test2()---");
		
		test2();
		
		System.out.println("----test3()----");
		
		test3();
		
	}
	
	
	/**
	 * HashSet:�洢�ַ�����������
	 * ���⣺Ϊʲô�洢�ַ�����ʱ���ַ���������ͬ��ֻ�洢��һ���أ�
	 * 	ͨ���鿴add������Դ�룬����֪����������ײ���������������
	 * 			������HashCode()��equals()����
	 * 	
	 * 	���裺
	 * 		���ȱȽϹ�ϣֵ��
	 * 			�����ͬ�������ߣ��Ƚϵ�ֵַ������equals();
	 * 			�����ͬ����ֱ����ӵ������С�
	 *  ���շ����Ĳ�����˵��
	 *  	�ȿ�hashCode()ֵ�Ƿ���ͬ��	
	 *  			��ͬ:������equals()����
	 *  				����true:˵��Ԫ���ظ����Ͳ���ӡ�
	 *  				����false:˵��Ԫ�ز��ظ�������ӵ������С�
	 * 				��ͬ:��ֱ�Ӱ�Ԫ����ӵ������С�
	 * �����û����д������������Ĭ��ʹ�õ�Object()�е�hashCode()��equals()������һ����˵������ͬ��
	 * 
	 * ��String����д��hashCode()��equals()����,�������Ϳ��԰�������ͬ���ַ���ȥ����ֻ����һ����
	 * 
	 */
	public static void test1(){
		//�������϶���
		HashSet<String> hs=new HashSet<String>();
		
		//���������Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");
		
		//ʹ����ǿfor��������
		for(String s:hs){
			System.out.println(s);
		}
		/**
		 * ���������
		 * 	hello
		 * 	java
		 * 	world
		 */
		
	}
	
	
	
	/**
	 * ���󣺴洢�Զ�����󣬲���֤Ԫ�ص�Ψһ�ԡ�
	 * Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ��Ԫ�ء�
	 * 
	 * Ŀǰ�ǲ���������Ҫ���:��Ϊ����֪��HashSet�ײ�����hashCode()��equals()������
	 * ������������������ѧ������û����д������Ĭ��ʹ�õ���Object��ġ�
	 * ���ʱ�����ǵĹ�ϣֵ�ǲ���һ���ģ������Ͳ�������жϣ���ִ������Ӳ���
	 *  	
	 *
	 * 
	 */
	public static void test2(){
		// �������϶���
		HashSet<Student> hs = new HashSet<Student>();

		// ����ѧ������
		Student s1 = new Student("����ϼ", 27);
		Student s2 = new Student("������", 22);
		Student s3 = new Student("������", 30);
		Student s4 = new Student("����ϼ", 27);
		Student s5 = new Student("����ϼ", 20);
		Student s6 = new Student("������", 22);

		// ���Ԫ��
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);		
		
		// ��������
		for (Student s : hs) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
		/**
		 * ���������
		 * 	������---30
			������---22
			����ϼ---27
			����ϼ---20
			������---22
		 */
		
	}
	
	
	
	/**
	 * HashSet���ϴ洢�Զ�����󲢱������������ĳ�Ա����ֵ��ͬ��Ϊͬһ������
	 * 
	 * ע���ˣ�	
	 * 		�����õ���HashSet���ϣ�������ϵĵײ���Hash��ṹ��
	 * 		����ϣ��ṹ�ײ�����:hashCode()��equals()����
	 * �������Ϊ����ĳ�Ա����ֵ��ͬ��Ϊͬһ������Ļ������Ӧ����д������������
	 * 	�����д�����������أ����ص��ģ��Զ����ɼ��ɡ�
	 * 
	 */
	public static void test3(){
		//�������϶���
		HashSet<Dog> hs=new HashSet<Dog>();
		
		// ����������
		Dog d1 = new Dog("����", 25, "��ɫ", '��');
		Dog d2 = new Dog("��ٴ", 22, "��ɫ", 'Ů');
		Dog d3 = new Dog("����", 25, "��ɫ", '��');
		Dog d4 = new Dog("����", 20, "��ɫ", 'Ů');
		Dog d5 = new Dog("κ����", 28, "��ɫ", '��');
		Dog d6 = new Dog("����Ӣ", 23, "��ɫ", 'Ů');
		Dog d7 = new Dog("����Ӣ", 23, "��ɫ", 'Ů');
		Dog d8 = new Dog("����Ӣ", 23, "��ɫ", '��');

		// ���Ԫ��
		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(d7);
		hs.add(d8);

		//����ǿfor��������
		for(Dog d:hs){
			System.out.println(d.getName() + "---" + d.getAge() + "---"
					+ d.getColor() + "---" + d.getSex());
		}
		
		/**
		 * ���������
		 * 	κ����---28---��ɫ---��
			����---20---��ɫ---Ů
			��ٴ---22---��ɫ---Ů
			����Ӣ---23---��ɫ---Ů
			����Ӣ---23---��ɫ---��
			����---25---��ɫ---��
		 */
		
		
	}
	
}
