package cmm03.flow;

import java.util.Scanner;

public class No7_ManOrWoman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요. 예123456-4567890");
		String ssn = scanner.nextLine();	
		
		char ch = ssn.charAt(7);
		if(ch == '1' || ch == '3'){
			System.out.println("남자입니다");
		}else if(ch == '2'){ 
			
			System.out.println("여자입니다");	
			
		}else if(ch == '3'){
			System.out.println("남자입니다");
		}
		}
	
}

