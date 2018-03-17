package a_Collection.gz.List.List_泛型.泛型类;

/**
 * 泛型类的测试
 * 
 * @author 贤元
 * 
 */
public class ObjectToolTest {

	public static void main(String[] args) {
		ObjectTool<String> ot=new ObjectTool<String>();
		//ot.setObj(new Integer(27));//这个时候编译期就过不去
		ot.setObj("林青霞");
		String s=ot.getObj();
		System.out.println("姓名是："+s);//姓名是：林青霞
		
		ObjectTool<Integer> ot2=new ObjectTool<Integer>();
		//ot2.setObj(new String("风清扬"));//这个时候编译期就过不去
		ot2.setObj(new Integer(27));
		Integer i=ot2.getObj();
		System.out.println("年龄是："+i);//年龄是27
		
	}
}
