package Object2.mvc.controller;

import Object2.mvc.model.vo.Member;

public class MemberController {
	
	private Member mem = new Member("admin", "1234", "홍길동", "901022-1362334", 163.0);
	
	public MemberController() {
		// TODO Auto-generated constructor stub
	}
	
	public int login(String id, String pwd) {
		// 전달받은 id, pwd값과 mem의 memberId와 memberPwd 비교했을 때
		// 모두 같으면 1을 리턴 아니면 0을 리턴
		if(mem.getMemeberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
			return 1;
		}
		return 0;
	}

	public Member readInfo() {
		// mem의 주소 값을 리턴
		return mem;		
	}

	public int readAge() { //풀어보고 틀려서 가이드 참고해서 수정
		// mem의 주민번호의 앞 2자리를 추출해서 출생년도를 알아낼 것
		//HINT : String클래스의 substring() 메소드, Integer클래스의 parseInt() 메소드 참고
		// 나이 = 올해년도 – 출생년도 + 1 ( 어떤 조건이 필요한지 생각해보시오 )
		// 구한 나이 값 리턴
		String cNo = mem.getCitizenNo().substring(0, 2); //주민번호 앞 2자리 추출
		int year = Integer.parseInt(cNo); //string형을 int형으로 변환
		
		int age = 0; //나이를 넣을 변수
		
		if(year > 22) { //지금이 2022년이기 때문에 22보다 크면 1900년대
			age = 2022 - (1900 + year) + 1;
		}else {
			age = 2022 - (2000 + year) + 1;
		}
		
		return age;
	}

	public void updateHeight(double height) {
		// 전달 받은 height값으로 mem의 height값 수정
		mem.setHeight(height);	
	}
}
