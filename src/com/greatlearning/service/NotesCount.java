package com.greatlearning.service;

public class NotesCount {
	public void countNotes(int[] denomination, int amount) {
		try {
			int i = 0;
			int[] notesRequired = new int[denomination.length];

			while (amount > 0 && i < denomination.length) {
				int countRequired = amount / denomination[i];
				amount = amount - (countRequired * denomination[i]);
				notesRequired[i] = countRequired;
				i++;
			}

			if (amount == 0) {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int j = 0; j < notesRequired.length; j++) {
					if (notesRequired[j] != 0) {
						System.out.println(denomination[j] + " : " + notesRequired[j]);
					}
				}
			} else {
				System.out.println("Amount cannot be paid with provided denominations");
			}
		} catch (ArithmeticException exception) {
			System.out.println(exception + " Denomination of 0 is invalid");
		}
	}
}