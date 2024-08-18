import java.util.*;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Amount:- ");
		int principal_amount = sc.nextInt();

		System.out.println("Enter the Rate of Interest:- ");
		double rate_of_interest = sc.nextInt();

		System.out.println("Enter the Time Period:- ");
		int time = sc.nextInt();

		double simple_interest = (principal_amount * rate_of_interest * time) / 100;

		System.out.print("The Simple Interest is :- " + simple_interest);
	}
}
