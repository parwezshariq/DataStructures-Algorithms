package com.shariqparwez.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci sequence position identifier
        int position = 6;

        try {
            // Get fibonacci value at given position
            long fibonacci = calculateFibonacci(position);

            // Print fibonacci number
            System.out.println("Fibonacci number at position " + position + " = " + fibonacci);
        } catch (RuntimeException e) {
            System.out.println("Fibonacci calculation failed. Error Message: " + e.getMessage());
        }
    }

    private static long calculateFibonacci(int position) {
        // If position is less than 1 throw exception
        if (position < 1) {
            throw new RuntimeException("Invalid position");
        }

        // If position is first or second, value will be either 0 or 1
        if (position == 1 || position == 2) {
            return position - 1;
        }

        // Calculate fibonacci recursively
        return calculateFibonacci(position - 1) + calculateFibonacci(position - 2);
    }
}
