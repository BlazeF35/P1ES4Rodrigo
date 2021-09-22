package br.edu.univas.AbstractFactory;

import br.edu.univas.vo.Ant;
import br.edu.univas.vo.Bee;

public class Invertebrados implements AbstractFactory {

		@Override
		public Eat getAnimal(Type animal) {
			if(animal.equals(Type.ANT)) {
				return new Ant();
			}else if(animal.equals(Type.BEE)) {
				return new Bee();
			}
			return null;
		}
}

