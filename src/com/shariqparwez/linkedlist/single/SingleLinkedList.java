package com.shariqparwez.linkedlist.single;

import java.util.Objects;

public class SingleLinkedList {

    private Node node;
    private Node headNode;
    private Node tailNode;

    public SingleLinkedList(int firstNodeValue) {
        // Initialize new node with provided value
        node = new Node();
        node.setData(firstNodeValue);

        // Assign this node to headNode and tailNode reference
        headNode = node;
        tailNode = node;
    }

    public void display() {
        // Check if linked list has been created
        if (Objects.isNull(headNode)) {
            System.out.println("Linked List do not exist");
            return;
        }

        // Get reference to head node
        Node node = headNode;

        System.out.print("\nSingle Linked List: ");

        // Print values of all the nodes in present linked list
        while (Objects.nonNull(node)) {
            System.out.print(node.getData() + " ");
            node = node.getNextNode();
        }

        System.out.print("\nHead Node: " + headNode.getData());
        System.out.print("\nTail Node: " + tailNode.getData());
        System.out.println();
    }

    public void insert(int nodeValue, int position) {
        // Check if linked list has been created
        if (Objects.isNull(headNode)) {
            System.out.println("Linked List do not exist");
            return;
        }

        // Set reference of node
        Node traverseNode = headNode;
        Node previousNode = null;

        // Find size of linked list
        int size = size(headNode);

        // Start a loop starting with first node position until position provided
        for (int nodeCount = 0; nodeCount <= (size + 1); nodeCount++) {
            // If current node position is matched with position provided, start insertion process
            if (nodeCount == position) {
                // If node to be entered is at first position, insert node at start
                // If node to be entered is at last position, insert node at end
                // Otherwise, insert in between
                if (position == 0) {
                    insertAtStart(nodeValue);
                } else if (Objects.isNull(traverseNode)) {
                    insertAtEnd(nodeValue);
                } else {
                    insertInBetween(nodeValue, traverseNode, previousNode);
                }

                // Print successful message of insertion
                System.out.println("Node inserted at position " + (position + 1) + ": " + nodeValue);
                return;
            }

            // Break out of loop if traverse mode is null
            if (Objects.isNull(traverseNode)) {
                break;
            }

            // Maintain reference to previous node and next node
            previousNode = traverseNode;
            traverseNode = traverseNode.getNextNode();
        }

        // Return message if node position was invalid
        System.out.println("Failed to insert node at position " + (position + 1));
    }

    private void insertAtStart(int nodeValue) {
        // Initialize new node
        Node newNode = new Node();
        newNode.setData(nodeValue);
        newNode.setNextNode(headNode);

        // Change reference of head node to new node
        headNode = newNode;
    }

    private void insertAtEnd(int nodeValue) {
        // Initialize new node
        Node newNode = new Node();
        newNode.setData(nodeValue);

        // Assign next node of last node to new node
        tailNode.setNextNode(newNode);

        // Change reference of tail node to new node
        tailNode = newNode;
    }

    private void insertInBetween(int nodeValue, Node currentNode, Node previousNode) {
        // Initialize new node
        Node newNode = new Node();
        newNode.setData(nodeValue);
        newNode.setNextNode(currentNode);

        // Previous node should refer to new node
        previousNode.setNextNode(newNode);
    }

    private int size(Node headNode) {
        // Check if linked list has been created
        if (Objects.isNull(headNode)) {
            System.out.println("Linked List do not exist");
            return 0;
        }

        // Initialize size variable
        int size = 0;

        // Reference to head node for traversal
        Node traverseNode = headNode;

        // Iterate until last node to get the size of node
        while (Objects.nonNull(traverseNode)) {
            traverseNode = traverseNode.getNextNode();
            size++;
        }

        // Return size of the linked list
        return size;
    }

    public void search(int searchValue) {
        // Check if linked list has been created
        if (Objects.isNull(headNode)) {
            System.out.println("Linked List do not exist");
            return;
        }

        // Assign headNode to traverseNode, for traversal
        Node traverseNode = headNode;

        // Traverse through each nodes to find the search value
        for (int nodeCount = 0; Objects.nonNull(traverseNode); nodeCount++) {
            // If node value matches with search value, print node number
            if (traverseNode.getData() == searchValue) {
                System.out.println("Found " + searchValue + " at node number: " + (nodeCount + 1));
                return;
            }

            // Get reference of next node in linked list
            traverseNode = traverseNode.getNextNode();
        }

        // Node not found will be displayed on console
        System.out.println("No node found with value " + searchValue);
    }

    public void delete(int nodePosition) {
        // Check if linked list has been created
        if (Objects.isNull(headNode)) {
            System.out.println("Linked List do not exist");
            return;
        }

        // Set reference for traversal
        Node traverseNode = headNode;
        Node previousNode = null;

        // Traverse through nodes
        for (int nodeCount = 0; Objects.nonNull(traverseNode); nodeCount++) {
            // Perform deletion only if position matches with iteration count
            if (nodeCount == nodePosition) {
                // If first node to be deleted, 1) Only one node, and 2) Other nodes present
                // If last node to be deleted
                // If node in between to be deleted
                if (nodePosition == 0) {
                    deleteAtStart(traverseNode);
                } else if (Objects.isNull(traverseNode.getNextNode())) {
                    deleteAtEnd(previousNode);
                } else {
                    deleteInBetween(traverseNode, previousNode);
                }
                System.out.println("Deleted node at position " + (nodePosition + 1));
                return;
            }

            // Update references for traverseNode and previousNode
            previousNode = traverseNode;
            traverseNode = traverseNode.getNextNode();
        }

        // Display message to no node was found with given position
        System.out.println("No node found with position " + (nodePosition + 1));
    }

    private void deleteInBetween(Node traverseNode, Node previousNode) {
        // Update reference of previous to next node from current node
        previousNode.setNextNode(traverseNode.getNextNode());
    }

    private void deleteAtEnd(Node previousNode) {
        // Previous node reference to next node is marked null, so that it will become last node
        previousNode.setNextNode(null);

        // Update tailNode reference to previous node
        tailNode = previousNode;
    }

    private void deleteAtStart(Node traverseNode) {
        // If current node is the only node, reset linked list
        // Otherwise update reference of head node
        if (Objects.isNull(traverseNode.getNextNode())) {
            headNode = null;
            tailNode = null;
        } else {
            headNode = traverseNode.getNextNode();
        }
    }

    public void reset() {
        // Check if linked list has been created
        if (Objects.isNull(headNode)) {
            System.out.println("Linked List do not exist");
            return;
        }

        // Reset linked list
        headNode = null;
        tailNode = null;

        // Display message that reset has been completed
        System.out.println("Linked list reset done");
    }
}
