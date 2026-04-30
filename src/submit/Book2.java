package jp.co.aforce.sample.exercise.classConstructor;

public class Book {
	
	String title;
	String author;
	int price;
	
	public Book(String title, String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.price = 2000;
	}
	
	void displayInfo() {
		System.out.println("この本のタイトルは" + title + "作者は" + author + "価格は" + price + "です");
	}
	
	public static void main(String[] args) {
		Book book1 = new Book("The Silent Patient", "アレックス・マイケリデス");
		Book book2 = new Book("All the Light We Cannot See", "アンソニー・ドーア", 2700);
		book1.displayInfo();
		book2.displayInfo();

	}

}
