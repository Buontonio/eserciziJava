package org.example;

public class User {

    private static User user;

    private String name;

    private int age;
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


    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

    public User() {
        this.name = "Default";
        this.age = 0;
    }


}
