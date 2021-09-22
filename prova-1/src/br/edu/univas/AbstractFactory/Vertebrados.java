package br.edu.univas.AbstractFactory;

import br.edu.univas.vo.Elephant;
import br.edu.univas.vo.Shark;

public class Vertebrados implements AbstractFactory{

	@Override
	public Eat getAnimal(Type animal) {
		if(animal.equals(Type.ELEPHANT)) {
			return new Elephant();
		}else if(animal.equals(Type.SHARK)) {
			return new Shark();
		}
		return null;
	}
}
