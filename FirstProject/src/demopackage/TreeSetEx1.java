package demopackage;

import java.util.TreeSet;

import java.util.Comparator;

public class TreeSetEx1 {
	

	public static void main(String[] args) {
		
		//TreeSet<Integer>ts=new TreeSet<>();
		
		TreeSet<Integer>ts=new TreeSet<>(new MyComparator());
		ts.add(10);
		ts.add(90);
		ts.add(30);
		ts.add(70);
		ts.add(20);
		System.out.println(ts);

	}
}

class MyComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		
		return -I1.compareTo(I2);
	}
	
	
}



