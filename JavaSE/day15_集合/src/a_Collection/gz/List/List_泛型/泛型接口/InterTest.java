package a_Collection.gz.List.List_泛型.泛型接口;

/**
 * 测试类
 * 
 * @author 贤元
 * 
 */
public class InterTest {

	public static void main(String[] args) {
		//第一种情况的测试
		//Inter<String> i=new InterImpl();
		//i.show("hello");//hello
		
		
		//第二种情况的测试
		Inter<String> ii=new InterImpl<String>();
		ii.show("hello");//hello
		
		Inter<Integer> iii=new InterImpl<Integer>();
		iii.show(100);//100
		
	}
}
