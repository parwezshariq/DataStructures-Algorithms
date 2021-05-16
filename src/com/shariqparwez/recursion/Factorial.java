package com.shariqparwez.recursion;

public class Factorial {
    public static void main(String[] args) {
        // Assign number for which factorial to be calculated
        int number = 5;

        // Call the method to get factorial
        long factorial = calculateFactorial(number);

        // Print factorial result
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    private static long calculateFactorial(int number) {
        // Base condition of recursive method. If number less than 1, 1 should be returned
        if (number < 1) {
            return 1;
        }

        // Call method recursively subtracting 1 each time to get factorial
        return number * (calculateFactorial(number - 1));
    }
}
