package gz.itcast.exception.b_�Զ����쳣;

import java.util.Scanner;

/*
 * �Զ����쳣������
 */
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int score = sc.nextInt();

		Teacher t = new Teacher();
		try {
			t.check(score);
		} catch (MyException e) {
			e.printStackTrace();//��ӡ�쳣��Ϣ
		}
	}
}