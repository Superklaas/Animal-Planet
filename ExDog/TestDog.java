package be.vdab.ExDog;

public class TestDog {
    public static void main(String[] args) {
        Dog bobby = new Dog();
        bobby.bark();
        bobby.beg();
        bobby.chase();
        bobby.react("look the postman");
        bobby.react("beg");
        bobby.react("speak");
        bobby.react("behave");
    }
}
