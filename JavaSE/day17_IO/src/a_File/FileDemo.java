package a_File;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class FileDemo {

	
	/*
	 * 我们要想实现IO的操作，就必须知道硬盘上文件的表现形式。
	 * 而Java就提供了一个类File供我们使用。
	 * 
	 * File:文件和目录(文件夹)路径名的抽象表示形式
	 * 构造方法：
	 * 		File(String pathname)：根据一个路径得到File对象
	 * 		File(String parent, String child):根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
	 * 		File(File parent, String child):根据一个父File对象和child 路径名字符串创建一个新 File 实例。
	 * 				以上两个构造方法的路径其实可以认为就是：parent+child所组成的路径
	 */
	@Test
	public void test1() throws Exception {
		// File(String pathname)：根据一个路径得到File对象
		// 把e:\\demo\\a.txt封装成一个File对象
		File file = new File("d:\\demo\\a.txt");

		// File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
		File file2 = new File("d:\\demo", "a.txt");

		// File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
		File file3 = new File("d:\\demo");
		File file4 = new File(file3, "a.txt");

		// 以上三种方式其实效果一样
	}
	
	/*
	 *创建功能：
	 *	public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了.注意：要想在某个目录下创建内容，该目录首先必须存在。
	 *	public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了.注意：要想在某个目录下创建内容，该目录首先必须存在。
	 *	public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来.
	 *
	 * 骑白马的不一定是王子，可能是班长。
	 * 注意：你到底要创建文件还是文件夹，你最清楚，方法不要调错了。
	 *  
	 */
	@Test
	public void test_create() throws Exception {
		//需求：我要在d盘目录下创建一个文件夹demo
		File file = new File("d:\\demo");
		System.out.println("mkdir:"+file.mkdir());//true
		
		//需求：我要在d盘的文件夹demo下创建一个文件a.txt
		File file2 = new File("d:\\demo\\a.txt");
		System.out.println("createNewFile():"+file2.createNewFile());
		
		// 需求：我要在e盘目录test下创建一个文件b.txt
		// Exception in thread "main" java.io.IOException: 系统找不到指定的路径。
		// 注意：要想在某个目录下创建内容，该目录首先必须存在。
		// File file3 = new File("e:\\test\\b.txt");
		// System.out.println("createNewFile:" + file3.createNewFile());
		
		//需求：我要在d盘目录test下创建aaa目录   注意：要想在某个目录下创建内容，该目录首先必须存在。
		File file4 = new File("d:\\test\\aaa");
		System.out.println(file4.mkdir());//false
		
		//需求：我要在d盘目录test下创建aaa目录
		File file5 = new File("d:\\demo\\aaa");
		System.out.println(file5.mkdir());//true
		
		// 需求:我要在d盘目录test下创建aaa目录
		// File file5 = new File("e:\\test");
		// File file6 = new File("e:\\test\\aaa");
		// System.out.println("mkdir:" + file5.mkdir());
		// System.out.println("mkdir:" + file6.mkdir());

		//public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
		File file7 = new File("d:\\aaa\\bbb\\ccc\\ddd");
		System.out.println("mkdirs:" + file7.mkdirs());//mkdirs:true

		// 看下面的这个东西：a.txt不一定是一个文本文件，也有可能是一个文件夹
		File file8 = new File("d:\\lixianyuan\\a.txt");
		System.out.println("mkdirs:" + file8.mkdirs());
		
	}
	
	
	/*
	 * 删除功能:public boolean delete()
	 * 
	 * 注意：
	 * 		A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
	 * 		B:Java中的删除不走回收站。
	 * 		C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
	 */
	@Test
	public void test_delete() throws Exception {
		//创建文件  A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
		//File file = new File("d:a.txt");
		//System.out.println("createNewFile:"+file.createNewFile());//true
		
		// 我不小心写成这个样子了   这个和file的结果一样    A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
		File file21 = new File("a.txt");
		System.out.println("createNewFile:" + file21.createNewFile());

		// 继续玩几个   A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
		File file2 = new File("aaa\\bbb\\ccc");
		System.out.println("mkdirs:" + file2.mkdirs());

		//删除功能：我要删除a.txt这个文件
		File file3 = new File("a.txt");
		System.out.println("delete:"+file3.delete());
		
		//我要删除aaa文件夹
		//File file5 = new File("aaa");
		//System.out.println("delete:"+file5.delete());//false  C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
		
		
		//在d盘创建aaa文件夹，并在aaa文件夹下创建bbb文件夹
		File file55 = new File("d:\\aaa\\bbb");
		System.out.println("mkdirs:" + file55.mkdirs());

		//我要删除aaa文件夹  因为aaa文件夹下有个bbb文件夹，所以删除aaa文件夹之前必须要先删除bbb文件夹，只有先把bbb文件夹删除后才能删除aaa文件夹
		File file6 = new File("d:\\aaa\\bbb");
		File file7 = new File("d:\\aaa");
		System.out.println("delete:" + file6.delete());//先删除bbb文件夹
		System.out.println("delete:" + file7.delete());//再删除aaa文件夹
	}
	
	
	/*
	 * 重命名功能:public boolean renameTo(File dest)
	 * 		如果路径名相同，就是改名。
	 * 		如果路径名不同，就是改名并剪切。
	 * 
	 * 路径以盘符开始：绝对路径	d:\\a.txt
	 * 路径不以盘符开始：相对路径	a.txt
	 */
	@Test
	public void test_renameTo() throws Exception {
		// 创建一个文件对象
//		 File file = new File("林青霞.jpg");
//		 // 需求：我要修改这个文件的名称为"东方不败.jpg"
//		 File newFile = new File("东方不败.jpg");
//		 System.out.println("renameTo:" + file.renameTo(newFile));

		File file2 = new File("东方不败.jpg");
		File newFile2 = new File("d:\\林青霞.jpg");
		System.out.println("renameTo:" + file2.renameTo(newFile2));
	
	}
	
	
	
	
	/*
	 * 判断功能:
	 * 		public boolean isDirectory():判断是否是目录
	 *		public boolean isFile():判断是否是文件
	 * 		public boolean exists():判断是否存在
	 * 		public boolean canRead():判断是否可读
	 * 		public boolean canWrite():判断是否可写
	 * 		public boolean isHidden():判断是否隐藏
	 */
	@Test
	public void test_Boolean() throws Exception {
		//创建文件对象
		File file = new File("b.txt");
		

		System.out.println("isDirectory:" + file.isDirectory());// false
		System.out.println("isFile:" + file.isFile());// true
		System.out.println("exists:" + file.exists());// true
		System.out.println("canRead:" + file.canRead());// true
		System.out.println("canWrite:" + file.canWrite());// true
		System.out.println("isHidden:" + file.isHidden());// false
	}
	
	
	
	
	/*
	 * 获取功能：
	 * 		public String getAbsolutePath()：获取绝对路径
	 * 		public String getPath():获取相对路径
	 * 		public String getName():获取名称
	 * 		public String getParent();获取父文件夹名称
	 * 		public long length():获取长度。字节数.就是该文件的大小
	 * 		public long lastModified():获取最后一次的修改时间，毫秒值
	 * 
	 * 		public String[] list():获取指定目录下的所有文件或者文件夹的名称数组。该目录下的 文件夹中的 文件或者文件夹就获取不到的哦
	 * 		public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
	 */
	@Test
	public void test_get() throws Exception {
		//创建文件对象
		File file = new File("demo\\test.txt");
		System.out.println("绝对路径:"+file.getAbsolutePath());//绝对路径： D:\Encoding\Java\SE\SE\day17_IO\demo\test.txt
		System.out.println("相对路径:"+file.getPath());//相对路径: demo\test.txt
		System.out.println("获取名称："+file.getName());//获取名称：test.txt
		System.out.println("获取长度(字节数)："+file.length());//获取长度(字节数)：0  也就是该文件test.txt的大小(包含的字节数)
		System.out.println("获取最后一次修改的时间(毫秒值)："+file.lastModified());//获取最后一次修改的时间(毫秒值)：0   也就是1982年到现在的毫秒值
		System.out.println("获取父文件夹名称："+file.getParent());//获取父文件夹名称：demo
		
		//将日期也就是1982年到现在的毫秒值进行格式化显示
		Date date = new Date(1488285211850L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(date);
		System.out.println(s);//2017-02-28 20:33:31
		
		System.out.println("--------------------");
		
	
		//public String[] list():获取指定目录下 的所有文件或者文件夹的名称数组。只能获取到该目录下的所有文件或者文件夹的名称。该目录下的 文件夹中的 文件或者文件夹就获取不到的哦
		//指定一个目录
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
			建站流程.txt
			要看的视频
		 */
		System.out.println("--------------");
		
		//public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
		//这个返回值是File[]类型的
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
			d:\建站流程.txt
			d:\要看的视频
		 */
	}
	
	
	
	/**
	 * 判断D盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
	 * 
	 * 分析：
	 * 		A:封装d盘目录
	 * 		B:获取该目录下所有文件或者文件夹的File数组
	 * 		C:遍历该File数组，得到每一个File对象，然后判断
	 * 		D:是否是文件
	 * 			是：继续判断是否以.jpg结尾
	 * 				是：就输出该文件名称
	 * 				否：不搭理它
	 * 			否：不搭理它
	 */
	@Test
	public void test_test() throws Exception {
		//指定一个目录  封装d盘目录
		File file = new File("d:\\");
		
		//获取d盘目录下的所有文件的或者文件夹的File数组
		File[] files = file.listFiles();
		for(File f:files){
			if(f.isFile()&&f.getName().endsWith(".jpg")){//如果是文件并且是以.jpg结尾的
				System.out.println(f.getName());
			}
		}
		
	}
	
	
	
	/**这个一定要看，是新技能！！ 可以通过一个接口-文件名过滤器(FilenameFileter)的方式实现
	 * 
	 * 判断D盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
	 * 		A:先获取所有的，然后遍历的时候，依次判断，如果满足条件就输出。
	 * 		B:获取的时候就已经是满足条件的了，然后输出即可。
	 * 
	 * 要想实现这个效果，就必须学习一个接口：文件名称过滤器
	 * 		public String[] list(FilenameFilter filter);获取该目录下所有文件或者文件夹的String 数组
	 * 		public File[] listFiles(FilenameFilter filter);获取该目录下所有文件或者文件夹的File 数组
	 */
	@Test
	public void test_NewTc() throws Exception {
		//封装d盘目录
		File file = new File("d:\\");
		//获取该目录下所有文件或者文件夹的String 数组
		String[] fileNames = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//参数：name:表示文件名  dir：表示目标路径(也就是d盘路径：  d:\   )    dir+name:表示该目录下的所有文件或者文件夹的绝对路径。
				System.out.println("李贤元"+dir+name);
				return new File(dir,name).isFile() && name.endsWith(".jpg");
			}
		});
		
	}
	
}
