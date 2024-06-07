//method overloading
package Assignment_3;

import java.util.Scanner;

public class Tester {
	
	static void setArea(int b,int h){
		System.out.println("Area of Triangle: "+(0.5*b*h));
	}
	
	static void setArea(float s) {
		System.out.println("Area of Sqaure: "+(s*s));
	}
	
	static void setArea(double r) {
		System.out.println("Area of Circle: "+(3.14*r*r));
	}
	
	static int exit;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String ex;
		do {
			System.out.println("MENU:\n1.Area of Triangle\n2.Area of Square\n3.Area of Circle\n4.Exit");
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter length and breadth");
				int l=sc.nextInt();
				int b=sc.nextInt();
				setArea(l,b);
				break;
			case 2:
				System.out.println("Enter side:");
				float s=sc.nextFloat();
				setArea(s);
				break;
			case 3:
				System.out.println("Enter radius:");
				double r=sc.nextDouble();
				setArea(r);
				break;
			case 4:
				exit=0;
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you wish to continue(y/n)?");
		    ex =sc.next() ;
		}while(ex.equals("y"));
	}
}


