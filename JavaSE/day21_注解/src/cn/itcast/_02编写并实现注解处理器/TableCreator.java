package cn.itcast._02编写并实现注解处理器;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


/**
 * 实现注解处理器 测试类
 * 
 * @author 贤元
 * 
 */
public class TableCreator {
	public static void main(String[] args) throws Exception{
		Class memberClazz = Class.forName("cn.itcast._02编写并实现注解处理器.Member");
		
		//获取类中的注解
		DBTable dbtable = (DBTable) memberClazz.getAnnotation(DBTable.class);
		System.out.println("数据库中的表名为："+dbtable.name());//MEMBER
		
		System.out.println("=========");
		
		//获取该Menber类中的字段
		Field firstName = memberClazz.getDeclaredField("firstName");
		Field lastName = memberClazz.getDeclaredField("lastName");
		Field age = memberClazz.getDeclaredField("age");
		Field handle = memberClazz.getDeclaredField("handle");
		
		//获取firstName字段上对应的注解的值
		SQLString firstNameSQLString = firstName.getAnnotation(SQLString.class);
		System.out.println(firstNameSQLString.value());
		System.out.println(firstNameSQLString.name());
		System.out.println(firstNameSQLString.constraints().primaryKey());
		System.out.println(firstNameSQLString.constraints().allowNull());
		System.out.println(firstNameSQLString.constraints().unique());

		
		//获取其Member类上他字段上对应的注解的值同上
		
		
		
		/**
		 * 结果：
		 * 
			数据库中的表名为：MEMBER
			=========
			30
			我是firstName上的注解
			false
			true
			false

		 */
		
	}
}