package c_java_IO.InputStream_OutpuStream.j_ObjectOutputStream_ObjectInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;
/**
 * ���ʵ�����л���
 * ���裺
 * 		1��Ҫʵ�����л��������ʵ�����л��ӿ� Serialize(����һ����ǽӿ�)  �ýӿ�λ��java.lang���У�
 * 		2��ʹ��һ�������������һ��ObjectOutputStream(������)����
 * 		3���ö����writeObject(Object object)�����Ϳ��Խ�obj����д��(��������״̬)
 * @author ��Ԫ
 *
 */
public class ObjectStreamDemo {
	
	/**
	 * ���л������Ѷ�������һ���ķ�ʽ�����ı��ļ������������д��䡣����---->������(ObjectOutputStream)
	 * 
	 * �����л��������ı��ļ��е����������ݻ��������е����������ݻ�ԭ�ɶ���������--->����(ObjectInputStream)
	 * 
	 * ���캯����
	 * 		ObjectInputStream(InputStream in);
	 * 		ObjectOutputStream(OutputStream out);
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		//��������Ҫ�Զ���������л��������������Զ���һ����
		//���л�������ʵ���ǰѶ���д���ı��ļ�
		write();
		
		read();
	}
	
	//�����л�     ������������
	public static void read() throws Exception{
		//���������л�����      
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		
		//��ԭ����
		Object obj = ois.readObject();
		
		//�ͷ���Դ
		ois.close();
		
		//�������   ����Person������д��toString()����
		System.out.println(obj);
		
	}
	
	//���л�   ��--������
	public static void write() throws Exception{
		//�������л�������         ����·�� oos.txt�ļ���
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		
		//��������
		Person p = new Person("����ϼ",27);

		//public final void writeObject(Object obj);
		//������pд��
		oos.writeObject(p);
		
		//�ͷ���Դ
		oos.close();
		
	}
	
}