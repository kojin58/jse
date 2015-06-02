package api01.lang.thread;
/*
 * Program : 특정 기능을 처리하기 위해 프로그래밍 언어를 통해
 * 함수, 메소드, 프로시져. 루팅 등을 모아놓은 것
 * 프로세스(Process) : Thread 의 집하으로 하나의 exe ,com ,dll 프로그램을 포함
 * 	Process 간 자원 (memory = resource ) 를 공유할수 없다.
 * 따라서 Process 를 많이 발생 시키면 자원이 바닥남
 */

/*
 *Thread 
 - 반복적으로 동기화 하여 실행되는 프로그램 루틴
 메소드 단위의 처리 모듈 , Process 의 구성요소
 Thread 는 많이 발생해도 자원을 공유함으로서 
 Process 에 비해 시스템 부담이 적음
 * */
/*
 *스레드를 구현하는 방법
 1. Thread 클래스를 상속하는 방법
 2. Runnable 인터페이스를 구현하는 방법
 - 객체지향적인 방법은 인터페이스 구현 방법을 취하는게 낫다
 - Runnable 구현방법은 추천
 * */
/*스레드 콜백 메소드
 - start() : JVM 이 스케줄 상 여유가 생겼을 떄 , 스레드 스케줄 상 run() 을 호출
 - run() : 스레드 상태에서 처리하려고 하는 모드 비즈니스 로직이 구현됨
 - sleep(long millsecond) : 지정된 시간동안 스레드를 쉬게 하고,
         그 시간이 지나면 다시 작동한다 . 1000분의 1초
 - wait() : 현재 스레드 무한 대기 , notify(), notifyAll() 메소드로 재실행시킴
 - suspend() : 일시정지 , 재실행은 resume()
 - yield() : 스레드 실행권한을 다른 스레드에 넘김
 - stop() : 스레드 실행을 종료
 **/

/*
 단일 스레드
 - 하나의 자바 프로그램을 실행하는 상태
 - main() 이 대표저익 싱글 스레드
 멀티 스레드
 - 하나의 메소드가 실행하는 상태가 아닌
 - 여러 메소드가 지속적으로 자원 공유 상태에서 실행하는것
 * */

/*
 * 콜백 메소드
 * - 메소드를 일정 실행순서에 따라 미리 등록시켜 놓고
 * - 등록된 순서에 따라 자동적으로 호출하는 메소드
 * */
/*
 고착상태(Dead lock)
 - 두 스레드가 lock 를 건 상태에서
 서로 lock 이 풀리기를 기다리는 상황으로
 작업(task) 이 진행되지 않고 ,영원히 기다리게 되는 상황
 - 프로그래머는 변수와 while 문 , if 문을 사용해서 스레드를 제어해야 한다
*/
public class ThreadSyntax {
	

}
