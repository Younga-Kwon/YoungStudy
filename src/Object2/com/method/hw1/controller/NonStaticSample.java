package Object2.com.method.hw1.controller;

public class NonStaticSample {

	public void printLottoNumbers() {		
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 + 1); // 1~45 까지의 랜덤 정수 6개 넣음
			for(int j = 0; j < i; j++) { //중복검사 -> i 인덱스에 들어가 있는 값을 비교할 j 인덱스의 값
				if(arr[i] == arr[j]) { //만약 arr 배열의 i인덱스 값과 j 인덱스 값이 같으면 i인덱스를 -1하고 다시 값을 넣는다. 
					i--;
					break; //같으면 안쪽 for문을 빠져나가고 바깥쪽 for문에서 i를 증가시킨다.
				}				
			}
		}
		//오름차순
		for(int i = 1; i < arr.length; i++) { //비교 주체
			for(int j = 0; j < i; j++) { //비교 대상
				if(arr[i] < arr[j]) { //인덱스 안의 값을 비교
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//출력
		System.out.print("랜덤 값 : ");
		
		for(int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}			
	}
	
	public void outputChar(int num, char c) {
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
		
		char ch[] = new char[num];
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] += c;
		}
		//출력
		System.out.print(c + "문자 " + num + "개 출력 : ");
		
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		
		//가이드
		/*for(int i = 0; i < num; i++) {
			System.out.print(c + " ");
		}*/
	}
	
	public char alphabette() { //가이드 참고
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함
		//대문자(A~Z -> 65~90), 소문자(a~z -> 97~122)
		
		int num = 0; //알파벳을 넣을 변수
		
		while(true) {
			num = (int)(Math.random() * 58 + 65); //65 ~ 122사이의 랜덤 숫자
			
			if((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
				break;
			}			
		}
		return (char)num;
	}
	
	public String mySubstring(String str, int index1, int index2) {
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		
		String letter = "";
		
		if(str != null) {
			for(int i = index1; i < index2; i++) {
				letter += str.charAt(i);
				
			//가이드 - 방법2(for문 한 줄 요약) : String 클래스에서 제공하는 substring(시작 인덱스, 끝 인덱스)
			//letter = str.substring(index1, index2);
			}
			return letter;
		}else {
			return null;
		}
		
	}
}
