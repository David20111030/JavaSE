package d_泛型类;

/*  
 早期的时候，我们使用object来代表任意的类型
 向上转型是没有任何问题的，但是在向下转型的时候其实隐含了类型转换的问题
 也就是说这样的程序其实是并不安全的，所以Java在JDK5后引入了泛型，提高程序的安全性

 泛型类:把泛型定义在类上
 格式： public class 类名<泛型类型1,...>

 泛型类:
 把泛型定义在类上
 格式：public class 类名<泛型类型1，...> //注意：此类型必须是引用类型
 注意:泛型必须是引用类型

 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool<Integer> ot = new ObjectTool<Integer>();
		ot.setObj(new Integer(27));
		// ot.setObj(new String("dsf"));//这个时候编译期就过不去

		int s = ot.getObj();
		System.out.println(s);// 27
		System.out.println("--------------------------");
		// ---------------------------------------------------------------
		ObjectTool<String> os = new ObjectTool<String>();
		os.setObj(new String("林青霞"));
		String s1 = os.getObj();
		System.out.println(s1);//林青霞
		os.setObj("李贤元");
		String s2 = os.getObj();
		System.out.println(s2);//李贤元
	}
}