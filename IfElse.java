package io.to.cj2;

import java.util.Scanner;

public class IfElse
{
	int a,b;
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
	 System.out.print("Input the values of a and b ");
     int a = input.nextInt();
     int b=input.nextInt();
		if(a>b)
			System.out.println("a is greater");
		else
			System.out.println("b is greater");
	}

}
