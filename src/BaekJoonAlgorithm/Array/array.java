package BaekJoonAlgorithm.Array;

import java.util.Arrays;
import java.util.Scanner;

public class array {
	
	//10818번 1차원배열
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		//방법1
		int n = sc.nextInt();
		int max = -1000000;
		int min = 1000000;		
		int[] nArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			nArr[i] = sc.nextInt();		
			
			if(nArr[i] > max) {
				max = nArr[i];
			}
			
			if(nArr[i] < min) {
				min = nArr[i];
			}
		}
		
		System.out.println(min + " " + max);
		
		//방법2
//		Arrays.sort(nArr); //오름차순 정렬	
//		System.out.println(nArr[0] + " " + nArr[n-1]);
	
	}
	
	//2562번 최댓값
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				max = arr[i];
				index = i+1;
			}
			
		}
		System.out.println(max + " " + index);
	}
	
	//2577번 숫자의 개수
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = a * b * c;
		
		for(int i = 0; i <= 9; i++) {
			
		}
	}
}
