package PB;

class Animal{}
class Bank{}
class Dog{}
class Emp{}

abstract class Test {
 abstract String m1(Animal a, Dog d);
 abstract Emp m2(float f, Bank b);
 abstract int m3(String str, char ch);
 abstract void m4(int a, int b);
 
}

abstract class A extends Test
{
	String m1(Animal a, Dog d) {
		System.out.println("Implemented m1 method");
		return null;
	}

	
	Emp m2(float f, Bank b) {
		 System.out.println("implemented m2 method");
		return null;
	}

	
}

abstract class B extends A
{
	int m3(String str, char ch) {
		System.out.println("implemented m3 method");
		return 0;
	}

		
}





