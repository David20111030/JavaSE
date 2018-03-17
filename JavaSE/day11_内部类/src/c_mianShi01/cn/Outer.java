package c_mianShi01.cn;
//面试题：要求分别输出30，20，10
//注意： 注意：1、内部类和外部类没有继承关系    
//        2、通过外部类名限定this对象
//         outer.this
public class Outer {
	public int num=10;
	class Inner{
		public int num=20;
		public void show(){
			int num=30;
			System.out.println(num);//30  就近原则
			System.out.println(this.num);//20
			System.out.println(Outer.this.num);//10
			System.out.println(new Outer().num);//10
		}
	}

}
