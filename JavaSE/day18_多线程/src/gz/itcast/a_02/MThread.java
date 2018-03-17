package gz.itcast.a_02;

public class MThread extends Thread{
	@Override
	public void run() {
		for(int x = 0;x<200;x++){
			System.out.println("ÄãÊÇÉµ±Æ:"+x);
		}
	}
}
