package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	//Scanner sc = new Scanner(System.in); -> 전역 변수로 선언하면 메소드마다 선언하지 않아도 된다.
	
	public void method1() {
		//이름(String), 성별(char), 나이(int), 키(double)를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();//엔터 빼주기
		
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height +"인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
	}
	
	public void method2() {
		//키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2)); //묶어주기
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + num1 * num2);
		System.out.println("나누기 몫 결과 : " + num1 / num2);
		
		//애초에 변수로 넣는 계산해서 넣는 것도 가능
		/*int sum = num1 + num2;
		int minus = num1 - num2; //삼항 연산자 사용해서 두번째 정수가 더 큰 경우
		int multi = num1 * num2;
		int division = num1 / num2;
		
		System.out.println("더하기 결과 : " + sum); 
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + multi);
		System.out.println("나누기 몫 결과 : " + division);*/
	}
	
	public void method3() {
		//키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		//* 참고 ( 면적=가로*세로 , 둘레=(가로+세로)*2 )
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 : ");
		double width = sc.nextDouble();
		
		System.out.println("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width + height) * 2);
		
		//면적, 둘레 변수에 넣어서 출력 가능
		/*double area = width * height;
		double cir = (width + height) * 2;
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + cir);*/
	}
	
	public void method4() {
		//영어 문자열 값을 키보드로 입력 받아 앞의 문자 세 개를 출력하세요.
		//HINT > charAt(인덱스) 메소드 활용해보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
		//반복문 사용도 가능
		for(int i = 0; i < 3; i++) {
			String s = "";
			if(i == 0) {
				s = "첫 번째 문자 : ";
			}
		}
	}
}
