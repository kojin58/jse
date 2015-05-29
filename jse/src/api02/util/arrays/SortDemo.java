package api02.util.arrays;

import java.util.Vector;
/*
 java.util.Arrays 의 메소드인
 sort() 는 오름차순 정렬에 특화되었다
  */

public class SortDemo {
	public static void main(String[] args) {
		
	}

}
class ArraysDemo{
	//Integer 는 int 형의 Wrapper Class 입니다
	// 즉 기본형인 int 를 객체화 시킨 겁니다
	//백터는 기본형을 담을 수 없기 때문에 int 형을
	// 담을 경우가 생기면 이처럼 Wrapper class 를 사용합니다
	Vector<Integer> vec = new Vector<Integer>();
	
	public Vector<Integer> getAscSort(int[] arr){
		return vec;
		/*
		 * 아래 로직은 오름차순 정렬 알고리즘인
		 * 스왑알고리즘입니다
		 * 바깥쪽 for 문의 limit 이 arr.length-1 인 것에
		 * 주의 하세요
		 * */
		
	}
 }
