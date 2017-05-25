package com.onlinecalculator.calculator.calctypes;

import java.util.*;
class xyz{
	
static int x;
void display()
{
	System.out.println("enter any number");
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	System.out.println("class variable x="+x);
}
}

public class classvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xyz a=new xyz();
		a.display();

	}

}
