package b_���ͷ���;

/*
 ���ͷ���:
 �ѷ��Ͷ����ڷ����ϣ�
 ��ʽ��
 public<��������> ����ֵ���� ������(��������)
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool obj = new ObjectTool();
		obj.show("hello");
		obj.show(123);

		message(12234);
		message("helloJavaee");
	}

	// ���ͷ���
	public static <T> void message(T t) {
		System.out.println(t);

	}
}