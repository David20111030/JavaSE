package a_ademo.cn;

public class InnerClassDemo {
public static void main(String[] args){
	//������Ҫ����Inner���show��������
	//��ʽ�� �ⲿ����.�ڲ�����  ������=�ⲿ����.�ڲ�����;
	Outer.Inner oi=new Outer().new Inner();
	oi.show();//10
	
}
}
