package com.company.dataStructures;

import java.util.Scanner;

class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode prev;

    public DoubleNode(int data, DoubleNode next, DoubleNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public DoubleNode() {
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
}

public class DoublyLinkedList {
    DoubleNode start;
    int size;

    public DoubleNode getStart() {
        return start;
    }

    public void setStart(DoubleNode start) {
        this.start = start;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DoublyLinkedList(DoubleNode start, int size) {
        this.start = start;
        this.size = size;
    }

    public DoublyLinkedList() {
        this.start = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Insert element at beginning");
            System.out.println("2. Insert element at last");
            System.out.println("3. Insert element at position");
            System.out.println("4. Delete first element");
            System.out.println("5. Delete last element");
            System.out.println("6. Delete from position");
            System.out.println("7. View Elements");
            System.out.println("8. Is LinkedList empty");
            System.out.println("9. No. of elements");
            System.out.println("10. Reverse Linked list");
            int n = sc.nextInt();
            switch (n) {
                case (1) :
                    System.out.println("Enter element");
                    list.insertAtBeginning(sc.nextInt());
                    break;
                case (2) :
                    System.out.println("Enter element");
                    list.insertAtLast(sc.nextInt());
                    break;
                case (4) :
                    list.deleteFirstElement();
                    break;
                case (5) :
                    list.deleteLastElement();
                    break;
                case (7) :
                    list.displayElements();
                    break;
                case (8) :
                    System.out.println("Is Doubly LinkedList empty: " + list.isEmpty());
                    break;
                case (9) :
                    list.totalElements();
                case (10) :
                    list.reverse();
                    break;
            }
        }
    }

    private void reverse() {
        DoubleNode curr = start, next = start, prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start = prev;
    }

    private void insertAtLast(int val) {
        if (isEmpty()) {
            insertAtBeginning(val);
        } else {
            DoubleNode node = new DoubleNode();
            node.data = val;
            DoubleNode temp = start;
            for (int i = 0; i < size; i++) {
                if (temp.next == null) {
                    temp.next = node;
                    node.prev = temp;
                }
                temp = temp.next;
            }
            size ++;
        }
    }

    private void deleteFirstElement() {
        if (isEmpty())
            System.out.println("Deletion not allowed");
        else {
            DoubleNode node = start;
            node.next.prev = null;
            start = node.next;
            size --;
        }
    }

    private void totalElements() {
        System.out.println("Total elements: " + size);
    }

    private void deleteLastElement() {
        if (isEmpty())
            System.out.println("Deletion not allowed");
        else if (size == 1) {
            start = null;
            size --;
        } else {
            DoubleNode temp = start;
            for (int i = 1; i < size - 1; i++) {
                temp = temp.next;
            }
            temp.next = null;
            size --;
        }
    }

    private void displayElements() {
        if (isEmpty())
            System.out.println("No elements");
        else {
            System.out.print("Elements are: ");
            DoubleNode n = start;
            for (int i = 0; i < size; i++) {
                System.out.print(n.data + "  ");
                n = n.next;
            }
            System.out.println();
        }

    }

    private void insertAtBeginning(int val) {
        DoubleNode node = new DoubleNode();
        node.data = val;
        if (!isEmpty()) {
            node.next = start;
            start.prev = node;
        }
        start = node;
        size ++;
    }

    private boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }
}
