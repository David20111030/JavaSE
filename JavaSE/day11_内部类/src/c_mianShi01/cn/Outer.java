package c_mianShi01.cn;
//�����⣺Ҫ��ֱ����30��20��10
//ע�⣺ ע�⣺1���ڲ�����ⲿ��û�м̳й�ϵ    
//        2��ͨ���ⲿ�����޶�this����
//         outer.this
public class Outer {
	public int num=10;
	class Inner{
		public int num=20;
		public void show(){
			int num=30;
			System.out.println(num);//30  �ͽ�ԭ��
			System.out.println(this.num);//20
			System.out.println(Outer.this.num);//10
			System.out.println(new Outer().num);//10
		}
	}

}
