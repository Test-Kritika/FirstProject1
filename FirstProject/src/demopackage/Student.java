package demopackage;


class Parents{
	String fname;
	String Mname;
	
	Parents(String fname, String Mname)
	{
		this.fname=fname;
		this.Mname=Mname;
	}
}
class Address{
	int dno;
	String stno;
	Address(int dno, String stno)
	{this.dno=dno; this.stno=stno;
			}
}
class Marks{
	int m1;
	int m2;
	int m3;
	Marks(int m1,int m2, int m3)
	{
		this.m1=m1; this.m2=m2; this.m3=m3;
	}
}

public class Student {
	int sid;
	String sname;
	Parents p;
	Marks m;
	Address a;
	Student(int sid, String sname, Parents p, Address a, Marks m)
	{this.sid=sid; 
	this.sname=sname; 
	this.p=p;
	this.a=a;
	this.m=m;}
	
	void disp()
	{
		System.out.println("Student id---"+sid);
		System.out.println("Student name---"+sname);
		System.out.println("Parents name----"+p.fname+"  "+p.Mname);
		System.out.println("Student Marks---"+m.m1+"  "+m.m2+"  "+m.m3);
		System.out.println("Student Address---"+a.dno+"  "+a.stno);
	}
	
	public static void main(String []args)
	{
		
		Parents p1=new Parents("ABC","man");
		Marks m1=new Marks(12,34,56);
		Address a1=new Address(12,"Laxmi nagar");
		Student st1=new Student(123,"Ram", p1,a1,m1);
		
		
		st1.disp();
		
		
	}
	
	

}
