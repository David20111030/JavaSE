package c_泛型接口;

/**
 *  实现类在实现接口的时候的第二种情况;
 	还不知道是什么类型的时候
 * @author 贤元
 * @param <T>
 */
public class InterImp2<T> implements Inter<T> {
	@Override
	public void show(T t) {
		System.out.println(t);
	}
}
