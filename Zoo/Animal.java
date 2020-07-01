package be.vdab.Zoo;

public class Animal {

    // data fields
    private String name;
    private int weight;
    private String gender;
    private int age;

    // constructor
    Animal() {};
    Animal(String name, int weight, String gender, int age) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    };

    // getters & setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
