package api01.lang.thread;

public class RunableDemo {
	public static void main(String[] args) {
		//인터페이스타입 참조변수 = new 인터페이스를 구현한 클래스명();
		Runnable r = new RunableImpl();
		/*
		 * 생성자 Thread(Runable target)
		 * */
		Thread thr = new Thread(r);
		thr.start();
		
	}
}
class RunableImpl implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<5;i++){
			System.out.println(
					Thread.currentThread().getName());
			/*
			 * 상속이 아니기 때문의 super 을 사용 할수없다,
			 * */
			
		}
	}
}