package Operator.com.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in); //전역변수로 선언
	
	public void practice1() {
		//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		//삼항연산자 사용
		System.out.println(num > 0 ? "양수다" : "양수가 아니다");
		
		//if문 사용
		/*if(num > 0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}*/
	}
	
	public void practice2() {
		//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
		//양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		//중첩 삼항연산자 사용
		System.out.println(num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다"));
		
		//if문 사용
		/*if(num > 0) {
			System.out.println("양수다");
		}else if(num == 0) {
			System.out.println("0이다");
		}else {
			System.out.println("음수다");
		}*/
		
	}
	
	public void practice3() {
		//키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		//num % 2 == 0 -> 짝수
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		//삼항연산자 사용
		System.out.println(num % 2 == 0 ? "짝수다" : "홀수다");
		
		//if문 사용
		/*if(num % 2 == 0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}*/
	}
	
	public void practice4() {
		//모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		//인원 수와 사탕 개수를 키보드로 입력 받고
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		System.out.println("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();
		
		//1인당 사탕 개수
		int pCandy = candy / person;
		//남는 사탕 개수 -> 나누고 난 나머지
		int remain = candy % person;
		
		System.out.println("1인당 사탕 개수 : " + pCandy);
		System.out.println("남는 사탕 개수 : " + remain);
	}
	
	public void practice5() {
		//키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		//이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.println("반(숫자만) : ");
		int group = sc.nextInt();
		
		 System.out.println("번호(숫자만) : ");
		 int num = sc.nextInt();
		 sc.nextLine(); //버퍼 빼기
		
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double record = sc.nextDouble();
		
		//삼항연산자 사용
		String gen = gender == 'M' ? "남학생" : "여학생";
		
		//if문 사용
		/*String gen ="";
		if(gender == 'M') {
			gen = "남학생";
		}else {
			gen ="여학생";
		}*/
		
		System.out.println(grade + "학년 " + group + "반 " + num + "번 " + name + " " + gen + "의 성적은 " +  record + "이다.");
	}
	
	public void practice6() {
		//나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		//삼항연산자 사용
		String result = age <= 13 ? "어린이" : (age <= 19 ? "청소년" : "성인");
		
		//if문 사용
		/*String result = "";
		if(age <= 13) {
			a = "어린이";
		}else if(age <= 19) {
			a = "청소년";
		}else {
			a = "성인";
		}*/
		
		System.out.println(result);
	}
	
	public void practice7() {
		//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
		//세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요
		
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math; //합계
		double avg = sum / 3.0; //평균 -> 자동 형 변환 가능
		
		//삼항연산자 사용
		String result = ((kor >= 40 && eng >= 40 && math >= 40) && (avg >= 60)) ? "합격" : "불합격";
		
		//if문 사용
		/*String result = "";
		if((kor >= 40 && eng >= 40 && math >= 40) && (avg >= 60)) {
			result = "합격";
		}else {
			result = "불합격";
		}*/
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);		
	}
	
	public void practice8() {
		//주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		
		System.out.println("주민번호를 입력하세요 : ");
		String reNum = sc.nextLine();
		
		char gender = reNum.charAt(7); //입력받은 주민번호의 7번째 추출
		
		//삼항연산자
		String result = (gender == '2' || gender == '4') ? "여자" : ((gender == '1' || gender == '3') ? "남자" : "잘못 입력하셨습니다."); 
		
		//if문
		/*String result = "";
		if(gender == '2' || gender == '4') {
			result = "여자";
		}else if(gender == '1' || gender == '3') {
			result = "남자";
		}else {
			result = "잘못 입력하셨습니다.";
		}*/
		
		System.out.println(result);
	}
	
	public void practice9() {
		//키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		//그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고 아니면 false를 출력하세요.
		//(단, 입력할 때 num1은 num2보다 작아야 함)
		
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력 : ");
		int number = sc.nextInt();
		
		//삼항연산자 사용
		boolean result = (number <= num1 || number > num2) ? true : false;
		
		//if문 사용
		/*boolean result;
		if(number <= num1 || number > num2) {
			result = true;
		}else {
			result = false;
		}*/
		
		System.out.println(result);
	}
	
	public void practice10() {
		//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
		
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.println("입력3 : ");
		int num3 = sc.nextInt();
		
		//삼항연산자
		boolean result = (num1 == num2 && num1 == num3 && num2 == num3) ? true : false;
		
		//if문
		/*boolean result;
		if(num1 == num2 && num1 == num3 && num2 == num3) {
			result = true;
		}else {
			result = false;
		}*/
		
		System.out.println(result);
	}
	
	public void practice11() {
		//A, B, C 사원의 연봉을 입력 받고 각 사원의 인센티브를 포함한 연봉을 계산하여 출력하고
		//인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		//(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		
		System.out.println("A사원의 연봉 : ");
		int aSalary = sc.nextInt();
		//doublc aSalary = sc.nextInt() * 1.4; -> 한꺼번에 계산해서 쓰면 코드가 간결하고 깔끔하다.
		System.out.println("B사원의 연봉 : ");
		int bSalary = sc.nextInt();
		
		System.out.println("C사원의 연봉 : ");
		int cSalary = sc.nextInt();
		
		//double aInsen = aSalary + (aSalary * 0.4); //자동 형변환
		//double cInsen = cSalary + (cSalary * 0.15); //자동 형변환
		double aInsen = aSalary * 1.4;
		double cInsen = cSalary * 1.15;
		
		//Stirng str1 = "3000 이상";
		//String str2 = "3000 미만";
		//--> 이 변수를 삼항 연산자에 대입도 가능
		String aResult = (aInsen >= 3000) ? "3000 이상" : "3000 미만";
		String bResult = (bSalary >= 3000) ? "3000 이상" : "3000 미만";
		String cResult = (cInsen >= 3000) ? "3000 이상" : "3000 미만";		
		
		System.out.println("A사원의 인센티브 포함 연봉 : " + aInsen);
		System.out.println(aResult);
		
		System.out.println("B사원의 인센티브 포함 연봉 : " + bSalary);
		System.out.println(bResult);
		
		System.out.println("C사원의 인센티브 포함 연봉 : " + cInsen);
		System.out.println(cResult);

	}
	//study 예제
	public void practice12() {
		
		int k = 10;
		int a = 3;
		
		switch(k++) {
		case 10 : a += 2;
		case 11 : a *= k; //break 없어서 여기까지 계산
		case 8 : break;
		case 9 : a %=2;
		}
		System.out.println(a);
		System.out.println(k);
	}
	
	public void practice13() {
		//아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다. 
				
		int num = 333;
		System.out.println(num / 10 * 10 + 1);
	}
	
	public void practice14() {
		//10의 배수에서 나머지를 뻬기
		
		int num = 24;
		System.out.println(10 - num % 10);
		
	}
	
	public void practice15() {
		//다음은 문자형 변수 ch가 영문자(대문자 혹은 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드
		char ch = 'z';
		boolean b = (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ? true : false;
		//boolean b = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')
		
		System.out.println(b);
	}
	
	public void practice16() {
		//다음은 소문자를 대문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 크다.
		//예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다. 
		
		char ch = 'A';
				
		char lowerCase = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
		
		System.out.println("upperCase : " + ch);
		System.out.println("lowerCase : " + lowerCase);
	}
	
	public void method1() {
		int a = 1000000;
		int b = 1000000;
		
		//long c = a * b; //이렇게 하면 데이터 오버 플로우로 음수가 나옴
		long c= (long)a * b; //형 변환을 해줘야 함
		
		System.out.println(c);
	}
}
