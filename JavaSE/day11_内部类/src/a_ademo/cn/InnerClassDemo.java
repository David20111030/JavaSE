package a_ademo.cn;

public class InnerClassDemo {
public static void main(String[] args){
	//需求：我要访问Inner类的show（）方法
	//格式： 外部类名.内部类名  对象名=外部对象.内部对象;
	Outer.Inner oi=new Outer().new Inner();
	oi.show();//10
	
}
}
