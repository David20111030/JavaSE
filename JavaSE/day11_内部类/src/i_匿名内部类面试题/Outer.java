package i_匿名内部类面试题;

public class Outer {

	//补齐代码
	public static Inter method(){
		//子类对象  ---子类匿名对象
		return new Inter(){
				public void show(){
					System.out.println("hello world");
				}
			};
	
		
	}
}
