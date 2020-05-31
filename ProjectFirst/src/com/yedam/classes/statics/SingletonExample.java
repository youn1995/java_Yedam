package com.yedam.classes.statics;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		Singleton obj3 = Singleton.getISingleton();
		Singleton obj4 = Singleton.getISingleton();
		
		if(obj3 == obj4) {
			System.out.println("같은 singleton 객체임");
		} else {
			System.out.println("다른 singleton 객체임");

		}

	}
}
