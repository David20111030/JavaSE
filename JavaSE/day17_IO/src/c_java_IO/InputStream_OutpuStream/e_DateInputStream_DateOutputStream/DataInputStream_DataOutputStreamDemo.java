package c_java_IO.InputStream_OutpuStream.e_DateInputStream_DateOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

public class DataInputStream_DataOutputStreamDemo {
	
	
	/**
	 * ���Զ�д�����������͵����ݣ�
	 * 		������������DataInputStream
	 * 			DataInputStream(InputStream in);
	 * 		�����������
	 * 			DataOutputStream(OutputStream out);
	 * 
	 * @throws Exception
	 */
	@Test
	public  void read() throws Exception{
		//������������������
		DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));
		
		//��ȡ����  ���д���ֻ��һ���ַ�/�ַ������͵����ݿ���������ȡ����
		//read();
		//read(byte[] bys);
		//read(byte[] bys,int index,int len);
		//һ�ζ�ȡһ���ֽ�����
//		byte[] bys = new byte[1024];//�洢���ζ���������
//		int len = 0;//��ű��ζ�ȡ�����ֽڸ���
//		while((len = dis.read(bys))!=-1){
//			System.out.println(new String(bys,0,len));
//		}

		
		
		// ������
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
		
		//�ͷ���Դ
		dis.close();
		
	}
	@Test
	public void write() throws Exception{
		//�����������������
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));
		
		//д������ ����д����ֻ������͵�����
		dos.writeByte(10);
		dos.writeShort(100);
		dos.writeInt(1000);
		dos.writeLong(10000);
		dos.writeFloat(12.34F);
		dos.writeDouble(12.56);
		dos.writeChar('a');
		dos.writeBoolean(true);
		
		//ˢ�»�����
		dos.flush();
		//�ͷ���Դ
		dos.close();
	}
}
