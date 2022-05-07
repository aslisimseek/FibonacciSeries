import java.awt.*;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Fibonacci Max Number");
        int variable = scanner.nextInt();
        int previousNumber = 0, presentNumber = 1;
        int total = 0;
        for (int i = 1; i <= variable; i++) {
            total = previousNumber + presentNumber;
            System.out.println(previousNumber + " + " + presentNumber + " = " + total);
            previousNumber = presentNumber;
            presentNumber = total;
        }
    }
}