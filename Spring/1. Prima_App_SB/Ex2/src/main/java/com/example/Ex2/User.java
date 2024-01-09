package com.example.Ex2;

public class User {

    public String name;
    public String province;
    public String greet;

    public User(String province, String name, String greet) {
        this.province = province;
        this.name = name;
        this.greet = greet;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", greet='" + greet + '\'' +
                '}';
    }
}
