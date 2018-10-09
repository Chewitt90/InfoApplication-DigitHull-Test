package com.company;

public class Client
{
    public Client(String fullName, String address, int age)
    {
        FullName = fullName;
        Address = address;
        Age = age;
    }

    public String FullName;
    public String Address;
    public int Age;

    @Override
    public java.lang.String toString() {
        return FullName + " Address: " + Address + " Age: " + Age;
    }
}
