package com.chapter01;

public class Student {
    private int age;

//    public Student(int age, String name) {
//        this.name = name;
//        this.age=age;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(0<=age && age <=100){
            this.age = age;
        }else System.out.println("年龄有误！");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<=5){
            this.name = name;
        }else System.out.println("姓名过长！");
    }

    private String name;

    public void showInfo(){
        System.out.println("This student is "+this.age+" years old and name is "+this.name);
    }
}
