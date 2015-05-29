package api02.util.Vector;

import java.util.Vector;
/*
 java.util.Vector 의
  메소드인 addElement() 는
  add() 와 거의 유사합니다.
  횬용하셔도 무방합니다만..
  removeElement()같이 사용할 경우
  에는 이 메소드를 같이 써 줍니다
   */

public class AddElementDemo {
	public static void main(String[] args) {
		String[] heros = {"iron", "thor", "hulk", "hawk"};
		Vector<String>avengers = new Vector<String>();
		/*
		 백터에 배열의 요소를 저장 addElement(배열);
		  */
		for(int i =0; i <heros.length;i++){
			avengers.addElement(heros[i]);
		}
		/*
		 * 토르가 존재하는 지 체크 contains() 메소드를 사용
		 */
		String thor = "thor";
		if(avengers.contains(thor)){
			int idx = avengers.indexOf(thor);
			System.out.println("토르는 " + idx+1+"번째에 있습니다. ");
		}else{
			System.out.println("토르는 없습니다.");
		}
		/*첫번째 요소를 삭제 removeElementAt()*/
		avengers.removeElementAt(0);
		
		System.out.println("삭제 후 요소를 인덱스 변화" );
		
		for(int j = 0;j<avengers.size();j++){
			System.out.println("어벤져스의" + (j+1)+
					"번째 멤버는"  );
		}
		
		
	}
	

}
