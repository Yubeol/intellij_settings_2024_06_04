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
//        System.out.println("a의 나이: " + a.age);
//        a.age++;
//        a.introduce();
//        System.out.println("a의 나이: " + a.age);

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
//        int age = this.age;
//        String name = this.name;
//        boolean isMarried = this.isMarried;
        System.out.println("===자기소개===");
        System.out.printf("이름: %s\n", this.name );
        System.out.printf("나이: %d\n", this.age);
        System.out.printf("결혼여부: %b\n", this.isMarried);

    }
}
