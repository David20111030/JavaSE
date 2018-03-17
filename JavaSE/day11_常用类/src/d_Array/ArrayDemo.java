package d_Array;

import java.util.Arrays;

import org.junit.Test;

public class ArrayDemo {

	/**
	 * ��������֮ð������ 
	 * 		����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ�����������������
	 * 
	 * @throws Exception
	 */
	@Test
	public void test_Pop() throws Exception {
		// ����һ������
		int[] arr = { 24, 12, 34, 45, 56 };
		System.out.println("����ǰ��");
		// ��������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// 24 12 34 45 56
		}

		// �����������������ʹ��ð������
		for (int x = 0; x < arr.length - 1; x++) {//�Ƚϴ���
			for (int y = 0; y < arr.length - 1 - x; y++) {//��n�ֽ��еıȽϴ���
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}

		System.out.println("�����");
		// ��������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");//12 24 34 45 56 
		}

	}
	
	
	
	
	/**
	 * ��������֮ѡ������ ��
	 *		��0������ʼ�����κͺ���Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ����������С������
	 * @throws Exception
	 */
	@Test
	public void test_Select() throws Exception {
		// ����һ������
		int[] arr = { 24, 12, 34, 45, 56 };
		System.out.println("����ǰ��");
		// ��������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// 24 12 34 45 56
		}

		// �����������������ʹ��ѡ������
		for(int i = 0;i < arr.length-1;i++){//�ܹ�Ҫ���бȽϵĴ���
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println("�����");
		// ��������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");//12 24 34 45 56 
		}
		
	}
	
	
	
	
	/**
	 * ��һ���������ð������  ����������Բ��ÿ����䱾�ʾ���Ϊ����Ϥð�������ʹ��
	 *
	 *
	 * ���ַ����е��ַ���������
	 * 		������"dacgebf"
	 * 		�����"abcdefg"
	 * 
	 * ������
	 * 		A:����һ���ַ���
	 * 		B:���ַ���ת��Ϊ�ַ�����
	 * 		C:���ַ������������
	 * 		D:���������ַ�����ת���ַ���
	 * 		E:��������ַ���
	 */
	@Test
	public void test_1() throws Exception {
		// ����һ���ַ���
		String s = "dacgebf";

		// ���ַ���ת��Ϊ�ַ�����
		char[] chs = s.toCharArray();

		// ���ַ������������  ð������
		for (int x = 0; x < chs.length - 1; x++) {
			for (int y = 0; y < chs.length - 1 - x; y++) {
				if (chs[y] > chs[y + 1]) {
					char temp = chs[y];
					chs[y] = chs[y + 1];
					chs[y + 1] = temp;
				}
			}
		}

		//���������ַ�����ת���ַ���
		String result = String.valueOf(chs);
		
		//��������ַ���
		System.out.println("result:"+result);//result:abcdefg
	}
	
	
	/**
	 * ���ң�
	 * 		��������:����Ԫ������(��ͷ�ҵ�β)
	 * 		���ֲ���(�۰����):����Ԫ������
	 * 
	 * ���ֲ���ԭ��
	 * ������
	 * 		A:���������������С����
	 * 		B:������м�����
	 * 		C:���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
	 * 			��ȣ��ͷ��ص�ǰ���м�����
	 * 			����ȣ�
	 * 				��	�����
	 * 				С	�ұ���
	 * 		D:���¼�����м�����
	 * 			��	�����
	 * 				max = mid - 1;
	 * 			С	�ұ���
	 * 				min = mid + 1;
	 * 		E:�ص�B
	 * 	
	 * 
	 * 
	 * ���ֲ�����Ҫע��ĵط���
	 * 		ʹ�ö��ֲ��ҵ��������������ġ�
	 * 		 ��Ϊ���鱾��������ģ�������������µĲ��Ҳ���ʹ�ö��ֲ��ҡ�
	 * 			�������������ˣ������������ʱ���Ѿ��ı�������ԭʼ��Ԫ��������
	 * @param args
	 */
	@Test
	public void test_erFenSelect() throws Exception {
		//����һ������
		int[] arr = {11,22,33,44,55,66,77};
		
		//д����ʵ��
		int index = erSelect(arr, 33);
		System.out.println("index:"+index);//index:2
		
		//�������Ԫ�ز����ڵĻ���ʲô�����أ����᷵�ؽ��
		//int index2 = erSelect(arr,333);
		//System.out.println("index2:"+index2);
	}
	
	/**
	 * @param arr  Ҫ�����۰���ҵ�����
	 * @param value Ҫ���в��ҵ�Ԫ��
	 * @return ����Ҫ���ҵ�Ԫ���������ж�Ӧ�ĵ�����.���Ҫ���в��ҵ�Ԫ����Ҫ�����۰���ҵ��������Ҳ������򲻷����κ�ֵ��
	 */
	public static int erSelect(int[] arr,int value){
		/** ����(����ľ��Ƕ��ֲ��ҵı��ʹ���)��
		 * 		A:���������������С����
		 * 		B:������м�����
		 * 		C:���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
		 * 			��ȣ��ͷ��ص�ǰ���м�����
		 * 			����ȣ�
		 * 				��	�����
		 * 				С	�ұ���
		 * 		D:���¼�����м�����
		 * 			��	�����
		 * 				max = mid - 1;
		 * 			С	�ұ���
		 * 				min = mid + 1;
		 * 		E:�ص�B
		 */
		//�����������
		int max = arr.length-1;
		int min = 0;
		//������м�����
		int middle = (max + min)/2;
		
		//���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�
		while(arr[middle]!=value){
			//��	�����
			if(arr[middle]>value){
				max = middle - 1;
			}
			//С	�ұ���
			if(arr[middle]<value){
				min = middle + 1;
			}
			
			//������м�����
			middle = (max + min)/2;
		}
		
		return middle;
	}
	
	
	/*
	 * Arrays:���������в����Ĺ����ࡣ����˵����Ͳ��ҡ�
	 * 		1:public static String toString(int[] a); ������ת���ַ���
	 * 		2:public static void sort(int[] a); �������������     �ײ��ǿ�������
	 * 		3:public static int binarySearch(int[] a,int key); ���ֲ��� . ǰ����Ҫ�������������key�������в����ڣ��򷵻�һ��û�������ֵ -6.
	 */
	@Test
	public void test_ArraysTool() throws Exception {
		// ����һ������
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a) ������ת���ַ���
		System.out.println("����ǰ��" + Arrays.toString(arr));//����ǰ��[24, 69, 80, 57, 13]

		// public static void sort(int[] a) �������������
		Arrays.sort(arr);
		System.out.println("�����" + Arrays.toString(arr));//�����[13, 24, 57, 69, 80]

		// [13, 24, 57, 69, 80]
		// public static int binarySearch(int[] a,int key) ���ֲ���
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 57));//binarySearch:2
		System.out.println("binarySearch:" + Arrays.binarySearch(arr, 5711));//binarySearch:-6
	}
	
	
	
	
}
