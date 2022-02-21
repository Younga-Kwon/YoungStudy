package Object2.com.method.hw1.run;

import Object2.com.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample nss = new NonStaticSample();
		//nss.printLottoNumbers();
		//nss.outputChar(5, 'a');
		//nss.alphabette();
		//System.out.println("랜덤 영문자 출력 : " + nss.alphabette());
		System.out.println("apple의 2번 4번 인덱스 사이의 값 출력 : " + nss.mySubstring("apple", 2, 4));
	}

}
