package j_�����ڲ����ڿ����е�Ӧ��.cv;

public class InnerTest2 {
public static void main(String[] args){
	//����
	PersonDemo pd=new PersonDemo();
	Person p=new Student();
	pd.method(p);
	System.out.print("-----------------");

	//�����ڲ����ڿ����е�ʹ��
	//�����ڲ���ı����Ǽ̳и�����ʵ���˽ӿڵ�������������
	//�����ڲ���
/*	��ʽ��
	  new �������߽ӿ���(){
	  ��д������
	  };
	  
	  */
     pd.method(new Person(){
		public void study(){
			System.out.println("�ú�ѧϰ��������");
		}
	});

}
}
