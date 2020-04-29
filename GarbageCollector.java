package com.company;

public class GarbageCollector {

    void test() {
        Integer x= 4;
        System.out.println(x);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Run before deleting");
    }

    public static void main(String[] args) {
        GarbageCollector garbageCollector = new GarbageCollector();
        System.gc();
        garbageCollector.test();
    }
}
