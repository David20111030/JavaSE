package i_匿名内部类面试题;

public class OuterDemo {

	public static void main(String[] args){
		Outer.method().show();
		
		
		
		//要求输出helloworld 
		
		/*
		 * outer.method() 可以看出method是outer中的一个静态方法
		 * Outer.method().show();可以看出method方法的返回值是一个对象
		 * 又由于接口Inter中有一个show方法，所以method法国法的返回值类型是一个接口
		 * 
		 */
		
	}
}
