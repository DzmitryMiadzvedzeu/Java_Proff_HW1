package com.telran.org.homeworkone;

public class Phone {
    private int number;
    private int weight;
    private String model;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void receiveCall (String name){
        System.out.println("Звонит " + name);
    }

//    public void getNumber(int){
//        System.out.println(number);
//    }






    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }
}
