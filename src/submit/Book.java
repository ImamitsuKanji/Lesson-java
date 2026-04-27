package jp.co.aforce.sample.exercise.classBasics;

public class Book {
	String title;
	String author;
	int price;
	
	public Book(String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void showIofo() {
		System.out.println(title + "の作者は" + author + "の" + price +"円の商品");
	}
	
	public static void main(String[] args) {
		Book book = new Book("java入門", "中垣健志", 2600);
		book.showIofo();

	}

}
