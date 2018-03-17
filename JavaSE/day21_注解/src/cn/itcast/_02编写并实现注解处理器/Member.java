package cn.itcast._02编写并实现注解处理器;
/**
 * 一个简单的javabean
 * @author 贤元
 *
 */
@DBTable(name="MEMBER")
public class Member {
	
	@SQLString(value=30,name="我是firstName上的注解")
	String firstName;
	
	@SQLString(value=50,name="我是lasttName上的注解")
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
