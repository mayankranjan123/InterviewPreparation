package com.company.javaPrograms;

import java.util.Scanner;

public class QuickSort {
    int partition(int [] a, int start, int end) {
        int pivot = a[end - 1];
        int pindex = start;
        for (int i = start; i < end - 1; i++) {
            if (a[i] <= pivot) {
                int temp = a[i];
                a[i] = a[pindex];
                a[pindex] = temp;
                pindex ++;
            }
        }
        int temp = a[pindex];
        a[pindex ] = a[end - 1] ;
        a[end - 1] = temp;
        return pindex;
    }

    void sort(int[] a, int start, int end) {
        if (start < end) {
            int pindex = partition(a, start, end);
            sort(a, start, pindex - 1);
            sort(a, pindex + 1, end);
            System.out.println("Array elements after quick sort:");
            for (int i = 0; i < end; i++) {
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n);
    }
}
