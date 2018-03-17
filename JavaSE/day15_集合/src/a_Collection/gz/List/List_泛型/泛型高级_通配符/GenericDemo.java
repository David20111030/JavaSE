package a_Collection.gz.List.List_泛型.泛型高级_通配符;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型高级(通配符):
 * 		? :任意类型，如果没有明确，那么就是Object以及任意的java类了
 * 		? extends E : 向下限定，E及其子类	
 * 		? super E  : 向上限定，E及其父类
 * 
 * 
 * 
 * 
 * 
 * 
 * @author 贤元
 *
 */
public class GenericDemo {
	public static void main(String[] args) {
		//发逆行如果明确些的时候m，前后必须一致
		Collection<Object> c1=new ArrayList<Object>();
	   //以下注释掉的三行代码都是有错的
		//Collection<Object> c2 = new ArrayList<Animal>();
		//Collection<Object> c3 = new ArrayList<Dog>();
		//Collection<Object> c4 = new ArrayList<Cat>();
		
		// ?表示任意的类型都是可以的
		Collection<?> c5 = new ArrayList<Object>();
		Collection<?> c6 = new ArrayList<Animal>();
		Collection<?> c7 = new ArrayList<Dog>();
		Collection<?> c8 = new ArrayList<Cat>();

		// ? extends E:向下限定，E及其子类
		// Collection<? extends Animal> c9 = new ArrayList<Object>();//这样代码有错，只能是Animal及其子类。向下限定
		Collection<? extends Animal> c10 = new ArrayList<Animal>();
		Collection<? extends Animal> c11 = new ArrayList<Dog>();
		Collection<? extends Animal> c12 = new ArrayList<Cat>();

		// ? super E:向上限定，E极其父类
		Collection<? super Animal> c13 = new ArrayList<Object>();
		Collection<? super Animal> c14 = new ArrayList<Animal>();
		//以下注释掉的两行代码是出错的
		// Collection<? super Animal> c15 = new ArrayList<Dog>();//只能是Animal及其父类。向上限定
		// Collection<? super Animal> c16 = new ArrayList<Cat>();//只能是Animal及其父类	。向上限定	
		
		
		
	}
}


class Animal{
	
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}