package a_FanXing;

import java.util.ArrayList;
import java.util.Iterator;



/*
   �洢�Զ�����󲢱���
   ������
    1������ѧ����
    2���������϶���
    3������Ԫ�ض���
    4����Ԫ����ӵ�����
    5����������*/
public class Exercise01 {
public static void main(String[] args) {
	//�������϶���
	//JDK7�������ԣ������ƶ�
   //ArrayList<Student> array=new ArrayList<>();
	//���ǲ��Ƽ�����ʹ��
	ArrayList<Student> array=new ArrayList<Student>();
	
	//����ѧ������
	Student s1=new Student("�½���",20);
	Student s2=new Student("��־��",20);
	Student s3=new Student("л����",21);
	Student s4=new Student("ʯ���",19);
	Student s5=new Student("�Գ�",20);
	
	//���Ԫ��
	array.add(s1);
	array.add(s2);
	array.add(s3);
	array.add(s4);
	array.add(s5);

	//����
	Iterator<Student> it=array.iterator();
	while(it.hasNext()){
		Student s=it.next();
		System.out.println(s.getName()+"----"+s.getAge());
		
	}
//-----------------------------------	
	System.out.println("---------------");
	//ʹ��forѭ������
	for(int x=0;x<array.size();x++){
		Student ss=array.get(x);
		System.out.println(ss.getName()+"----"+ss.getAge());
	}
}
 	
} 
