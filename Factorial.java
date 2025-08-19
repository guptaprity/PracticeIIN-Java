package com.prity.practicequestion;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number ");
		int n=sc.nextInt();
		int pro=1;
		for(int i=n; i>=1; i--) {
			pro*=i;
		}
		
		System.out.println("factorial of " + n +" = "+pro);

	}

}
