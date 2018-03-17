package a_Collection.gz.Set.Set_Son;

import java.util.HashSet;
import java.util.Set;

/**
 * Collection:
 * 		|--List:
 * 			����(�洢˳���ȡ��˳��һ��)�����ظ�
 * 		|--Set: 
 * 			����(�洢˳���ȡ��˳��һ��),Ψһ
 * 
 * 			
 * 			
 * 		  HashSet:������֤Set�ĵ���˳���ر���������֤��˳���ò��䣺
 * 
 * 		ע�⣺��ȻSet���ϵ�Ԫ�����򣬵��ǣ���Ϊ������˵�����϶������Լ��Ĵ洢˳��
 * 			�����˳���ɺϺ����Ĵ洢˳��һ�£����������������Զ�洢һЩ���ݣ����ܿ���Ч����
 * 
 * 
 * @author ��Ԫ
 *
 */
public class SetDemo {
	public static void main(String[] args) {
		//�������϶���
		Set<String> set=new HashSet<String>();
		
		//���������Ԫ��
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");
		set.add("hello");
		set.add("java");
		set.add("world");
		set.add("java");
		set.add("world");
		
		
		//����ǿfor����
		for(String s:set){
			System.out.println(s);
		}
		/**
		 * ���������
		 * 	hello
		 * 	java
		 *  world
		 */
		
	}
}
