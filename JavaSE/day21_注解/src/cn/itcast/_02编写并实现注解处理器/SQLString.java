package cn.itcast._02编写并实现注解处理器;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 *  一个注解处理器
 * @author 贤元
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
	int value() default 0;
	String name() default "";
	Constraints constraints() default @Constraints;
	/**
	 * constraints元素表示是注解Constraints的类型，且默认值为Constraints注解中的默认值
	 */
}
