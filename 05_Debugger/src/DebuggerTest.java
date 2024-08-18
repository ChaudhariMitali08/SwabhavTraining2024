public class DebuggerTest {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        int sum = addNumbers(num1, num2);
        System.out.println("Sum: " + sum);

        int product = multiplyNumbers(num1, num2);
        System.out.println("Product: " + product);
    }

    public static int addNumbers(int a, int b) {
        int result = multiplyNumbers(a, b);
        System.out.println(result);

        return a + b;
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
}
