package chapter04;

class Book {
	String title;
	int year;
	
	void displayInfo() {
		System.out.println("title :" + title+ "year : " + year );
}

	Book(String bookName, int year) {
		title =  bookName;
		this.year = year;
	}
	
}

public class Object04 {
	public static void main(String[] args) {
		Book  myBook = new Book("데미안", 2024);
		Book anotherBook = new Book("안녕, 보노보노", 2017);
		System.out.println(myBook.title);
		System.out.println(myBook.year);
		
		myBook.displayInfo();
		
	}
}
