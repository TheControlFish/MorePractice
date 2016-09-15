import java.io.*;
import java.util.*;
public class WordRepeatFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Type Word: ");
		String str = kbScanner.next();
		for (int j = 0; j < str.length(); j++){
			System.out.println(str);
		}
	}

}
