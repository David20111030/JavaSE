package b_DiGui;

import java.io.File;

import org.junit.Test;

public class DiGuiFileDemo {
	/*
	 * ���󣺵ݹ�ɾ�������ݵ�Ŀ¼
	 * 
	 * Ŀ¼���Ѿ�������demo
	 * 
	 * ������
	 * 		A:��װĿ¼
	 * 		B:��ȡ��Ŀ¼�µ������ļ������ļ��е�File����
	 * 		C:������File���飬�õ�ÿһ��File����
	 * 		D:�жϸ�File�����Ƿ����ļ���
	 * 			�ǣ��ص�B
	 * 			�񣺾�ɾ��
	 */
	@Test
	public void testFileDelete() throws Exception {
		//��װĿ¼
		File srcFolder = new File("demo");	
	}
	public static void deleteFolder(File srcFolder){
		//��ȡ��Ŀ¼�µ������ļ������ļ��е�File����
		File[] fileNames = srcFolder.listFiles();
		//���������飬�õ�ÿһ��File����
		for(File f:fileNames){
			//�жϸ�File�����Ƿ����ļ���
			if(f.isDirectory()){
				//���ļ��У����ظ����²��裺
				/**
	  		B:��ȡ��Ŀ¼�µ������ļ������ļ��е�File����
	  		C:������File���飬�õ�ÿһ��File����
	  		D:�жϸ�File�����Ƿ����ļ���
	  			�ǣ��ص�B
	 			�񣺾�ɾ��
				 */
				deleteFolder(f);
			}else{
				//�����ļ��У���ɾ��
				System.out.println(f.getName()+"��ɾ��  "+f.delete());
			}
		}
	}
	
	
	
	
	
	/*
	 * �������Ұ�D:\EncodingĿ¼�����е�java��β���ļ��ľ���·��������ڿ���̨��
	 * 
	 * ������
	 * 		A:��װĿ¼
	 * 		B:��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
	 * 		C:������File���飬�õ�ÿһ��File����
	 * 		D:�жϸ�File�����Ƿ����ļ���
	 * 			�ǣ��ص�B
	 * 			�񣺼����ж��Ƿ���.java��β
	 * 				�ǣ���������ļ��ľ���·��
	 * 				�񣺲�������
	 */
	@Test
	public void testFilePath() throws Exception {
		//��װĿ¼
		File file = new File("D:\\Encoding");
		printJave(file);
		
	}
	public static void printJave(File file){
		//��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
		File[] fileNames = file.listFiles();
		//�����õ���File���飬�õ�ÿһ��File����
		for(File f:fileNames){
			//�жϸ�File�����Ƿ����ļ���
			if(f.isDirectory()){
				//���ļ��У����ظ�������������
				/**
				 * B:��ȡ��Ŀ¼�����е��ļ������ļ��е�File����
	  				C:������File���飬�õ�ÿһ��File����
	  				D:�жϸ�File�����Ƿ����ļ���
				 */
				printJave(f);
			}else{
				//���ļ�
				//�жϸ��ļ��Ƿ���.java��β
				//�ǣ���������ļ��ľ���·��
				//�񣺾Ͳ�������
				if(f.getName().endsWith(".java")){
					System.out.println(f.getName());
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
