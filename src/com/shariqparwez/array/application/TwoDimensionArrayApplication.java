package com.shariqparwez.array.application;

import com.shariqparwez.array.SingleDimensionArray;
import com.shariqparwez.array.TwoDimensionArray;

import java.util.Scanner;

public class TwoDimensionArrayApplication {
    public static void main(String[] args) {
        // Reference variable for twoDimensionArray
        TwoDimensionArray twoDimensionArray = null;

        // Initialize scanner to read input values from console
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            // Menu for two dimension array operations
            System.out.println("\nTwo Dimension Array Operations -");
            System.out.println("\t\t[1] Create Array");
            System.out.println("\t\t[2] Fill elements in Array");
            System.out.println("\t\t[3] Insert element in Array");
            System.out.println("\t\t[4] Print Array");
            System.out.println("\t\t[5] Read element at position in Array");
            System.out.println("\t\t[6] Search element in Array");
            System.out.println("\t\t[7] Delete element at position in Array");
            System.out.println("\t\t[8] Reset Array");
            System.out.println("\t\t[9] Exit");

            // Ask user to enter choice of operation to be performed
            System.out.print("Enter your choice: ");
            int choice = inputScanner.nextInt();

            // Reference variables to store position or element value for performing operations
            int value, rowCount, columnCount, rowPosition, columnPosition;

            // As per choice perform operations on array
            switch (choice) {
                // [1] Create Array
                case 1:
                    // Ask user to enter number of rows and number of columns of array
                    System.out.print("\nEnter number of rows of array: ");
                    rowCount = inputScanner.nextInt();
                    System.out.print("Enter number of columns of array: ");
                    columnCount = inputScanner.nextInt();

                    // Initialize array using row count and column count entered by user
                    twoDimensionArray = new TwoDimensionArray(rowCount, columnCount);
                    break;

                // [2] Fill elements in Array
                case 2:
                    System.out.println();

                    // Fetch two dimension numeric array, and find out number of rows and columns
                    int[][] numericArray = twoDimensionArray.getNumericArray();
                    rowCount = numericArray.length;
                    columnCount = numericArray[0].length;

                    // Iterate to ask user to enter values for all positions of array
                    for (int row = 0; row < rowCount; row++) {
                        for (int column = 0; column < columnCount; column++) {
                            // Ask user to enter element value for the position
                            System.out.print("Insert at position [row " + (row + 1) + ", column " + (column + 1) + "]: ");
                            int arrayElement = inputScanner.nextInt();

                            // Use insert method to insert value
                            twoDimensionArray.insert(row, column, arrayElement);
                        }
                    }

                    System.out.println("Array filled successfully");
                    break;

                // [3] Insert element in Array
                case 3:
                    // Ask user to enter position and value of element to be inserted
                    System.out.print("\nEnter row position: ");
                    rowPosition = inputScanner.nextInt();
                    System.out.print("Enter column position: ");
                    columnPosition =  inputScanner.nextInt();
                    System.out.print("Enter value: ");
                    value = inputScanner.nextInt();

                    // Use insert method to insert value
                    twoDimensionArray.insert((rowPosition - 1), (columnPosition - 1), value);
                    break;

                // [4] Print Array
                case 4:
                    // Print elements of array
                    System.out.println("\nArray elements: ");
                    twoDimensionArray.print();
                    break;

                // [5] Read element at position in Array
                case 5:
                    // Ask user to enter position from which element had to be read
                    System.out.print("\nEnter row position: ");
                    rowPosition = inputScanner.nextInt();
                    System.out.print("Enter column position: ");
                    columnPosition = inputScanner.nextInt();

                    // Use readValue method to read elements value from given position
                    twoDimensionArray.readValue(rowPosition - 1, columnPosition - 1);
                    break;

                // [6] Search element in Array
                case 6:
                    // Ask user to enter elements value to be searched
                    System.out.print("\nEnter value to search: ");
                    value = inputScanner.nextInt();

                    // Use search method to find position of the element in array
                    twoDimensionArray.search(value);
                    break;

                // [7] Delete element at position in Array
                case 7:
                    // Ask user to enter elements position to be deleted from array
                    System.out.print("\nEnter row position: ");
                    rowPosition = inputScanner.nextInt();
                    System.out.print("Enter column position: ");
                    columnPosition = inputScanner.nextInt();

                    // Use deleteElement method to delete it from array
                    twoDimensionArray.deleteElement(rowPosition - 1, columnPosition - 1);
                    break;

                // [8] Reset Array
                case 8:
                    // Use reset method to clear all existing elements in array
                    twoDimensionArray.reset();
                    System.out.println("\nArray reset completed");
                    break;

                // [9] Exit
                case 9:
                    // Use system exit method to terminate program
                    System.exit(0);
            }
        }
    }
}
