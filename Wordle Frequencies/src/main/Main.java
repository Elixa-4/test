package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			File words = new File("C:\\Users\\emmac\\OneDrive\\Desktop\\wordle-words.txt");
			Scanner reader = new Scanner(words);
			
			int numLetters[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int total = 0;
			
			while(reader.hasNextLine()) {
				String word = reader.nextLine();
				for(int i = 0; i < 5; i++) {
					char letter = word.charAt(i);
					numLetters[letter-97]++;
				}
			}
			for(int i = 0; i < 26; i++) {
				System.out.println(/*(char)(i+97) + ": " + */numLetters[i]);
				total+=numLetters[i];
			}
			System.out.println("Total: " + total);
		} catch(FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
