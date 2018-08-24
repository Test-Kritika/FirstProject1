package PB;

class Emply{};
class Student{};



abstract  class Test1 {
	
	abstract String m1(Emply e, Student s);
	abstract Dog m2(float f, double d);
	abstract void m3(int a, int b);

}

abstract class A1 extends Test1{
	
	String m1(Emply e, Student s) {
		System.out.println("implemented m1 method");
		return null;
	}
	
	Dog m2(float f, double d){
		System.out.println("implemented m2 method");
		return null;
		
	}
}
