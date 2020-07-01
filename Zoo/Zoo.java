package be.vdab.Zoo;

import java.util.ArrayList;

public class Zoo {

    // 1 array per animal
    Ape[] apes = new Ape[1];
    Dolphin[] dolphins = new Dolphin[1];
    Lion[] lions = new Lion[1];
    Rinoceros[] rinos = new Rinoceros[1];
    Turtle[] turtles = new Turtle[1];

    // counter animals
    int numberOfApes;
    int numberOfDolphins;
    int numberOfLions;
    int numberOfRinos;
    int numberOfTurtles;

    // 5 overloaded methods to add animals to their array
    public void add(Ape ape) {
        Ape[] temp = new Ape[apes.length + 1];
        for (int i = 0; i < numberOfApes; i++) {
            temp[i] = apes[i];
        }
        apes = temp;
        apes[numberOfApes] = ape;
        numberOfApes++;
    }

    public void add(Dolphin dolphin) {
        Dolphin[] temp = new Dolphin[dolphins.length + 1];
        for (int i = 0; i < numberOfDolphins; i++) {
            temp[i] = dolphins[i];
        }
        dolphins = temp;
        dolphins[numberOfDolphins] = dolphin;
        numberOfDolphins++;
    }

    public void add(Lion lion) {
        Lion[] temp = new Lion[lions.length + 1];
        for (int i = 0; i < numberOfLions; i++) {
            temp[i] = lions[i];
        }
        lions = temp;
        lions[numberOfLions] = lion;
        numberOfLions++;
    }

    public void add(Rinoceros rino) {
        Rinoceros[] temp = new Rinoceros[rinos.length + 1];
        for (int i = 0; i < numberOfRinos; i++) {
            temp[i] = rinos[i];
        }
        rinos = temp;
        rinos[numberOfRinos] = rino;
        numberOfRinos++;
    }

    public void add(Turtle turtle) {
        Turtle[] temp = new Turtle[turtles.length + 1];
        for (int i = 0; i < numberOfTurtles; i++) {
            temp[i] = turtles[i];
        }
        turtles = temp;
        turtles[numberOfTurtles] = turtle;
        numberOfTurtles++;
    }

    // method to print current list of animals with their features
    public void print() {
        for (int i = 0; i < numberOfApes; i++) {
            System.out.print("APE " + (i+1) + ": ");
            System.out.print(apes[i].getName() + ", " + apes[i].getWeight() + " kg, ");
            System.out.print(apes[i].getGender() + ", " + apes[i].getAge() + " years old\n");
        }
        for (int i = 0; i < numberOfDolphins; i++) {
            System.out.print("DOLPHIN " + (i+1) + ": ");
            System.out.print(dolphins[i].getName() + ", " + dolphins[i].getWeight() + " kg, ");
            System.out.print(dolphins[i].getGender() + ", " + dolphins[i].getAge() + " years old\n");
        }
        for (int i = 0; i < numberOfLions; i++) {
            System.out.print("LION " + (i+1) + ": ");
            System.out.print(lions[i].getName() + ", " + lions[i].getWeight() + " kg, ");
            System.out.print(lions[i].getGender() + ", " + lions[i].getAge() + " years old\n");
        }
        for (int i = 0; i < numberOfRinos; i++) {
            System.out.print("RINOCEROS " + (i+1) + ": ");
            System.out.print(rinos[i].getName() + ", " + rinos[i].getWeight() + " kg, ");
            System.out.print(rinos[i].getGender() + ", " + rinos[i].getAge() + " years old\n");
        }
        for (int i = 0; i < numberOfTurtles; i++) {
            System.out.print("TURTLE " + (i+1) + ": ");
            System.out.print(turtles[i].getName() + ", " + turtles[i].getWeight() + " kg, ");
            System.out.print(turtles[i].getGender() + ", " + turtles[i].getAge() + " years old\n");
        }
    }
}













