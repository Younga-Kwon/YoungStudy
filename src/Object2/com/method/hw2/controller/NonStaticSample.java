package Object2.com.method.hw2.controller;

public class NonStaticSample {
	
	public int[] inArrayAllocation(int length) {
		// 전달받은 정수 (length) 만큼 int 배열을 할당
		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴
		
		int arr[] = new int[length];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		return arr;
	}
	
	public void display(int[] arr) {
		// 전달받은 배열 출력
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void swap(int[] arr, int idx1, int idx2) {
		// 전달받은 배열의 각각의 인덱스 값을 교환
				
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;				

	}
	
	public void sortDescending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		// 위의 display 메소드를 이용하여 출력
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j); //swap 메소드 호출
				}
			}
		}
		display(arr); //display 메소드 호출
	}
	
	public void sorAscending(int[] arr) {
		// 위의 swap 메소드를 이용하여 전달받은 배열을 오름차순 적용
		// 위의 display 메소드를 이용하여 출력
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					swap(arr, i, j); //swap메소드 호출
				}
			}
		}
		display(arr); //display 메소드 호출
	}
	
	public int countChar(String str, char c) {
		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴
		
		int count = 0; //문자 갯수 담을 변수
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)
		
		int max = 0; //최대값 넣을 변수
		int min = 0; //최소값 넣을 변수
		int total = 0; //합계 넣을 변수
		
		max = Math.max(num1, num2);
		min = Math.min(num1, num2);
		
		for(int i = min + 1; i < max; i++) {
			total += i;
		}
		
		return total;
	}
	
	public char pCharAt(String str, int index) {
		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴
		
		char c = 0; //리턴할 문자를 담을 변수
		
		for(int i = 0; i< str.length(); i++) {
			c = str.charAt(index);
		}
		return c;
		//return str.charAt(index);
	}
	
	public String pConcat(String str1, String str2) {
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴
		
		String sum = ""; //하나의 문자열로 합친 결과를 담을 문자열
		
		sum = str1.concat(str2);
		return sum;
	}
}
