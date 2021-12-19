package com.greatlearning.question1;

import java.util.Scanner;

public class Transaction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int transactionSize = scan.nextInt();
		int[] transaction = new int[transactionSize];
		
		System.out.println("Enter the values of array");
		for (int i = 0; i < transactionSize; i++) {
			transaction[i] = scan.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets = scan.nextInt();
		
		for (int i = 0; i < noOfTargets; i++) {
			System.out.println("Enter the value of target");
			int target = scan.nextInt();
			int j = 0;
			while (target > 0 && j < transactionSize) {
				target -= transaction[j];
				j++;
			}
			if (target <= 0) {
				System.out.println("Target achieved after " + j + " transactions");
			} else {
				System.out.println("Given target is not achieved");
			}
		}
		
		scan.close();
	}
}