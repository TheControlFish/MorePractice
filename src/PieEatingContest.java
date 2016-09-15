import java.io.*;
import java.util.*;
public class PieEatingContest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Weight: ");
		double weight = kbScanner.nextDouble();
		if (220 < weight && weight < 280){
			System.out.println("Allowed in the Contest");
		}
		else {
			System.out.println("Lose or gain weight, fatty or chicken legs");
		}
	}

}
