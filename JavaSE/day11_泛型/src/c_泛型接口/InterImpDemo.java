package c_泛型接口;

public class InterImpDemo {

	public static void main(String[] args) {
		// 第一种情况的测试
		Inter<String> i=new InterImp1();
		i.show("hello");//hello--我是实现类在实现接口的时候，已经知道是什么类型的了
		
		//第二种情况的测试
		Inter<Integer> i2=new InterImp2<Integer>();
		i2.show(123);//123
	}

}


