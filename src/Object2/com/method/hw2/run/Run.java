package Object2.com.method.hw2.run;

import Object2.com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {

		NonStaticSample nss = new NonStaticSample();
		
		//1. 전달받은 배열에 배열 크기를 넣음
		int arr[] = nss.inArrayAllocation(5); //넘어온 inArrayAllocation에서 넘어온 값을 int arr 배열에 넣음
		
		//2. 출력
		System.out.print("- 크기가 5인 배열의 랜덤 값 : ");
		nss.display(arr);
		System.out.println();
		
		//3. 내림차순
		System.out.print("- 내림차순 출력 : ");
		nss.sortDescending(arr);
		
		//4. 내림차순
		System.out.println();
		System.out.print("- 오름차순 출력 : ");
		nss.sorAscending(arr);
		System.out.println();
		
		//5. 문자열과 문자 하나를 전달 받아 문자열에 포함된 문자의 갯수 출력
		System.out.println();
		System.out.println("- apple 문자열에 p의 갯수 : " + nss.countChar("apple", 'p'));
		
		//6. 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 출력
		System.out.println("- 13과 7사이 정수들의 합계 : " + nss.totalValue(13, 7));
		
		//7. 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 출력
		System.out.println("- programming문자열의 3번 인덱스 문자 : " + nss.pCharAt("programming", 3));
		
		//8. 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 출력
		System.out.println("- JAVA와 programming을 합친 문자열 : " + nss.pConcat("JAVA", "programming"));

	}

}
