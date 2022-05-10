package com.company;

public class Main {

    public static void main(String[] args) {

        Fish fish1 = new Fish();
        fish1.setKind("Shark");
        fish1.setWeight(14);
        System.out.println("Kind of: " + fish1.getKind() + "  Weight: " + fish1.getWeight() + "kg");
        System.out.println();

        Dog dog1 = new Dog();
        dog1.setName("Bendi");
        dog1.setAge(3);
        dog1.setWeight(32);
        System.out.println("Name: " + dog1.getName() + "  Age: " + dog1.getAge() + "y.  Weight: " + dog1.getWeight() + "kg");
        System.out.println();


        Cat mycat1 = new Cat();
        mycat1.setName("Koshka");
        mycat1.setColor("Black");
        mycat1.setAge(2);
        System.out.println("Name: "+mycat1.getName()+"  Color: "+mycat1.getColor()+"  Age: "+mycat1.getAge());
        System.out.println();

        Popugai popugai = new Popugai();
        popugai.setName("Popugaika");
        popugai.setAge(1);
        popugai.setWeight(4);
        System.out.println("Name: "+popugai.getName()+"  Age: "+popugai.getAge()+"  Weight: "+popugai.getWeight());
    }
}
