import java.util.*;
public class Swapper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 :- ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter Number 2 :- ");
		int number2 = sc.nextInt();
		
		int number3 = number1;
		number1 = number2;
		number2 = number3;
		
		System.out.println("after swapping "+number1 +" and " + number2 );
		
				
		
	}
}
