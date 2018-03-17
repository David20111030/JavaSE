package j_匿名内部类在开发中的应用.cv;

public class PersonDemo {

	//接口作为形式参数
	//其实这里需要的不是接口，而是该接口的实现类的对象
	public void method(Person p){
		p.study();
	}
}
