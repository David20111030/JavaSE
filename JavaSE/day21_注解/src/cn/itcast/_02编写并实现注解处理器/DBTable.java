package cn.itcast._02��д��ʵ��ע�⴦����;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * һ��ע�⴦����
 * @author ��Ԫ
 *
 */

@Target(ElementType.TYPE) //��ʾ��ע����������ࡢ�ӿ�(����ע������)��enum����
@Retention(RetentionPolicy.RUNTIME)//��ʾ��Ҫ��ʲô������ע��
public @interface DBTable {
	public String name() default "";
}
