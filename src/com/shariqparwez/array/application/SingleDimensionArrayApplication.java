package com.shariqparwez.array.application;

import com.shariqparwez.array.SingleDimensionArray;

import java.util.Scanner;

public class SingleDimensionArrayApplication {
    public static void main(String[] args) {
        // Reference variable for singleDimensionArray
        SingleDimensionArray singleDimensionArray = null;

        // Initialize scanner to read input values from console
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            // Menu for single dimension array operations
            System.out.println("\nSingle Dimension Array Operations -");
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
            int position, value;

            // As per choice perform operations on array
            switch (choice) {
                // [1] Create Array
                case 1:
                    // Ask user to enter size of array
                    System.out.print("\nEnter size of array: ");
                    int arraySize = inputScanner.nextInt();

                    // Initialize array using the size entered by user
                    singleDimensionArray = new SingleDimensionArray(arraySize);
                    break;

                // [2] Fill elements in Array
                case 2:
                    System.out.println();

                    // Iterate to ask user to enter values for all positions of array
                    for (int i = 0; i < singleDimensionArray.getNumericArray().length; i++) {
                        // Ask user to enter element value for the position
                        System.out.print("Insert at position " + (i + 1) + " : ");
                        int arrayElement = inputScanner.nextInt();

                        // Use insert method to insert value
                        singleDimensionArray.insert(i, arrayElement);
                    }

                    System.out.println("Array filled successfully");
                    break;

                // [3] Insert element in Array
                case 3:
                    // Ask user to enter position and value of element to be inserted
                    System.out.print("\nEnter position: ");
                    position = inputScanner.nextInt();
                    System.out.print("Enter value: ");
                    value =  inputScanner.nextInt();

                    // Use insert method to insert value
                    singleDimensionArray.insert((position-1), value);
                    break;

                // [4] Print Array
                case 4:
                    // Print elements of array
                    System.out.print("\nArray elements: ");
                    singleDimensionArray.print();
                    System.out.println();
                    break;

                // [5] Read element at position in Array
                case 5:
                    // Ask user to enter position from which element had to be read
                    System.out.print("\nEnter position: ");
                    position = inputScanner.nextInt();

                    // Use readValue method to read elements value from given position
                    singleDimensionArray.readValue(position - 1);
                    break;

                // [6] Search element in Array
                case 6:
                    // Ask user to enter elements value to be searched
                    System.out.print("\nEnter value to search: ");
                    value = inputScanner.nextInt();

                    // Use search method to find position of the element in array
                    singleDimensionArray.search(value);
                    break;

                // [7] Delete element at position in Array
                case 7:
                    // Ask user to enter elements position to be deleted from array
                    System.out.print("\nEnter position: ");
                    position = inputScanner.nextInt();

                    // Use deleteElement method to delete it from array
                    singleDimensionArray.deleteElement(position - 1);
                    break;

                // [8] Reset Array
                case 8:
                    // Use reset method to clear all existing elements in array
                    singleDimensionArray.reset();
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
