package cn.itcast._02��д��ʵ��ע�⴦����;
/**
 *  һ��ע�⴦����
 * @author ��Ԫ
 *
 */
public @interface Uniquencess {
	Constraints constraints() default @Constraints(unique=true);
}
