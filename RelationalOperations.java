package io.to.CJ3;

import java.util.Scanner;

public class RelationalOperations 
{ 
	public static void main(String[] args)
	
	{
		int x,y;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Value of x : ");
    x=scan.nextInt();
    System.out.print("Enter the Value of y : ");
    y=scan.nextInt();
    System.out.println("x>y : "+(x>y));
    System.out.println("x<y : "+(x<y));
    System.out.println("x>=y : "+( x>=y));
    System.out.println("x<=y : "+( x<=y));
		
	}
}