package ocp01_syntax;
/*
Date : 0521
Author : 고진광
Desc : 접근제한자 문법 
 * */

/*
 멤버변수 접근 제한자
 - 필드나 메소드에 접근 권한을 지정할 수 있다.
 - 효율적ㅇㄴ 접근 권한은 컴포넌트의 독립성을 항상 시킨다.
  */
/*
 접근제한자  	같은클래스 	같은패키지		상속관계다른패키지		무관한패키지
 public			가능				가능				가능							가능
 friendly			가능				가능				가능							불가능
 protected		가능				가능				불가능						불가능
 private			가능				불가능			불가능						불가능
  */

/*
 private
 		- 보안성이 향상됨, 콤퍼넌트의 독립성이 보장됨
 		- 콤퍼넌트간 간섭을 최소화하여 독립성을 유지할 수있음
 		- 데이터 은닉
*/
public class No07_AccessModfierSyntax {

}
