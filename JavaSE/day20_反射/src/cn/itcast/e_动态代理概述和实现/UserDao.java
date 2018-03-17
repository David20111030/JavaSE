package cn.itcast.e_动态代理概述和实现;
/**
 * 用户操作接口
 * @author 贤元
 *
 */
public interface UserDao {
	//增、删、改、查
	public abstract void add();
	public abstract void delete();
	public abstract void update();
	public abstract void find();
}
