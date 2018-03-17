package a_Collection.gz.List.List_泛型.泛型方法;

/**
 * 泛型方法的测试
 * 
 * @author 贤元
 * 
 */
public class ObjectToolTest {
	public static void main(String[] args) {
		//定义泛型方法后
		ObjectTool ot=new ObjectTool();
		ot.show("hello");
		ot.show(100);
		ot.show(true);
		/**
		 * 打印结果：
		 * hello
		 * 100
		 * true
		 */
	}
}
