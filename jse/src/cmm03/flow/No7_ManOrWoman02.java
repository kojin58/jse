package cmm03.flow;

import java.util.Scanner;

public class No7_ManOrWoman02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요. 예123456-4567890");
		String ssn = scanner.nextLine();	
		
		char ch = ssn.charAt(7);
		
		switch (ch) {
		case '1' :case '3':System.out.println("남자"); break;
		case '2' :case '4':System.out.println("여자"); break;
		case '5' :case '6':System.out.println("외국인"); break;

		default:System.out.println("잘못 입력하셨습니다");
			break;
		}
}
}
