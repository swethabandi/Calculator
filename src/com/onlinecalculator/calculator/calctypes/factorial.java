package com.onlinecalculator.calculator.calctypes;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,fact=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of a given number is:"+fact);
		
	}

}
