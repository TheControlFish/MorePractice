import java.io.*;
import java.util.*;
public class WordRepeatWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Type Word: ");
		String str = kbScanner.next();
		int j = 0;
		while (j < str.length()){
			System.out.println(str);
			j++;
		}
	}

}

