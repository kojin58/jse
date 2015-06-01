package oop04.polymorphism;
/*
Date : 0522
Author : 고진광
Desc : 인터페이스 문법
*/

/*
Interface
- 추상 메소드만으로 이루어짐...{} 가 없음
- 클래스 바디가 없고 메소드의 프로토타입만 선언되어 있으면,
		추상 메소드가 됨
- 추상메소드를 사용하는 이유는 앞으로 추가되거나 구현되어야 하는
 기능의 설계 역활을 하며 실제 기능은 구현하지 않고
  메소드의 프로토타입만 구현하는 것을 말함
  - 추상메소드는 건축물에서 구조를 이루는 철근과 같고 설계도와 같은 역활을 함
  - 어떤 컴토너트나 클래스의 이를 메소드를 공개할 목적으로 사용되
  - 하나의 콤포넌트가 다양한 형태로 구현되어야 할 경우 인터페이스를 이용하면
  콤포넌트와 사용법이 상당히 단순해짐
  - 자식 클래스는 이터페이스상에 있는 추상메소드를 전부 구현해야함
  - 인터페이스상에 있는 메소드를 하나라도 구현하지 않으면 인터페이스를 
  상속받은 클래스는 추상 클래스가 됨
  -인터페이스는 객체를 만들 수 없음, 따라서 반드시 그 인터페이스를 구현한
   클래스의 객체를 받아 사용해야함.
  - 인터페이스에 선언된 메소드를 호출하면 그 인터페이스를 구현한 메소드가
  자동으로 호출됨
  - 인터페이스를 이용하면 인터페이스를 구현하는 클래스들은 메소드의 형태가
  같기 때문에 같은 메소드명을 이용하면서 , 다양한 구현을 할 수 있음
  이것은 마치 MySQL 용으로 개발된 프로그램을 Oracle 용으로 변경시에
  */
public class InterfaceSyntax {

}