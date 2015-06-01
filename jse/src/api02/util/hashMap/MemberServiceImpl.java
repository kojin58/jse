package api02.util.hashMap;

import java.util.HashMap;
import java.util.Map;

/*
 객체지향의 4대 특징인 은닉화, 상속,추상화,다양성 중
 추상화 + 다양성 을 구현하는 implements 키워드 코딩후
 인터페이스를 입력하시고 나면, 클래스명에 빨간줄(에러)표시가
 뜨는 데, 마우스를 대시고, add unimplement 를 클릭하세요
 그럼 자동 오버라이딩이 됩니다.
  */


public class MemberServiceImpl implements MemberService{
	
	Map<String,Object> map = new HashMap<String,Object>();
	MemberVO vo = new MemberVO();

	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		/*
		 1. vo 객체를 생성해서
		  - DB에 값이 저장되는 형상을 표현한 것이다
		  */
		
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);
		/*
		 2. 인스턴스 변수값을 통합하여 운반하고 검색할
		 컬렉션을 준비한다.
		  * */
		
		/*
		 vo.getId()가 가능한 이유는 위 메소드일 vo.setID() 에서 
		 저장한 인스턴스 변수 String id 를 같이 공유하며
		 바라보고 있기 때문이다.
		 * vo.getID() 를 "id" 라는 리터럴
		 * */
		map.put("id", vo.getID());
		map.put("password", vo.getPassword());
		/*
		 *1.첫번째 에러 유형
		 *map.put(vo.getId(), vo.getPassword());
		 *이건 개발자가 많이  하는 착각의 코딩
		 *
		 * */
		map.put("name", vo.getName());
		/*
		 *2. 두번째 에러 유형
		 *map.put("age",vo.getAge());
		 *valuOf() 는  apl.lang.string.ValuOfDemo 참조
		 * */
		map.put("age", vo.getAge());
		map.put("addr", vo.getAddr());
	}
	
	public void login(String id , String password) {
		System.out.println("앱에 담긴 ID :" + map.get("id"));
		if(!map.containsKey("id")){
			System.out.println("입력하신 ID는 존재하지 않습니다."
					+ " 다시 입력하세요");
			
		}else{
			/*
			 *3. 세번째 에러유형 NullPointerException 
			 *mag.get(KEY) 에서 KEY는 맵을 선언한
			 *타입과 이치해야 하는데.. 현재 필드에 선언된 맵은
			 *<String.Object> 이므로
			 *password 는 String 값이 되어야 합니다
			 *그래서 "password: 로해야합니다.
			 * */
			if(!(map.get("password").equals(password))){
				System.out.println("비번이 다릅니다."
						+ "다시 입력하세요");
			}else{
				System.out.println("환영합니다..."
						+ vo.getAddr()+"에 사시는"
						+ vo.getAge() + "세 되시는"
						+ vo.getName() + "님 환영합니다.");
			}
		}
	}
}	
		
	

