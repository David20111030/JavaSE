package d_������;

/*  
 ���ڵ�ʱ������ʹ��object���������������
 ����ת����û���κ�����ģ�����������ת�͵�ʱ����ʵ����������ת��������
 Ҳ����˵�����ĳ�����ʵ�ǲ�����ȫ�ģ�����Java��JDK5�������˷��ͣ���߳���İ�ȫ��

 ������:�ѷ��Ͷ���������
 ��ʽ�� public class ����<��������1,...>

 ������:
 �ѷ��Ͷ���������
 ��ʽ��public class ����<��������1��...> //ע�⣺�����ͱ�������������
 ע��:���ͱ�������������

 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool<Integer> ot = new ObjectTool<Integer>();
		ot.setObj(new Integer(27));
		// ot.setObj(new String("dsf"));//���ʱ������ھ͹���ȥ

		int s = ot.getObj();
		System.out.println(s);// 27
		System.out.println("--------------------------");
		// ---------------------------------------------------------------
		ObjectTool<String> os = new ObjectTool<String>();
		os.setObj(new String("����ϼ"));
		String s1 = os.getObj();
		System.out.println(s1);//����ϼ
		os.setObj("����Ԫ");
		String s2 = os.getObj();
		System.out.println(s2);//����Ԫ
	}
}