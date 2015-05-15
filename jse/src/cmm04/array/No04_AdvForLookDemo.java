package cmm04.array;

public class No04_AdvForLookDemo {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		System.out.println("향상된 for 문으로 출력한 예제");
		
		for(int i : intArr){
			System.out.println("\t" + i);
		}
	}

}
