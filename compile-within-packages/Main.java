package my.domain;

import my.other.domain.AnotherClass;

public class Main {

    public static void main(String... args) {
        new AnotherClass().sayHello();
        System.out.println("World!");
    }

}