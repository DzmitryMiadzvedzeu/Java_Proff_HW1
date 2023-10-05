package com.telran.org.homeworkone;

public class Pesron {
    private String name;
    private String fullname;
    private int age;

    public Pesron() {
    }

    public Pesron(String name, String fullname, int age) {
        this.name = name;
        this.fullname = fullname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move (String Fullname){
        System.out.println( "Такой то " + Fullname + " идёт");
    }

    public void talk (String Fullname){
        System.out.println( "Такой то " + Fullname + " говорит");
    }

    @Override
    public String toString() {
        return "Pesron{" +
                "name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                '}';
    }
}
