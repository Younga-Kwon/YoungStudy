package Loop.com.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);

	public void method1() {
		//정수a, b를 포함하여 그 사이의 모든 정수의 합을 구해보시오.
		System.out.println("정수1 : ");
		int a = sc.nextInt();
		
		System.out.println("정수2 : ");
		int b = sc.nextInt();
		
		int result = 0;
		for(int i = a; i <= b; i++) {
			result += i;
		}
		System.out.println(result);
	}
	
	public void method2() {
		//가우스의 덧셈 공식을 이용하면 1부터 10까지의 합은 (1+10) * 5 와 같은 방법으로 구할 수 있다. 
		//그럼 1부터 n까지의 정수 합을 구하는 프로그램을 작성하고, **n이 홀수일 때와 짝수일 때를 고려하여 작성해보시오.**
		
		System.out.println("정수 n : ");
		int n = sc.nextInt();
				
		//System.out.println(1 + n) * (n / 2); -> 가우스의 덧셈 공식
		
		int result1 = (1 + n) * (n / 2);
		//double result2 = (1 + n) * ((double)n / 2); -> 내가 품
		double result2 = n + ((n - 1) * n / 2);
		//int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		
		if(n % 2 == 0) { //짝수
			System.out.println(result1);
		}else if(n % 2 == 1) { //홀수
			System.out.println(result2);
		}
	}
	
	public void practice1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
		//(for문 이용)
		
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			} 
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice2() {
		//practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		//“잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요		
				
		while(true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice3() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//(for문 이용)
		
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i >= 1; i--) { //true면 수행하고, false면 빠져나옴!!
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice4() {
		//practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		//“잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		while(true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}
			
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice5() { //가이드 봄 -> if~부분
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		//(for문 이용)
		
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int result = 0; //결과값을 넣을 변수
		
		for(int i = 1; i <= num; i++) {
			result += i;
			
			//i가 num이랑 같아지면 마지막 반복이기 때문에 더이상 +를 붙이지 않고 =을 붙여야 한다.
			if(i == num) {
				System.out.print(i + " = ");
			}else { //i가 num이랑 같지 않으면 숫자 뒤에 계속 +를 붙여야 한다.
				System.out.print(i + " + ");
			}
		}		
		System.out.println(result);
	}
	
	public void practice6() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.
		//(for문 이용)
		
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1 < num2) { //num2가 num1보다 클때
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}	
			}else if(num1 > num2){ //num1이 num2보다 클때
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("1이상의 숫자만을 입력해주세요");
		}
		//min, max 이용
		/*if(num1 >= 1 && num2 >= 1) {
			
			int min = Math.min(num1, num2); //받은 정수 값 중 작은 수 담아주기
			int max = Math.max(num1, num2); //받은 정수 값 중 큰 수 담아주기
			
			for(int i = min; i <= max; i++) {
				System.out.println(i + " ");
			}
		}*/
	}
	
	public void practice7() {
		//위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		while(true) {
			
			System.out.println("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.println("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >= 1) {
				if(num1 < num2) {//num2가 num1보다 클때
					for(int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					} 
				} else if(num1 > num2) {
					for(int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					} 
				}
				break;
			}			
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}
	
	public void practice8() {
		//사용자로부터 입력 받은 숫자의 단을 출력하세요.
		//(for문 이용)
		
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("====== " + num + "단 =====");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
	
	public void practice9() { 
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요.
				
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) {		
			for(int i = num; i <= 9; i++) { //num 부터 9단까지 -> 단 결정
				System.out.println("====== " + i + "단 =====");
				for(int j = 1; j <= 9; j++) { //곱해지는 수 결정하는 for문
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}				
		}else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		//Practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
		//“2~9 사이의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		while(true) {
			System.out.println("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) {
				for(int i = num; i <= 9; i++) {
					System.out.println("====== " + i + "단 =====");
					for(int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i * j);
					}
				}
				break;
			}else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void practice11() { //가이드 봄... -> 너무 복잡하게 생각함
		//사용자로부터 시작 숫자와 공차를 입력 받아
		//일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요. -> 공차를 더하거나 빼준다
		//단, 출력되는 숫자는 총 10개입니다
		
		//* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
		//ex) 2, 7, 12, 17, 22 …
		//5 5 5 5 => 여기서 공차는 5
		
		System.out.println("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.println("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i = 1 ; i <= 10 ; i++) { //10개 나오도록 돌리고
			System.out.print(num1 + " "); //num1의 값을 출력함
			num1 += num2; //num1에 공차 num2를 계속 누적해줌
		}
	}
	
	public void practice12() { //가이드 봄, 언제 조건문을 넣어야하는지 헷갈림...
		/*정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.*/
		
		while(true) {
			System.out.println("연산자(+, -, *, /, %) : ");
			String operator = sc.nextLine(); //exit라는 문자열이 들어올 수 도 있으니 String
			
			//먼저 operator에 exit를 입력했는지 비교 -> 입력했다면 빠져나감, 정수를 받기 전에 빠져나가야 함.
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}			
			
			System.out.println("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.println("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine(); //엔터빼주기 -> 반복문 다시 시작하면 엔터가 인식됨
			
			//연산하기 전에 사용자가 입력한 연산자가 /이면서 두 번째 정수가 0인지 확인
			if(operator.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue; //아래의 실행문 무시하고 다시 입력해야함
			}
			
			int result = 0;
			
			switch(operator) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
			/*case "exit" :
				System.out.println("프로그램을 종료합니다.");
				break; -> 잘못됨*/
			default :
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue; //아래의 실행코드 실행하지 않고 다시 연산자를 입력받는다.
			}		
			System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		}		
	}
	
	//반복문 ver.hard	
	public void practice15() { //가이드 봄.. -> 다시 풀기
		//사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		//(for문 이용)
		//* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		//ex) 2, 3, 5, 7, 11 …
		
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		boolean pn = true; //입력 받은 숫자가 소수인지 아닌지 판별하는 논리 변수
		
		if(num >= 2) {
			for(int i = 2; i < num; i++) { //1과 자기 자신(num)을 빼고 반복문을 돌린다 -> num이 i로 나눠지면 소수 아님
				if(num % i == 0) { //1과 자기 자신을 뺐기 때문에 그 외의 숫자로 나눴을 때 나머지가 0이면 소수가 아니다.
					pn = false;
					break; //이미 false이기 때문에 더이상 반복문을 돌릴 필요가 없다.								
				}				
			}
			if(pn) { //for문 안에서 num이 i로 나눠지면 false이고, 아니면 원래 그대로 true이기 때문에 if가 pn(true)이면 소수이다.
				System.out.println("소수 입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice16() {
		//위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		//“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		//* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		//ex) 2, 3, 5, 7, 11 …
		
		boolean pn = true;
		
		while(true) {
			System.out.println("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2) {
				for(int i = 2; i < num; i++) {
					if(num % i == 0) {
						pn = false;
						break;
					}
				}
				if(pn) {
					System.out.println("소수입니다.");
					break; //속해있는 가장 가까운 반복문 빠져나감 -> while(true)
				}else {
					System.out.println("소수가 아닙니다.");
					break;
				}
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}
	
	public void practice17() { //가이드 참고함 -> 다시 풀기
		//2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		
		boolean pn = true; //입력 받은 숫자가 소수인지 아닌지 판별하는 논리 변수
		int count = 0; //소수의 개수를 담을 변수
		
		if(num >= 2) {
			for(int i = 2; i <= num; i++) {
				for(int j = 2; j < i; j++) {
					if(i % j == 0) { //소수가 아닐 경우
						pn = false;
						break; //안쪽 for문을 빠져나감
					}
				}
				if(pn) { //소수일 경우
					count++;
					System.out.print(i + " ");
				}
				pn = true; //false인 경우(소수가 아닐 경우)는 이미 break로 반복문을 빠져나갔기 때문에 그 다음 수를 판별하기 위해 pn을 true로 다시 초기화 한다.
			}
			System.out.println();
			System.out.println("2부터 " + num + "까지 소수의 개수는 " + count + "개 입니다.");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice18() {
		//1부터 사용자에게 입력 받은 수까지 중에서
		//1) 2와 3의 배수를 모두 출력하고
		//2) 2와 3의 공배수의 개수를 출력하세요.
		//(for문 이용)
		//* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때 모두 나머지가 0이 나오는 수
		
		System.out.println("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0; //count를 구할 변수
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 || i % 3 == 0) { //i를 2로 나눴을 때 나머지가 0인 수, 3으로 나눴을 때 나머지가 0인 수를 받은 숫자인 num까지 돌린다.
				System.out.print(i + " ");	
				if(num % i == 0) {
					count++; //위의 2와 3의 배수 중에 num을 나누었을 때 나머지가 0이 되는 수 -> 배수이면 1씩 증가한다.
				}
			}						
		}
		System.out.println();
		System.out.println("count : " + count);
	}
	
	public void practice19() {
		//다음과 같은 실행 예제를 구현하세요.
		//(for문 이용)
		/*
		  * 공백3+별1
		 ** 공백2+별2
		***
	   ****
		 */		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = num; j > 0; j--) {
				if(i < j) { //i보다 j가 클때는 공백이 나와야 한다.
					System.out.print(" ");
				}else { //(i <= j)
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice20() {
		//다음과 같은 실행 예제를 구현하세요.
		//(for문 이용)
		/*
		 
		 *
		 **
		 *** 
		 **
		 *
		 -> 위 아래 잘라서 붙이기 
		 *
		 **
		 ***
		-------
		 **
		 *
		 
		 */
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= (num - 1); i++) {
			for(int j = (num - 1); j >= i; j--) {
				System.out.print("*");
				}
			System.out.println();
			}
		}
		
	public void practice21() { //가이드, 구글링함... -> 그래도 잘 모르겠음...ㅠ -> 다시 풀기!
		//다음과 같은 실행 예제를 구현하세요.
		//(for문 이용)
		/*
		 
		 	* 
		   ***    
		  *****  
		 *******
		
		 */
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int num2 = 1; //"*"을 출력할 때 사용할 변수
		
		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(" "); // 피라미드 왼쪽 옆의 공백을 뽑는 for문
			}
			for(int k = 0; k < num2; k++) {
				System.out.print("*"); // 피라미드 모양 별을 뽑는 for문
			}
			num2 += 2;
			System.out.println();
		}
	}
	
	public void practice22() {
		//다음과 같은 실행 예제를 구현하세요.
		//(for문 이용)
		/*
		 
		 *****
		 *   *
		 *   *
		 *   *
		 *****
		 -> 맨 윗줄, 가운데, 맨 아랫줄 나눠서 for문 짜기
		 *****
		   +
		 *   *
		 *   *
		 *   *
		   +
		 *****
		 
		 */
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 1; i++) { //맨 위
			for(int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= (num - 2); i++) { //가운데
			for(int j = 1; j <= num; j++) {
				if(j == 1 || j == num) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 1; i <= 1; i++) { //맨 아래
			for(int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
