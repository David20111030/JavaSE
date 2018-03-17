package a_FanXing;

import java.util.ArrayList;
import java.util.Iterator;
 /*  泛型：就是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型。
      	参数化类型，把类型当做参数一样的传递
      	
     格式：
      <数据类型>
    此处的数据类型只能是引用类型
    
    好处：
    A:把运行时期的问题提前到了编译期间
    B:避免了强制转换类型
    C:优化了程序设计，解决了黄色警告线
    
  泛型在哪些地方使用呢？
     看API,如果类、接口、抽象类后面跟的有<E>就要使用泛型。一般来说就是在集合中使用
     
     
     
     */
    	
public class Demo01 {
public static void main(String[] args) {
	//用ArrayList存储字符串元素，并遍历。用泛型改进
	ArrayList<String> array=new ArrayList<String>();
	array.add("hello");
	array.add("world");
	array.add("java");
	//遍历
	Iterator<String> it=array.iterator();
	while(it.hasNext()){
		String s=it.next();
		System.out.println(s);
	}
//--------------------------------------------------
	System.out.println("---------------------------------");
	
	//用for循环遍历
	for(int x=0;x<array.size();x++){
		String s1=array.get(x);
		System.out.println(s1);
	}
	
	
	
	
}
}
