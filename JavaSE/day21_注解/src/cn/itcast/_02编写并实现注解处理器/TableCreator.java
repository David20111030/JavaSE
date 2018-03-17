package cn.itcast._02��д��ʵ��ע�⴦����;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


/**
 * ʵ��ע�⴦���� ������
 * 
 * @author ��Ԫ
 * 
 */
public class TableCreator {
	public static void main(String[] args) throws Exception{
		Class memberClazz = Class.forName("cn.itcast._02��д��ʵ��ע�⴦����.Member");
		
		//��ȡ���е�ע��
		DBTable dbtable = (DBTable) memberClazz.getAnnotation(DBTable.class);
		System.out.println("���ݿ��еı���Ϊ��"+dbtable.name());//MEMBER
		
		System.out.println("=========");
		
		//��ȡ��Menber���е��ֶ�
		Field firstName = memberClazz.getDeclaredField("firstName");
		Field lastName = memberClazz.getDeclaredField("lastName");
		Field age = memberClazz.getDeclaredField("age");
		Field handle = memberClazz.getDeclaredField("handle");
		
		//��ȡfirstName�ֶ��϶�Ӧ��ע���ֵ
		SQLString firstNameSQLString = firstName.getAnnotation(SQLString.class);
		System.out.println(firstNameSQLString.value());
		System.out.println(firstNameSQLString.name());
		System.out.println(firstNameSQLString.constraints().primaryKey());
		System.out.println(firstNameSQLString.constraints().allowNull());
		System.out.println(firstNameSQLString.constraints().unique());

		
		//��ȡ��Member�������ֶ��϶�Ӧ��ע���ֵͬ��
		
		
		
		/**
		 * �����
		 * 
			���ݿ��еı���Ϊ��MEMBER
			=========
			30
			����firstName�ϵ�ע��
			false
			true
			false

		 */
		
	}
}