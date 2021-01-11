package nl.novi.javaprogrammeren.two;

public class Dog extends Animal {

    private String owner;

    public Dog(String name, String owner, int numberOfLegs) {
        this.setName(name);
        this.owner = owner;
        this.setNumberOfLegs(numberOfLegs);
    }

    public void pet() {
        System.out.println(this.owner + " petted " + this.getName());
    }
}
