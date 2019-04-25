package com.robin.springmvc.hello.entities;

public class User {
    private String name;
    private String password;
    private int age;
    private Address address;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public User(String name, String password, int age, int id) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.id = id;
    }

    public User() {

    }
}
