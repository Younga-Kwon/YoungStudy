package Object.com.hw2.model.vo;

public class Book {
	//필드부
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	//기본 생성자
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title, int price, double discountRat, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	//getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String information() {
		return title + " " + price + " " + discountRate + " " + author;
	}
}
