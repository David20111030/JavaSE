package c_java_IO.InputStream_OutpuStream.e_DateInputStream_DateOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

public class DataInputStream_DataOutputStreamDemo {
	
	
	/**
	 * 可以读写基本数据类型的数据：
	 * 		数据输入流：DataInputStream
	 * 			DataInputStream(InputStream in);
	 * 		数据输出流：
	 * 			DataOutputStream(OutputStream out);
	 * 
	 * @throws Exception
	 */
	@Test
	public  void read() throws Exception{
		//创建数据输入流对象
		DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
		
		//读取数据  如果写入的只是一种字符/字符串类型的数据可以这样读取数据
		//read();
		//read(byte[] bys);
		//read(byte[] bys,int index,int len);
		//一次读取一个字节数组
//		byte[] bys = new byte[1024];//存储本次读到的数据
//		int len = 0;//存放本次读取到的字节个数
//		while((len = dis.read(bys))!=-1){
//			System.out.println(new String(bys,0,len));
//		}

		
		
		// 读数据
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		char c = dis.readChar();
		boolean bb = dis.readBoolean();
		
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bb);
		
		//释放资源
		dis.close();
		
	}
	@Test
	public void write() throws Exception{
		//创建数据输出流对象
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
		
		//写入数据 可以写入各种基本类型的数据
		dos.writeByte(10);
		dos.writeShort(100);
		dos.writeInt(1000);
		dos.writeLong(10000);
		dos.writeFloat(12.34F);
		dos.writeDouble(12.56);
		dos.writeChar('a');
		dos.writeBoolean(true);
		
		//刷新缓冲区
		dos.flush();
		//释放资源
		dos.close();
	}
}
