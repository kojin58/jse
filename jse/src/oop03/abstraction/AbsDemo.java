package oop03.abstraction;

public abstract class AbsDemo {
	public static void main(String[] args) {
		
		
	}

}
abstract class AbsSum{
	// 필수적으로 강제성이 있는 메소드
	public abstract String toString();
	public String sum(int i , int k){
		int sum = i+k;
		return ""+sum;  //int 리턴을 String 반환값으로 주는 방법
	}
}
class Sum01 extends AbsSum{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class Sum01 extends AbsSum";
	}
	
}
class Sum02 extends AbsSum{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class Sum02 extends AbsSum";
	
}
}