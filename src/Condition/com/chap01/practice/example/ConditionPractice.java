package Condition.com.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		//종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("9.종료");	
		System.out.println("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		//if문 사용
		if(num == 1) {
			System.out.println("입력 메뉴 입니다.");
		}else if(num == 2) {
			System.out.println("수정 메뉴 입니다.");
		}else if(num == 3) {
			System.out.println("조회 메뉴 입니다.");
		}else if(num == 4) {
			System.out.println("삭제 메뉴 입니다.");
		}else {
			System.out.println("프로그램이 종료됩니다.");
		}
		
		//switch문 사용
		switch(num) {
		case 1 : 
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2 : 
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3 : 
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4 : 
			System.out.println("삭제 메뉴 입니다.");
			break;
		case 9 :
			System.out.println("프로그램이 종료됩니다.");
			break;
		default :
			System.out.println("잘못 입력하였습니다.");
			break;
		}
	}
	
	public void practice2() {
		//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고 짝수가 아니면 “홀수다“를 출력하세요.
		//양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		//if~else if~else문 사용
		System.out.println("숫자 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if((num > 0) && (num % 2 == 0)) {
			System.out.println("짝수다");
		}else if((num > 0) && (num % 2 == 1)){
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		
		//중첩 if문 사용 -> 공통적인 조건문 바깥에
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		//합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		//합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		//불합격인 경우에는 “불합격입니다.”를 출력하세요.

		System.out.println("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		int avg = sum / 3;
		
		//if~else문 사용
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");		
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		//수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		
		System.out.println("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = "";
		
		switch(month) { //switch는 break를 걸지 않으면 아래 구문이 이어서 실행된다 -> 여러 조건이 하나의 값을 출력할 때 사용
		case 12 :
		case 1:
		case 2:
			season = "겨울";
			break;
		case 3 :
		case 4 :
		case 5 :
			season = "봄";
			break;
		case 6 :
		case 7 :
		case 8 :
			season = "여름";
			break;
		case 9 : 
		case 10 :
		case 11 :
			season = "가을";
			break;	
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			return; //return으로 아래 코드는 실행하지 않고 이 메소드를 호출한 곳으로 빠져나감
		}
		
		System.out.println(month + "월은 " + season +"입니다.");
	}
	
	public void practice5() {
		//아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		//로그인 성공 시 “로그인 성공”, 
		//아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		//비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		String id = "user1";
		int pwd = 1234;
					
		System.out.println("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		int userPwd = sc.nextInt();
		
		if(id.equals(userId) && pwd == userPwd) {
			System.out.println("로그인 성공");
		}else if(pwd != userPwd) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(!id.equals(userId)){
			System.out.println("아이디가 틀렸습니다.");
		}		
	}
	
	public void practice6() {
		//사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		//단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//비회원은 게시글 조회만 가능합니다.
		//(단, 잘못 입력하였을 경우 “잘못 입력했습니다.” 라는 출력문이 출력되도록)
		
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String user = sc.nextLine();
		
		//if~else문
		if(user.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리 \n" + "게시글 작성, 댓글 작성 \n" + "게시글 조회");
		}else if(user.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(user.equals("비회원")) {
			System.out.println("게시글 조회");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		//switch문
		switch(user) { //switch(sc.nextline()) -> 바로 입력도 가능
		case "관리자" :
			System.out.println("회원관리, 게시글 관리 \n" + "게시글 작성, 댓글 작성 \n" + "게시글 조회");
			break;
		case "회원" :
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		default : 
			System.out.println("잘못 입력했습니다.");
			break;
		}
	}
	
	public void practice7() {
		//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		//저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
		//BMI = 몸무게 / (키(m) * 키(m))
		//BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		//BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		//BMI가 30이상일 경우 고도 비만
		
		System.out.println("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		//if문은 아래 조건을 실행할때 위의 조건이 false라서 내려오는 것이므로, 이미 위의 조건의 반대 조건을 품고있다고 볼 수 있다.
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		//키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		//(단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
		//“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		//(printf()문을 이용하여 마지막 출력문을 작성해보시오.)
		
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		char operator = sc.nextLine().charAt(0);
		
		//중첩 if문 사용
		if(num1 > 0 && num2 > 0) { //num1, num2 둘 다 양수인 경우
			if(operator == '+') {
				System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 + num2));
			}else if(operator == '-') {
				System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 - num2));
			}else if(operator == '*') {
				System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 * num2));
			}else if(operator == '/') {
				System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 / num2));
			}else if(operator == '%') {
				System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 % num2));
			}else { //양수가 아닌 값 입력
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}
		
		//switch문 사용
		int result = 0; //계산 결과 값을 담는 변수
		
		if(num1 > 0 && num2 > 0) {
			
			switch(operator) {
			case '+' :
				result = num1 + num2;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case '*' :
				result = num1 * num2;
				break;
			case '/' :
				result = num1 / num2;
				break;
			case '%' :
				result = num1 % num2;
				break;
			default :
				System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}		
		}else {
			System.out.println("양수가 아닙니다. 프로그램을 종료합니다.");
			return;
		}
		System.out.printf("%d %s %d = %d", num1, operator, num2, result);	
	}
	
	public void practice9() {
		//중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		//총점 100점 중 배점으로는 다음과 같다.
		//중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)
		//이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력
		//총점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass, 아니면 Fail을 출력하세요
		
		System.out.println("중간 고사 점수 : ");
		double middle = sc.nextInt() * 0.2;
		
		System.out.println("기말 고사 점수 : ");
		double finals = sc.nextInt() * 0.3;
		
		System.out.println("과제 점수 : ");
		double task = sc.nextInt() * 0.3;
		
		System.out.println("출석 회수 : ");
		int att = sc.nextInt();
		
		double sum = middle+ finals + task + att; //총점 : 모두 더함, 100점 만점
		
		System.out.println("===========결과==========");
		
		if(sum >= 70 && att >= 14) { //총점이 70점 이상, 강의의 70%이상 출석 -> 총 20회 중 70%는 14번 이상 출석 했을때(20*0.7)
			System.out.println("중간 고사 점수(20) : " + middle);
			System.out.println("기말 고사 점수(30) : " + finals);
			System.out.println("과제 점수 (30) : " + task);
			System.out.println("출석 점수 (20) : " + (double)att);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
			
		}else if(sum < 70 && att >= 14) {
			System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			
		}else if(sum >= 70 && att < 14) {
			System.out.println("FAIL [출석 횟수 부족] (" + att + "/20)");
			
		}else if(sum < 70 && att < 14) {
			System.out.println("FAIL [출석 횟수 부족] (" + att + "/20)");
			System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
		}
		
		//다른 방법
		/*}else { //총점이 부족할 수도 있고, 출석 횟수가 부족할 수도 있고, 아니면 둘 다 부족할 수도 있을 경우
		
			if(att < 20 * 0.7) { //출석횟수가 부족할 경우 
				System.out.println("FAIL [출석 횟수 부족] (" + att + "/20)");
			}
			
			// 위아래 두개의 조건문 각각 별개  --> 만일 둘 다 부족할 경우 둘 다 실행될것!
			
			if(sum < 70) { //총점이 부족할 경우
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			}
		}*/
	}
	
	public void practice10() {
		//앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요. -> 메소드 호출
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			practice5();
			break;
		case 6 :
			practice6();
			break;
		case 7 :
			practice7();
			break;
		case 8 :
			practice8();
			break;
		case 9 :
			practice9();
			break;
		default :
			System.out.println("잘못 입력하였습니다.");
			break;
		}
		
	}
}
