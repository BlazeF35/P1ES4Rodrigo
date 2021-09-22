package br.edu.univas.AbstractFactory;

import static br.edu.univas.AbstractFactory.Animal.INVERTEBRADOS;
import static br.edu.univas.AbstractFactory.Animal.VERTEBRADOS;

public class FactoryProvider {

    public static AbstractFactory getAnimalType(Animal animalType) {
        if (animalType.equals(INVERTEBRADOS)) {
            return new Invertebrados();
        } else if (animalType.equals(VERTEBRADOS)) {
            return new Vertebrados();
        }
        return null;
    }
}