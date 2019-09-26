package com.chapter01;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(101);
        s1.setName("abcdefg");
        s1.showInfo();
        char[] chs = {'H', 'E', 'L', 'L', 'O'};
        String s2 = new String(chs);
        System.out.println(s2);
    }
}
