package chapter20.Library2.controller;

import java.util.Scanner;

import chapter20.Library2.model.Book;
import chapter20.Library2.model.User;
import chapter20.Library2.service.LibraryService;

public class LibraryController {
	private LibraryService libraryService = new LibraryService();
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		
		while(running) {
			System.out.println("1: 도서등록 | 2: 사용자 등록 | 3: 도서 대여 | 4: 도서 반납| 5: 도서목록 조회| 6: 사용자 내역 조회 | 7: 종료 ");
			
			int choice = sc.nextInt();
			sc.nextLine() ; // 개행문자 (\n, 줄바꿈) 소비
			
			switch (choice) {
			case 1:
				System.out.print("도서 제목: ");
				String title = sc.nextLine();
				
				System.out.print("도서 저자: ");
				String author = sc.nextLine();
				libraryService.addBook(new Book(title, author, false));
				break;
				
			case 2: 
				System.out.print("사용자 이름: ");
				String name = sc.nextLine();
				
				System.out.print("사용자 ID: ");
				String userId = sc.nextLine();
				
				libraryService.registerUser(new User(name, userId));
				break;
				
			case 3:
				System.out.print("사용자 Id: ");
				 userId = sc.nextLine();
				
				System.out.print("도서 제목: ");
				 title = sc.nextLine();
				 
				 libraryService.borrowedBook( userId, title);
					break;
					
			case 4: 
				System.out.print("반납할 도서 제목: ");
				 title = sc.nextLine();
				 
				 libraryService.returnBook( title);
					break;
			case 5:
				libraryService.listAllBook();
				break;
				
			case 6:
				libraryService.listAllUsers();
				break;
				
			case 7:
				running = false;
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
