package cn.itcast._02��д��ʵ��ע�⴦����;
/**
 * һ���򵥵�javabean
 * @author ��Ԫ
 *
 */
@DBTable(name="MEMBER")
public class Member {
	
	@SQLString(value=30,name="����firstName�ϵ�ע��")
	String firstName;
	
	@SQLString(value=50,name="����lasttName�ϵ�ע��")
	String lastName;
	
	@SQLInteger
	Integer age;
	
	@SQLString(value=30,constraints=@Constraints(primaryKey=true))
	String handle;
	
	static int menberCount;

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getHandle() {
		return handle;
	}
	public Integer getAge(){
		return age;
	}
	public String toString(){
		return handle;
	}
	
	
}
