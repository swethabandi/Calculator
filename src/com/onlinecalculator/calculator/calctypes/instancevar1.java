package com.onlinecalculator.calculator.calctypes;
import java.util.*;
class mno{
	int a;
	void display()
	{
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("instance of variable a="+a);
	}
	void output()
	{
		System.out.println("instance of variable a="+a);
	}
}
public class instancevar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mno s=new mno();
		s.display();
		s.output();

	}

}
