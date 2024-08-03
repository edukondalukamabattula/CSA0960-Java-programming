package com.example.squareroot;

import java.util.Scanner;

public class SquareRootWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double number;

	        // Loop until the user provides a non-negative number
	        while (true) {
	            System.out.print("Please enter a non-negative number: ");
	            number = scanner.nextDouble();

	            if (number >= 0) {
	                break; // Exit the loop if the number is non-negative
	            } else {
	                System.out.println("The number must be non-negative. Try again.");
	            }
	        }

	        // Compute and display the square root
	        double squareRoot = Math.sqrt(number);
	        System.out.printf("The square root of %.2f is %.2f%n", number, squareRoot);
	    }
	}