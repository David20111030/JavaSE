package gz.itcast.b_04线程安全问题_锁_同步代码块;

public class MyRunnable implements Runnable{
	
	//定义100张票
	private int tickets = 100;
	
	//创建锁对象
	Object obj = new Object();
	
	/**
	 * 某电影院目前正在上映贺岁大片(红高粱,少林寺传奇藏经阁)，
	 * 共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
	 * 用实现Runnable接口的方式来做
	 */
	@Override
	public void run() {
		while(true){
			//把需要同步的代码锁起来
			synchronized (obj) {// 发现这里的代码将来是会被锁上的，所以t1进来后，就锁了。(关)
				while(true){
					//执行流程
					// t1,t2,t3都能走到这里
					// 假设t1抢到CPU的执行权，t1就要进来
					// 假设t2抢到CPU的执行权，t2就要进来,发现门是关着的，进不去。所以就等着。
					// 门(开,关)
					if(tickets!=0){
						//让线程睡眠100毫秒
						try {
							Thread.sleep(1L);// t1就睡眠了
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");////窗口1正在出售第100张票
					}else{
						return;//如果没票了就结束吧
					}
					//t1就出来可，然后就开门。(开)
				}
			}
			
			
		}
		
	}
}
