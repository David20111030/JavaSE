package a_Collection.gz.Set.Set_Son.TreeSet;

public class Student3 {
	//����
	private String name;
	//���ĳɼ�
	private int chinese;
	//��ѧ�ɼ�
	private int math;
	//Ӣ��ɼ�
	private int english;
	public Student3(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}

	public Student3() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	//�ܳɼ�
	public int getSum() {
		return this.chinese + this.math + this.english;
	}
}
