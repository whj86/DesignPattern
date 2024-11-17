package ch6_Decorator;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.printf("裝扮的%s\n", name);
    }
}
