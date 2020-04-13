package com.company.dataStructures;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class LinkedList {
    Node start;
    int size;

    public Node getNode() {
        return start;
    }

    public void setNode(Node node) {
        this.start = node;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LinkedList(Node node, int size) {
        this.start = node;
        this.size = size;
    }

    public LinkedList() {
        this.start = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
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
            System.out.println("10. Sort linked list");
            System.out.println("11. Rotate linked list");
            System.out.println("12. Reverse linked list");
            System.out.println("13. Remove duplicates in linked list");
            System.out.println("14. Reverse linked list using recursion");

            int n = sc.nextInt();
            switch (n) {
                case (1) :
                    System.out.println("Enter an element");
                    list.insertAtBeginning(sc.nextInt());
                    break;
                case (2) :
                    System.out.println("Enter an element");
                    list.insertElementAtLast(sc.nextInt());
                    break;
                case (3) :
                    System.out.println("Enter position and element to insert: ");
                    list.insertAtPosition(sc.nextInt(), sc.nextInt());
                case (4) :
                    list.deleteFirstElement();
                    break;
                case (5):
                    list.deleteLastElement();
                    break;
                case (6) :
                    System.out.println("Enter position to delete element from: ");
                    list.deleteFromPosition(sc.nextInt());
                    break;
                case (7) :
                    list.viewElements();
                    break;
                case (8) :
                    System.out.println("Is List Empty: " + list.isEmpty());
                    break;
                case (9) :
                    System.out.println("No. of elements: " + list.size);
                    break;
                case (10) :
                    list.sortElements();
                    break;
                case (11) :
                    System.out.println("Enter position to rotate against");
                    list.rotate(sc.nextInt());
                    break;
                case(12) :
                    list.reverse();
                    break;
                case(13) :
                    list.removeDuplicates();
                    break;
                case (14) :
                    list.reverseUsingRecursion(list.start);
                    break;
            }
        }
    }

    private Node reverseUsingRecursion(Node head) {
        if (head == null)
            return head;
        Node p = head;
        Node q = p.next;
        if (q == null)
            return head;
        q = reverseUsingRecursion(q);
        p.next.next = p;
        p.next = null;
        return q;
    }

    private void reverse() {
        Node prev = null, curr = start, next = start;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start = prev;
    }

    private void removeDuplicates() {
        if (isEmpty())
            System.out.println("No elements found");
        else {
            Node t = start;
            int a[] = new int[1000];
            for (int i = 0; i < 1000; i++) {
                a[i] = 0;
            }

            for (int i = 0; i < size; i++) {
                if (a[t.data] == 1) {
                    deleteFromPosition(i);
                } else {
                    a[t.data] = 1;
                }
                t = t.next;
            }
        }
    }

    private void rotate(int pos) {
        if (isEmpty() || pos > size - 1)
            System.out.println("Rotation not possible");
        else {
            Node t = start, k = start;
            for (int i = 1; i < pos; i++) {
                t = t.next;
            }
           Node p = t.next;

            for (int i = pos; i < size - 1; i++) {
                p = p.next;
            }

            if (p.next == null) {
                p.next = k;
                start = t.next;
                t.next = null;


            } else {
                System.out.println("Rotation failed or error occurred");
            }
        }
    }

    private void sortElements() {
        if (isEmpty())
            System.out.println("No elements");
        else {
            Node p1 = start, p2 = start.next;
            while (p2 != null) {
                if (p1.data > p2.data) {
                    p1.data = p1.data ^ p2.data;
                    p2.data = p1.data ^ p2.data;
                    p1.data = p1.data ^ p2.data;
                }
                p1 = p2;
                p2 = p2.next;
            }
        }
    }

    private void deleteFromPosition(int pos) {
        if (isEmpty() || (pos + 1) > size)
            System.out.println("Deletion not allowed");
        else if (pos == 0)
            deleteFirstElement();
        else if (size == pos + 1)
            deleteLastElement();
        else {
            Node p1 = start, p2 = start, p3 = start;
            for (int i = 0; i < pos; i++) {
                p2 = p1;
                p1 = p1.next;
            }
            p2.next = p1.next;
            size --;
        }
    }

    private void deleteLastElement() {
        if (isEmpty())
            System.out.println("Deletion not allowed, empty linked list");
        else if (size == 1) {
            start = null;
            size --;
        } else {
            Node p1 = start;
            for (int i = 1; i < size - 1; i++) {
                p1 = p1.next;
            }
            p1.next = null;
            size --;
        }
    }

    private void deleteFirstElement() {
        if (isEmpty()) {
            System.out.println("Deletion not allowed, empty linked list");
        } else {
            Node n = start;
            start = n.next;
            size --;
        }
    }

    private void insertAtPosition(int pos, int val) {
        if (pos == size)
            insertElementAtLast(val);
        else if (pos > size)
            System.out.println("Insertion not allowed");
        else if (pos == 0)
            insertAtBeginning(val);
        else {
            Node p1 = start, p2 = start;
            for (int i = 0; i < pos; i++) {
                p2 = p1;
                p1 = p1.next;
            }
            Node n = new Node();
            n.data = val;
            n.next = p1;
            p2.next = n;
            size ++;
        }
    }

    private void insertElementAtLast(int value) {
        Node n = new Node();
        n.data = value;
        if (isEmpty()) {
            start = n;
        } else {
            Node temp = start;
            for (int i = 0; i < size; i++) {
                if (temp.next == null) {
                    temp.next = n;
                }
                temp = temp.next;
            }
        }
        size ++;
    }

    private void insertAtBeginning(int value) {
        Node n = new Node();
        n.data = value;
        if (start != null) {
            n.next = start;
        }
        start = n;
        size ++;
    }

    private void viewElements() {
        Node temp = start;
        System.out.print("Elements are: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }
}
