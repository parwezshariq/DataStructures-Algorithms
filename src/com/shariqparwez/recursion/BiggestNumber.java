package com.shariqparwez.recursion;

public class BiggestNumber {
    // Assign lowest value possible to biggest number initially
    static int biggestNumber = Integer.MIN_VALUE;

    public static void main(String[] args) {
        // Numbers array
        int[] numbers = {5, 18, 3, 54, 26, 55, 41, 19, 1, 10};

        // Reference to last index position of numbers array
        int lastPosition = numbers.length - 1;

        // Call method to find biggest number present in array
        int biggestNumber = findBiggestNumber(numbers, lastPosition);

        // Print the result on console
        System.out.println("Biggest Number = " + biggestNumber);
    }

    private static int findBiggestNumber(int[] numbers, int lastPosition) {
        // If last position is less than 0, this means that all array elements have been processed,
        // Therefore, return the biggest number found until now
        // Otherwise, check if current position array number is greater than already found biggest number,
        // If yes, update the biggest number with new value found
        if (lastPosition == -1) {
            return biggestNumber;
        } else if (numbers[lastPosition] > biggestNumber) {
            biggestNumber = numbers[lastPosition];
        }

        // Call the method recursively to find biggest number, and return result
        return findBiggestNumber(numbers, lastPosition - 1);
    }
}
