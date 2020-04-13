package com.company.dataStructures;

import java.util.Scanner;

public class Queue {
    int front, rear;
    int queue[];
    int size;

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int[] getQueue() {
        return queue;
    }

    public void setQueue(int[] queue) {
        this.queue = queue;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Queue(int front, int rear, int size) {
        this.front = front;
        this.rear = rear;
        this.queue = new int[size];
        this.size = size;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total stack size");
        int size = sc.nextInt();
        Queue queue = new Queue(-1, -1, size);

        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. View stack elements");
            System.out.println("4. Reverse string using stack");
            System.out.println("5. Is stack empty");
            int n = sc.nextInt();
            switch (n) {
                case (1):
                    System.out.println("Enter element");
                    queue.enQueue(sc.nextInt());
                    break;
                case (2):
                    queue.deQueue();
                    break;
                case (3):
                    queue.display();
                    break;
            }
        }
    }

    private void deQueue() {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else if (front == rear && front != -1) {
            System.out.println("Element deleted: " + queue[front]);
            front = rear = -1;
        } else {
            System.out.println("Element deleted: " + queue[front]);
            front ++;
        }
    }

    private void display() {
        System.out.print("Elements are: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    private void enQueue(int data) {
        if (rear == size - 1)
            System.out.println("Overflow");
        else if (front == -1 && rear == -1) {
            front = rear = 0;
            queue[rear] = data;
        } else {
            rear ++;
            queue[rear] = data;
        }
    }
}
