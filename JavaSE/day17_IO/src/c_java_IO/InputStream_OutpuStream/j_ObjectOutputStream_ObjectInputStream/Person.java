package c_java_IO.InputStream_OutpuStream.j_ObjectOutputStream_ObjectInputStream;

import java.io.Serializable;

/*
 * NotSerializableException:δ���л��쳣
 * 
 * ��ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
 * �ýӿھ�Ȼû���κη���������������û�з����Ľӿڱ���Ϊ��ǽӿڡ�
 * 
 * java.io.InvalidClassException: 
 * cn.itcast_07.Person; local class incompatible: 
 * stream classdesc serialVersionUID = -2071565876962058344, 
 * local class serialVersionUID = -8345153069362641443
 * 
 * Ϊʲô����������?
 * 		Person��ʵ�������л��ӿڣ���ô������ҲӦ����һ�����ֵ��
 * 		������ֵ������100��
 * 		��ʼ��ʱ��
 * 		Person.class -- id=100
 * 		wirte���ݣ� oos.txt -- id=100
 * 		read����: oos.txt -- id=100	
 * 
 * 		���ڣ�
 * 		Person.class -- id=200
 * 		wirte���ݣ� oos.txt -- id=100
 * 		read����: oos.txt -- id=100
 * ������ʵ�ʿ����У����ܻ���Ҫʹ����ǰд�������ݣ���������д�롣��ô����?
 * ����һ��ԭ������Ϊ���ǵ�idֵ��ƥ�䡣
 * ÿ���޸�java�ļ������ݵ�ʱ��,class�ļ���idֵ���ᷢ���ı䡣
 * ����ȡ�ļ���ʱ�򣬻��class�ļ��е�idֵ����ƥ�䡣���ԣ��ͻ�����⡣
 * �����أ�������а취�������idֵ��java�ļ�����һ���̶���ֵ�����������޸��ļ���ʱ�����idֵ���ᷢ���ı���?
 * ���ᡣ���ڵĹؼ���������ܹ�֪�����idֵ��α�ʾ����?
 * ���õ��ģ��㲻�ü�ס��Ҳû��ϵ�������꼴�ɡ�
 * ���ѵ�û�п�����ɫ��������?
 * 
 * ����Ҫ֪�����ǣ�
 * 		������ʵ�������л��ӿڵ�ʱ��Ҫ������ɫ���������⣬�Ϳ����Զ�����һ�����л�idֵ��
 * 		���Ҳ������ֵ�Ժ����Ƕ�������κθĶ�������ȡ��ǰ��������û������ġ�
 * 
 * ע�⣺
 * 		��һ�����п����кܶ�ĳ�Ա��������Щ�Ҳ���������л������ʸ���ô����?
 * 		ʹ��transient�ؼ��ֻ���ʹ��static�ؼ�����������Ҫ���л��ĳ�Ա������
 * 		���������ؼ������εĳ�Ա������û��get/set�����ģ���Ϊ�����ǲ����ڶ���
 * 
 * 
 * 
 */
/**
 * ���ʵ�����л���
 * ���裺
 * 		1��Ҫʵ�����л��������ʵ�����л��ӿ� Serialize(����һ����ǽӿ�)  �ýӿ�λ��java.lang���У�
 * 		2��ʹ��һ�������������һ��ObjectOutputStream(������)����
 * 		3���ö����writeObject(Object object)�����Ϳ��Խ�obj����д��(��������״̬)
 * @author ��Ԫ
 *
 */
/**
 * ���л��������ص㣺
 * 	1�����һ�����ܱ����л�����ô��������Ҳ�ܹ��������л�
 *  2������static(��̬)������ĳ�Ա��transient(Java���Թؼ��֣������transient����һ��ʵ��������
 *  ������洢ʱ������ֵ����Ҫά�֡�)����������ʱ���ݣ�
 *  ��˱�static��transient�������ؼ������εĳ�Ա�ǲ��ᱻ���л���
 *  
 * @author ��Ԫ
 *
 */
public class Person implements Serializable {
	
	//�����ü��ϣ�ֱ�ӵ��Person����Ļ�ɫ�����߾ͻ��Զ�����
	private static final long serialVersionUID = 2158478794264414617L;

	private  String name;

	// private int age;
	
	private static double height;//����  ���뱻���л��ĳ�Ա����

	private transient int age;//���뱻���л��ĳ�Ա����

	// int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static double getHeight() {
		return height;
	}

	public static void setHeight(double height) {
		Person.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
}
