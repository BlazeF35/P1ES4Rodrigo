package br.edu.univas.vo;

import br.edu.univas.AbstractFactory.Eat;

public class Elephant implements Eat{

	public void eat() {
		System.out.println("elephant eating");
	}
}
