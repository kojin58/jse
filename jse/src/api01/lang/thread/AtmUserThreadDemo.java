package api01.lang.thread;

public class AtmUserThreadDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		AtmUser hong = new AtmUser(atm, "홍길동");
		AtmUser kim = new AtmUser(atm, "김길동");
		AtmUser moon = new AtmUser(atm, "문길동");
		
		hong.start();
		kim.start();
		moon.start();
	}

}
class AtmUser extends Thread{	
	Atm atm;
	String name;
	
	public AtmUser extends Thread{
	}
}
class Atm{
	public synchronized void inchul(String name){
		System.out.println(name + "님꼐서 인출 요청함");
		for(int i=0;i< 1000000;i++){
			if(i==10000){
				System.out.println(name + "인출중..");
			}
		}
		System.out.println(name + " 님 인출해서 나감");
	}
}