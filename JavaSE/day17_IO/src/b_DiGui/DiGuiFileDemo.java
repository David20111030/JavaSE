package b_DiGui;

import java.io.File;

import org.junit.Test;

public class DiGuiFileDemo {
	/*
	 * 需求：递归删除带内容的目录
	 * 
	 * 目录我已经给定：demo
	 * 
	 * 分析：
	 * 		A:封装目录
	 * 		B:获取该目录下的所有文件或者文件夹的File数组
	 * 		C:遍历该File数组，得到每一个File对象
	 * 		D:判断该File对象是否是文件夹
	 * 			是：回到B
	 * 			否：就删除
	 */
	@Test
	public void testFileDelete() throws Exception {
		//封装目录
		File srcFolder = new File("demo");	
	}
	public static void deleteFolder(File srcFolder){
		//获取该目录下的所有文件或者文件夹的File数组
		File[] fileNames = srcFolder.listFiles();
		//遍历该数组，得到每一个File对象
		for(File f:fileNames){
			//判断该File对象是否是文件夹
			if(f.isDirectory()){
				//是文件夹，就重复如下步骤：
				/**
	  		B:获取该目录下的所有文件或者文件夹的File数组
	  		C:遍历该File数组，得到每一个File对象
	  		D:判断该File对象是否是文件夹
	  			是：回到B
	 			否：就删除
				 */
				deleteFolder(f);
			}else{
				//不是文件夹，就删除
				System.out.println(f.getName()+"已删除  "+f.delete());
			}
		}
	}
	
	
	
	
	
	/*
	 * 需求：请大家把D:\Encoding目录下所有的java结尾的文件的绝对路径给输出在控制台。
	 * 
	 * 分析：
	 * 		A:封装目录
	 * 		B:获取该目录下所有的文件或者文件夹的File数组
	 * 		C:遍历该File数组，得到每一个File对象
	 * 		D:判断该File对象是否是文件夹
	 * 			是：回到B
	 * 			否：继续判断是否以.java结尾
	 * 				是：就输出该文件的绝对路径
	 * 				否：不搭理它
	 */
	@Test
	public void testFilePath() throws Exception {
		//封装目录
		File file = new File("D:\\Encoding");
		printJave(file);
		
	}
	public static void printJave(File file){
		//获取该目录下所有的文件或者文件夹的File数组
		File[] fileNames = file.listFiles();
		//遍历得到该File数组，得到每一个File对象
		for(File f:fileNames){
			//判断该File对象是否是文件夹
			if(f.isDirectory()){
				//是文件夹，就重复以下三个步骤
				/**
				 * B:获取该目录下所有的文件或者文件夹的File数组
	  				C:遍历该File数组，得到每一个File对象
	  				D:判断该File对象是否是文件夹
				 */
				printJave(f);
			}else{
				//是文件
				//判断该文件是否以.java结尾
				//是：就输出该文件的绝对路径
				//否：就不搭理它
				if(f.getName().endsWith(".java")){
					System.out.println(f.getName());
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
