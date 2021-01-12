package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.HumanMaker;

public class MainFour {
    public static void main(String[] args) {

        HumanMaker.makeHuman("Adam");
        System.out.println(HumanMaker.getHumanName());

    }
}
