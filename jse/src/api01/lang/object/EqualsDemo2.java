package api01.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("820110-1222233");
		Person p2 = new Person("820110-1222233");
		String result = "";
		result = ( p1 == p2) ? "p1 과 p2는 같은사람" : "p1 과 p2는 다른사람" ;
		System.out.println("( p1 == p2)결과값 : " + result);
		/*
		 * ( p1 == p2)결과값 : p1 과 p2는 다른사람
		 * 결과로 보아 ==는 해시코드 주소값을 비교한다
		 * */
		
		result = ( p1.equals(p2)) ? "p1 과 p2는 같은사람" : "p1 과 p2는 다른사람" ;
		System.out.println("( p1.equals(p2))결과값 : " + result);
		
	/*
	 * ( p1.equals(p2))결과값 : p1 과 p2는 같은사람
	 * 결과로 보아 eqals()는 실제 리터럴값을 비교한다
	 * */
	}

}
class Person{
	private String ssn;  // 주민번호
	public Person(String ssn){
		this.ssn = ssn;
		
		
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person){
			return ssn == ((Person)obj).ssn;
		}else{
			return false;
		}
		
	}

	
	// equals  overriding 단축키는
	// ALT + SHIFT + S 
	// generate hashCode() and equals() 선택
	
}