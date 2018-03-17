package c_java_IO.Reader_Writer.d_LineNumberReader.案例_可看可不看.cn.itcast_09;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * BufferedReader
 * 		|--LineNumberReader
 * 			public int getLineNumber()获得当前行号。 
 * 			public void setLineNumber(int lineNumber)
 */
public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("my.txt"));

		// 从10开始才比较好
		// lnr.setLineNumber(10);

		// System.out.println(lnr.getLineNumber());
		// System.out.println(lnr.getLineNumber());
		// System.out.println(lnr.getLineNumber());

		String line = null;
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);
		}

		lnr.close();
	}
}