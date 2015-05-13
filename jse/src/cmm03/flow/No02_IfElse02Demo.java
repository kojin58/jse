package cmm03.flow;

import java.util.Scanner;

import javax.print.CancelablePrintJob;

public class No02_IfElse02Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor =0,eng =0,math=0,sum=0;
		sum = kor + eng + math;
			double avg = 0.0;
		String msg = "message";
		
		if(avg==100){
			msg = "보너스 지급";
		}else if(avg > 70){
			msg = "시험 합격입니다.";
		}else{
			msg = "재시험을 보세요";
		
		System.out.println("국어 점수를 입력하세요");
		kor = scanner.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		eng = scanner.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		math = scanner.nextInt();

		System.out.println("국어 = " + kor );
		System.out.println("영어 = " + eng );
		System.out.println("수학 = " + math );
		System.out.println("평균 = " + avg );
		System.out.println("귀하의 시험 결과  " + msg + "입니다");
		
	}
	
}
