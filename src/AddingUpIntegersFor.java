import java.io.*;
import java.util.*;
public class AddingUpIntegersFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("How many integers will be added? ");
		int amount = kbScanner.nextInt();
		int number = 0;
		for (int j = 0; j < amount; j++){
			System.out.println("Enter an Integer: ");
			number += kbScanner.nextInt();
		}
		System.out.println("The sum is " + number);
	}

}
