package a_Collection.gz.List.List_����.������;

/**
 * ������Ĳ���
 * 
 * @author ��Ԫ
 * 
 */
public class ObjectToolTest {

	public static void main(String[] args) {
		ObjectTool<String> ot=new ObjectTool<String>();
		//ot.setObj(new Integer(27));//���ʱ������ھ͹���ȥ
		ot.setObj("����ϼ");
		String s=ot.getObj();
		System.out.println("�����ǣ�"+s);//�����ǣ�����ϼ
		
		ObjectTool<Integer> ot2=new ObjectTool<Integer>();
		//ot2.setObj(new String("������"));//���ʱ������ھ͹���ȥ
		ot2.setObj(new Integer(27));
		Integer i=ot2.getObj();
		System.out.println("�����ǣ�"+i);//������27
		
	}
}
