package com.onlinecalculator.calculator.calctypes;
import java.util.*;
public class localvar {
	 static void display()
	{
		int x;
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		System.out.println("local variable x="+x);
	}
	public static void main(String args[])
	{
		display();
	}

}
