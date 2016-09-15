import java.io.*;
import java.util.*;
public class StartAndEndValuesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Start: ");
		int start = kbScanner.nextInt();
		System.out.print("End: ");
		int end = kbScanner.nextInt();
		while (start <= end ){
			System.out.println(start);
			start++;
		}
	}

}
