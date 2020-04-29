package com.company.dataStructures;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ implements Comparable<PriorityQ> {
    String name;
    int rank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public PriorityQ(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(PriorityQ o) {
        if (this.rank > o.rank) {
            return 1;
        } else if (this.rank == o.rank)
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return "PriorityQ{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    public static void main(String[] args) {
        PriorityQueue<PriorityQ> pq = new PriorityQueue<>();
        pq.add(new PriorityQ("Mayank", 5)); // rank = 5
        pq.add(new PriorityQ("Ranjan", 3)); // rank = 3, (5 > 3) return 1 means swap
        pq.add(new PriorityQ("David", 4));
        pq.add(new PriorityQ("John", 2));
        Iterator<PriorityQ> it = pq.iterator();
        while (it.hasNext())
            System.out.println(pq.poll().toString()); //poll removes element from queue
    }
}
