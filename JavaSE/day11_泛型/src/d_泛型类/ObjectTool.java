package d_泛型类;
/**
 * 泛型类：
 * 	 格式： public class 类名<泛型类型1,...> //注意：此类型必须是引用类型
 * @author 贤元
 *
 * @param <T>
 */
public class ObjectTool<T>{
	private T obj;//私有的
	public T getObj(){
		return this.obj;
	}
	
	public void setObj(T obj){
		this.obj=obj;
	}
	
}
