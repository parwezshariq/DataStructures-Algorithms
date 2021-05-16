package com.shariqparwez.array;

public class TwoDimensionArray {
    // Reference to array
    private int[][] numericArray;

    // Build array using size provided
    public TwoDimensionArray(int rowCount, int columnCount) {
        // Initialize array as per row count and column count provided
        numericArray = new int[rowCount][columnCount];

        // Set default value for each element (i.e. minimum value)
        for (int rowIndex = 0; rowIndex < numericArray.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < numericArray[0].length; columnIndex++) {
                numericArray[rowIndex][columnIndex] = Integer.MIN_VALUE;
            }
        }
    }

    // Get numeric array
    public int[][] getNumericArray() {
        return numericArray;
    }

    // Print all elements of array
    public void print() {
        try {
            // Iterate through each element of array and print on console
            for (int rowIndex = 0; rowIndex < numericArray.length; rowIndex++) {
                for (int columnIndex = 0; columnIndex < numericArray[0].length; columnIndex++) {
                    System.out.printf("%12d ", numericArray[rowIndex][columnIndex]);
                }
                System.out.println();
            }
        } catch (RuntimeException e) {
            System.out.println("Error occurred while traversing array. Error message: " + e.getMessage());
        }
    }

    // Insert element at given index
    public void insert(int rowIndex, int columnIndex, int value) {
        try {
            // If given index do not have any value assigned, assign value to it
            // Otherwise, print message, that this index is already occupied with other value
            if (numericArray[rowIndex][columnIndex] == Integer.MIN_VALUE) {
                numericArray[rowIndex][columnIndex] = value;
            } else {
                System.out.println("Position not empty. Please delete to insert value at this position again.");
            }
        } catch (RuntimeException e) {
            System.out.println("Error occurred while inserting element in array. Error message: " + e.getMessage());
        }
    }

    // Read element at given index
    public void readValue(int rowIndex, int columnIndex) {
        try {
            // Fetch and display element value at given index
            System.out.println("Element at position [row " + (rowIndex + 1) + ", column " + (columnIndex + 1) + "]: "
                    + numericArray[rowIndex][columnIndex]);
        } catch (RuntimeException e) {
            System.out.println("Error occurred while reading element at given position from array. Error message: "
                    + e.getMessage());
        }
    }

    // Search element provided
    public void search(int value) {
        // Iterate through all elements of array and print the location if element is found in array
        for (int rowIndex = 0; rowIndex < numericArray.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < numericArray[0].length; columnIndex++) {
                // If value matches with current element at this index, print the location and return
                if (numericArray[rowIndex][columnIndex] == value) {
                    System.out.println("Found " + value + " at position: " + "[row " + (rowIndex + 1)
                            + ", column " + (columnIndex + 1) + "]");
                    return;
                }
            }
        }

        // If no element in array consist of this value, print on console, value not found
        System.out.println("Element consisting of value " + value + " was not found");
    }

    // Delete element at given index
    public void deleteElement(int rowIndex, int columnIndex) {
        try {
            // If given index already do not have any value, print that there is no element to be deleted
            // Otherwise, assign minimum (default) value at this index
            if (numericArray[rowIndex][columnIndex] == Integer.MIN_VALUE) {
                System.out.println("No element exist at this position that can be deleted");
            } else {
                numericArray[rowIndex][columnIndex] = Integer.MIN_VALUE;
                System.out.println("Deleted element at position [row " + (rowIndex + 1)
                        + ", column " + (columnIndex + 1) + "]");
            }
        } catch (RuntimeException e) {
            System.out.println("Error occurred while deleting element in array. Error message: " + e.getMessage());
        }
    }

    // Reset entire array
    public void reset() {
        // For all element in array, assign minimum (default) value
        for (int rowIndex = 0; rowIndex < numericArray.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < numericArray[0].length; columnIndex++) {
                numericArray[rowIndex][columnIndex] = Integer.MIN_VALUE;
            }
        }
    }
}