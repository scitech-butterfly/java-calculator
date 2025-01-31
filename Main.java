//Name: Kashvi Singh
//PRN: 23070126057
//Batch: AIML A3

//Main.java

import java.util.*;
class Main{
	public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();

        // Display menu and prompt user for operation selection
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n0. Exit");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the program.");
                break;
            }

            switch (choice) {
                case 1 -> {
                    int[] numbers = userInput.getTwoNumbers();
                    System.out.println("Sum: " + calculator.add(numbers));
                }
                case 2 -> {
                    int[] numbers = userInput.getTwoNumbers();
                    System.out.println("Difference: " + calculator.subtract(numbers));
                }
                case 3 -> {
                    int[] numbers = userInput.getTwoNumbers();
                    System.out.println("Product: " + calculator.multiply(numbers));
                }
                case 4 -> {
                    int[] numbers = userInput.getTwoNumbers();
                    System.out.println("Quotient: " + calculator.divide(numbers));
                }
                
                default -> System.out.println("Invalid choice.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
