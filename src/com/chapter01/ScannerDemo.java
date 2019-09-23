
package com.chapter01;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("x=" + x);

        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int sum = a+b;
        System.out.println("sum=" + sum);

        Scanner sc2 = new Scanner(System.in);
        int x1 = sc2.nextInt();
        int x2 = sc2.nextInt();
        int x3 = sc2.nextInt();
        int maxValue = Math.max(x1, Math.max(x2, x3));
        System.out.println("maxValue=" + maxValue);

    }
}
