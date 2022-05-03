package com.kmc.pa;

import java.util.Scanner;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// Declare all variables
		String sentence, result = "";
		String allWords[];

		Scanner sc = new Scanner(System.in);
		// Accept any sentence from User
		System.out.print("Enter your sentence: ");
		sentence = sc.nextLine();

		// Split the given sentence to get each word as String array
		allWords = sentence.split(" ");
		// Use for loop to remove duplicate words
		for (int i = 0; i < allWords.length; i++) {
			for (int j = i + 1; j < allWords.length; j++) {
				if (allWords[i].equals(allWords[j])) {
					allWords[j] = "remove";
					allWords[i] = "remove";
				}
			}
		}
		// Convert to String
		for (String word : allWords) {
			if (word != "remove") {
				result = word + " "+ result ;
			}
		}
		// Display given String after removing duplicates
		System.out.println("\nSentence after removing duplicate words: " + result);
	}
}