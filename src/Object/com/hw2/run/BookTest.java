package Object.com.hw2.run;

import Object.com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// 기본생성자를 이용하여 첫 번째 Book 객체 생성 -> 아무 값도 넣지말고 그냥 생성만
		// 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고) -> 값을 넣는다.
		// 객체가 가진 필드 값 출력 확인
		Book bk1 = new Book();
		Book bk2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		System.out.println("===========================");
		
		// 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		// 수정된 내용 출력 확인
		
		bk1.setTitle("c언어");
		bk1.setPrice(30000);
		bk1.setDiscountRate(0.1);
		bk1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(bk1.information());
		
		System.out.println("===========================");
		
		// 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 할인된 가격 = 가격 – (가격 * 할인율)
		int price1 = bk1.getPrice() - (int)(bk1.getPrice() * bk1.getDiscountRate());
		int price2 = bk2.getPrice() - (int)(bk2.getPrice() * bk2.getDiscountRate()); //왜 16000원 아니라 20000원이 나오지?
		
		System.out.println("도서명 = " + bk1.getTitle());
		System.out.println("할인된 가격 = " + price1 + "원");
		
		System.out.println("도서명 = " + bk2.getTitle());
		System.out.println("할인된 가격 = " + price2 + "원");

	}

}
