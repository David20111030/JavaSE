package f_Example;

public class Outer {
public void method(){
	//�����ڲ�����ֻ��һ��������ʱ��
	new Inter(){
		public void show(){
			System.out.println("show");
		}
	}.show();
	
}
}




