package oop04.polymorphism;

import oop02_inhelbtance.FruitInterface;

public class BananaImp implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s + " 바나나입니다.");
		
	}
	
	

}
