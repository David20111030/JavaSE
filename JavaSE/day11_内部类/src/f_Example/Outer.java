package f_Example;

public class Outer {
public void method(){
	//匿名内部类中只有一个方法的时候
	new Inter(){
		public void show(){
			System.out.println("show");
		}
	}.show();
	
}
}




