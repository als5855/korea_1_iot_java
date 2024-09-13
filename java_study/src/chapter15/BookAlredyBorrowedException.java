package chapter15;

public class BookAlredyBorrowedException extends RuntimeException{
	public BookAlredyBorrowedException(String message) {
			super(message);
	}
}
