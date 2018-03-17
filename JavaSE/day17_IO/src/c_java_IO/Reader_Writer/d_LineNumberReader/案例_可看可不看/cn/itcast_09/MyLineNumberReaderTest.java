package c_java_IO.Reader_Writer.d_LineNumberReader.案例_可看可不看.cn.itcast_09;

import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReaderTest {
	public static void main(String[] args) throws IOException {
		// MyLineNumberReader mlnr = new MyLineNumberReader(new FileReader(
		// "my.txt"));

		MyLineNumberReader2 mlnr = new MyLineNumberReader2(new FileReader(
				"my.txt"));

		// mlnr.setLineNumber(10);

		// System.out.println(mlnr.getLineNumber());
		// System.out.println(mlnr.getLineNumber());
		// System.out.println(mlnr.getLineNumber());

		String line = null;
		while ((line = mlnr.readLine()) != null) {
			System.out.println(mlnr.getLineNumber() + ":" + line);
		}

		mlnr.close();
	}
}
