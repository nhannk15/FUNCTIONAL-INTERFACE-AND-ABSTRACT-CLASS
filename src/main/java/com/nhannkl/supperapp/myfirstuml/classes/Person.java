package com.nhannkl.supperapp.myfirstuml.classes;

public abstract class Person {
    private String id;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public void doTalk(String message) {
        System.out.println("Person say: " + message);
    }
    
    public void doSleep(int hours) {
        System.out.println("Doing something during " + hours + " hours of sleeping");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
        
}








