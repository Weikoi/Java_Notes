package com.chapter03;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> a1 = new LinkedList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);

        a1.push(4);
        a1.pop();

        System.out.println(a1);
    }
}
