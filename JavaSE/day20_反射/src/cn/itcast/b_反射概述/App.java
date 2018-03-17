package cn.itcast.b_�������;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * ע�⣺���췽�����ǳ�Ա����Ŷ��������
 * @author ��Ԫ
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		//ͨ�������ȡ���췽����ʹ��
		reflect_Constructor();
		
		//ͨ�������ȡ��Ա������ʹ��
		//reflect_Field();
		
		//ͨ�������ȡ��Ա������ʹ��
		//reflect_Method();
		
		
	}

	/**
	 * ͨ�������ȡ���췽����ʹ��
	 */
	public static void reflect_Constructor() throws Exception {
		//���Ȼ�ȡ�ֽ����ļ�����   Ҳ���ǻ�ȡClass����
		//Class clazz = Person.class;
		//Class clazz = new Person().getClass();
		//��Ŀ�������Ƽ�ʹ�����ַ�ʽ
		Class clazz = Class.forName("cn.itcast.b_�������.Person");
		
		//��ȡ���й��췽��
		//public Constructor[] getConstructors();//��ȡ���й����Ĺ��췽��
		/**
		 * public Constructor[] getDeclaredConstructors();
		 * 	//��ȡ�����Ĺ��췽����Ҳ���ǻ�ȡ���еĹ��췽�����������еĺ�˽�м�Ĭ�ϰ�����(Ҳ���ǲ�д���η�)��
		 */
		Constructor[] cons =  clazz.getConstructors();//��ȡ�����Ĺ��췽��
		for(Constructor con : cons){
			System.out.println(con);
		}
		/**
		 * public cn.itcast.b_�������.Person(java.lang.String,int,java.lang.String)
		   public cn.itcast.b_�������.Person()
		 */
		
		System.out.println("=============");
		Constructor[] cons2 =  clazz.getDeclaredConstructors();//��ȡ���еĹ��췽��
		for(Constructor con : cons2){
			System.out.println(con);
		}
		/**
		 * public cn.itcast.b_�������.Person(java.lang.String,int,java.lang.String)
			cn.itcast.b_�������.Person(java.lang.String,int)
			public cn.itcast.b_�������.Person()
			private cn.itcast.b_�������.Person(java.lang.String)
		 */
		
		System.out.println("==================");
		
		//��ȡ�������췽��
		/**
		 * public Constructor<T> getConstructor(Class<?>... paramenterTypes);
		 * //��ȡһ�����еĹ��췽��������һ�� Constructor ����,����ӳ�� Class ��������ʾ�����ָ���������췽����
		 */
		/**
		 * public Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes);
		 * 			//��ȡһ���Ѿ������Ĺ��췽�������С�˽�еĹ��췽�������Ի�ȡ����
		 */
		//������ʾ���ǣ���Ҫ��ȡ�Ĺ��췽���Ĺ�������������������͵�Class�ֽ����ļ�����
		Constructor cons3 = clazz.getConstructor();//��ȡ���е��޲ι��췽��
		System.out.println(cons3);//public cn.itcast.b_�������.Person()
		
		System.out.println("========");
		
		//��ȡһ��˽�еĴ���String���Ͳ������вι��캯��
		Constructor cons4 = clazz.getDeclaredConstructor(String.class);//��ȡһ��˽�еĴ���String���Ͳ������вι��캯��
		System.out.println(cons4);//private cn.itcast.b_�������.Person(java.lang.String)
		
		System.out.println("=========");
		
		/**
		 * public T newInstance();
		 * 	 ����Class���еķ����������� Class ��������ʾ�����һ����ʵ����Ҳ���Ǵ�����clazz�����ʾ����Ķ���Ҳ���Ǵ���Person����
		 */
		Person p = (Person) clazz.newInstance();
		System.out.println(p);//Person [name=null, age=0, address=null]
		p.show();//show
		
		System.out.println("====================");
		
		//===============================================**********
		//ͨ�������ȡ���еĴ��ι��췽����ʹ��
		Class c = Class.forName("cn.itcast.b_�������.Person");
		//��ȡ���ι��췽������
		Constructor con = c.getConstructor(String.class,int.class,String.class);//ͨ��Class�����ȡ���͹��췽������
		//ͨ�����ι��췽����������
		/**
		 * public T newInstance(Object... initargs);
		 * 		ʹ�ô� Constructor �����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ��
		 */
		Object obj = con.newInstance("����Ԫ",950,"����");
		System.out.println(obj);//Person [name=����Ԫ, age=950, address=����]
		
		
		System.out.println("===============");
		//==================================================**********
		//ͨ�������ȡ˽�й��췽����ʹ��
		Class c2 = Class.forName("cn.itcast.b_�������.Person");
		//��ȡ˽�еĴ��ι��췽����ʹ��
		Constructor con2 = c2.getDeclaredConstructor(String.class);
		//ע�⣺��ȡ˽�еĴ��ι��칹�췽����ʹ�õ�ʱ�򣬻ᷢ���Ƿ������쳣����ν���أ������������ʾ����ˡ�
		
		System.out.println(con2);//private cn.itcast.b_�������.Person(java.lang.String)
		
		//��������  ������������
		con2.setAccessible(true);//ֵΪtrue��ֻ�Ƿ���Ķ�����ʹ��ʱӦ��ȡ��Java�����ʼ��
		Object obj2 = con2.newInstance("����Ԫ");//���newInstance����������Constructor������
		System.out.println(obj2);//Person [name=����Ԫ, age=0, address=null]  
		//��ӡһ����Ķ����൱�ڵ��ø����toString����
	}
	
	



	/**
	 * ͨ�������ȡ��Ա������ʹ��
	 */
	public static void reflect_Field() throws Exception {
		//��ȡ�ֽ����ļ�����
		Class clazz = Class.forName("cn.itcast.b_�������.Person");
		
		//��ȡ���еĳ�Ա����
		//public Field[] getFields();//ֻ�ܻ�ȡ���еĹ��еĳ�Ա����
		/**
		 * public Field[] getDeclaredFields();
		 * 	//��ȡ���е��Ѿ������ĳ�Ա������Ҳ���ǰ������к�˽�еĳ�Ա������Ҳ�������г�Ա���������ܹ��л���˽��
		 */

		//��ȡ���еĳ�Ա����
		Field[] fields = clazz.getDeclaredFields();
		for(Field field:fields){
			System.out.println(field);
		}
		/**
		 * private java.lang.String cn.itcast.b_�������.Person.name
			private int cn.itcast.b_�������.Person.age
			public java.lang.String cn.itcast.b_�������.Person.address
		 */
		
		System.out.println("=============");
		
		//=====================
		//ͨ���޲ι��췽����������
		Constructor con = clazz.getConstructor();
		Object obj = con.newInstance();
		
		//��ȡ�����ĳ�Ա����
		/**
		 * public Field getField(String name); 
		 * 		����һ�� Field ��������ӳ�� Class ��������ʾ�����ӿڵ�ָ��������Ա�ֶΡ��������ֻ�ܻ�ȡ�����ĳ�Ա����
		 */
		/**
		 * public Field getDeclaredField(String name);
		 * 		����������Ի�ȡ���л���˽�еĳ�Ա������,����һ�� Field ���󣬸ö���ӳ�� Class ��������ʾ�����ӿڵ�ָ���������ֶΡ�
		 */
		//��ȡ˽�г�Ա����name,��Ϊ�丳ֵ
		Field nameField = clazz.getDeclaredField("name");
		//public void set(Object obj,Object value); ��ָ����������ϴ� Field �����ʾ���ֶ�����Ϊָ������ֵ��
		//��Ϊ��Ա����name��˽�еģ�����Ҫ������������
		nameField.setAccessible(true);
		nameField.set(obj, "����Ԫ");
		
		System.out.println(obj);//Person [name=����Ԫ, age=0, address=null]
	}

	
	
	


	/**
	 * ͨ�������ȡ��Ա������ʹ��
	 * @throws Exception
	 */
	public static void reflect_Method() throws Exception {
		//��ȡClass�ֽ����ļ�����
		Class clazz = Class.forName("cn.itcast.b_�������.Person");
		
		//��ȡ���еķ���
		//public Method[] getMethods();//��ȡ���еĹ��еĳ�Ա����
		/**
		 * public Field[] getDeclaredFields();
		 * 		��ȡ�Ѿ������ĳ�Ա������Ҳ���ǻ�ȡ���еĳ�Ա���������ܹ��л���˽�еĳ�Ա���������Ի�ȡ����
		 */
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods){
			System.out.println(method);
		}
		/**
			public java.lang.String cn.itcast.b_�������.Person.toString()
			public java.lang.String cn.itcast.b_�������.Person.getString(java.lang.String,int)
			private void cn.itcast.b_�������.Person.appShow(java.lang.String)
			private void cn.itcast.b_�������.Person.function()
			public void cn.itcast.b_�������.Person.method(java.lang.String)
			public void cn.itcast.b_�������.Person.show()		 
		 */
		
		System.out.println("===========");
		//����һ������
		Person p = (Person)clazz.newInstance();
		//==================================
		//��ȡ������Ա����
		/**
		 * public Method getMethod(String name,Class<?>... parameterTypes);
		 * 			��ȡ�������еĳ�Ա������ֻ�ܻ�ȡ���еĳ�Ա����
		 */
		/**
		 * public Method getDeclaredMethod(String name,Class<?>... parameterTypes);
		 * 			��ȡ�Ѿ������ĵ�����Ա���������еĺ�˽�еĳ�Ա���������Ի�ȡ����
		 */
		//��һ��������ʾ�ķ��������ڶ���������ʾ���Ƿ����Ĳ�����class����
		
		//��ȡ����˽�еĲ��Ҵ������ĳ�Ա����appShow(String name)��ʹ��
		Method appshowMethod = clazz.getDeclaredMethod("appShow", String.class);
		//public Object invoke(Object obj,Object... args);
		//����ֵ��Object���գ���һ��������ʾ������˭���ڶ���������ʾ���ø÷�����ʵ�ʲ���
		/**
		 * ������
				obj - ���е��õײ㷽���Ķ���
				args - ���ڷ������õĲ��� 
				���أ�
				ʹ�ò��� args �� obj ��ָ�ɸö�������ʾ�����Ľ�� 
		 */
		//ע�⣺��Ϊʹ�õ���˽�еĳ�Ա����������Ҫ�����������ʡ�����ᷢ��IllegalAccessException�Ƿ������쳣
		appshowMethod.setAccessible(true);
		appshowMethod.invoke(p, "����Ԫ");//appShow����:����Ԫ
	}
	
}