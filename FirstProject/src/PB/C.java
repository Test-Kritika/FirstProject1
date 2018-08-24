package PB;

class C extends B

{
	void m4(int a, int b) {
		System.out.println("implemented m4 method");
		
	}
	
	
	public static void main(String[] args){
		C c1 = new C();
		Animal a1 = new Animal();
		Dog d1 = new Dog();
		Bank b1= new Bank();
		c1.m1(a1, d1);
		
		c1.m2(1, b1);
		c1.m3("AA", 'A');
		c1.m4(2, 4);
		
	}
}
