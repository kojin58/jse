package api01.lang.thread;

public class BankTyncDemo {
	public static void main(String[] args) {
		//사용자 정의 타입의 배열을 생성하는 방법은 아래와 같다.
		Customer[] customers = new Customer[3];
		Account hong= new Account("홍길동");
		Account kim= new Account("김길동"); 
		Account moon= new Account("문길동");
		customers[0] = new Customer(account, str, i)
}
class Account{
	String name;
	int total;
	/*
	 * 코딩습관 : 생성자를 생성시킬 때는
	 * 무조건 필드를 선언 후 바로 CTRL + Space Enter
	 * */
	/*
	 * 생성자 오버로딩을 하려고 할때는 
	 * 자동 생성 시킨 생성자에다 this("") 이런식으로
	 * String 이면 "" , int 면 0, 객체면 null 을 주면된다.
	 * */
	public Account() {	}
	public Account(String name) {
		this.name = name;
	}
	/*
	 * 파라미터값 int  monet : 입출금
	 * 파라미터값 String location : 지점
	 * */
	
	public void deposit(int money, String location){
		total += money;
		try{
			Thread.sleep(1000);
				}catch(Exception ex){
					ex.printStackTrace();
					System.out.println(
							"[" + location+ "]"  "+money+" "원 입금함"
									+ "총액 : " "+totoal+" "원");
				}
	}	
}
class Customer extends Thread{
	Account account;
	int money;
	public Customer(Account account, String str, int i) {
		super(str);   //super 를 사용하려면 가장 먼저 호출해야 함
		// this.account = object; 해도 에러는 나지 않지만 가도성..
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		// this.getName() 은 스레드가 이미 구현한 메소드를
		// 가져다 쓰겠다는 뜻.
		account.deposit(money, this.getName());
	}
}
	