//UserInput.java

class UserInput {
    Scanner scanner = new Scanner(System.in);

    // Method to get two integers from the user
    int[] getTwoNumbers() {
        int[] numbers = new int[2];
        System.out.println("Enter first number:");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter second number:");
        numbers[1] = scanner.nextInt();
        return numbers;
    }

    // Method to get an array of integers from the user
    int[] getArray() {
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Method to select an operation and perform calculations
    void selectOperation(Calculator calculator) {
        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Fibonacci\n6. Sum of Array\n7. Mean of Array\n0. Exit");
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
                case 5 -> {
                    System.out.println("Enter a number for Fibonacci sequence:");
                    int n = scanner.nextInt();
                    System.out.println("Fibonacci of " + n + ": " + calculator.fibonacci(n));
                }
                case 6 -> {
                    int[] array = userInput.getArray();
                    System.out.println("Sum of Array: " + calculator.sumArray(array));
                }
                case 7 -> {
                    int[] array = userInput.getArray();
                    System.out.println("Mean of Array: " + calculator.meanArray(array));
                }
                default -> System.out.println("Invalid choice.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
