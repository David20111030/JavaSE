package cn.itcast._02编写并实现注解处理器;
/**
 *  一个注解处理器
 * @author 贤元
 *
 */
public @interface Uniquencess {
	Constraints constraints() default @Constraints(unique=true);
}
