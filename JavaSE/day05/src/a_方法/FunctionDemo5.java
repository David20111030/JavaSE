package a_方法;

//方法的重载问题
class Test {
	//与返回值相不相同无关
	
	//无参方法
	public void Test(){}
	
	//有参方法的重载
	public void Tset(int i){}
	
	//参数类型不同的重载
	public int Test(String i){return 0;}
	
	//会报错,返回值不同不能重载
	//public String Test(String i){return "0";}
	
	//参数数量不同的重载
	public void Test(String i,int j){}
	
	//报错，方法的重载与访问修饰符无关
	//private void Test(String i,int j){}
	
	//参数顺序不同的重载
	public void Test(int j,String i){}
}

public class FunctionDemo5 {

}
