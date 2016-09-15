import java.io.*;
import java.util.*;
public class LastChanceGas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Tank Capacity: ");
		int c = kbScanner.nextInt();
		System.out.print("Gauge Reading: ");
		int g = kbScanner.nextInt();
		System.out.print("Miles Per Gallon: ");
		int mpg = kbScanner.nextInt();
		if ((c * ((double)g / 100)) * mpg < 200){
			System.out.println("Get Gas!");
		}
		else {
			System.out.println("Good to go");
		}
	}

}
