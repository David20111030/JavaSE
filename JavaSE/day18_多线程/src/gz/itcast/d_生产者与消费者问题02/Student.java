package gz.itcast.d_生产者与消费者问题02;
//改进版
public class Student {
	private String name;
	private int age;
	private boolean flag;//默认情况下是没有数据，如果是true，说明有数据
	
	//同步方法
	public synchronized void set(String name,int age){
		//如果有数据，就等待
		if(this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//设置数据
		this.name = name;
		this.age = age;
		
		//修改标记
		this.flag = true;
		this.notify();//唤醒当前正在沉睡线程
	}
	
	//同步方法
	public synchronized void get(){
		//如果没有数据，就等待
		if(!this.flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//获取数据
		System.out.println(this.name+"---"+this.age);
		
		//修改标记
		this.flag = false;
		this.notify();//唤醒当前正在沉睡的线程
	}
	
}
