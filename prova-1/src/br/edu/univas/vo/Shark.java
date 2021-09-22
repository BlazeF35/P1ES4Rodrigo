package br.edu.univas.vo;

import br.edu.univas.AbstractFactory.Eat;

public class Shark implements Eat{

	public void eat() {
		System.out.println("shark eating");
	}
}
