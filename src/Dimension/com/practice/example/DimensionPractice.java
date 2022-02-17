package Dimension.com.practice.example;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 1 ~ 16까지 값을 차례대로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요
		
		int[][] arr = new int[4][4];
		
		int value = 1; //이차원 배열에 1부터 16까지 넣기 위한 변수
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) { //배열의 i행의 열의 길이만큼
				arr[i][j] = value++;
			}
		}
		//출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println(); //한 행이 끝날 때마다 개행
		}
	}
	
	public void practice2() {
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		
		int[][] arr = new int[4][4];
				
		int value = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--; //16부터 넣었기 때문에 감소
			}			
		}
		//출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println(); //한 행이 끝날 때마다 개행
		}
	}
	
	public void practice3() {
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		//(0, 0)(0, 1)(0, 2)
		//(1, 0)(1, 1)(1, 2)
		//(2, 0)(2, 1)(2, 2)
		
		int[][] arr = new int[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + ", " + j + ")"); // 이차원배열 i행의 j열 인덱스를 출력한다.
			}
			System.out.println();
		}
	}
	
	public void practice4() { //가이드 봄.. 봐도 이해가 잘 안감.. -> 설명을 들어보기
		//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		//아래의 내용처럼 처리하세요.
		//4 7 3 14 
		//4 2 10 16 
		//7 10 5 22 
		//15 19 18 52
		
		int[][] arr = new int[4][4];
		
		int lSum = 0; //행의 합
		int cSum = 0; //열의 합
		
		//2행 2열 1~10까지의 임의의 정수 저장
		for(int i = 0; i < arr.length - 1; i++) { //2행 까지 -> arr.length - 1
			for(int j = 0; j < arr[i].length - 1; j++) { //2열까지 arr[i].length
				arr[i][j] = (int)(Math.random() * 10 + 1);
				
				arr[3][j] += arr[i][j]; //배열의 3행 j열 -> j열 값들의 합
				arr[i][3] += arr[i][j]; //배열의 i행 3열 -> i행 값들이 합
				arr[3][3] += arr[i][j]; //배열의 3행 3열 -> 행 + 열의 총합
			}
		}
		for(int i = 0; i < arr.length - 1; i++) {
			arr[3][3] += arr[3][i] + arr[i][3];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();			
		}
	}
	
	public void practice5() {
		//2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1~10사이 숫자가 아니면
		//“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		//크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		//(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타내고 90은 Z를 나타냄)	
		/*
		 행 크기 : 5
		 열 크기 : 4
		 T P M B 
		 U I H S 
		 Q M B H 
		 H B I X 
		 G F X I
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("행 크기 : ");
			int line = sc.nextInt();
			
			System.out.println("열 크기 : ");
			int col = sc.nextInt(); 
			
			char arr[][] = new char[line][col]; //char형 이차원 배열
			
			if(line >= 1 && line <= 10 && col >= 1 && col <= 10) {
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char)(Math.random() * 26 + 65);// 대문자의 숫자 범위 65<= <91
						System.out.print(arr[i][j] + " ");
					}
					System.out.println(); //개행
				}
				break;
			}
			else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
	}
	
	public void practice6() {
		//String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
		//"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		//위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제6 흐름’과 같은 방식으로 출력하세요.
		//단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요		
		
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
											{"차", "지", "습", "으", "냅"}, 
											{"원", "열", "니", "로", "시"}, 
											{"배", "심", "다", "좀", "다"}, 
											{"열", "히", "! ", "더", "!! "}};
											//(0,0)(0,1)(0,2)(0,3)(0,4)		(0,0)(1,0)(2,0)(3,0)(4,0)
											//(1,0)(1,1)(1,2)(1,3)(1,4)		(0,1)(1,1)(2,1)(3,1)(4,1)
											//(2,0)(2,1)(2,2)(2,3)(2,4)  -> (0,2)(1,2)(2,2)(3,2)(4,2)
											//(3,0)(3,1)(3,2)(3,3)(3,4)		(0,3)(1,3)(2,3)(3,3)(4,3)
											//(4,0)(4,1)(4,2)(4,3)(4,4)		(0,4)(1,4)(2,4)(3,4)(4,4)
											//행고정							열고정
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " "); //행과 열을 바꿔준다. -> i를 열자리에 넣으면 개행 될 때까지 i(행)은 고정이고 열이 바뀐다
			System.out.println();
			}
		}
	}
	
	public void practice7() { //가이드 참고 -> 다시 풀어보기!
		//사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아
		//문자형 가변 배열을 선언 및 할당하세요.
		//그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요. -> 소문자 범위 97(a) ~ 122(z)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("행의 크기 : ");
		int line = sc.nextInt();
		
		char chArr[][] = new char[line][]; //가변 배열
		int value = 97; //소문자를 넣어줄 변수
		
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(i + "행의 크기 : "); //각 행마다 크기를 입력 받는다 -> 열을 입력받는다
			int col = sc.nextInt();	
			
			chArr[i] = new char[col]; //가변 배열 각 행의 열의 크기 할당
		}
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				chArr[i][j] = (char)value++; //97부터 1씩 증가 -> char형으로 변환해주면 소문자
			}
		}
		//출력
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				System.out.print(chArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		//1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		//3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장.
		//1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		//<출석부>
		//1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
		//7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		/*
		== 1분단 ==
		강건강 남나나     ->   1분단 / 2분단 나눠서, 2행 3열인 이차원배열
		도대담 류라라
		문미미 박보배
		== 2분단 ==
		송성실 윤예의
		진재주 차천축
		피풍표 홍하하
		*/
		
		String str[] = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
							"송성실", "윤예의", "진재주", "차전축", "피풍표", "홍하하"};
		
		String strArr1[][] = new String[3][2];
		String strArr2[][] = new String[3][2];
	
		//1분단
		int index = 0; //일차원 배열에서 값을 빼올 인덱스 변수 -> 1분단에 들어간 애들에 이어서 남은 애들을 2분단에 넣어준다.
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < strArr1.length; i++) {
			for(int j = 0; j < strArr1[i].length; j++) {
				strArr1[i][j] = str[index++];
			}
		}
		
		for(int i = 0; i < strArr1.length; i++) {
			for(int j = 0; j < strArr1[i].length; j++) {
				System.out.print(strArr1[i][j] + " ");
			}
			System.out.println();
		}
		
		//2분단
		System.out.println("== 2분단 ==");
		for(int i = 0; i < strArr2.length; i++) {
			for(int j = 0; j < strArr2[i].length; j++) {
				strArr2[i][j] = str[index++];
			}
		}
		
		for(int i = 0; i < strArr2.length; i++) {
			for(int j = 0; j < strArr2[i].length; j++) {
				System.out.print(strArr2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice9() { //가이드 참고 -> 다시 풀어보기!
		/*위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
		해당 학생이 어느 자리에 앉았는지 출력하세요.
		ex.
		== 1분단 ==
		강건강 남나나
		도대담 류라라
		문미미 박보배
		== 2분단 ==
		송성실 윤예의
		진재주 차천축
		피풍표 홍하하
		============================
		검색할 학생 이름을 입력하세요 : 차천축
		검색하신 차천축 학생은 2분단 2번째 줄 오른쪽에 있습니다.
		*/
		String str[] = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차전축", "피풍표", "홍하하"};

		String strArr1[][] = new String[3][2];
		String strArr2[][] = new String[3][2];
		
		//1분단
		int index = 0; //일차원 배열에서 값을 빼올 인덱스 변수 -> 1분단에 들어간 애들에 이어서 남은 애들을 2분단에 넣어준다.
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < strArr1.length; i++) {
			for(int j = 0; j < strArr1[i].length; j++) {
				strArr1[i][j] = str[index++];
			}
		}
		
		for(int i = 0; i < strArr1.length; i++) {
			for(int j = 0; j < strArr1[i].length; j++) {
				System.out.print(strArr1[i][j] + " ");
			}
			System.out.println();
		}
		
		//2분단
		System.out.println("== 2분단 ==");
		for(int i = 0; i < strArr2.length; i++) {
			for(int j = 0; j < strArr2[i].length; j++) {
				strArr2[i][j] = str[index++];
			}
		}
		
		for(int i = 0; i < strArr2.length; i++) {
			for(int j = 0; j < strArr2[i].length; j++) {
				System.out.print(strArr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String part = ""; //몇 분단인지
		int row = 0; //몇 번째 줄인지
		String col = ""; //왼쪽, 오른쪽
		
		//1분단에서 검색
		for(int i = 0; i < strArr1.length; i++) {
			for(int j = 0; j < strArr1[i].length; j++) {
				if(strArr1[i][j].equals(name)) { //이차원배열에 입력한 이름과 같은 이름이 있다면
					
					part = "1분단";
					row = i + 1; //인덱스가 0부터 시작하기 때문에 +1(행)
					
					if(j == 0) { //인덱스 j가 0이면 1열 -> 왼쪽
						col = "왼쪽";
					}else {
						col = "오른쪽";
					}	
				}
			}
		}
		
		//2분단에서 검색
		for(int i = 0; i < strArr2.length; i++) {
			for(int j = 0; j < strArr2[i].length; j++) {
				if(strArr2[i][j].equals(name)) {
					
					part = "2분단";
					row = i + 1;
					
					if(j == 0) {
						col = "왼쪽";
					}else {
						col = "오른쪽";
					}
				}
			}
		}
		/*if(part.equals("")) { //분단과 일치하는게 없다면
			System.out.println("일치하는 사람이 없습니다.");
		}else {*/
			System.out.println("검색하신 " + name + " 학생은 " + part + " " + row + "번째 줄 " + col + "에 있습니다.");
		//}
		
	}
	
}
