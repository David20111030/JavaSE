package a_FanXing;

import java.util.ArrayList;
import java.util.Iterator;
 /*  ���ͣ�����һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ����������͡�
      	���������ͣ������͵�������һ���Ĵ���
      	
     ��ʽ��
      <��������>
    �˴�����������ֻ������������
    
    �ô���
    A:������ʱ�ڵ�������ǰ���˱����ڼ�
    B:������ǿ��ת������
    C:�Ż��˳�����ƣ�����˻�ɫ������
    
  ��������Щ�ط�ʹ���أ�
     ��API,����ࡢ�ӿڡ���������������<E>��Ҫʹ�÷��͡�һ����˵�����ڼ�����ʹ��
     
     
     
     */
    	
public class Demo01 {
public static void main(String[] args) {
	//��ArrayList�洢�ַ���Ԫ�أ����������÷��͸Ľ�
	ArrayList<String> array=new ArrayList<String>();
	array.add("hello");
	array.add("world");
	array.add("java");
	//����
	Iterator<String> it=array.iterator();
	while(it.hasNext()){
		String s=it.next();
		System.out.println(s);
	}
//--------------------------------------------------
	System.out.println("---------------------------------");
	
	//��forѭ������
	for(int x=0;x<array.size();x++){
		String s1=array.get(x);
		System.out.println(s1);
	}
	
	
	
	
}
}
