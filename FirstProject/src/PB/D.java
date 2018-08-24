package PB;

  class D extends A1{
	 
	 void m3(int a, int b)
	 {
		 System.out.println("implemented m3 method");
	 }
	 
	 public static void main(String[] args)
	 {
		 Emply e1= new Emply();
		 Student s1= new Student();
		 D d = new D();
		 d.m1(e1, s1);
		 d.m2(1, 1.2);
		 d.m3(12, 89);
	 }

	

}
