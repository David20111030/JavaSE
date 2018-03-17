package c_java_IO.InputStream_OutpuStream.j_ObjectOutputStream_ObjectInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;
/**
 * 如何实现序列化？
 * 步骤：
 * 		1、要实现序列化的类必须实现序列化接口 Serialize(这是一个标记接口)  该接口位于java.lang包中，
 * 		2、使用一个输出流来构造一个ObjectOutputStream(对象流)对象
 * 		3、用对象的writeObject(Object object)方法就可以将obj对象写出(即保存其状态)
 * @author 贤元
 *
 */
public class ObjectStreamDemo {
	
	/**
	 * 序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。对象---->流数据(ObjectOutputStream)
	 * 
	 * 反序列化流：把文本文件中的流对象数据或者网络中的流对象数据还原成对象。流数据--->对象(ObjectInputStream)
	 * 
	 * 构造函数：
	 * 		ObjectInputStream(InputStream in);
	 * 		ObjectOutputStream(OutputStream out);
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		//由于我们要对对象进行序列化，所以我们先自定义一个类
		//序列化数据其实就是把对象写到文本文件
		write();
		
		read();
	}
	
	//反序列化     流——》对象
	public static void read() throws Exception{
		//创建反序列化对象      
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		
		//还原对象
		Object obj = ois.readObject();
		
		//释放资源
		ois.close();
		
		//输出对象   我在Person类中重写了toString()方法
		System.out.println(obj);
		
	}
	
	//序列化   流--》对象
	public static void write() throws Exception{
		//创建序列化流对象         保存路径 oos.txt文件中
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		
		//创建对象
		Person p = new Person("林青霞",27);

		//public final void writeObject(Object obj);
		//将对象p写出
		oos.writeObject(p);
		
		//释放资源
		oos.close();
		
	}
	
}