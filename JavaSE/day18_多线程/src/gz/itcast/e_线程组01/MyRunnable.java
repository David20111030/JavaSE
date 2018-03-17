package gz.itcast.e_线程组01;

//实现多线程的第二种方式：实现Runnable接口
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int x = 0;x<100;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
			
		}

		
	}
}
