package c_java_IO.Reader_Writer.c_BufferedReader_BufferedWriter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：复制多极文件夹
 * 
 * 数据源：C:\Users\贤元\Desktop\html+css+js\day05
 * 目的地：d:\\
 * 
 * 分析：
 * 		A:封装数据源File
 * 		B:封装目的地File
 * 		C:判断该File是文件夹还是文件
 * 			a:是文件夹
 * 				就在目的地目录下创建该文件夹
 * 				获取该File对象下的所有文件或者文件夹File对象
 * 				遍历得到每一个File对象
 * 				回到C
 * 			b:是文件
 * 				就复制(字节流)
 */
public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException {
		// 封装数据源File
		File srcFile = new File("C:\\Users\\贤元\\Desktop\\html+css+js\\day05");
		// 封装目的地File
		File destFile = new File("d:\\");

		// 复制文件夹的功能
		copyFolder(srcFile, destFile);
	}
	//复制文件夹
	private static void copyFolder(File srcFile, File destFile)
			throws IOException {
		// 判断该File是文件夹还是文件
		if (srcFile.isDirectory()) {
			// 文件夹
			File newFolder = new File(destFile, srcFile.getName());
			newFolder.mkdir();

			// 获取该File对象下的所有文件或者文件夹File对象
			File[] fileArray = srcFile.listFiles();
			for (File file : fileArray) {
				copyFolder(file, newFolder);
			}
		} else {
			// 文件
			File newFile = new File(destFile, srcFile.getName());
			copyFile(srcFile, newFile);
		}
	}

	//复制文件 将srcFile复制到newFile中
	private static void copyFile(File srcFile, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}
