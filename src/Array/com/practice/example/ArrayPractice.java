package Array.com.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		//길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		//순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.
		
		int[] arr = new int[10];
		
		/*for(int i = 0; i < arr.length; i++) {
			arr[i] += i + 1; //i가 0부터 시작하니까 넣어주는 값에는 +1을 해준다.
			System.out.print(arr[i] + " ");
		}*/
		
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] += num;
			num++;
			System.out.print(arr[i] + " "); 
		}
		
	}
	
	public void practice2() {
		//길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		//인덱스 0에는 10이 들어가고, 인덱스 1에는 9가 들어가고, 인덱스 2에는 8이 들어가고...
		int[] arr = new int[10];
		
		int num = 10; //i인덱스 마다 넣어줄 변수
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] += num;
			num--; //num이 10부터 시작하니까 감소연산자를 통해서 1씩 감소 시킨다
			System.out.print(arr[i] + " ");
		}		
	}
	
	public void practice3() {
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		System.out.println("양의 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num]; //입력받은 정수만큼 배열 크기를 할당
		
		int count = 1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] += count;
			count++;
			System.out.print(arr[i] + " ");
		}		
	}
	
	public void practice4() {
		//길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		//배열 인덱스를 활용해서 귤을 출력하세요.
		
		String arr[] = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
	}
	
	public void practice5() { //가이드 봄.. 다시 풀어보기!
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()]; //문자열의 길이만큼 돌려준다.
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i); //배열에 문자열의 문자 하나하나를 넣어준다.
		}
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : "); //출력문 먼저
		
		int count = 0; //개수를 세 줄 변수
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) { //arr배열의 i가 입력받은 문자 ch와 같다면 인덱스 위치 출력
				System.out.print(i + " ");
				count++; //그리고 개수 세주기
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void practice6() {
		//“월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		
		String str[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		
		if(num >= 0 && num <= 6) {
			for(int i = 0; i < str.length; i++) {
				if(str[i].equals(str[num])) { //str배열의 i번째 인덱스와 str인덱스의 num번째 인덱스의 값이 같을 때 출력
					System.out.println(str[i] + "요일");
				}	
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num2 = sc.nextInt(); 			
			arr[i] = num2; //입력 받은 값을 배열에 넣는다.			
		}
		int sum = 0; //합계를 넣을 변수
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : "+ sum);
	}
	
	public void practice8() { //가이드 참고함.. 다시 풀어보기!
		//3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.
		
		while(true) {		
			System.out.println("정수 : ");
			int num = sc.nextInt();
			
			if(num % 2 == 1 && num >= 3) {
				
				int[] arr = new int[num];
				int n = 1;
				
				for(int i = 0; i < arr.length; i++) {
					
					arr[i] = n;
					
					if(i < arr.length / 2) { // 인덱스가 중간 이전일 때 -> 배열의 길이를 2로 나눈 수가 입력 받은 수보다 작거나 같을 때
						n++;
					}else { //인덱스가 중간 이후일 때
						n--;
					}
				}
				//출력 -> toString 사용
				for(int i = 0; i < arr.length; i++) {
					if(i < arr.length-1) {
						System.out.print(arr[i] + ", ");
					}else {
						System.out.println(arr[i]);
					}
				}
				break;
			}
			else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public void practice9() {
		//사용자가 입력한 값이 배열에 있는지 검색하여
		//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		
		System.out.println("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		String chArr[] = {"양념", "불닭", "뿌링클", "대세", "허니콤보", "파닭"};
		
		boolean menu = false; 
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i].equals(chicken)) {
				menu = true; //배열에 입력한 치킨과 같은게 있다면 true를 넣어준다.
				break;
			}
		}
		if(menu) { //위에서 true로 바꿔서 내려왔다면
			System.out.println(chicken + "은 배달 가능");		
		}else {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int num =  (int) (Math.random() * 10 + 1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}		
	}

	public void practice11() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 배열에 초기화 후
		//배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int num =  (int) (Math.random() * 10 + 1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 1; i < arr.length; i++) { //오름차순 정렬하면 배열의 0인덱스가 최소값이고, 10 인덱스가 최대값이다.
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) { //비교 주체가 비교 대상보다 작으면 교환이 발생한다. -> 앞에서 뒤로 비교하기 때문에
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("최소값 : " + arr[0]);
		System.out.println("최대값 : " + arr[9]);
	}
	
	public void practice12(){
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) { //배열 인덱스 i의 값과 j의 값이 같으면 -> 중복
					i--; //i의 값을 빼고 다시 넣는다.
					break;
				}
			}
		}
		//출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		//주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를
		//char[]에 옮겨 담기 (단, 성별 자리 이후부터는 *로 담기)
		
		System.out.println("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] no = new char[14]; //주민번호 -포함 14자리
		
		for(int i = 0; i < no.length; i++) {
			no[i] += str.charAt(i); //배열에 문자열 하나하나를 각 인덱스에 넣어줌
		}
		
		for(int i = 0; i < no.length; i++) {
			if(i <= 7) {
				System.out.print(no[i]);
			}else {
				System.out.print("*");
			}
		}
	}
	
	public void practice14() {
		//로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		
		int arr[] = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * 45 + 1); //난수를 넣을 변수
			arr[i] = num; //난수를 배열에 넣어줌
			
			for(int j = 0; j < i; j++) { //중복 값 제거
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		//오름차순
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//study 문제 풀어보기
	public void Exercise1() { //다시 풀어보기
		 
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복
		for(int x = 0; x < 20; x++) {
			int i = (int)(Math.random() * ballArr.length);
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
		 
			//그냥 섞어주기 -> 정렬X
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			
		}
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		for(int i=0;i<ball3.length;i++) {
		System.out.print(ball3[i]);
		}
	}
	
	public void Exercise2() { //다시 풀어보기
		 // 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			
			System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i]);
			money  = money % coinUnit[i];
		}		
	}
	
	public void Exercise3() { //어려워..
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}
		for(int i=0; i < counter.length;i++) {
		/*
		 (2) 알맞은 코드를 넣어 완성하시오. */
		System.out.println();
		}
	}
	
	public void Exercise4() {
		
		int arr[] = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		int count = 0; //몇 번째 수
		int max = arr[0]; //초기값을 배열 0번째 인덱스로 설정하고, 그 수를 최대값으로 한다.
		
		for(int i = 0; i < arr.length; i++) { //기준이 되는 
			if(arr[i] > max) {
				max = arr[i];
				count = i;
			}
		}
		System.out.println(max);
		System.out.println(count + 1);
				
	}
}
