package gz.itcast.b_04�̰߳�ȫ����_��_ͬ�������;

public class MyRunnable implements Runnable{
	
	//����100��Ʊ
	private int tickets = 100;
	
	//����������
	Object obj = new Object();
	
	/**
	 * ĳ��ӰԺĿǰ������ӳ�����Ƭ(�����,�����´���ؾ���)��
	 * ����100��Ʊ��������3����Ʊ������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ��
	 * ��ʵ��Runnable�ӿڵķ�ʽ����
	 */
	@Override
	public void run() {
		while(true){
			//����Ҫͬ���Ĵ���������
			synchronized (obj) {// ��������Ĵ��뽫���ǻᱻ���ϵģ�����t1�����󣬾����ˡ�(��)
				while(true){
					//ִ������
					// t1,t2,t3�����ߵ�����
					// ����t1����CPU��ִ��Ȩ��t1��Ҫ����
					// ����t2����CPU��ִ��Ȩ��t2��Ҫ����,�������ǹ��ŵģ�����ȥ�����Ծ͵��š�
					// ��(��,��)
					if(tickets!=0){
						//���߳�˯��100����
						try {
							Thread.sleep(1L);// t1��˯����
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+(tickets--)+"��Ʊ");////����1���ڳ��۵�100��Ʊ
					}else{
						return;//���ûƱ�˾ͽ�����
					}
					//t1�ͳ����ɣ�Ȼ��Ϳ��š�(��)
				}
			}
			
			
		}
		
	}
}
