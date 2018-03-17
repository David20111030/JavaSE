package gz.itcast.d_生产者与消费者问题.o1;

public class SetThread implements Runnable {

	private Student s;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		// Student s = new Student();
		s.name = "林青霞";
		s.age = 27;
	}

}
