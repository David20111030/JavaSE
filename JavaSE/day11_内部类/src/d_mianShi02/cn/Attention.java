package d_mianShi02.cn;

public class Attention {

	/*
	 * 局部内部类：
	A：可以直接访问外部类的成员
	B：在局部位置，可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能    
	
	
	局部内部类访问局部变量的注意事项：
	A：局部内部类访问局部变量必须用final修饰
	B：为什么呢？
	  局部变量是随着方法的调用而调用，随着方法的完毕而小时
	   而队内粗你的内同并不会消失，所以我们加final修饰
	   加入final修饰后，这个变啊另就成了常量，既然是常量，你消失了，我在内存中存储的数据是20，
	   所以，我还是有数据使用的
	
	
	*/
	public static void main(String[] args){
	    final  int num1=10;
	    //错误:因为局部内部类访问局部变量必须用final修饰
	    //int num1=10;
		class Inner{
			int num2=20;
			public void show(){
				System.out.println(num1);
				System.out.println(num2);
			}
		}
		//创建局部内部类对象  用来使用局部内部类功能
		new Inner().show();//10 20
		
	}
}
