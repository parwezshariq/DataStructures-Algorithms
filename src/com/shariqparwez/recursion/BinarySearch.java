package com.shariqparwez.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        // Numbers array
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

        // Provide search parameters
        int searchNumber = 125;
        int startPosition = 0;
        int endPosition = numbers.length - 1;

        try {
            // Do binary search and fnd the position of search element in array
            int searchNumberIndex = binarySearch(searchNumber, numbers, startPosition, endPosition);

            // Print the result on console
            System.out.println("Found " + searchNumber + " at position " + (searchNumberIndex + 1));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int binarySearch(int searchNumber, int[] numbers, int startPosition, int endPosition) {
        // Check if start position is same or with just one number difference with end position,
        // this implies only two element is present and therefore either of start or end position is our result
        // If not, throw exception
        if ((endPosition - startPosition) <= 1) {
            // If number being searched matches with the position number in array, return the position
            // Otherwise throw exception that number is not present in array
            if (numbers[startPosition] == searchNumber) {
                return startPosition;
            } else if (numbers[endPosition] == searchNumber) {
                return endPosition;
            } else {
                throw new RuntimeException("Number do not exist");
            }
        }

        // Calculate mid position
        int midPosition = getMidPosition(startPosition, endPosition);

        // If number found at current position, return position,
        // Otherwise recursively call to find number with updated startPosition/endPosition
        if (numbers[midPosition] == searchNumber) {
            return midPosition;
        } else if (numbers[midPosition] > searchNumber) {
            return binarySearch(searchNumber, numbers, startPosition, midPosition);
        } else {
            return binarySearch(searchNumber, numbers, midPosition, endPosition);
        }
    }

    private static int getMidPosition(int startPosition, int endPosition) {
        // Calculate midPosition
        return startPosition + ((endPosition - startPosition) / 2);
    }
}
