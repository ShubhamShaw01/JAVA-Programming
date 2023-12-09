package com.shubham;

class GenericsTest <T1, T2> {
    private T1 t1;
    private T2 t2;

    public GenericsTest(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }
}

public class Generics {
    public static void main(String[] args) {
        GenericsTest<Integer, String> g1 = new GenericsTest<>(12, "my name is shubham");
        System.out.println("generic values = " + g1.getT1() + " and " + g1.getT2());
    }
}
