package e_Test01.cn;

public class InnerClassDemo {
public static void main(String[] args){
	//��Ա�ڲ��౻��̬���κ�ķ��ʷ�ʽ�ǣ�
	//��ʽ���ⲿ����.�ڲ����� ������=new �ⲿ����.�ڲ�����();
	Outer.Inner oi=new Outer.Inner();
	oi.show3();//100
	oi.show4();//100
	//show4()������һ�ֵ��÷�ʽ
	new Outer.Inner().show4();//100
}
}