package g_���췽��;
/*
	����һֱ��ʹ�ù��췽�������ǣ�����ȷû�ж��幹�췽�����õ�������������?
	
	���췽����ע������:
		A:�������û�и������췽����ϵͳ���Զ��ṩһ���޲ι��췽����
		B:������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽����
			ע�⣺���ʱ��������ǻ���ʹ���޲ι��췽�����ͱ����Լ�������������Զ�Լ������޲ι��췽��
		
	����Ա������ֵ�����ַ�ʽ��
		A:setXxx()
		B:���췽��
*/

class Student1 {
	private String name;
	private int age;

	public Student1() {
		//System.out.println("�Ҹ��ˣ��㻹����");
		System.out.println("�����޲ι��췽��");
	}
	
	//���췽�������ظ�ʽ
	public Student1(String name) {
		System.out.println("���Ǵ�һ��String���͵Ĺ��췽��");
		this.name = name;
	}
	
	public Student1(int age) {
		System.out.println("���Ǵ�һ��int���͵Ĺ��췽��");
		this.age = age;
	}
	
	public Student1(String name,int age) {
		System.out.println("����һ������������Ĺ��췽��");
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+"---"+age);
	}
}

class ConstructDemo2 {
	public static void main(String[] args) {
		//��������
		Student1 s = new Student1();
		s.show();
		System.out.println("-------------");
		
		//��������2
		Student1 s2 = new Student1("����ϼ");
		s2.show();
		System.out.println("-------------");
		
		//��������3
		Student1 s3 = new Student1(27);
		s3.show();
		System.out.println("-------------");
		
		//��������4
		Student1 s4 = new Student1("����ϼ",27);
		s4.show();
	}
}