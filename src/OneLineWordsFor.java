import java.io.*;
import java.util.*;
public class OneLineWordsFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String word1 = kbScanner.next();
		System.out.print("Enter second word: ");
		String word2 = kbScanner.next();
		System.out.print(word1);
		for (int j = word1.length(); j < (30 - word2.length()); j++){
			System.out.print(".");
		}
		System.out.print(word2);
	}

}
