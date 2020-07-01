package be.vdab.Zoo;

public class TestZoo {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Ape a1 = new Ape("Freddie", 56, "M", 6);
        zoo.add(a1);
        Ape a2 = new Ape("Veerle", 59, "V", 4);
        zoo.add(a2);
        Ape a3 = new Ape("Pedro", 20, "M", 45);
        zoo.add(a3);

        Dolphin d1 = new Dolphin("Filip", 80, "M", 10);
        zoo.add(d1);
        Dolphin d2 = new Dolphin("Adelheid", 68, "V", 9);
        zoo.add(d2);
        Dolphin d3 = new Dolphin("Fatima", 56, "V", 6);
        zoo.add(d3);
        Dolphin d4 = new Dolphin("Rudy", 80, "M", 60);
        zoo.add(d4);

        Lion l1 = new Lion("Johan Museeuw de leeuw van Vlaanderen", 70, "M", 55);
        zoo.add(l1);
        Lion l2 = new Lion("Frederik", 60, "M", 50);
        zoo.add(l2);
        Lion l3 = new Lion("Louis", 40, "M", 208);
        zoo.add(l3);

        Rinoceros r1 = new Rinoceros("Mohamed", 70, "M", 10);
        zoo.add(r1);
        Rinoceros r2 = new Rinoceros("Hilary", 140, "V", 10);
        zoo.add(r2);

        Turtle t1 = new Turtle("Beatrijs", 36, "V", 3);
        zoo.add(t1);
        Turtle t2 = new Turtle("Magda", 7, "V", 7);
        zoo.add(t2);
        Turtle t3 = new Turtle("Lydia", 78, "V", 2);
        zoo.add(t3);

        zoo.print();
    }

}
