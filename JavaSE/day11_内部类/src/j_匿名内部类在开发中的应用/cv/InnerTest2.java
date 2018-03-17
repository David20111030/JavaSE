package j_匿名内部类在开发中的应用.cv;

public class InnerTest2 {
public static void main(String[] args){
	//测试
	PersonDemo pd=new PersonDemo();
	Person p=new Student();
	pd.method(p);
	System.out.print("-----------------");

	//匿名内部类在开发中的使用
	//匿名内部类的本质是继承个或者实现了接口的子类匿名对象
	//匿名内部类
/*	格式：
	  new 类名或者接口名(){
	  重写方法；
	  };
	  
	  */
     pd.method(new Person(){
		public void study(){
			System.out.println("好好学习天天向上");
		}
	});

}
}
