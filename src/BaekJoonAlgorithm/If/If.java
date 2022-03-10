package BaekJoonAlgorithm.If;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class If {

	//1330 두 수 비교하기
	public void method1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b){
			 System.out.println("<");
		}else {
			System.out.println("==");
		}
				
	}
	
	//9498 시험성적
	public void method2() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B"); 
		}else if(score >= 70) {
			System.out.println("C"); 
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
	
	//25753 윤년
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		GregorianCalendar gc = new GregorianCalendar();
		if(gc.isLeapYear(year) == true) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
	
	//14681 사분면 고르기
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		}else if(x < 0 && y > 0) {
			System.out.println("2");
		}else if(x < 0 && y < 0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
	}
	
	//2884번 알람시계
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			h--; //45보다 작으니까 시간도 1 줄어든다.
			m =  60 - (45 - m); //45에서 지금 분을 뺀 시간을 60분에서 다시 빼준다.
			
			if(h < 0) { //h-- 한 값이 0보다 작으면 24시에서 23시가 된 것이기 때문에 h를 23으로 초기화
				h = 23;
			}			
			System.out.println(h + " " + m);
		}else {
			m = m - 45;
			System.out.println(h + " " + m);
		}
	}
	
	//2525번 오븐시계
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		
		if(c+m >= 60 && c+m < 120) {
			
		}
		
	}

}
