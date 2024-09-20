package chapter20.Library;

import java.util.ArrayList;
import java.util.List;

//데이터를 메모리에 저장하고 관리하는 클래스
public class BookRepository {
		private List<Book> books = new ArrayList<Book>();
		private int idCounter = 1;
		
		// 메모리에 데이터를 저장하는 메서드
		public void save(Book book ) {
			// 책을 생성하면서 id값은 전달되지 X >> int 필드의 기본값 0
			// - 책의 생성
			if (book.getId() == 0) {
				book.setId(idCounter++);
				books.add(book);
			} else {
				//- 책의 수정
					int index = books.indexOf(findById(book.getId()));
					//수정할 책이 리스트에서 몇 번째 위치에 있는지 찾는 과정
					//findById(int id) 메서드는 리스트 books에서 
					//특정 id를 가진 책을 찾아 반환
					//book.getId()는 수정하려는 책의 id를 가져옵니다.
					//indexOf()는 리스트에서 주어진 객체의 인덱스(위치)를 반환
					//findById(book.getId())로 찾은 책이 books 리스트의 몇 번째에 위치해 있는지를 반환합니다.
					//만약 리스트에서 해당 책을 찾지 못하면 -1을 반환
					books.set(index, book);//리스트의 특정 인덱스 위치에 있는 요소를 새로운 값으로 교체하는 역할
			}
		}
		
		// id를 통해 책을 검색하는 메서드
		public Book findById(int id) {
			return books.stream()
					.filter(book -> book.getId() == id)
					.findFirst()
					.orElse(null);
			
		}
		
		// id에 해당하는 책 요소를 삭제
		public void delete(int id) {
			// removeIf: 해당 조건이 존재할 경우에 삭제를 진행 
			books.removeIf(book -> book.getId() == id);
		}
		
		// 전체 책 데이터를 반환
		public List<Book> findAll() {
			return books;
		}
		
		
}
