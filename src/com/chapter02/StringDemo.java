
package com.chapter02;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        System.out.println("s1==s2?"+(s1==s2));

        StringBuilder sb = new StringBuilder(s1);
        System.out.println(sb);

        int[] a = new int[]{1,2,3,4,5};
        for (int i :a) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
