package chapter12;

import chapter12.view.BookView;

public class Main {
	public static void main(String[] args) {
		BookView bookView = new BookView();
		bookView.showMenu();
		
		int[] numbers = {1, 2, 3, 4, 5};
		// for-each문
		// for (배열요소타입: 배열명) {
		
		// }
		for (int num: numbers) {
			System.out.println(num);
		}
	}
}