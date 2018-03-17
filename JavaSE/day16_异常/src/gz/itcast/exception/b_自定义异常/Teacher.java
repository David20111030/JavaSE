package gz.itcast.exception.b_自定义异常;

public class Teacher {
//	public void check(int score) throws MyException {
//		if (score > 100 || score < 0) {
//			throw new MyException("分数必须在0-100之间");
//		} else {
//			System.out.println("分数没有问题");
//		}
//	}

	// 针对MyException继承自RuntimeException
	 public void check(int score) {
		 if (score > 100 || score < 0) {
			 throw new MyException();//抛出一个自定义异常对象
		 } else {
			 System.out.println("分数没有问题");
		 }
	 }
}
