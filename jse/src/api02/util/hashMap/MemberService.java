package api02.util.hashMap;

public interface MemberService {

	void join(String id, String password, String name, int age, String addr);
	/*
	 회원가입을 담당하는 로직
	 회원가입시 ID, 비번,이름,나이,주소를 받음
	  */

	void login(String id, String password);
	
}