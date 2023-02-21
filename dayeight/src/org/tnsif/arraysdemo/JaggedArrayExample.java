
package org.tnsif.arraysdemo;

import java.util.Scanner;

//program to demonstrate on Jagged array
public class JaggedArrayExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Declaring 2-D array with 2 rows
		int arr[][] = new int[2][];
		//first array has 3 columns
		arr[0] = new int[3];
		//second array has 2 columns
		arr[1] = new int[2];
		
		System.out.println("Enter the array elements: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}