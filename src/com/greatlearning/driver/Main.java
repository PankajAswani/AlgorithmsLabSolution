package com.greatlearning.driver;

import java.util.Scanner;
import com.greatlearning.service.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		
		int denominationSize = scan.nextInt();
		int[] denomination = new int[denominationSize];
		
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i< denominationSize; i++) {
			denomination[i] = scan.nextInt();
		}
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		mergeSortImplementation.sort(denomination);
		
		System.out.println("Enter the amount you want to pay");
		int amount = scan.nextInt();
		
		NotesCount notesCount = new NotesCount();
		notesCount.countNotes(denomination, amount);
		
		scan.close();
	}
}