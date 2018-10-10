package com.company;

public class Client {
    private String fullName;
    private String address;
    private int age;

    public Client(String fullName, String address, int age) {
        this.fullName = fullName;
        this.address = address;
        this.age = age;
    }

    public String getFullName() {
        return this.fullName;
    }

    @Override
    public String toString() {
        return fullName + " address: " + address + " age: " + age;
    }
}