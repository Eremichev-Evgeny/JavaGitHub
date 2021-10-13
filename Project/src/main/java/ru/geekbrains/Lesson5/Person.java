package ru.geekbrains.Lesson5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo (){
        System.out.printf("Person: fullName - %s, position - %s, email - %s, phone - %s, salary - %d, age - %d\n", this.fullName, this.position, this.email, this.phone, this.salary, this.age);
    }

    public int getAge () {
        return age;
    }
}
