package b_泛型方法;

/*
 泛型方法:
 把泛型定义在方法上：
 格式：
 public<泛型类型> 返回值类型 方法名(泛型类型)
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool obj = new ObjectTool();
		obj.show("hello");
		obj.show(123);

		message(12234);
		message("helloJavaee");
	}

	// 泛型方法
	public static <T> void message(T t) {
		System.out.println(t);

	}
}