package nwk02.swing;

import java.util.Arrays;
/*
 * VO : Value Object 라는 개념으로
 * 데이터를 처리하는 클래스에 접미사로 현장에서 통용된다
 * */

public class LottoVO {
	int[] lotto = new int[6];
	// getter setter 단축키 ALT + SHIFT + S 
	public void setLotto() {
		for(int i=0;i<lotto.length;i++){
			lotto[i] = 0;
		}
		for(int i=0;i<lotto.length;i++){
			int randomNum = (int) (Math.random()*45+1);
			// 45는 리미트 ~까지 라는 의미, 1은 begin ~부터
			// 결국 위 로직은 1부터 45까지 랜덤으로 숫자를 발생시
			boolean exist = false;
			
			// 등록된 번호 확인
			for(int j= 0;j<lotto.length;j++){
				if(randomNum == lotto[j]){
					exist = true;
					break; // 등록된 번호이면 확인 종료
				}
			}
			if(exist){
				
				i--;
				continue;
			}else{
				//등록된 번호가 아니면
				lotto[i] = randomNum;
			}
		}
		Arrays.sort(lotto);
	}
	
	public int[] getLotto() {
		return lotto;
	}
	
	/*
	오버라이딩 과 오버로딩
	오버라이딩 : 재정의.. 똑같은 이름의 메소드가 존재하는 것이 아니라 Override
	 							태그가 있고 부모ㄱ클래스에 동일한 이름과 메소드가 있는것.
	오버로딩 : 중복정의 .. 똑같은 이름의 메소드가 파라미터의 갯수나 타입만 다르다면
	 					같은 클래스에 여러개를 줄 수 있는것*/

}
