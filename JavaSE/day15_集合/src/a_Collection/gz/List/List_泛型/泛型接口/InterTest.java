package a_Collection.gz.List.List_����.���ͽӿ�;

/**
 * ������
 * 
 * @author ��Ԫ
 * 
 */
public class InterTest {

	public static void main(String[] args) {
		//��һ������Ĳ���
		//Inter<String> i=new InterImpl();
		//i.show("hello");//hello
		
		
		//�ڶ�������Ĳ���
		Inter<String> ii=new InterImpl<String>();
		ii.show("hello");//hello
		
		Inter<Integer> iii=new InterImpl<Integer>();
		iii.show(100);//100
		
	}
}
