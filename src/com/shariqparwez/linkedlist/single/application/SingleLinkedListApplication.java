package com.shariqparwez.linkedlist.single.application;

import com.shariqparwez.linkedlist.single.SingleLinkedList;

import java.util.Scanner;

public class SingleLinkedListApplication {
    public static void main(String[] args) {
        // Reference variable for singleLinkedList
        SingleLinkedList singleLinkedList = null;

        // Initialize scanner to read input values from console
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            // Menu for single dimension array operations
            System.out.println("\nSingle Linked List Operations -");
            System.out.println("\t\t[1] Create");
            System.out.println("\t\t[2] Display");
            System.out.println("\t\t[3] Insert");
            System.out.println("\t\t[4] Search");
            System.out.println("\t\t[5] Delete");
            System.out.println("\t\t[6] Reset");
            System.out.println("\t\t[7] Exit");

            // Ask user to enter choice of operation to be performed
            System.out.print("Enter your choice: ");
            int choice = inputScanner.nextInt();

            // Reference variables to store position or element value for performing operations
            int nodeValue, nodePosition;

            // As per choice perform operations on single linked list
            switch (choice) {
                // [1] Create
                case 1:
                    // Ask user to enter value of first node of linked list
                    System.out.print("\nEnter value for first node in linked list: ");
                    int firstNodeValue = inputScanner.nextInt();

                    // Initialize linked using the first node value entered by user
                    singleLinkedList = new SingleLinkedList(firstNodeValue);
                    System.out.println("Successfully created single linked list");

                    break;

                // [2] Display
                case 2:
                    // Display linked list nodes
                    singleLinkedList.display();

                    break;

                // [3] Insert
                case 3:
                    // Ask user to enter value of node and position of node to be inserted in linked list
                    System.out.print("\nEnter value for node: ");
                    nodeValue = inputScanner.nextInt();
                    System.out.print("Enter position of node: ");
                    nodePosition = inputScanner.nextInt();

                    // Insert node at given position in linked list
                    singleLinkedList.insert(nodeValue, nodePosition - 1);

                    break;

                // [4] Search
                case 4:
                    // Ask user to enter value for which node in linked list had to be searched
                    System.out.print("\nEnter value to be searched: ");
                    nodeValue = inputScanner.nextInt();

                    // Search linked list
                    singleLinkedList.search(nodeValue);

                    break;

                // [5] Delete node
                case 5:
                    // Ask user to enter position for which node in linked list had to be deleted
                    System.out.print("\nEnter position of node to be deleted: ");
                    nodePosition = inputScanner.nextInt();

                    // Deleted linked list node at given position
                    singleLinkedList.delete(nodePosition - 1);

                    break;

                // [6] Reset linked list
                case 6:
                    // Reset linked list
                    singleLinkedList.reset();

                    break;

                // [7] Exit
                case 7:
                    // Use system exit method to terminate program
                    System.exit(0);
            }
        }

    }
}
