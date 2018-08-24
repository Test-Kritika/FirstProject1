package demopackage;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int arrsize = sc.nextInt();
		int a[]= new int[arrsize];
		int sum=0;
		
		System.out.println("Enter Array Elements");
		for(int i=0 ; i<a.length; i++)
		{
		
		System.out.print("a["+i+"]=");
		a[i] = sc.nextInt();
		sum = sum + a[i];
		
		}
		
		System.out.println("Sum = " + sum);
		
		
	}
		

	}

