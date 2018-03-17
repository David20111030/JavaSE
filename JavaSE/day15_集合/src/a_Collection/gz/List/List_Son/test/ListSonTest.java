package a_Collection.gz.List.List_Son.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ListSonTest {
	public static void main(String[] args) {
		test1();
		
		System.out.println("----test2()----");
		
		test2();
		
		System.out.println("----test3()-----");
		
		test3();
		
	}
	
	/*
	 * 集合的嵌套遍历
	 * 需求：
	 * 		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
	 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
	 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
	 * 		就是这个样子的：ArrayList<ArrayList<Student>>
	 */
	public static void test1(){
		 //创建大集合
		ArrayList<ArrayList<Student>> bigArrayList=new ArrayList<ArrayList<Student>>();
		
		//创建第一个班级的学生集合
		ArrayList<Student> firstArrayList=new ArrayList<Student>();
		//创建学生
		Student s1 = new Student("唐僧", 30);
		Student s2 = new Student("孙悟空", 29);
		Student s3 = new Student("猪八戒", 28);
		Student s4 = new Student("沙僧", 27);
		Student s5 = new Student("白龙马", 26);		
		
		//学生进第一个班级
		firstArrayList.add(s1);
		firstArrayList.add(s2);
		firstArrayList.add(s3);
		firstArrayList.add(s4);
		firstArrayList.add(s5);
		
		//把第一个班级存储到学生系统中
		bigArrayList.add(firstArrayList);
		
		// 创建第二个班级的学生集合
		ArrayList<Student> secondArrayList = new ArrayList<Student>();
		// 创建学生
		Student s11 = new Student("诸葛亮", 30);
		Student s22 = new Student("司马懿", 28);
		Student s33 = new Student("周瑜", 26);
		// 学生进班
		secondArrayList.add(s11);
		secondArrayList.add(s22);
		secondArrayList.add(s33);
		// 把第二个班级存储到学生系统中
		bigArrayList.add(secondArrayList);

		// 创建第三个班级的学生集合
		ArrayList<Student> thirdArrayList = new ArrayList<Student>();
		// 创建学生
		Student s111 = new Student("宋江", 40);
		Student s222 = new Student("吴用", 35);
		Student s333 = new Student("高俅", 30);
		Student s444 = new Student("李师师", 22);
		// 学生进班
		thirdArrayList.add(s111);
		thirdArrayList.add(s222);
		thirdArrayList.add(s333);
		thirdArrayList.add(s444);
		// 把第三个班级存储到学生系统中
		bigArrayList.add(thirdArrayList);		
		
		
		//遍历集合
		for(ArrayList<Student> stu:bigArrayList){
			for(Student s:stu){
				System.out.println(s.getName()+"---"+s.getAge());
			}
		}
		/**
		 * 遍历结果：
		 * 	唐僧---30
			孙悟空---29
			猪八戒---28
			沙僧---27
			白龙马---26
			诸葛亮---30
			司马懿---28
			周瑜---26
			宋江---40
			吴用---35
			高俅---30
			李师师---22
		 */
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	/*
	 * 获取10个1-20之间的随机数，要求不能重复
	 * 
	 * 用数组实现，但是数组的长度是固定的，长度不好确定。
	 * 所以我们使用集合实现。
	 * 
	 * 分析：
	 * 		A:创建产生随机数的对象
	 * 		B:创建一个存储随机数的集合。
	 * 		C:定义一个统计变量。从0开始。
	 * 		D:判断统计遍历是否小于10
	 * 			是:先产生一个随机数，判断该随机数在集合中是否存在。
	 * 					如果不存在:就添加，统计变量++。
	 * 					如果存在:就不搭理它。
	 * 			否：不搭理它
	 * 		E:遍历集合
	 */	
	public static void test2(){
		//创建产生随机数的对象
		Random r=new Random();
		
		//创建一个存储随机数的集合
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		//定义一个统计变量。从0开始
		for(int count=0;count<10;count++){
			int a=r.nextInt(21);
			if(!array.contains(a)){
				array.add(a);
			}else{
				count--;
			}
		}
		
		//遍历集合
		Iterator it=array.iterator();
		while(it.hasNext()){
			int a=(int)it.next();
			System.out.print(a+" ");
		}
	}
	
	
	/*
	 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
	 * 
	 * 分析：
	 * 		A:创建键盘录入数据对象
	 * 		B:键盘录入多个数据,我们不知道多少个，所以用集合存储
	 * 		C:以0结束,这个简单，只要键盘录入的数据是0，我就不继续录入数据了
	 * 		D:把集合转成数组
	 * 		E:对数组排序
	 * 		F:获取该数组中的最大索引的值
	 */	
	public static void test3(){
		//创建键盘录入对象
		Scanner sc=new Scanner(System.in);
		
		//键盘录入多个数据，我们不知道多少个，所有用集合存储
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		//以0结束,这个简单，只要键盘录入的数据是0，我就不继续录入数据了
		while(true){
			System.out.println("请输入数据:");
			int number=sc.nextInt();
			if(number==0){
				break;
			}else{
				array.add(number);
			}
		}
		
		
		
		//把集合转成数组
		Object[] arr=array.toArray();
		
		//这种方法也可以  方法一：   Arrays类是专门用于操作数组的工具类
		Arrays.sort(arr);
		System.out.println("最大值为:"+arr[arr.length-1]);
		
		//方法二
		int max=(int)arr[0];
		//对数组进行排序
		for(int i=0;i<arr.length;i++){
			if((int)arr[i]>max){
				max=(int)arr[i];
			}
		}
		
		System.out.println("您输入的最大值为："+max);
		
		
		
		
	}
	
	
	
	
	
}
