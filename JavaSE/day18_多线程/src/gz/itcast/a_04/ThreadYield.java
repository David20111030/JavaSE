package gz.itcast.a_04;

public class ThreadYield extends Thread {
	@Override
	public void run() {
		for(int x=0;x<100;x++){
			System.out.println(getName()+":"+x);
			Thread.yield();// 暂停当前正在执行的线程对象，并执行其他线程。
		}
	}
}
