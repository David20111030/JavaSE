package e_泛型高级_通配符;

import java.util.ArrayList;
import java.util.Collection;
/**
	 泛型高级(通配符)：
		    泛型通配符<?>
		   	任意类型，如果没有明确，那就是Object以及任意的Java类了
		   	
		 ?extends E
			向下限定,E及其子类
			
		 ?super E
			 向上限定，E及父类
			 
		  //注意：泛型如果明月确写的时候，前后必须一致 如：Collection<object> c1=new ArrayList<Object>();	 
			 
		 ? ：任意类型，如果没有明确，那么就是Object以及任意的Java类了
		 ?extends E:向下限定，E及其子类
		 ?extends E:向上限定，E及其父类
	
 * @author 贤元
 *
 */
public class Demo01 {
	public static void main(String[] args) {

		// ? 表示任意的类型都是可以的
		Collection<?> c5 = new ArrayList<Object>();
		Collection<?> c6 = new ArrayList<Annimal>();
		Collection<?> c7 = new ArrayList<Dog>();

		// ?extends E；向下限定，E及其子类
		// Collection<?extends Annimal> c9=new ArrayList<Object>();//错误
		Collection<? extends Annimal> c10 = new ArrayList<Annimal>();
		Collection<? extends Annimal> c11 = new ArrayList<Dog>();

		// ?super E:向上限定，E及其父类
		Collection<? super Annimal> c12 = new ArrayList<Object>();
		Collection<? super Annimal> c13 = new ArrayList<Annimal>();
		// Collection<?super Annimal> c14=new ArrayList<Dog>();//错误

	}
}
