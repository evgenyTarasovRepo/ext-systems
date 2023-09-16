package edu.javacourse.ext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartClass {
    public static void main(String[] args) {
        Street street = new Street(1, "Svobody");
        Street street2 = new Street(1, "Pobedy");
        Street street3 = new Street(1, "Pushkina");

        List<Street> streets = Arrays.asList(street, street2, street3);
        streets.forEach(System.out::println);

    }
}
