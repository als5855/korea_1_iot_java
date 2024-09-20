package chapter20.Library2.model;

public class Book {
	private String title;
	private String author;
	private boolean isBorrowed; // 책의 대여 상태를 나타내는 필드
	
	public Book(String title, String author, boolean isBorrowed ) {
		this.title = title;
		this.author = author;
		this.isBorrowed = isBorrowed;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean isBorrowed() {
		return isBorrowed;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;		
	}
	
	public void setIsBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;		
	}


}
