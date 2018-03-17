package c_java_IO.s_Properties属性集合类_可以和IO流结合使用;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

/*
 * 这里的集合必须是Properties集合：
 * public void load(Reader reader):把文件中的数据读取到集合中
 * public void store(Writer writer,String comments):把集合中的数据存储到文件
 * 
 * 单机版游戏：
 * 		进度保存和加载。
 * 		三国群英传，三国志，仙剑奇侠传...
 * 
 * 		吕布=1
 * 		方天画戟=1
 */
public class PropertiesDemo3 {

	@Test
	public  void myStore() throws IOException {
		// 创建集合对象
		Properties prop = new Properties();

		prop.setProperty("林青霞", "27");
		prop.setProperty("武鑫", "30");
		prop.setProperty("刘晓曲", "18");
		
		//public void store(Writer writer,String comments):把集合中的数据存储到文件
		Writer w = new FileWriter("name.txt");
		prop.store(w, "helloworld");
		w.close();
	}

	@Test
	public void myLoad() throws IOException {
		Properties prop = new Properties();

		// public void load(Reader reader):把文件中的数据读取到集合中
		// 注意：这个文件的数据必须是键值对形式
		Reader r = new FileReader("prop.txt");
		prop.load(r);
		
		//读取配置文件中的数据   第一种读取数据的方式
		String name = prop.getProperty("zhangsan");
		String name2 = prop.getProperty("lisi");
		String name3 = prop.getProperty("wangwu");
		System.out.println(name);//张三
		System.out.println(name2);//李四
		System.out.println(name3);//王五
		
		//第三种读取数据的方式
		System.out.println("prop:" + prop);//prop:{zhangsan=30, lisi=40, wangwu=50}

		//直接遍历读加载到的数据  第二种读取数据的方式
		Set<Object> set = prop.keySet();
		for(Object key : set){
			String value = (String) prop.get(key);
			System.out.println(key+"--"+value);
			/**
			 * for循环读取到的数据
			 * zhangsan--张三
				lisi--李四
				wangwu--王五
			 */
		}
		r.close();
	}
}
