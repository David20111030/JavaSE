package cn.itcast.e_动态代理概述和实现;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 	代理：本来应该字节做的事却请了别人来做，被请的人就是代理。
 	
 	动态代理：在程序运行过程中产生的这个对象。动态代理其实就是通过反射来生成一个代理。
 	
 * @author 贤元
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		/**
		 *  添加功能
			删除功能
			修改功能
			查找功能
		 */
		System.out.println("===============");
		
		//我们要创建一个动态代理对象
		//proxy类：此类表示代理类
		//Proxy类中有一个方法可以创建动态代理对象
		/**
		 * public static Object newProxyInstance(
						  	ClassLoader loader,
				        	Class<?>[] interfaces,
				        	InvocationHandler h);
				参数：
					loader - 定义代理类的类加载器
					interfaces - 代理类要实现的接口列表
					h - 指派方法调用的调用处理程序 
					
			         返回：
				   一个带有代理类的指定调用处理程序的代理实例，它由指定的类加载器定义，并实现指定的接口
		 */
		//我准备对ud对象做一个代理对象
		UserDao proxy = (UserDao) Proxy.newProxyInstance(
							ud.getClass().getClassLoader(),
							ud.getClass().getInterfaces(),
							new InvocationHandler() {
								@Override
								public Object invoke(Object proxy, Method method, Object[] args)
										throws Throwable {
									/**
									  参数：
										proxy - 在其上调用方法的代理实例
										method - 对应于在代理实例上调用的接口方法的 Method 实例。Method 对象的声明类将是在其中声明方法的接口，该接口可以是代理类赖以继承方法的代理接口的超接口。
										args - 包含传入代理实例上方法调用的参数值的对象数组，如果接口方法不使用参数，则为 null。基本类型的参数被包装在适当基本包装器类（如 java.lang.Integer 或 java.lang.Boolean）的实例中。 
										
										返回：
										从代理实例的方法调用返回的值。
									 */
									System.out.println("权限校验");
									Object result = method.invoke(new UserDaoImpl(), args);////返回值是Object接收，第一个参数表示对象是谁，第二个参数表示调用该方法的实际参数
									System.out.println("日志记录");
									return result;//返回的就是代理对象
								}
							});
				
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();
		/**
		 * 权限校验
			添加功能
			日志记录
			权限校验
			删除功能
			日志记录
			权限校验
			修改功能
			日志记录
			权限校验
			查找功能
			日志记录
		 */
		
	}//mian方法的括号
	
	
}
