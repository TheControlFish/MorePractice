import java.io.*;
import java.util.*;
public class DiscountPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter amount of purchases: ");
		int p = kbScanner.nextInt();
		if (p > 1000){
		System.out.println("Discounted Price: " + (p - (.1 * p)));
		}
		else {
			System.out.println("No Discount Fo' You!");
		}
	}

}
