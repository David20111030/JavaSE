package g_Example01.cn;

public class Outer {
public void method(){
	//匿名内部类中有多个方法的时候
	Inter i=new Inter(){
		public void show(){
			System.out.println("show");
		}
		public void show2(){
			System.out.println("show2");
		}
	};
	i.show();
	i.show2();
	
}
	
}


