package cn.itcast._01�����﷨;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 javaĿǰֻ���������ֱ�׼ע�⣺
  	@Override  ��ʾ��ǰ�ķ������彫���ǳ����еķ�����
  	@Deprecated �������Աʹ����ע��Ϊ����Ԫ�أ���ô�������ᷢ��������Ϣ
  	@SuppressWarnings �رղ����ı�����������Ϣ��
 
 java�������ṩ������ע�⣬ר�Ÿ�����ע��Ĵ�����
 	@Target  ��ʾ��ע���������ʲô�ط������ܵ�ElementType����������
 				CONSTRUCTOR ������������
 				FIELD �� ������(����enumʾ��)(ȫ�ֱ������ֶλ�����)
 				LOCAL_VARIABLE:�ֲ���������
 				METHOD :��������
 				PACKAGE��������
 				PARAMETER :��������
 				TYPE ���ࡢ�ӿ�(����ע������)��enum����
 				
 	@Retention  ��ʾ��Ҫ��ʲô���𱣴��ע����Ϣ����ѡ��RetentionPlicy����������
 					SOURCE�� ע�⽫������������
 					CLASS ��ע����class�ļ��п��ã����ᱻJVM������
 					RUNTIME�� JVM����������Ҳ����ע�⣬��˿���ͨ��������ƶ�ȡע�����Ϣ
 					
 	@Documented  ����ע�������javadoc��
 	
 	@Inherited  ��������̳и����е�ע��
 */	

/**
 * ����һ��ע��
 * @author ��Ԫ
 *
 */
//ע�⣺û��Ԫ�ص�ע���Ϊ"���ע��(marker annotation)"

@Target(ElementType.METHOD)  //��ʾע�⽫Ӧ���ڷ�����
@Retention(RetentionPolicy.RUNTIME) //��ʾ��Ҫ��ʲô���𱣴��ע����Ϣ
public @interface UseCase {
	public int id();//����ע���Ԫ��
	public String description() default "no description";//����ע���Ԫ��   ��Ϊ��Ԫ���ṩĬ��ֵ
}

/**
 ע��Ԫ�ؿ��õ�����������ʾ��
 	A�����л�������(int,float,boolean��)
 	B��String
 	C:enum
 	D:Annotation
 	E:�������͵�����
 	�����ʹ�����������ͣ��Ǳ����ھͻᱨ��ע�⣬Ҳ������ʹ���κΰ�װ���ͣ����������Զ�����Ĵ��ڣ����㲻��ʲô���ơ�
 	ע�������Ϊע���е�Ԫ�ص����ͣ�Ҳ����˵ע�����Ƕ�ס�
 */