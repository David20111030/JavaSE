package gz.itcast.a_06;

import java.util.Date;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("开始执行："+new Date());
		
		//我要休息10秒钟，亲，不要打扰我
		try{
			Thread.sleep(10000);//让线程休眠10秒钟
		}catch(InterruptedException e){
			System.out.println("线程被终止了");
		}
		
		System.out.println("结束时间："+new Date());
	}	
}
