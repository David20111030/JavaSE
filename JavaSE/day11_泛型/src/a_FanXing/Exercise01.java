package a_FanXing;

import java.util.ArrayList;
import java.util.Iterator;



/*
   存储自定义对象并遍历
   分析：
    1、创建学生类
    2、创建集合对象
    3、创建元素对象
    4、吧元素添加到集合
    5、遍历集合*/
public class Exercise01 {
public static void main(String[] args) {
	//创建集合对象
	//JDK7的新特性：泛型推断
   //ArrayList<Student> array=new ArrayList<>();
	//但是不推荐这样使用
	ArrayList<Student> array=new ArrayList<Student>();
	
	//创建学生对象
	Student s1=new Student("陈建江",20);
	Student s2=new Student("侯志民",20);
	Student s3=new Student("谢杰翔",21);
	Student s4=new Student("石昌瑾",19);
	Student s5=new Student("赵崇",20);
	
	//添加元素
	array.add(s1);
	array.add(s2);
	array.add(s3);
	array.add(s4);
	array.add(s5);

	//遍历
	Iterator<Student> it=array.iterator();
	while(it.hasNext()){
		Student s=it.next();
		System.out.println(s.getName()+"----"+s.getAge());
		
	}
//-----------------------------------	
	System.out.println("---------------");
	//使用for循环遍历
	for(int x=0;x<array.size();x++){
		Student ss=array.get(x);
		System.out.println(ss.getName()+"----"+ss.getAge());
	}
}
 	
} 
