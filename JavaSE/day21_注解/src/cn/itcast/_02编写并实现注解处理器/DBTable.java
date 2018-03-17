package cn.itcast._02编写并实现注解处理器;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 一个注解处理器
 * @author 贤元
 *
 */

@Target(ElementType.TYPE) //表示该注解可以用于类、接口(包括注解类型)或enum声明
@Retention(RetentionPolicy.RUNTIME)//表示需要在什么级别保留注解
public @interface DBTable {
	public String name() default "";
}
