import java.util.*;
public class Sum_Of_Numbers {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int num2 = sc.nextInt();
		
		int sum = num1 +num2;
		System.out.println("The sum of " +num1 + " and " + num2+ " is " +sum);
	
	}
}
