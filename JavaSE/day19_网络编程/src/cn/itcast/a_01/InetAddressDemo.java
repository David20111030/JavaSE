package cn.itcast.a_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 如果一个类没有构造方法：
 * 	A：成员全部是静态的(Math,Arrays,Collections)
 *  B:单例设计模式(Runtime)
 *  C:类中有静态方法返回该类的对象(InetAddress)
 *  	class Demo{
 *  		private Demo(){}
 *  		
 *  		private static Demo getXXX(){
 *  			return new Demo();
 *  		}
 *  	}
 *  看InetAddress的成员方法：
 *  	public staitc InetAddress getByName(String host);//根据主机名或者IP地址的字符串表示得到IP地址对象
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//public static InetAddress getByName(String host);
		//根据主机名或者IP地址的字符串表示得到IP地址对象
		//InetAddress address = InetAddress.getByName("192.168.123.233");//这个运行比较慢
		//或者这样也一样
		InetAddress address = InetAddress.getByName("lixian");//这个运行比较快
		
		//获取两个东西：主机名，IP地址
		//public String getHostName();//获取主机名
		String name = address.getHostName();
		System.out.println("主机名："+name);//
		
		String ipAddress = address.getHostAddress();//主机名：lixian
		System.out.println("IP地址："+ipAddress);//IP地址：192.168.123.223
	}
	
}
