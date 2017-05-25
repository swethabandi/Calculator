package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
class localvarwithobject{
	int x;
		  void display()
		{
		
			System.out.println("enter any number");
			Scanner sc=new Scanner(System.in);
			x=sc.nextInt();
			System.out.println("local variable x="+x);
		}
		  static public class local{
			 
		public static void main(String args[])
		{
			localvarwithobject l=new localvarwithobject();
			l.display();
		}
	

	}

}
