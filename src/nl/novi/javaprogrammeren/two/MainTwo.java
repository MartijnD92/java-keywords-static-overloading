package nl.novi.javaprogrammeren.two;

public class MainTwo {

    public static void main(String[] args) {

        Animal mokie = new Dog("Mokie", "Martijn", 4);
        System.out.println(mokie.getName());
        System.out.println(mokie.getNumberOfLegs());
        mokie.pet();
    }
}
