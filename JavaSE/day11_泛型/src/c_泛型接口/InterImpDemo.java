package c_���ͽӿ�;

public class InterImpDemo {

	public static void main(String[] args) {
		// ��һ������Ĳ���
		Inter<String> i=new InterImp1();
		i.show("hello");//hello--����ʵ������ʵ�ֽӿڵ�ʱ���Ѿ�֪����ʲô���͵���
		
		//�ڶ�������Ĳ���
		Inter<Integer> i2=new InterImp2<Integer>();
		i2.show(123);//123
	}

}


