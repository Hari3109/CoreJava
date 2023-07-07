import java.util.Scanner;

public class FactorialCalculation {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Calculate factorial iteratively
	        long factorialIterative = calculateFactorial1(number);
	        System.out.println("Factorial (Iterative): " + factorialIterative);

	        // Calculate factorial recursively
	        long factorialRecursive = calculateFactorial(number);
	        System.out.println("Factorial (Recursive): " + factorialRecursive);

	        scanner.close();
	    }

	    public static long calculateFactorial1(int number) {
	        long factorial = 1;

	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }

	        return factorial;
	    }

	    public static long calculateFactorial(int number) {
	        if (number == 0) {
	            return 1;
	        }

	        return number * calculateFactorial(number - 1);
	    }
	}


