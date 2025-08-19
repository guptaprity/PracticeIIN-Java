package com.prity.practicequestion;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number ");
		int n=sc.nextInt();
		int c=0;
		
		for(int i=0; i<=n; i++) {
			if(i%2==0) {
			c++;
			}
		}
		if(c==2) {
			System.out.println("it is a prime number "+n);
		}
		else {
			System.out.println("It is not a prime number");
		}

	}

}
