package e_Test01.cn;
/*
成员内部类的修饰符：
private：为了保证数据的安全性
static：为了方便访问数据
注意：静态内部类访问外部类数据必须用静态修饰符 
*/
public class Outer {

	private static int num2=100;
	//内部类用静态修饰是因为内部类可以看成是外部类的成员
	public static class Inner{
		public void show3(){
			System.out.println(num2);
		}
		//内部类的静态方法
		public static void show4(){
			System.out.println(num2);
		}
	}
}
