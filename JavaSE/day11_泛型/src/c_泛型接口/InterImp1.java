package c_泛型接口;
/*
实现类在实现接口的时候：
   第一种情况，已经知道是什么类型的了*/
public class InterImp1 implements Inter<String>{

	@Override
	public void show(String t) {
		System.out.println(t+"--"+"我是实现类在实现接口的时候，已经知道是什么类型的了");
	}
  
   
}


