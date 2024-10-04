package sumsytem;
import java.util.Scanner;

public class Sumsystem{
    public static void main(String[] args) {
        // Initialize a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int number;
        int sum = 0;

        // Start the loop
        do {
            // Ask the user for input
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();  // Get user input

            // Add the number to the sum
            sum += number;

        } while (number != 0);  // Loop until the user enters 0

        // Display the total sum
        System.out.println("The total sum is: " + sum);
        
        // Close the scanner
        scanner.close();
    }


	}


