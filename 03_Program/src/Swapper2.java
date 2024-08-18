import java.util.Scanner;

public class Swapper2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 :- ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter Number 2 :- ");
		int number2 = sc.nextInt();
		
		number1 = number1 +number2;
		number2 = number1 - number2;
		number1= number1 -number2;
		System.out.println("after swapping " +number1 +"and " +number2);
}
}