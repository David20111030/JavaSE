package a_Collection.gz.List.List_泛型.泛型类;
/**
 * 泛型类：把泛型定义在类上
 * @author 贤元
 *
 * @param <T>
 */
public class ObjectTool<T> {
	private T obj;
	
	public T getObj(){
		return this.obj;
	}
	
	public void setObj(T obj){
		this.obj=obj;
	}
	
}
