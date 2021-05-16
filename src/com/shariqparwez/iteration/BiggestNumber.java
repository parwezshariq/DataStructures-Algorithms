package com.shariqparwez.iteration;

public class BiggestNumber {
    public static void main(String[] args) {
        // Numbers array
        int[] numbers = {5, 18, 3, 54, 26, 55, 41, 19, 1, 10};

        // Call method to find biggest number present in array
        int biggestNumber = findBiggestNumber(numbers);

        // Print the result on console
        System.out.println("Biggest Number = " + biggestNumber);
    }

    private static int findBiggestNumber(int[] numbers) {
        // Assume first number present in array to be biggest
        int biggestNumber = numbers[0];

        // Iterate through all numbers present in array, to find actual biggest number
        for (int i = 1; i < numbers.length; i++) {
            // If current number in array is greater than already found biggest number,
            // replace it, with new found number
            if (numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
            }
        }

        // Return the biggest number as result
        return biggestNumber;
    }
}
