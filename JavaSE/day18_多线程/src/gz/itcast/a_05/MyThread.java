package gz.itcast.a_05;

import java.util.Date;

public class MyThread extends Thread{
	@Override
	public void run() {
		for(int x = 0;x<100;x++){
			System.out.println(getName()+":"+x+",日期："+new Date());
			
			//困了，让线程稍微休息1秒钟
			try{
				Thread.sleep(1000);//设置线程休眠时间为1秒 在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
