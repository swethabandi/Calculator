package com.onlinecalculator.calculator.calctypes;
import java.util.*;
 class  instance{
	int x;
	void display()
	{
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("instance variable x="+x);
	}
}

 public class instancevariable
 {

	public static void main(String[] args) {
		
		 instance m=new  instance();
m.display();
	}

}
