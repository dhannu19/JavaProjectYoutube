package javabasics;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		System.out.println("Enter first number to multiple");

		int a = sr.nextInt();

		System.out.println("Enter Second number to multiple");

		int b = sr.nextInt();

		int c = a * b;
		System.out.println("Multiplication is equal to " +c);

	}

}
