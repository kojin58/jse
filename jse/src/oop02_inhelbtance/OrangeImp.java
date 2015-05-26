package oop02_inhelbtance;

public class OrangeImp implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s + " 오렌지입니다.");
	}
	public int getCount(){
		return 100;
	}

}
