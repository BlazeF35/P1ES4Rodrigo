package br.edu.univas.vo;

import br.edu.univas.AbstractFactory.Eat;

public class Ant implements Eat{

	@Override
	public void eat() {
		System.out.println("ant eating");
	}
}
