package org.example;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String gender;


    public PersonBuilder() {
    }


    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, age, address, gender);
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
