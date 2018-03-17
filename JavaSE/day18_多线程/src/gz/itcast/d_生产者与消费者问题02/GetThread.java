package gz.itcast.d_生产者与消费者问题02;
//消费者
public class GetThread implements Runnable{
	private Student s;
	
	public GetThread(Student s){
		this.s = s;
	}
	
	 
	@Override
	public void run() {
		while(true){
			s.get();
		}
		
	}
	
}
