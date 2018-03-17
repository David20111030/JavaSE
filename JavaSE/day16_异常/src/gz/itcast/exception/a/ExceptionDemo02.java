package gz.itcast.exception.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A：一个异常
 * B：二个异常的处理
 * 		a:每一个写一个try...catch
 * 		b:写一个try，多个catch
 * 			try{
 * 			  ...
 * 			}catch(异常类名 变量名){
 * 			  ...
 * 			}catch(异常类名  变量名){
 * 			  ...
 * 			}
 * 			...
 * 	  注意事项：
 * 		1、能明确的尽量明确，不要用大的来处理
 * 		2、平级关系的异常谁欠谁后无所谓，如果出现了子父关系，父必须在后面。
 * 注意：
 * 		一旦try里面除了问题，就会在这里把问题给跑出去，然后和catch里面的问题进行匹配，
 * 				一旦有匹配的，就执行catch里面的处理，然后结束了try...catch,之后据徐执行后面的语句。
 * 
 * 
 * 
 */	
public class ExceptionDemo02 {
	public static void main(String[] args) {
		// method1();

		// method2();

		// method3();

		//method4();
		
		//method5();
		
		//method6();
		
		
		method7();
	}
	
	/**
	 * 在try里面发现问题后，jvm会帮我们生成一个异常对象，然后把这个对象抛出，然后和catch里面的类进行匹配。
	 * 	如果该对象是某个类型的，就会执行该catch里面的处理信息。
	 * 
	 * 异常中药了解的几个方法：
	 * 	public String getMessage();异常的消息字符串
	 *  public String toString();返回异常的简单信息描述
	 *  		此对象的类的  name(全路径名)
	 *  		": " (冒号和一个空格)
	 *  		调用此对象 getLocalizedMessage()方法的结果（默认返回的是getMessage()的内容）
	 *  printStackTrace();获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。把信息输出在控制台。
	 *  
	 */
	public static void method7(){
		String s = "2014-11-20";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d = sdf.parse(s); // 创建了一个ParseException对象，然后抛出去，和catch里面进行匹配
			System.out.println(d);
		} catch (ParseException e) { // ParseException e = new ParseException();
			// ParseException
			// e.printStackTrace();

			// getMessage();//异常的消息字符串
			 //System.out.println(e.getMessage());
			//上一行代码的执行结果： Unparseable date: "2014-11-20"

			// toString();返回异常的简单信息描述
			// System.out.println(e.toString());//返回异常的简单信息描述
			// 上一行代码的执行结果：java.text.ParseException: Unparseable date: "2014-11-20"
			
			e.printStackTrace();//获取异常类名和异常信息 
			 /**上一行代码的结果：
			  * java.text.ParseException: Unparseable date: "2014-11-20"
				at java.text.DateFormat.parse(DateFormat.java:357)
				at gz.itcast.exception.a.ExceptionDemo02.method7(ExceptionDemo02.java:65)
				at gz.itcast.exception.a.ExceptionDemo02.main(ExceptionDemo02.java:45)
			  */
		}
		
		System.out.println("over");
			
		
	}
	
	
	
	/**
	 * 编译时异常和运行时异常的区别：
	 * 	编译期异常：Java程序必须显示处理，否则程序就会发生错误，无法通过编译。
	 *  运行期异常：无需显示处理，也可以和编译时异常一样处理。
	 */
	public static void method6(){
		String s="2017-02-15";
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//如果使用这行代码就会出现异常
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date d=sdf.parse(s);//会出现编译期异常
			System.out.println(d);//Wed Feb 15 00:00:00 CST 2017
		}catch(ParseException e){
			System.out.println("解析日期出问题了");
		}
	}
	
	

	/**
	 * JDK7出现了一个新的异常处理方案：
	 * 		try{
	 * 		 ...
	 * 		}catch(异常名1 | 异常名2 |...  变量){
	 * 		  ...
	 * 		}
	 * 		
	 * 	注意：这个方式虽然简洁，但是也不够好。
	 * 	注意这种异常处理方式：
	 * 		A：处理方式是一致的。（实际开发中，好多时候可能就是针对同类型的问题，也给出一个处理）
	 * 		B:多个异常间必须是平级关系
	 * 
	 * 
	 * 
	 * 
	 */
	public static void method5(){
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

//		 try {
//			 System.out.println(a / b);
//			 System.out.println(arr[3]);
//			 System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
//		 } catch (ArithmeticException e) {
//			 System.out.println("除数不能为0");
//		 } catch (ArrayIndexOutOfBoundsException e) {
//			 System.out.println("你访问了不该的访问的索引");
//		 } catch (Exception e) {
//			 System.out.println("出问题了");
//		 }
		 /**
		  * 结果：
		  * 除数不能为0
		  */
		 
		 
		// JDK7的处理方案
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出问题了");
		}
		/**
		 * 打印结果：
		 * 	出问题了
		 */
		
		System.out.println("over");
	}
		
		
	
	
	
	//多个异常的处理方式
	public static void method4() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		// 爷爷在最后
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		} catch (Exception e) {
			System.out.println("出问题了");
		}

		// 爷爷在前面是不可以的 这种方式是错误的，应该把精确的放在前面
//		 try {
//			 System.out.println(a / b);
//			 System.out.println(arr[3]);
//			 System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
//		 } catch (Exception e) {
//			 System.out.println("出问题了");
//		 } catch (ArithmeticException e) {
//			 System.out.println("除数不能为0");
//		 } catch (ArrayIndexOutOfBoundsException e) {
//			 System.out.println("你访问了不该的访问的索引");
//		 }

		System.out.println("over");
	}

	// 两个异常的处理   第二种处理方式
	public static void method3() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };

		try {
			System.out.println(arr[3]);
			System.out.println(a / b);
			// System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		}

		System.out.println("over");
	}

	// 两个异常   第一种处理方式
	public static void method2() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}

		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("你访问了不该的访问的索引");
		}

		System.out.println("over");
	}

	// 一个异常
	public static void method1() {
		// 第一阶段
		int a = 10;
		// int b = 2;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
		}

		// 第二阶段
		System.out.println("over");
	}
}