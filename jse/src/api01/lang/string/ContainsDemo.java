package api01.lang.string;
/*
 jave.lang.String 에 있는 메소드
 contain("a") : 문자열 중에 a 가 있는지 체크
 */
public class ContainsDemo {
	public static void main(String[] args) {
		String str = "abcde";
		System.out.println((str.contains("f")) ? " f가 있음" : "f가 없음");
 	}

}
