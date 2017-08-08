package lesson070620;

import java.io.Serializable;

import warmup.Warmup1;

public class Hello {
	
	public static void main (String [] args) {
		//System.out.println("Hello, world");
		Warmup1 warmup1 = new Warmup1(); 
		System.out.println(warmup1.sleepIn(true, false));
		
		
		/*
		A a = new A ();
		B b = new B ();
		
		Object o = a;
		
		A x = b;
		
		Serializable s = b;*/
		
	}

}

/*
class A implements Serializable {
	
}

class B extends A {
	
} */
