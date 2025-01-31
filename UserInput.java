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

}
