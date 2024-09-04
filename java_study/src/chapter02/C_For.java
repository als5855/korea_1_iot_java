package chapter02;

// 반복문
// : 어떤 작업을 반복적으로 실행하고 싶을 때 사용

// 종류
// for, while, do-while문
public class C_For {
	public static void main(String[] args) {
		// for문
		// : 특정 조건이 만족될 때까지 코드 블록을 반복 실행
		/*
		  for
		  */
		
		for(int num = 1; num < 5; num++) {
			System.out.println(num);
		}
		// 12345
		
//		==예제==
//		for 반복문을 사용하여  부터 10까지 
		for(int num = 1; num <= 10 ; num++) {
			if(num %  2 == 0) System.out.print(num);
			
			
		int num1 = 3;
		for(int x = 3; x <= 9; x++ ) {
			System.out.println(num + "X" + x+ "=" + num* x);
		}
		
//	 ==중첩 반복문 사용하여 구구단 전체를 출려하는 코드==
		System.out.println("구구단");
		for(int i = 0; i < 8; i++) { // 초기화는 0  조건은 초과 미만으로 사용하는 것이 좋다.
			int dan = i + 2;
			System.out.println("[" + dan + "단]"); //[2단]
			for(int j = 0; j < 9; j++) {
				int number = j + 1; // number: 1~9
				System.out.println(dan + "X" + number + "=" + dan * number);
			}
		}
		}
	}
}
