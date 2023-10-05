package com.telran.org.homeworkone;

public class HomeworkOneApp {
    public static void main(String[] args) {

        Pesron JohnKonor = new Pesron();
        JohnKonor.setName("John");
        JohnKonor.setFullname("John Konor");
        JohnKonor.setAge(30);


        Pesron KonorJohn = new Pesron("Konor", "Konor John", 25 );

        System.out.println(JohnKonor);
        System.out.println(KonorJohn);


        JohnKonor.move("John Konor");

        JohnKonor.talk("John Konor");


        KonorJohn.move("Konor John");

        KonorJohn.talk("Konor John");


        Phone motorolla = new Phone();
        motorolla.setModel("Motorolla Razr V3");
        motorolla.setWeight(120);
        motorolla.setNumber(225544);

        Phone alcatel = new Phone();
        alcatel.setModel("Alcatel F150");
        alcatel.setWeight(130);
        alcatel.setNumber(114422);

        Phone siemens = new Phone();
        siemens.setModel("Siemens C65");
        siemens.setWeight(100);
        siemens.setNumber(337788);

        System.out.println("Model is: " + motorolla.getModel() + "; " + "Weight: " + motorolla.getWeight() + "; " + "Number: " + motorolla.getNumber() + ".");
        System.out.println("Model is: " + alcatel.getModel() + "; " + "Weight: " + alcatel.getWeight() + "; " + "Number: " + alcatel.getNumber() + ".");
        System.out.println("Model is: " + siemens.getModel() + "; " + "Weight: " + siemens.getWeight() + "; " + "Number: " + siemens.getNumber() + ".");

        motorolla.receiveCall("Alex");
        alcatel.receiveCall("Jordan");
        siemens.receiveCall("Tifany");




    }


}
