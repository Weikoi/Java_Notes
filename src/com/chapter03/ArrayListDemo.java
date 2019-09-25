
package com.chapter03;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(1);
        a1.add(2);

        System.out.println(a1);

        System.out.println(a1.get(1));
    }
}
