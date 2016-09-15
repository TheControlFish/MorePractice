import java.io.*;
import java.util.*;
public class StartAndEndValuesFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Start: ");
		int start = kbScanner.nextInt();
		System.out.print("End: ");
		int end = kbScanner.nextInt();
		for (int j = start; j <= end; j++){
			System.out.println(j);
		}
	}

}