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
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
	int value() default 0;
	String name() default "";
	Constraints constraints() default @Constraints;
	/**
	 * constraintsԪ�ر�ʾ��ע��Constraints�����ͣ���Ĭ��ֵΪConstraintsע���е�Ĭ��ֵ
	 */
}
