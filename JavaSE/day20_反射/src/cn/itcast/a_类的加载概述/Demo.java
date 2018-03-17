package cn.itcast.a_类的加载概述;
/**
 类的加载：
 	当程序要使用某个类时，如果该类还未被加载到内存中，则系统会通过加载，连接，初始化三步来实现对这个类的初始化
 	
 加载：
 	就是将class文件读取内存，并为之创建一个class对象
 	任何类被使用时都会建立一个class对象
 
 连接：
 	*验证:是否有正确的内部结构，并和其他类协调一致
 	*准备：负责为类的静态成员分配内存，并设置默认初始化值
 	*解析：将类的二进制数据中的符号引用替换为直接引用
 
 初始化：就是以前讲过的初始化步骤
 

 初始化时机：
	*创建类的实例
	*类的静态变量，或者为静态变量赋值
	*调用类的静态方法
	*调用反射方法类强制创建某个类或者接口对应的java.lang.class对象
	*初始化某个类的子类
	*直接使用Java.exe命令运行某个主类
	
 
 类加载器：
 	*负责将class文件加载到内存中，并为之生成对应的class对象
 	*虽然我们不需要关系类加载机制，但是了解这个机制我们能更好的理解程序的运行
 	*类加载器的组成：
 	*		Bootstrap  ClassLoader 根类加载器
 	*		Extension  ClassLoader 扩展类加载器
 	*		System	   ClassLoader 系统类加载器
 

类加载器的作用：
	Bootstrap ClassLoader 根类加载器
		也被称为引导来加载器，负责Java核心类的加载
			比如：System，String等，在JDK中JRE的lib目录下rt.jar文件中
	
	Extension ClassLoader 扩展类加载器
		负责JRE的扩展幕府中jar包的加载
		在JDK中的jre的lib目录下ext目录
		
	System ClassLoader 系统类加载器
		负责在JVM启动时加载来自Java命令的Class文件，以及classPath环境变量所制定的jar包和类的路径

 * @author 贤元
 *
 */
public class Demo {

}
