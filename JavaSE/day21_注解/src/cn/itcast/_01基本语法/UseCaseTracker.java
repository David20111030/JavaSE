package cn.itcast._01�����﷨;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ���Ǳ�д��ע�⴦����
 * @author ��Ԫ
 *
 */
public class UseCaseTracker {
	
	public static void trackUserCase(List<Integer> useCases,Class<?> c1){
		/**
		 * getDeclaredMethods()���� Method �����һ�����飬
		 * 		��Щ����ӳ�� Class �����ʾ�����ӿ����������з���������������������Ĭ�ϣ��������ʺ�˽�з��������������̳еķ�����
		 */
		for(Method m:c1.getDeclaredMethods()){
			UseCase uc = m.getAnnotation(UseCase.class);//������ڸ�Ԫ�ص�ָ�����͵�ע�⣬�򷵻���Щע�⣬���򷵻� null��
			if(uc != null){
				System.out.println("Found Use Case:"+ uc.id()+" "+uc.description());
				/**
				 * ��List�����еĶ�Ӧ��Ԫ���Ƴ�������Ϊ�������forѭ���ܴ�ӡ���������еĵ���PasswordUtils��ע����û�е�idֵ
				 */
				useCases.remove(new Integer(uc.id()));
			}
		}
		
		for(int i:useCases){
			System.out.println("Warnging: Missing use case-"+i);
		}
	}
	
	public static void main(String[] args){
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47,48,49,50);//������ָ��Ԫ����ӵ�ָ�� List���� �С�
		trackUserCase(useCases, PasswordUtils.class);
	}
	
/**
 * 	��ӡ�����
 	Found Use Case:47 Passwords must contain at least one numeric
	Found Use Case:49 New passwords can't equal previously used ones
	Found Use Case:48 no description
	Warnging: Missing use case-50
		
 */
}