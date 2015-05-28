package api01.lang.string;
/*
 java.lang.String 에서
 substring(n) 은 n 부터 끝까지 잘라낸다.
 substring(n,n) 은 n 부터 n 까지 잘라낸다.
  */

public class SubstringDemo {
	public static void main(String[] args) {
		String str = "Hello Java";
		System.out.println(str.substring(6));
		System.out.println(str.substring(6,8));
	}

}
