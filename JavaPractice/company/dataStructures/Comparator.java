package com.company.dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Comparator implements java.util.Comparator<Integer> {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        java.util.Comparator<Integer> comp = new Comparator();
        Collections.sort(list, comp);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1; // return 1 means swap, descending order
        return -1;
    }

    @Override
    public java.util.Comparator<Integer> reversed() {
        return null;
    }
}
