package cn.itcast._02��д��ʵ��ע�⴦����;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 *  һ��ע�⴦����
 * @author ��Ԫ
 *
 */
@Target(ElementType.FIELD)  //��ʾ�����ڳ�Ա������  Ҳ�����ֶ���
@Retention(RetentionPolicy.RUNTIME)  //��ʾJVM������ʱҲ�����ע�⣬��˿���ͨ��������ƻ�ȡ��ע������Ϣ
public @interface Constraints {
	//����ע���Ԫ��,������Ĭ��ֵ
	boolean primaryKey() default false;
	boolean allowNull() default true;
	boolean unique() default false;
}
