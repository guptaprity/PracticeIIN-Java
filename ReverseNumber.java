package com.prity.practicequestion;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number ");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(temp!=0) {
			int ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
		}
		
		System.out.println("Reverse number is "+rev);
	}

}
