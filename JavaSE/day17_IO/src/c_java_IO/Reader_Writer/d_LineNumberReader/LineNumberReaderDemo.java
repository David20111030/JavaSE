package c_java_IO.Reader_Writer.d_LineNumberReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * �����кŵĻ����ַ�������LineNumberReader��
 * 		
 * LineNumberReader�Ǹ�Ч�ַ���BufferedReader������
 * BufferedReader
 * 		|--LineNumberReader�ķ���
 * 			public int getLineNumber()��õ�ǰ�кš� 
 * 			public void setLineNumber(int lineNumber);���õ�ǰ�к�
 * 			public String readLine();��ȡ�ı��У���ȡһ��
 * 			public int read();��ȡ�����ַ�
 * 
 */
public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("fw.txt"));

		// ��5��ʼ�űȽϺ�
	    lnr.setLineNumber(5);

//		 System.out.println(lnr.getLineNumber());//5
//		 System.out.println(lnr.getLineNumber());//5
//		 System.out.println(lnr.getLineNumber());//5

		String line = null;
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}
		/**
		 * ��ӡ�����
6:hello����Ԫ0
7:hello����Ԫ1
8:hello����Ԫ2
9:hello����Ԫ3
10:hello����Ԫ4
11:hello����Ԫ5
12:hello����Ԫ6
13:hello����Ԫ7
14:hello����Ԫ8
15:hello����Ԫ9

		 */
		 
		lnr.close();
	}
}