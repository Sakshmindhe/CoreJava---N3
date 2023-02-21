
package org.tnsif.assignmentFunctionRecursion;

import java.util.Scanner;

//to demonstrate the program of factorial using recursion
public class FactorialUsingRecursion {

	//function definition
	static int factorial(int num) 
	{
		if(num!=0)
			return num*factorial(num-1);
		return 1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		//function call
		System.out.println("The factorial of a given number is: "+factorial(num));
		s.close();

	}

}