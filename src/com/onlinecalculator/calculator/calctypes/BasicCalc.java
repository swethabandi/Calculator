package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;

class calcl
{
	int a,b,c,ch,res;
	public calcl()
	{
		a=0;
		b=0;
		c=0;
		res=0;
	}
	
	public int menu()
        {
		System.out.println("select option");
		
		System.out.println("1.additin");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("******************");
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		return 0;
        }
		
		
	
    public void userInputs()
    {
    	Scanner S=new Scanner(System.in);
    	System.out.println("enter first number");
    	a=S.nextInt();
    	System.out.println("enter second number");
    	b=S.nextInt();
    	
    }

    public void performOperation()
{
    	switch(ch)
		{
		case 1:System.out.println("additon");
		res=add();
		System.out.println(res);
		break;
		
		case 2:System.out.println("subtraction");
		res=subtract();
		System.out.println(res);
		break;
		
		case 3:System.out.println("multiplication");
		res=multiply();
		System.out.println(res);
		break;
		
		case 4:System.out.println("division");
		res=divide();
		System.out.println(res);
		break;
		default: System.out.println("invalid choice");
		
		
    	
        }
       
}
    
	int add()
	{
		c=a+b;
		return c;
		
	}
	
	int subtract()
	{
		c=a-b;
		return c;
		
	}
	
	int multiply()
	{
		c=a*b;
		return c;
	}
	
	int divide()
	{
		c=a/b;
		return c;
	}
	
}
public class BasicCalc
{
	public static void main(String args[])
	{
		calcl c=new  calcl();
		c.menu();
		c.userInputs();
		c. performOperation();
	}

	}
