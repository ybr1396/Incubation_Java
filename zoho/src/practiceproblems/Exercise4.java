package practiceproblems;
import java.util.*;
public class Exercise4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input value: ");
		double input = in.nextDouble();
		if (input > 0) {
			if (input < 1) {
				System.out.println("Positive small number ");
			} else if (input > 100000) {
				System.out.println("Positive large number ");
			} else {
				System.out.println("Positive number");
			}
		} else if (input < 0) {
			input =input*-1;
			if (input < 1) {
				System.out.println(" Negative large number ");
			} else if (input > 100000) {
				System.out.println("Negative small number ");
			} else {
				System.out.println("Negative number");
			}
		} else {
			System.out.println("Zero");
		}
		in.close();
	}
}


