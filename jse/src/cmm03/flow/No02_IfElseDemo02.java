package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo02 {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0, sum = 0, avg = 0;
		
		String msg = "Message";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3;
		
		if(avg==100){
			msg = "보너스지급";
		}
		else if(avg > 70){
			msg = "시험 합격입니다.";
		}
		else{
			msg = "재시험을 보세요";
		}
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("평균 : " + (int)avg);
		System.out.println("결과 : " + msg);
		sc.close();
	}
}