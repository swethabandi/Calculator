package com.onlinecalculator.calculator.calctypes;
import java.util.*;

public class powerprg {


		public static void main(String args[]){
			int x,n,i, sum=1;
			
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x value");
		x=sc.nextInt();
		System.out.println("enter n value");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum*x;
		}
          System.out.println(" the power of a given num is..."+sum);	
		
		}
		}
