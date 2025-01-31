//Calculator.java

class Calculator {
    // Addition of two numbers
    public int add(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    // Subtraction of two numbers
    public int subtract(int[] numbers) {
        return numbers[0] - numbers[1];
    }

    // Multiplication of two numbers
    public int multiply(int[] numbers) {
        return numbers[0] * numbers[1];
    }
    
    // Division of two numbers
    public int divide(int[] numbers) {
        if (numbers[1] == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numbers[0] / numbers[1];
    }
}
