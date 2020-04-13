package com.company.dataStructures;

import java.util.Scanner;

public class Stack {
    int top;
    int stack [];
    int size;

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int[] getStack() {
        return stack;
    }

    public void setStack(int[] stack) {
        this.stack = stack;
    }

    public Stack(int top, int size) {
        this.top = top;
        this.stack = new int [size];
        this.size = size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total stack size");
        int size = sc.nextInt();
        Stack st = new Stack(-1, size);

        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. View stack elements");
            System.out.println("4. Reverse string using stack");
            System.out.println("5. Is stack empty");
            int n = sc.nextInt();
            switch (n) {
                case (1) :
                    System.out.println("Enter element");
                    st.push(sc.nextInt());
                    break;
                case (2) :
                    st.pop();
                    break;
                case (3) :
                    st.display();
                    break;
                case (4) :
                    st.reverse("1234");
                    break;
                case (5) :
                    System.out.println("Is stack empty: " + st.isEmpty());
                    break;
            }
        }

    }

    private void reverse(String s) {
        char temp [] = s.toCharArray();
        // Push elements to stack
        for (int i = 0; i < s.length(); i++) {
            push(temp[i]);
        }

        //reverse string by popping stack elements
        for (int i = 0; i < s.length(); i++) {
            if (top != -1) {
                temp[i] = (char) stack[top];
                top--;
            }
        }

        System.out.println("Reversed string: " + String.valueOf(temp));
    }

    private void display() {
        if (isEmpty())
            System.out.println("No elements present");
        else {
            System.out.print("Elements are: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    private void pop() {
        if (isEmpty())
            System.out.println("Underflow");
        else {
            System.out.println("Popped element is: " + stack[top]);
            top --;
        }
    }

    private boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    private void push(int data) {
        if (top == size - 1)
            System.out.println("Overflow");
        else {
            top ++;
            stack[top] = data;
        }
    }
}

