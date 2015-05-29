package api02.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/*
 java.util.ArrayList 의 메소드인
 add() 는 벡터의 add() 와 동일하다
 */

public class AddDemo {
	public static void main(String[] args) {
		/*
		 * Vector 는 내부적으로 String 사용,속도가 느림. 동기화 지원
		 * ArrayList 는 내부적으로 StringBuffer 사용, 동기화 지원하지 않음
		 * */
		ArrayList<String> lists = new ArrayList<String>();
		
		//항목 추가
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		/* 출력 1 : iterator() 이용*/
		// 이클립스 제안 중에서 java.util.Iterator 선택
		Iterator<String>itl = lists.iterator();
		
		/*
		 Iterator 를 선언하고 나서 whi 를 로딩하면
		 3가지 이클립스 제안이 나오는데 그줄에서
		 ..with iterator 를 선택한다 */
		
		while (itl.hasNext()){
			//String string = (String) itl.next();
			System.out.printf("%s",itl.next());
			// 윗 구문 중 printf 인 것에 주의 !!
			// printf 는 표맷팅한 결과를 콘솔에 촐력하겠다는 의미
			// %s 는 String 값을 의미한다, 다음 구문이
			// itl.next() 의 리턴값을 보여주는 역할을 한다.
			// 여기서 %s 의 s 는 String 을 의미
			// 만약 숫자를 포멧팅한다면 %d 이며 이때 d 는 decimal 이라
			// 하며 10진수를 뜻한다
		}
		System.out.println();
		/*
		 * 출력2 : listIterator() 이용
		 * */
		Iterator<String> it2 =  lists2.iterator();
		String str;
		while (itl2.hasNext()){
			System.out.printf("%s",it2.next());
		}
		
		
	}

}
