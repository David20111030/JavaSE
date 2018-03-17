package a_Collection.gz.Set.Set_Son.TreeSet;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * TreeSet:能够对元素按照某种规则进行排序
 * 排序有两种方式：
 * 		A:自然排序  
 * 			实现Comparable接口
 * 		B:比较器排序
 * 			实现Comparator接口.（可以通过匿名内部类来实现比较器排序）
 * TreeSet集合的特点：排序和唯一。
 * 	通过观察TreeSet的add()方法，我们知道最终要看TreeMap的put方法
 * @author 贤元
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		test1();
		
		System.out.println("---test2()----");
		
		test2();
		
		System.out.println("---test3()---");
		test3();
		
		System.out.println("---test4()---");
		test4();
		
		System.out.println("---test5()---");
		test5();
		
	}
	
	/**
	 * 自然排序
	 */
	public static void test1(){
		//创建集合对象
		//自然顺序进行排序
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		//创建元素并添加
		// 20,18,23,22,17,24,19,18,24
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18);
		ts.add(24);
		
		//使用增强for遍历集合
		for(Integer i:ts){
			System.out.print(i+" ");
		}
		//遍历结果：17 18 19 20 22 23 24 
		
	}
	
	
	/**
	 * TreeSet存储自定义对象并保证排序和唯一。
	 *	
	 *	A：你没有告诉我们怎么排序
	 *			自然排序，按照年龄从小到大排序
	 *	B：元素什么情况算唯一你也没告诉我
	 *			成员变量值都相同即为同一个元素
	 *
	 * 
	 */
	public static void test2(){
		//创建集合对象
		TreeSet<Student> ts=new TreeSet<Student>();
		
		//创建元素
		// 创建元素
		Student s1 = new Student("linqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("linqingxia", 27);
		Student s5 = new Student("liushishi", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingy", 22);

		// 添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		
		
		//遍历
		for(Student s:ts){
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
		/**
		 * 遍历结果：
		 * 	fengqingy---22
			liushishi---22
			wanglihong---23
			linqingxia---27
			zhangguorong---29
			wuqilong---40
		 */
		
		
	}
	
	
	
	/**
	 * 需求：按照姓名的长度排序（自然排序）
	 */
	public static void test3(){
		//创建集合对象
		TreeSet<Student> ts=new TreeSet<Student>();
		
		//创建元素
		Student s1 = new Student("linqingxia", 27);
		Student s2 = new Student("zhangguorong", 29);
		Student s3 = new Student("wanglihong", 23);
		Student s4 = new Student("linqingxia", 27);
		Student s5 = new Student("liushishi", 22);
		Student s6 = new Student("wuqilong", 40);
		Student s7 = new Student("fengqingy", 22);
		Student s8 = new Student("linqingxia", 29);

		//添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		//使用增强for遍历
		for(Student s:ts){
			System.out.println(s.getName()+"--"+s.getAge());
		}
		/**
		 * 遍历结果：
		 * fengqingy--22
			liushishi--22
			wanglihong--23
			linqingxia--27
			linqingxia--29
			zhangguorong--29
			wuqilong--40
		 */
		
	}
	
	
	/**
	 * 需求：请按照姓名的长度排序
	 * 
	 * TreeSet集合保证元素排序和唯一性的原理
	 * 唯一性：是根据比较的返回时否是0来决定.（如果返回的是0，则为同一个元素）
	 * 排序：
	 * 		A：自然排序(元素具备比较性)
	 * 			让元素所属的类实现自然排序接口 Comparable、
	 * 		B：比较器排序(集合具备比较性)
	 * 			让集合的构造方法接收一个比较器接口的子类对象Comparator
	 * 
	 */			
	public static void test4(){
		//创建集合对象
		// public TreeSet(Comparator comparator) //比较器排序
		//比较器排序的第一种实现方式
		//TreeSet<Student2> ts=new TreeSet<Student2>(new MyComparator());//比较器排序
		
		
		//比较器排序的第二种实现方式
		//如果一个方法的参数是接口，那么真正要的是接口的实现类的对象
		//而匿名内部类就是可以实现这个东西
		TreeSet<Student2> ts=new TreeSet<Student2>(new Comparator<Student2>() {

			@Override
			public int compare(Student2 s1,  Student2 s2) {
				//姓名长度
				int num=s1.getName().length()-s2.getName().length();
				//姓名内容
				int num2= num==0?s1.getName().compareTo(s2.getName()):num;
				//年龄
				int num3= num2==0?s1.getAge()-s2.getAge():num2;
						
				return num3;
			}
		});
		
		
		// 创建元素
		Student2 s1 = new Student2("linqingxia", 27);
		Student2 s2 = new Student2("zhangguorong", 29);
		Student2 s3 = new Student2("wanglihong", 23);
		Student2 s4 = new Student2("linqingxia", 27);
		Student2 s5 = new Student2("liushishi", 22);
		Student2 s6 = new Student2("wuqilong", 40);
		Student2 s7 = new Student2("fengqingy", 22);
		Student2 s8 = new Student2("linqingxia", 29);

		// 添加元素
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		ts.add(s7);
		ts.add(s8);

		// 使用增强for遍历遍历
		for (Student2 s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
		/**
		 * 遍历结果：
			wuqilong---40
			fengqingy---22
			liushishi---22
			linqingxia---27
			linqingxia---29
			wanglihong---23
			zhangguorong---29
		 */

	}

	
	/*
	 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台
	 * 
	 * 分析：
	 * 		A:定义学生类
	 * 		B:创建一个TreeSet集合
	 * 		C:总分从高到底如何实现呢?		
	 * 		D:键盘录入5个学生信息
	 * 		E:遍历TreeSet集合
	 * 
	 * 使用比较器排序。(得实现比较器排序接口Comparator)
	 */
	public static void test5(){
		//创建一个TreeSet集合  使用比较器排序(第二种实现方式)
		TreeSet<Student3> ts=new TreeSet<Student3>(new Comparator<Student3>() {

			@Override
			public int compare(Student3 s1, Student3 s2) {
				//总分从高到低
				int num= s1.getSum()-s2.getSum();
				//总分相同，语文成绩不一定相同
				int num2= num==0?s1.getChinese()-s1.getChinese():num;
				//语文成绩相同，数学成绩不一定相同
				int num3= num2==0?s1.getMath()-s2.getMath():num2;
				//数学成绩相同，英语成绩不一定相同
				int num4= num3==0?s1.getEnglish()-s2.getEnglish():num3;
				//英语成绩相同，姓名不一定相同
				int num5= num4==0?s1.getName().compareTo(s2.getName()):num4;
				
				return num5;//如果返回值为0，则代表元素相同，不添加到集合中
			}
		});
		
		System.out.println("学生信息录入开始：");
		//键盘录入5个学生信息
		for(int x=1;x<=5;x++){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入第"+x+"个学生的姓名");
			String name=sc.nextLine();
			System.out.println("请输入第" + x + "个学生的语文成绩:");
			String chineseString = sc.nextLine();
			System.out.println("请输入第" + x + "个学生的数学成绩:");
			String mathString = sc.nextLine();
			System.out.println("请输入第" + x + "个学生的英语成绩:");
			String englishString = sc.nextLine();
			
			//把数据封装到学生对象中
			Student3 s=new Student3();
			s.setName(name);
			s.setChinese(Integer.parseInt(chineseString));
			s.setMath(Integer.parseInt(mathString));
			s.setEnglish(Integer.parseInt(englishString));
			
			//把学生对象添加到集合中
			ts.add(s);
		}
		
		System.out.println("学生信息录入完毕！");
		
		System.out.println("学生信息从高到低排序如下：");
		System.out.println("姓名\t语文成绩\t数学成绩\t英语成绩");
		
		//使用增强for遍历集合
		for(Student3 s:ts){
			System.out.println(s.getName() + "\t" + s.getChinese() + "\t"
					+ s.getMath() + "\t" + s.getEnglish());
		}
		
		
	}
	
	
	
	
	
	
	
	
}
