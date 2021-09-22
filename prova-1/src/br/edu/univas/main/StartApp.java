package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.AbstractFactory.AbstractFactory;
import br.edu.univas.AbstractFactory.Animal;
import br.edu.univas.AbstractFactory.Eat;
import br.edu.univas.AbstractFactory.FactoryProvider;
import br.edu.univas.AbstractFactory.Type;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***ANIMAIS***");
		System.out.println("1 - Vertebrados");
		System.out.println("2 - Invertebrados");
		System.out.println("Digite sua opção:");
		
		int option = scanner.nextInt();
		
		if (option == 1) {
            AbstractFactory factory = FactoryProvider.getAnimalType(Animal.VERTEBRADOS);
            Eat elephant = factory.getAnimal(Type.ELEPHANT);
            elephant.eat();

            Eat shark = factory.getAnimal(Type.SHARK);
            shark.eat();


        } else if (option == 2) {
            AbstractFactory factory = FactoryProvider.getAnimalType(Animal.INVERTEBRADOS);
            Eat ant = factory.getAnimal(Type.ANT);
            ant.eat();

            Eat bee = factory.getAnimal(Type.BEE);
            bee.eat();
		}
		
		scanner.close();
	}
}
