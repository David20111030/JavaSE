package b_泛型方法;

public class ObjectTool {
	/**
	 * 泛型方法的定义格式：
	 * 		 public<泛型类型> 返回值类型 方法名(泛型类型)
	 * @param t
	 */
	public <T> void show(T t) {
		System.out.println(t);
	}
	
	
}
