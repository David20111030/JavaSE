package gz.itcast.exception.b_�Զ����쳣;

public class Teacher {
//	public void check(int score) throws MyException {
//		if (score > 100 || score < 0) {
//			throw new MyException("����������0-100֮��");
//		} else {
//			System.out.println("����û������");
//		}
//	}

	// ���MyException�̳���RuntimeException
	 public void check(int score) {
		 if (score > 100 || score < 0) {
			 throw new MyException();//�׳�һ���Զ����쳣����
		 } else {
			 System.out.println("����û������");
		 }
	 }
}
