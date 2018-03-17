package a_File;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class FileDemo {

	
	/*
	 * ����Ҫ��ʵ��IO�Ĳ������ͱ���֪��Ӳ�����ļ��ı�����ʽ��
	 * ��Java���ṩ��һ����File������ʹ�á�
	 * 
	 * File:�ļ���Ŀ¼(�ļ���)·�����ĳ����ʾ��ʽ
	 * ���췽����
	 * 		File(String pathname)������һ��·���õ�File����
	 * 		File(String parent, String child):���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
	 * 		File(File parent, String child):����һ����File�����child ·�����ַ�������һ���� File ʵ����
	 * 				�����������췽����·����ʵ������Ϊ���ǣ�parent+child����ɵ�·��
	 */
	@Test
	public void test1() throws Exception {
		// File(String pathname)������һ��·���õ�File����
		// ��e:\\demo\\a.txt��װ��һ��File����
		File file = new File("d:\\demo\\a.txt");

		// File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
		File file2 = new File("d:\\demo", "a.txt");

		// File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
		File file3 = new File("d:\\demo");
		File file4 = new File(file3, "a.txt");

		// �������ַ�ʽ��ʵЧ��һ��
	}
	
	/*
	 *�������ܣ�
	 *	public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������.ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼���ȱ�����ڡ�
	 *	public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������.ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼���ȱ�����ڡ�
	 *	public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������.
	 *
	 * �����Ĳ�һ�������ӣ������ǰ೤��
	 * ע�⣺�㵽��Ҫ�����ļ������ļ��У����������������Ҫ�����ˡ�
	 *  
	 */
	@Test
	public void test_create() throws Exception {
		//������Ҫ��d��Ŀ¼�´���һ���ļ���demo
		File file = new File("d:\\demo");
		System.out.println("mkdir:"+file.mkdir());//true
		
		//������Ҫ��d�̵��ļ���demo�´���һ���ļ�a.txt
		File file2 = new File("d:\\demo\\a.txt");
		System.out.println("createNewFile():"+file2.createNewFile());
		
		// ������Ҫ��e��Ŀ¼test�´���һ���ļ�b.txt
		// Exception in thread "main" java.io.IOException: ϵͳ�Ҳ���ָ����·����
		// ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼���ȱ�����ڡ�
		// File file3 = new File("e:\\test\\b.txt");
		// System.out.println("createNewFile:" + file3.createNewFile());
		
		//������Ҫ��d��Ŀ¼test�´���aaaĿ¼   ע�⣺Ҫ����ĳ��Ŀ¼�´������ݣ���Ŀ¼���ȱ�����ڡ�
		File file4 = new File("d:\\test\\aaa");
		System.out.println(file4.mkdir());//false
		
		//������Ҫ��d��Ŀ¼test�´���aaaĿ¼
		File file5 = new File("d:\\demo\\aaa");
		System.out.println(file5.mkdir());//true
		
		// ����:��Ҫ��d��Ŀ¼test�´���aaaĿ¼
		// File file5 = new File("e:\\test");
		// File file6 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file5.mkdir());
		// System.out.println("mkdir:" + file6.mkdir());

		//public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
		File file7 = new File("d:\\aaa\\bbb\\ccc\\ddd");
		System.out.println("mkdirs:" + file7.mkdirs());//mkdirs:true

		// ����������������a.txt��һ����һ���ı��ļ���Ҳ�п�����һ���ļ���
		File file8 = new File("d:\\lixianyuan\\a.txt");
		System.out.println("mkdirs:" + file8.mkdirs());
		
	}
	
	
	/*
	 * ɾ������:public boolean delete()
	 * 
	 * ע�⣺
	 * 		A:����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
	 * 		B:Java�е�ɾ�����߻���վ��
	 * 		C:Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
	 */
	@Test
	public void test_delete() throws Exception {
		//�����ļ�  A:����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
		//File file = new File("d:a.txt");
		//System.out.println("createNewFile:"+file.createNewFile());//true
		
		// �Ҳ�С��д�����������   �����file�Ľ��һ��    A:����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
		File file21 = new File("a.txt");
		System.out.println("createNewFile:" + file21.createNewFile());

		// �����漸��   A:����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
		File file2 = new File("aaa\\bbb\\ccc");
		System.out.println("mkdirs:" + file2.mkdirs());

		//ɾ�����ܣ���Ҫɾ��a.txt����ļ�
		File file3 = new File("a.txt");
		System.out.println("delete:"+file3.delete());
		
		//��Ҫɾ��aaa�ļ���
		//File file5 = new File("aaa");
		//System.out.println("delete:"+file5.delete());//false  C:Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
		
		
		//��d�̴���aaa�ļ��У�����aaa�ļ����´���bbb�ļ���
		File file55 = new File("d:\\aaa\\bbb");
		System.out.println("mkdirs:" + file55.mkdirs());

		//��Ҫɾ��aaa�ļ���  ��Ϊaaa�ļ������и�bbb�ļ��У�����ɾ��aaa�ļ���֮ǰ����Ҫ��ɾ��bbb�ļ��У�ֻ���Ȱ�bbb�ļ���ɾ�������ɾ��aaa�ļ���
		File file6 = new File("d:\\aaa\\bbb");
		File file7 = new File("d:\\aaa");
		System.out.println("delete:" + file6.delete());//��ɾ��bbb�ļ���
		System.out.println("delete:" + file7.delete());//��ɾ��aaa�ļ���
	}
	
	
	/*
	 * ����������:public boolean renameTo(File dest)
	 * 		���·������ͬ�����Ǹ�����
	 * 		���·������ͬ�����Ǹ��������С�
	 * 
	 * ·�����̷���ʼ������·��	d:\\a.txt
	 * ·�������̷���ʼ�����·��	a.txt
	 */
	@Test
	public void test_renameTo() throws Exception {
		// ����һ���ļ�����
//		 File file = new File("����ϼ.jpg");
//		 // ������Ҫ�޸�����ļ�������Ϊ"��������.jpg"
//		 File newFile = new File("��������.jpg");
//		 System.out.println("renameTo:" + file.renameTo(newFile));

		File file2 = new File("��������.jpg");
		File newFile2 = new File("d:\\����ϼ.jpg");
		System.out.println("renameTo:" + file2.renameTo(newFile2));
	
	}
	
	
	
	
	/*
	 * �жϹ���:
	 * 		public boolean isDirectory():�ж��Ƿ���Ŀ¼
	 *		public boolean isFile():�ж��Ƿ����ļ�
	 * 		public boolean exists():�ж��Ƿ����
	 * 		public boolean canRead():�ж��Ƿ�ɶ�
	 * 		public boolean canWrite():�ж��Ƿ��д
	 * 		public boolean isHidden():�ж��Ƿ�����
	 */
	@Test
	public void test_Boolean() throws Exception {
		//�����ļ�����
		File file = new File("b.txt");
		

		System.out.println("isDirectory:" + file.isDirectory());// false
		System.out.println("isFile:" + file.isFile());// true
		System.out.println("exists:" + file.exists());// true
		System.out.println("canRead:" + file.canRead());// true
		System.out.println("canWrite:" + file.canWrite());// true
		System.out.println("isHidden:" + file.isHidden());// false
	}
	
	
	
	
	/*
	 * ��ȡ���ܣ�
	 * 		public String getAbsolutePath()����ȡ����·��
	 * 		public String getPath():��ȡ���·��
	 * 		public String getName():��ȡ����
	 * 		public String getParent();��ȡ���ļ�������
	 * 		public long length():��ȡ���ȡ��ֽ���.���Ǹ��ļ��Ĵ�С
	 * 		public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	 * 
	 * 		public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е��������顣��Ŀ¼�µ� �ļ����е� �ļ������ļ��оͻ�ȡ������Ŷ
	 * 		public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
	 */
	@Test
	public void test_get() throws Exception {
		//�����ļ�����
		File file = new File("demo\\test.txt");
		System.out.println("����·��:"+file.getAbsolutePath());//����·���� D:\Encoding\Java\SE\SE\day17_IO\demo\test.txt
		System.out.println("���·��:"+file.getPath());//���·��: demo\test.txt
		System.out.println("��ȡ���ƣ�"+file.getName());//��ȡ���ƣ�test.txt
		System.out.println("��ȡ����(�ֽ���)��"+file.length());//��ȡ����(�ֽ���)��0  Ҳ���Ǹ��ļ�test.txt�Ĵ�С(�������ֽ���)
		System.out.println("��ȡ���һ���޸ĵ�ʱ��(����ֵ)��"+file.lastModified());//��ȡ���һ���޸ĵ�ʱ��(����ֵ)��0   Ҳ����1982�굽���ڵĺ���ֵ
		System.out.println("��ȡ���ļ������ƣ�"+file.getParent());//��ȡ���ļ������ƣ�demo
		
		//������Ҳ����1982�굽���ڵĺ���ֵ���и�ʽ����ʾ
		Date date = new Date(1488285211850L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(date);
		System.out.println(s);//2017-02-28 20:33:31
		
		System.out.println("--------------------");
		
	
		//public String[] list():��ȡָ��Ŀ¼�� �������ļ������ļ��е��������顣ֻ�ܻ�ȡ����Ŀ¼�µ������ļ������ļ��е����ơ���Ŀ¼�µ� �ļ����е� �ļ������ļ��оͻ�ȡ������Ŷ
		//ָ��һ��Ŀ¼
		File file2 = new File("d:\\");
		String[] fileNames = file2.list();
		for(String str:fileNames){
			System.out.println(str);
		}
		/**
		 * $RECYCLE.BIN
			360Downloads
			BaiduyunDownload
			Config.Msi
			Encoding
			images
			LenovoDrivers
			MSOCache
			My File
			MySQL Datafiles
			oracle
			Software
			System Volume Information
			��վ����.txt
			Ҫ������Ƶ
		 */
		System.out.println("--------------");
		
		//public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
		//�������ֵ��File[]���͵�
		File[] listFiles = file2.listFiles();
		for(File ffile:listFiles){
			System.out.println(ffile);
		}
		/**
		 * d:\$RECYCLE.BIN
			d:\360Downloads
			d:\BaiduyunDownload
			d:\Config.Msi
			d:\Encoding
			d:\images
			d:\LenovoDrivers
			d:\MSOCache
			d:\My File
			d:\MySQL Datafiles
			d:\oracle
			d:\Software
			d:\System Volume Information
			d:\��վ����.txt
			d:\Ҫ������Ƶ
		 */
	}
	
	
	
	/**
	 * �ж�D��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
	 * 
	 * ������
	 * 		A:��װd��Ŀ¼
	 * 		B:��ȡ��Ŀ¼�������ļ������ļ��е�File����
	 * 		C:������File���飬�õ�ÿһ��File����Ȼ���ж�
	 * 		D:�Ƿ����ļ�
	 * 			�ǣ������ж��Ƿ���.jpg��β
	 * 				�ǣ���������ļ�����
	 * 				�񣺲�������
	 * 			�񣺲�������
	 */
	@Test
	public void test_test() throws Exception {
		//ָ��һ��Ŀ¼  ��װd��Ŀ¼
		File file = new File("d:\\");
		
		//��ȡd��Ŀ¼�µ������ļ��Ļ����ļ��е�File����
		File[] files = file.listFiles();
		for(File f:files){
			if(f.isFile()&&f.getName().endsWith(".jpg")){//������ļ���������.jpg��β��
				System.out.println(f.getName());
			}
		}
		
	}
	
	
	
	/**���һ��Ҫ�������¼��ܣ��� ����ͨ��һ���ӿ�-�ļ���������(FilenameFileter)�ķ�ʽʵ��
	 * 
	 * �ж�D��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
	 * 		A:�Ȼ�ȡ���еģ�Ȼ�������ʱ�������жϣ�������������������
	 * 		B:��ȡ��ʱ����Ѿ��������������ˣ�Ȼ��������ɡ�
	 * 
	 * Ҫ��ʵ�����Ч�����ͱ���ѧϰһ���ӿڣ��ļ����ƹ�����
	 * 		public String[] list(FilenameFilter filter);��ȡ��Ŀ¼�������ļ������ļ��е�String ����
	 * 		public File[] listFiles(FilenameFilter filter);��ȡ��Ŀ¼�������ļ������ļ��е�File ����
	 */
	@Test
	public void test_NewTc() throws Exception {
		//��װd��Ŀ¼
		File file = new File("d:\\");
		//��ȡ��Ŀ¼�������ļ������ļ��е�String ����
		String[] fileNames = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//������name:��ʾ�ļ���  dir����ʾĿ��·��(Ҳ����d��·����  d:\   )    dir+name:��ʾ��Ŀ¼�µ������ļ������ļ��еľ���·����
				System.out.println("����Ԫ"+dir+name);
				return new File(dir,name).isFile() && name.endsWith(".jpg");
			}
		});
		
	}
	
}
