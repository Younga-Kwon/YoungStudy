package Variable.com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	//Scanner sc = new Scanner(System.in); -> 전역으로 선언
	
	public void method1() {
		//키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 유니코드 값을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0); //문자 하나를 입력 받으니까 charAt 사용
		
		System.out.println("A Unicode : " + (int)ch);	
	}

	public void method2() {
		//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		//이 때 총점과 평균은 정수형으로 처리하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.println("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.println("수학 : ");
		double math = sc.nextDouble();
		
		//바로넣고 형 변환
		
		//int count = 3; -> 과목 수도 변수로
		/*System.out.println("총점 : " + (int)(kor + eng + math));
		System.out.println("평균 : " + (int)((kor + eng + math) / 3));*/
		
		int total = (int)(kor + eng + math);
		int avg = (int)(total / 3); //평균은 총점/3 -> total 변수에 총점을 넣어놓음
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);		
	}
	
	public void method3() {
		//선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); //2
		System.out.println((int)dNum); //2 -> double을 int로 강제 형 변환 하여 소수점 버림
		
		System.out.println(iNum2 * dNum); //10.0 -> double * int = double로 자동 형 변환
		System.out.println((double)iNum1); //10.0 -> iNum1을 double로 강제 형 변환
		
		System.out.println((double)iNum1 / iNum2); //2.5 -> 한 쪽을 double로 강제 형 변환 시켜서 double / int = int로 자동 형 변환
		//System.out.println(iNum1 / (double)iNum2);
		System.out.println(dNum); //2.5
		
		System.out.println((int)fNum); // 3 -> float 타입을 int로 강제 형 변환 하여 소수점 버림
		System.out.println(iNum1 / (int)fNum); // 3 -> float를 int로 강제 형 변환 하여 int / int = int
		//System.out.println((int)(iNum1 / fNum)); //3 -> int / float = float로 자동 형 변환 되는데 이 값을 int로 강제 형 변환
		
		System.out.println(iNum1 / fNum);// 3.3333333 -> int가 float형으로 자동 형 변환
		System.out.println(iNum1 / (double)fNum); // 3.333333333333335 -> float형을 double형으로 강제 형 변환하여 int / double = double 형으로 자동 형 변환
		//System.out.println((double)iNum1 / fNum); 3.333333333333335
		
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65 -> int형으로 강제 형 변환 하면 유니코드 숫자가 나옴
		System.out.println((int)ch + iNum1); // 75 -> int 형으로 강제 형 변환 한 유니코드 숫자와 int 10을 더함
		System.out.println((char)(ch + iNum1)); // 'K' -> char형으로 강제 형 변환 하여 유니코드에 해당하는 문자 출력
	}
	
	public void selfTest() { //포맷 쓰지 않고 소수점 셋째 자리 까지
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 : "); //85.5
		double kor = sc.nextDouble();
		
		System.out.println("영어 : "); //75.5
		double eng = sc.nextDouble();
		
		System.out.println("수학 : "); //90
		double math = sc.nextDouble();
		
		double avg = (double)((kor + eng + math) / 3);
		
		//방법1
		//83.66666... * 100
		//8366.66666...
		//8366.66666 + 0.5
		//8367.66666...
		//83.67
		//float average = ((int)(avg * 100 + 0.5)) / 100f; -> float형으로 바꾸기
		
		//방법2
		float average = (int)(avg * 100 + 0.5);
		double d = average / (double)100;
		
		System.out.println(average);
		System.out.println("평균 : " + d);
		
		//System.out.printf("평균 : " + "%.3f", avg);
	}
	
}
