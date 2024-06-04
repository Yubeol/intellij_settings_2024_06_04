package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        사람 a = new 사람();
        a.age = 23;
        a.name = "김철수";
        a.isMarried = true;
        a.introduce();

        사람 b = new 사람();
        b.age = 33;
        b.name = "박영수";
        b.isMarried = false;
        b.introduce();

    }
}

class 사람 {
    int age;

    String name;
    boolean isMarried;

    void introduce() {
        System.out.println("안녕, 나는 23살 기혼, 김철수야 ");
    }
}
