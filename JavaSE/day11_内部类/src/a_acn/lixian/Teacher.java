package a_acn.lixian;

public class Teacher {
  private String name;
  private int age;
  private char sex;
  //�޲����Ĺ��췽��
  public Teacher(){
	  System.out.println("Teacher");
  }
  //�вι��췽��
 public Teacher(String name,int age,char sex){
	 this.age=age;
	 this.name=name;
	 this.sex=sex;
 }
 
 public void show(){
	 System.out.println(this.name+"---"+this.age+"---"+this.sex);
 }
  
  
}
