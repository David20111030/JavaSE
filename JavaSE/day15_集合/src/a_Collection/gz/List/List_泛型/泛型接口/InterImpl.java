package a_Collection.gz.List.List_泛型.泛型接口;

//实现类在实现接口的时候：

//第一种情况：已经知道该是什么类型的了
//public class InterImpl implements Inter<String>{
//
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//}

//第二种情况:还不知道是什么类型的时候. 把实现类也定义为泛型，全部都用泛型
public class InterImpl<T> implements Inter<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}
}
