package be.vdab.ExDog;

public class Dog {

    public Dog() {};

    public void bark() {
        System.out.println("Woof woof!");
    }

    public void beg() {
        System.out.println("Beg beg!");
    }

    public void chase() {
        System.out.println("Chase chase");
    }

    public void react(String command) {
        switch (command) {
            case "speak" :
                bark();
                break;
            case "beg":
                beg();
                break;
            case "look the postman":
                chase();
                break;
            default:
                System.out.println("no reaction");
                break;
        }
    }

}

