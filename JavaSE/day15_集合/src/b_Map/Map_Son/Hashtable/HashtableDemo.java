package b_Map.Map_Son.Hashtable;
import java.util.Hashtable;
/**
 * 1��Hashtable��HashMap������?
 * Hashtable:�̰߳�ȫ��Ч�ʵ͡�������null����nullֵ��
 * HashMap:�̲߳���ȫ��Ч�ʸߡ�����null����nullֵ��
 * 
 * 2��List��Set��Map�Ƚӿ��Ƿ񶼼̳���Map�ӿڣ�
 * 		List,Set���Ǽ̳���Map�ӿڣ����Ǽ̳��Ե��м��ϵĶ���ӿ�Collection�ӿڡ�Map�ӿڱ������һ������ӿڡ�
 * 
 * @author ��Ԫ
 *
 */
public class HashtableDemo {
	public static void main(String[] args) {
		//HashtableҲʵ����˫�м��ϵĶ���ӿڣ�Map�ӿ�
		Hashtable<String,String> hm=new Hashtable<String,String>();
		
		hm.put("it001", "hello");
		//hm.put(null, "world");//NullPointerException
		//hm.put("java", null);//NullPointerException
		
		System.out.println("hm:"+hm);//��ӡ�����hm:{it001=hello}
	}
}
