//Exceptions
package Assignment_4;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Exception 1:");
			System.out.print("Enter a number:");
			int a=sc.nextInt();
			int b=a/0;
		}
		catch(ArithmeticException e) {
			System.out.println("You shouldn’t divide a number by zero.");
		}
		int n=0,s = 0;
		try {
			System.out.println("Exception 2:");
			System.out.print("Enter total no .of elements:");
			n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter array elements:");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.print("Access which array element:");
			s=sc.nextInt();
			System.out.println(arr[s]);
			
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("OOPs!!!Array Index "+s+" out of bounds for length "+n+".");
		}
		try {
			String str=null;
			System.out.println("Exception 3:");
	
			System.out.println("Length of given string: "+str.length());			
		}
		catch(NullPointerException p) {
			System.out.println("Null Pointer Exception arises!!");
		}
	}
}
