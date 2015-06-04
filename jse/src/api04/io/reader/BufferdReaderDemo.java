package api04.io.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferdReaderDemo {
	public static void main(String[] args) {
		//InputStreamReader isr = new InputStreamReader(System.in);
		// system.in은 system이 하드웨어 장치를 의미하고
		// .in은 하드웨어 장치에 속한 키보드를 의미한다.
		//BufferedReader in = new BufferedReader(isr);
		// 방금 코딩한 내용은 파라미터로 마치 isr가 BufferedREader에
		// 속한 것처럼 보이지만, 내부적으로는 isr에 buffer기능을
		// 추가한 것이다.
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문장을 입력하세요");
		String str = "";
		try{
			str = in.readLine();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("입력받은 내용 : " + str);
	}
}