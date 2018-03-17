package e_Test01.cn;

public class InnerClassDemo {
public static void main(String[] args){
	//成员内部类被静态修饰后的访问方式是：
	//格式：外部类名.内部类名 对象名=new 外部类名.内部类名();
	Outer.Inner oi=new Outer.Inner();
	oi.show3();//100
	oi.show4();//100
	//show4()的另外一种调用方式
	new Outer.Inner().show4();//100
}
}