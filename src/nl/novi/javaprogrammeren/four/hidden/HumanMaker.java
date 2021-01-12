package nl.novi.javaprogrammeren.four.hidden;

public class HumanMaker {

    private static Human human;

    private HumanMaker() {
    }

    public static Human makeHuman(String name) {
        return human = new Human(name);
    }

    public static String getHumanName() {
       return human.getName();
    }
}
