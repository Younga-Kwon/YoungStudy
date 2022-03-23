package BaekJoonAlgorithm.While;

import java.util.Scanner;

public class While {
	
	//10952번 A+B-5
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			
			System.out.println(a+b);
		}
	
	}
	
	//10951번 A+B-4 -> EOF(End Of File) 사용 : 더이상 읽을 데이터가 없다.
	//다시 풀어보기
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) { 
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
		sc.close();
	}
	
}
