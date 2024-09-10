package chapter10;

// 자바 예외 처리

// 예외 (Exception)
// : 프로그램 실행 중에 발생할 수 있느 예기치 못한 문제나 조건

// 예외 처리
// : 예외가 발생할 경우 프로그램이 중단 되지 않고 대응하여 정상적인 흐름을 유지하는 프로그래밍 기법


// 자바 예외 클래스
// : Throwable: 모든 예외와 오류의 최상위 클래스
// - 모든 예외 클래스는 해당

// 1) Exception(예외)
// : 프로그램이 처리 할 수 있는 예외들의 클래스
// : 애플리케이션 레벨에서 발생하는 오류
// : 예외 처리를 통해 개발자가 처리 할 수 있는 문제들을 정의

// 1-1) checked 


// 2) error: 시스템 베레에서 발생하는 예외, 개발자가 처리할 수 없다.
// EX - 메모리 부족, 네트워크 연결 등



public class Exception01 {
	public static void main(String[] args) {
		System.out.println('a');
			System.out.println("A"); // -Error
			System.out.println("ABC"); // 
			
////			try % catch
//			
//			try {
//				
//			} catch() {
//				
//			} catch() {
//				
//			}
			
//			catch 블록 : 특정 예외 타입이 발생했으 떼 실해
			try {
				
				int division = 10 / 0; // runtime
				
				// >> 수를 0으로 나눌 수 없다.
				
			} catch (Exception e) {
				// try 블록 내에서 발생하는 예외를 ()소괄호 내에서 매개변수 전달 받아
				// {} 실행문에서 처리
				// >> 매개변수의 형식: 타입 변수명
				System.out.println("0으로 나눌수 없습니다.");
			}
			
			System.out.println("정상적인 실행입니다.");
			
			System.out.println("=========");
			try {
				int division = 10 / 0;

				int[] numbers = new int[5];
				numbers[10] = 50;
				
				String text = null;
				System.out.println(text.length());
				
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스 초과 오류 발생" + e.getMessage());
			}catch(NullPointerException e) {
				System.out.println("null을 계산할 경우 오류 발생" + e.getMessage());
			} catch(Exception e) {
				System.out.println("초과 오류 발생" + e.getMessage());
			} finally {
				System.out.println("finally 블록 실행");
			}
//			System.out.println("");
			
			// ==throw 블록 == 
			// : 예외를 직접 발생시키는 데 사용
			// >> 특정 조건에서 예외를 발생 시킬 경우 사용
			// >> 주로 조건문과 함께 사용
			
			int age = -10;
			
			try {
				if(age < 0) {
					throw new Exception("나이는 음수가 될 수 없습니다.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				// 나이는 음수가 될 수 없습니다.
			}
			
			System.out.println("반드시 실행되어야할 코드");
			
	}
}
