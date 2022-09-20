package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		try {
			File words = new File("C:\\Users\\emmac\\OneDrive\\Desktop\\wordle-words.txt");
			Scanner reader = new Scanner(words);
			
			int char1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int char2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int char3[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int char4[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int char5[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			int total = 0;
			
			while(reader.hasNextLine()) {
				String word = reader.nextLine();
				for(int i = 0; i < 5; i++) {
					char letter = word.charAt(i);
					if(i == 0) {
						char1[letter-97]++;
					} else if (i == 1) {
						char2[letter-97]++;
					} else if (i == 2) {
						char3[letter-97]++;
					} else if (i == 3) {
						char4[letter-97]++;
					} else if (i == 4) {
						char5[letter-97]++;
					}
				}
			}
			System.out.println("Character 1");
			for(int i = 0; i < 26; i++) {
				System.out.println(char1[i]);
				total+=char1[i];
			}
			System.out.println("Character 2");
			for(int i = 0; i < 26; i++) {
				System.out.println(char2[i]);
				total+=char2[i];
			}
			System.out.println("Character 3");
			for(int i = 0; i < 26; i++) {
				System.out.println(char3[i]);
				total+=char3[i];
			}
			System.out.println("Character 4");
			for(int i = 0; i < 26; i++) {
				System.out.println(char4[i]);
				total+=char4[i];
			}
			System.out.println("Character 5");
			for(int i = 0; i < 26; i++) {
				System.out.println(char5[i]);
				total+=char5[i];
			}
			System.out.println("Total: " + total);
		} catch(FileNotFoundException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
