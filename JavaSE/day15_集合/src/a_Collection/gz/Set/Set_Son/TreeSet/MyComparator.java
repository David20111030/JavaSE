package a_Collection.gz.Set.Set_Son.TreeSet;

import java.util.Comparator;
//�Ƚ�������
public class MyComparator implements Comparator<Student2>{

	@Override
	public int compare(Student2 s1, Student2 s2) {
		//��������
		int num =s1.getName().length()-s2.getName().length();
		//��������
		int num2= num==0?s1.getName().compareTo(s2.getName()):num;
		//����
		int num3= num2==0?s1.getAge()-s2.getAge():num2;
		
		return num3;
	}

}
