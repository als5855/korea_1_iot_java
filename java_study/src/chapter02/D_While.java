package chapter02;

public class D_While {
	public static void main(String[] args) {
		//while문
		//: 일반적으로 반복 횟수가 지정되지 않을 때 사용
		
		//: 조건을 검사하고 새당 조건이 true인 경우 코드 블로을 실행
		// >> if 문의 반복 형태
		
		/*
		 while (조건){
		 	조건이 참 일 때 실
		 }
		 */
		// 초기화
		int num =1;
		while (num <= 5) {
			System.out.println(num); 
			num ++;
		}
		//cf) while 	
		int number = 0;
		while (true) { 
//			0부터 20까지 중에서 홀수만 출력
			if(number % 2 == 0) {
				number++;
				//루프 안에서 를 만나면 아래의 코드를 모두 수밋하고 다시 조건을 검사 
				continue;
			}
			// 홀수 아래으이 내용이 실행
			System.out.println(number);
			number++;

			if(number == 20) break;
		}
	}
}
