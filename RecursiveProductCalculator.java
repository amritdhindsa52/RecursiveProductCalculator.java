import java.util.Scanner;

public class RecursiveProductCalculator {

    private static double getUserInput(int count) {
        if (count <= 5) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number " + count + ": ");
                double num = scanner.nextDouble();
                return num * getUserInput(count + 1);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                return getUserInput(count);
            }
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        double result = getUserInput(1);
        System.out.println("The product of the five numbers is: " + result);
    }
}
