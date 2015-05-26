package oop04.polymorphism;

import oop02_inhelbtance.FruitInterface;

public class AppleImp implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s + " 사과입니다.");
		
	}

}
