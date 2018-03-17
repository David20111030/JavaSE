package a_Collection.gz.List.List_泛型.泛型方法;
/**
 * 泛型方法：把泛型定义在方法上
 * @author 贤元
 *
 */
public class ObjectTool {
	//<T>：可以理解为泛型声明
	public <T> void show(T t){
		System.out.println(t);
	}
}
