import java.io.*;
import java.util.*;
public class OrderChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter number of bolts: ");
		int b = kbScanner.nextInt();
		System.out.print("Enter number of nuts: ");
		int n = kbScanner.nextInt();
		System.out.print("Enter number of washers: ");
		int w = kbScanner.nextInt();
		int total = 5 * b + 3 * n + w;
		if (n < b){
			System.out.println("Check the Order: too few nuts");
		}
		if (w < b * 2){
			System.out.println("Check the Order: too few washers");
		}
		if (n >= b && w >= b * 2){
			System.out.println("Order is OK");
		}
		System.out.println("Total: " + total);
	}

}
