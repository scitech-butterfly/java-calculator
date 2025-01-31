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
}
