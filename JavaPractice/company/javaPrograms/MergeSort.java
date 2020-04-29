package com.company.javaPrograms;

public class MergeSort {
    void merge(int a [], int left [], int right []) {
        int i = 0, j = 0 , k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k] = left[i];
                i ++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        // left sub-array remaining elements
        while (i < left.length) {
            a[k] = left[i];
            i++;
            k++;
        }

        // right sub-array remaining elements
        while (j < right.length) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    int [] initializeArray(int a [], int start, int end) {
        int newArray[] = new int [end - start];
        int j = 0;
        for (int i = start; i < end; i++) {
            newArray[j] = a[i];
            j++;
        }
        return newArray;
    }
    void sort(int[] a) {
        int n = a.length;
        if (n < 2)
            return;
        int mid = n / 2;
        int  lmid = mid;
        if (n % 2 != 0) {
            lmid = mid + 1;
        }
        int [] left = initializeArray(a, 0, lmid);
        int [] right = initializeArray(a, n - mid, n);
        sort(left);
        sort(right);
        merge(a, left, right);
    }
    public static void main(String[] args) {
        int a[] = {10, 7, 8, 9, 1, 5};
        MergeSort mg = new MergeSort();
        mg.sort(a);

        System.out.println("After Merge Sort");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
