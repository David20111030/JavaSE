package cn.itcast._02��д��ʵ��ע�⴦����;
/**
 *  һ��ע�⴦����
 * @author ��Ԫ
 *
 */
public @interface SQLInteger {
	String name() default "";
	Constraints constraints() default @Constraints;
}
