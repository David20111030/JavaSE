package c_java_IO.InputStream_OutpuStream.h_RandomAccessFile���������;

import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

public class RandomAccessFileDemo {
	
	/**
	 * �����������
	 * 	RandomAccessFile�಻����������Object������ࡣ
	 * 	�����ں���InputStream��OutputStream�Ĺ��ܡ�
	 * 	֧�ֶ��ļ���������ʶ�ȡ��д�롣
	 * 
	 * public RandomAccessFile(String name,String mode);
	 * 			��һ���������ļ�·�����ڶ��������ǲ����ļ���ģʽ
	 * 	  ģʽ�����֣�������õ�һ�ֽ�"rw",���ַ�ʽ��ʾ�ȿ��Զ����ݣ�Ҳ����д���ݡ�����:
	 * 		ֵ		����
			"r" 	��ֻ����ʽ�򿪡����ý��������κ� write �������������׳� IOException��  
			"rw" 	���Ա��ȡ��д�롣������ļ��в����ڣ����Դ������ļ���  
			"rws"	 ���Ա��ȡ��д�룬���� "rw"����Ҫ����ļ������ݻ�Ԫ���ݵ�ÿ�����¶�ͬ��д�뵽�ײ�洢�豸��  
			"rwd"   ���Ա��ȡ��д�룬���� "rw"����Ҫ����ļ����ݵ�ÿ�����¶�ͬ��д�뵽�ײ�洢�豸�� 

	 * @throws Exception
	 */
	@Test
	public  void read() throws IOException {
		// �����������������
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		int i = raf.readInt();
		System.out.println(i);
		// ���ļ�ָ�����ͨ�� getFilePointer������ȡ����ͨ�� seek �������á�
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());//���ش��ļ��еĵ�ǰƫ������

		char ch = raf.readChar();//�Ӵ��ļ���ȡһ���ַ���
		System.out.println(ch);
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());

		String s = raf.readUTF();// �Ӵ��ļ���ȡһ���ַ�����
		System.out.println(s);
		System.out.println("��ǰ�ļ���ָ��λ���ǣ�" + raf.getFilePointer());

		// �Ҳ�����ͷ��ʼ�ˣ��Ҿ�Ҫ��ȡa����ô����?
		raf.seek(4);//���õ����ļ���ͷ���������ļ�ָ��ƫ�������ڸ�λ�÷�����һ����ȡ��д�������
		ch = raf.readChar();
		System.out.println(ch);
		
		
		//100a�й� �ַ������й���ռ8���ֽ�
		
		/**
		 * ��ӡ�����
		 * 100
			��ǰ�ļ���ָ��λ���ǣ�4
			a
			��ǰ�ļ���ָ��λ���ǣ�6
			�й�
			��ǰ�ļ���ָ��λ���ǣ�14
			a

		 */
	}
	@Test
	public void write() throws IOException {
		// �����������������
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		// ��ô����?
		raf.writeInt(100);//���ĸ��ֽڽ� int д����ļ�����д���ֽڡ�
		raf.writeChar('a');//��˫�ֽ�ֵ�� char д����ļ�����д���ֽڡ�
		raf.writeUTF("�й�");//ʹ�� modified UTF-8 ������������޹صķ�ʽ��һ���ַ���д����ļ���

		raf.close();
	}
}	
