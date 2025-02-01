//Calculator.java

import java.util.*;
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

    // Fibonacci sequence
    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

     // Sum of elements in an array
    public int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Mean of elements in an array
    public double meanArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // Variance of an array
    public double varianceArray(int[] array) {
        double mean = meanArray(array);
        double sumSquaredDiffs = 0;
        
        for (int num : array) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        
        return sumSquaredDiffs / array.length;
    }

    // Standard deviation of an array
    public double stdDeviationArray(int[] array) {
        return Math.sqrt(varianceArray(array));
    }
}
