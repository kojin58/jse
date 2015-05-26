package ocp01.incapsule;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력해 주세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력해 주세요");
		double weight = scanner.nextDouble();
		KaupVO vo = new KaupVO(height, weight);
		//vo.setIdx();
		//vo.setHeight(height);
		//vo.setWeight(weight);
		int idx= (int)(weight / (height * height));
		System.out.println(idx);
		//vo.setIdx(idx);
		vo.getMsg();
		
		System.out.println(vo.toString());
		System.out.println("완료");
		
	}

}
