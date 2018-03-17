package d_Array;

import java.util.Arrays;

import org.junit.Test;

public class ArrayDemo {

	/**
	 * 数组排序之冒泡排序 
	 * 		相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
	 * 
	 * @throws Exception
	 */
	@Test
	public void test_Pop() throws Exception {
		// 定义一个数组
		int[] arr = { 24, 12, 34, 45, 56 };
		System.out.println("排序前：");
		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// 24 12 34 45 56
		}

		// 对数组进行排序，这里使用冒泡排序
		for (int x = 0; x < arr.length - 1; x++) {//比较次数
			for (int y = 0; y < arr.length - 1 - x; y++) {//第n轮进行的比较次数
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}

		System.out.println("排序后：");
		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");//12 24 34 45 56 
		}

	}
	
	
	
	
	/**
	 * 数组排序之选择排序 ：
	 *		从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
	 * @throws Exception
	 */
	@Test
	public void test_Select() throws Exception {
		// 定义一个数组
		int[] arr = { 24, 12, 34, 45, 56 };
		System.out.println("排序前：");
		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// 24 12 34 45 56
		}

		// 对数组进行排序，这里使用选择排序
		for(int i = 0;i < arr.length-1;i++){//总共要进行比较的次数
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println("排序后：");
		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");//12 24 34 45 56 
		}
		
	}
	
	
	
	
	/**
	 * 对一个数组进行冒泡排序  这个案例可以不用看，其本质就是为了熟悉冒泡排序的使用
	 *
	 *
	 * 把字符串中的字符进行排序。
	 * 		举例："dacgebf"
	 * 		结果："abcdefg"
	 * 
	 * 分析：
	 * 		A:定义一个字符串
	 * 		B:把字符串转换为字符数组
	 * 		C:把字符数组进行排序
	 * 		D:把排序后的字符数组转成字符串
	 * 		E:输出最后的字符串
	 */
	@Test
	public void test_1() throws Exception {
		// 定义一个字符串
		String s = "dacgebf";

		// 把字符串转换为字符数组
		char[] chs = s.toCharArray();

		// 把字符数组进行排序  冒泡排序
		for (int x = 0; x < chs.length - 1; x++) {
			for (int y = 0; y < chs.length - 1 - x; y++) {
				if (chs[y] > chs[y + 1]) {
					char temp = chs[y];
					chs[y] = chs[y + 1];
					chs[y + 1] = temp;
				}
			}
		}

		//把排序后的字符数组转成字符串
		String result = String.valueOf(chs);
		
		//输出最后的字符串
		System.out.println("result:"+result);//result:abcdefg
	}
	
	
	/**
	 * 查找：
	 * 		基本查找:数组元素无序(从头找到尾)
	 * 		二分查找(折半查找):数组元素有序
	 * 
	 * 二分查找原理：
	 * 分析：
	 * 		A:定义最大索引，最小索引
	 * 		B:计算出中间索引
	 * 		C:拿中间索引的值和要查找的值进行比较
	 * 			相等：就返回当前的中间索引
	 * 			不相等：
	 * 				大	左边找
	 * 				小	右边找
	 * 		D:重新计算出中间索引
	 * 			大	左边找
	 * 				max = mid - 1;
	 * 			小	右边找
	 * 				min = mid + 1;
	 * 		E:回到B
	 * 	
	 * 
	 * 
	 * 二分查找需要注意的地方：
	 * 		使用二分查找的数组必须是有序的。
	 * 		 因为数组本身是无序的，所以这种情况下的查找不能使用二分查找。
	 * 			所以你先排序了，但是你排序的时候已经改变了我最原始的元素索引。
	 * @param args
	 */
	@Test
	public void test_erFenSelect() throws Exception {
		//定义一个数组
		int[] arr = {11,22,33,44,55,66,77};
		
		//写功能实现
		int index = erSelect(arr, 33);
		System.out.println("index:"+index);//index:2
		
		//假如这个元素不存在的话有什么现象呢？不会返回结果
		//int index2 = erSelect(arr,333);
		//System.out.println("index2:"+index2);
	}
	
	/**
	 * @param arr  要进行折半查找的数组
	 * @param value 要进行查找的元素
	 * @return 返回要查找的元素在数组中对应的的索引.如果要进行查找的元素在要进行折半查找的数组中找不到，则不返回任何值。
	 */
	public static int erSelect(int[] arr,int value){
		/** 分析(下面的就是二分查找的本质规律)：
		 * 		A:定义最大索引，最小索引
		 * 		B:计算出中间索引
		 * 		C:拿中间索引的值和要查找的值进行比较
		 * 			相等：就返回当前的中间索引
		 * 			不相等：
		 * 				大	左边找
		 * 				小	右边找
		 * 		D:重新计算出中间索引
		 * 			大	左边找
		 * 				max = mid - 1;
		 * 			小	右边找
		 * 				min = mid + 1;
		 * 		E:回到B
		 */
		//定义最大索引
		int max = arr.length-1;
		int min = 0;
		//计算出中间索引
		int middle = (max + min)/2;
		
		//拿中间索引的值和要查找的值进行比较
		while(arr[middle]!=value){
			//大	左边找
			if(arr[middle]>value){
				max = middle - 1;
			}
			//小	右边找
			if(arr[middle]<value){
				min = middle + 1;
			}
			
			//计算出中间索引
			middle = (max + min)/2;
		}
		
		return middle;
	}
	
	
	/*
	 * Arrays:针对数组进行操作的工具类。比如说排序和查找。
	 * 		1:public static String toString(int[] a); 把数组转成字符串
	 * 		2:public static void sort(int[] a); 对数组进行排序     底层是快速排序
	 * 		3:public static int binarySearch(int[] a,int key); 二分查找 . 前提是要该数组有序。如果key在数组中不存在，则返回一个没有意义的值 -6.
	 */
	@Test
	public void test_ArraysTool() throws Exception {
		// 定义一个数组
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a) 把数组转成字符串
		System.out.println("排序前：" + Arrays.toString(arr));//排序前：[24, 69, 80, 57, 13]

		// public static void sort(int[] a) 对数组进行排序
		Arrays.sort(arr);
		System.out.println("排序后：" + Arrays.toString(arr));//排序后：[13, 24, 57, 69, 80]

		// [13, 24, 57, 69, 80]
		// public static int binarySearch(int[] a,int key) 二分查找
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));//binarySearch:2
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 5711));//binarySearch:-6
	}
	
	
	
	
}
