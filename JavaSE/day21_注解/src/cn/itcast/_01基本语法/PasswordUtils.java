package cn.itcast._01基本语法;

import java.util.List;
//这个类中，有三个方法被注解为用例
public class PasswordUtils {
	
	
	@UseCase(id=47,description="Passwords must contain at least one numeric")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@UseCase(id=48) //这里没有给出description的值，因此，在UserCase的注解处理器分析处理这个类是会使用该注解的默认值
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	
	@UseCase(id=49,description="New passwords can't equal previously used ones")
	public boolean checkForNewPassword(List<String> prevPasswords,String password){
		return !prevPasswords.contains(password);
	}
	
}
