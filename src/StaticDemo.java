


class Student{
    int age;
    String name;
    static String School;

}

public class StaticDemo {
    public static void main(String[] args) {
        Student.School = "FDU";

        Student s1 = new Student();
        s1.age=20;
        s1.name="Tom";
        s1.School = "ZJU";  // 类字段可以被覆盖掉；

        System.out.println(s1.name+"---"+s1.age+"---"+s1.School);

    }
}
