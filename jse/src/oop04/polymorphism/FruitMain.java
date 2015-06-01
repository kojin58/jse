package oop04.polymorphism;


public class FruitMain {
	public static void main(String[] args) {
		//인터페이스는 객체를 만들수 없다.
		FruitInterface apple = new AppleImp();
		FruitInterface orange; //FruitInterface 타입의 참조변수를 선언
		orange = new OrangeImp();
		//클래스 OrangeImp 의 객체를 생성하여 orange 에 할당하였다.
		FruitInterface banana = new BananaImp();
		apple.display("맛있는 ");
		orange.display("오래된 ");
		banana.display("비싼 ");
		// orange.getCount();
		// 인터페이스에 선언된 메소드만 호출이 가능하다.
		
		
		
		
	}	

}
