package com.personal;

public class Person {

    String name;
    int age;

    public Person(){
        this.name = "Unknown";
        this.age = 0;
    }
    public Person(String name){
        this.name = name;
        this.age = 0;
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice");
        Person p3 = new Person("bOB",30);
        System.out.println(p1.age+" "+p2.age+" "+ p3.age);
    }
}

class ex{
    private String name;
    private int age;

    public ex(){
        System.out.println("一个人的诞生");
    }

    public ex(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ex people = new ex();
    }
}