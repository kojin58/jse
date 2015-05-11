package cmm01.var;

public class EscapeDemo {
    public static void main(String[] args) {
		int kor = 90;
		int eng = 85;
		int sum = 0;
		
		sum = kor + eng;
		
		System.out.print("종합성적\n");
		System.out.println("====================");
		System.out.println("국어\영어\수학");
	    System.out.println(kor+"\t"+ eng+"\t"+sum);
	}
    
}