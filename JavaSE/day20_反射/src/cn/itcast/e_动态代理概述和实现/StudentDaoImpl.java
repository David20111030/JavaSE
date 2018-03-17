package cn.itcast.e_动态代理概述和实现;

public class StudentDaoImpl implements StudentDao{

	@Override
	public void login() {
		System.out.println("登陆功能");
	}

	@Override
	public void regist() {
		System.out.println("注册功能");
	}

}
