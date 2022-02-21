package Object2.com.method.hw3.controller;

public class StaticSample {

	private static String value;
	
	public static String getValue() {
		return value;
	}
	
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static void toUpper() { //가이드 참고
		// value 필드 값을 모두 대문자로 변경 --> char 배열 응용
		
		//배열에 value 값 하나 씩 담아주기
		char ch[] = new char[value.length()];
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] += value.charAt(i); 
		}
		//위의 코드를 한 줄로 쓸 수 있다 ->
		//char[] ch = value.toCharArray(); 문자열을 배열로 담아주기
		
		//대문자로 변경		
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char)(ch[i] - 32);
			}
		}
		value = "";
		for(int i = 0; i < ch.length; i++) {
			value += ch[i];
		}
		//위의 코드를 한 줄로 쓸 수 있다 ->
		//value = String.valueOf(ch); 배열을 다시 문자열로
		
		//value = value.toUpperCase();
	}
	
	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		
		//배열 안에 value값을 하나씩 담아준다.
		char ch[] = new char[value.length()];
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = value.charAt(i);			
		}
		//위의 코드를 한 줄로 쓸 수 있다 ->
		//char ch[] = value.toCharArray();
		
		ch[index] = c;
			
		value = String.valueOf(ch); //String.valueof -> 어떠한 값을 넣어도 문자열로 변환할 수 있다.
	}
	
	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		
		int count = 0; // 문자 갯수 담을 변수
		
		count = value.length();
		
		return count;
	}
	
	public static String valueConcat(String str) {
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		
		String total =""; //하나로 합칠 문자열 변수
		
		total = value.concat(str);
		
		return total;
	}
	
}
