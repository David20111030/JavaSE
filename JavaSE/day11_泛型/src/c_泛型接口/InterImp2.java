package c_���ͽӿ�;

/**
 *  ʵ������ʵ�ֽӿڵ�ʱ��ĵڶ������;
 	����֪����ʲô���͵�ʱ��
 * @author ��Ԫ
 * @param <T>
 */
public class InterImp2<T> implements Inter<T> {
	@Override
	public void show(T t) {
		System.out.println(t);
	}
}
