package gz.itcast.exception.a;

import org.junit.Test;

/**
 * 程序的异常：Throwable
 * 		严重问题：Error
 * 如果我们不处理。这种问题一般都是很严重的，比如说内存溢出。
 * 		问题：Exception
 * 		  编译期问题：不是RuntimeException的异常  必须处理的，因为你不处理，编译就不能通过。
 * 		 运行期问题：RuntimeException 这种问题我们也不处理，因为是你的问题，而且这个问题出现肯定是我们的代码不够严谨，需要修正代码的。
 * 
 * 如果程序出现了问题，我们没有做任何处理，最终jvm会做出默认的处理。----》把异常的名称，原因及出现的问题等信息输出在控制台，同时会结束程序。
 * 		
 * @author 贤元
 *
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		//test1();
		System.out.println("---test2()---");
		
		test2();
	
		
	}
	
	
	public static void test1(){
		//第一阶段
		int a=10;
		int b=0;
		System.out.println(a/b);//这句代码会报错
		
		//第二阶段
		System.out.println("over");
	}
	
	
	/**
	 * 我们自己如何处理异常呢？
	 * A：try...catch...finally
	 * B: throws 抛出
	   try...catch...finally的处理格式:
	   		try{
	   			可能出现问题的代码;
	   		}catch(异常名 变量){
	   			针对问题的处理;
	   		}finally{
	   			释放资源;
	   		}
	 
	   变形格式：
	   	try{
	   		可能出现问题的代码;
	   	}catch(异常名 变量){
	   		针对问题的处理;
	   	}
	 注意：
	 	A：try里面的代码越少越好
	 	B：catch里面必须有内容，哪怕是给出一个简单的提示。
	 
	 * 
	 */
	public static void test2(){
		//第一阶段
		int a=10;
		int b=0;
		
		try{
			System.out.println(a/b);
		}catch(ArithmeticException ae){
			System.out.println("除数不能为0");
		}
		
		//第二阶段
		System.out.println("over");
		
		/**
		 * 打印结果：
		 * 	除数不能为0
		 *  over
		 */
		
	}
}
