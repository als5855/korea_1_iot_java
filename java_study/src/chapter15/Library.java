package chapter15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
	private Map<String, Book> books;
	
	public Library() {
		this.books = new HashMap<String, Book>();
	}
	
	//추가
	public void addBook(Book book) {
		books.put(book.getIsbn(), book);
		System.out.println(book.getTitle() + "이(가) 추가되었습니다.");
	}
	
	//제목 검색
	//람다
	public List<Book> searchBooksByTitle(String title) {
		return books.values().stream()
				.filter(book -> book.getTitle().equalsIgnoreCase(title))
				.collect(Collectors.toList());
	}
	//저자 검색
	public List<Book> searchBooksByAuthor(String author) {
		return books.values().stream()
				.filter(book -> book.getAuthor().equalsIgnoreCase(author))
				.collect(Collectors.toList());
	}
}
