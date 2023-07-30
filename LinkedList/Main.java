package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Method to insert elements at the end of the linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to delete nodes with values greater than 25
    void deleteNodesGreaterThan25() {
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.data > 25) {
                if (current == head) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }
    }

    // Method to print the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        // Take input from the user and build the linked list
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements (numbers in the range of 1-50):");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num >= 1 && num <= 50) {
                linkedList.insert(num);
            } else {
                System.out.println("Invalid input! Numbers should be in the range of 1-50.");
            }
        }

        // Delete nodes with values greater than 25
        linkedList.deleteNodesGreaterThan25();

        // Display the updated linked list
        System.out.println("Linked List after deleting nodes with values greater than 25:");
        linkedList.display();
    }
}
