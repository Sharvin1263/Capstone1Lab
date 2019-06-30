import java.util.Scanner;

public class Capstone1_Lab {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String sentence;
		int stringLength;
		int i;
		String translateMore = "y";

		System.out.println("Welcome to the Pig Latin Translator!\n");

		do {

//Prompt for user input.			

			System.out.print("Enter a line to be translated: ");

			sentence = scnr.nextLine();
			sentence = sentence.toLowerCase();
			System.out.println();

//  Get length of string for loop to check each character.

			stringLength = sentence.length();

//  Check first character in string to see if it is a vowel.
//  If so, print word with "way " appended.			

			if (sentence.charAt(0) == 'a') {
				System.out.println(sentence.substring(0) + "way");
			} else if (sentence.charAt(0) == 'e') {
				System.out.println(sentence.substring(0) + "way");
			} else if (sentence.charAt(0) == 'i') {
				System.out.println(sentence.substring(0) + "way");
			} else if (sentence.charAt(0) == 'o') {
				System.out.println(sentence.substring(0) + "way");
			} else if (sentence.charAt(0) == 'u') {
				System.out.println(sentence.substring(0) + "way");
			} else {

//  If word doesn't start with vowel, search for first vowel character in string.

				for (i = 0; i < stringLength; i++) {
					if ((sentence.charAt(i) == 'a') || (sentence.charAt(i) == 'e') || (sentence.charAt(i) == 'i')
							|| (sentence.charAt(i) == 'o') || (sentence.charAt(i) == 'u')) {
						break;
					}
				}

//  Seperate string into substrings and print first substring behind the second substring with "ay" appended.
				System.out.println(sentence.substring(i) + sentence.substring(0, i) + "ay");
				// System.out.println();

			}

//  Ask user if they would like to continue or end.	

			System.out.println();
			System.out.print("Translate another word? (y/n): ");
			translateMore = scnr.nextLine();

			System.out.println();

			if (translateMore.equalsIgnoreCase("n")) {
				System.out.println("Done!");

			}

		} while (translateMore.equalsIgnoreCase("y"));
	}
}
