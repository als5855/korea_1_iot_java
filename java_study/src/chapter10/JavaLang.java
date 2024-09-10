package chapter10;

//java.lang
// : 자바 프로그램의 가장 기본적인 클래스드을포함


// 1) Object 클래스



class MyClass extends Object {
		// toString() 메서드
		// : 객체의 문자열 표현을 반환 
	private int id;
	private String name;

		// equals() 메서드 
		// : 두 객체가 동등한지 비교
		public MyClass(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
 }

// 2) Math 클래스
//-abs:
 
// 3) String 클래스
// >> 문자열 내용 작성에 유용한 유틸리티르 담은 클래스


public class JavaLang {
		public static void main(String[] args) {
			System.out.println("=== Object Class ===");
			MyClass myClass1 = new MyClass(123, "장지민");
			MyClass myClass2 = new MyClass(234, "이지윤");
			System.out.println(myClass1.toString();
			System.out.println(myClass2.toString();
			
			System.err.println(myClass1.equals(myClass2)); // false
			
			
			System.out.println("=== Math Class===");
			// 절대값 반환
			double result1 = Math.abs(-3.5);
			System.out.println(result1);
			
			//max(데이터1, )
			System.out.println(Math.max(125356, 1234569));
			// random() : 0.0에서 1.0 사이의 난수 생성
			// ㅔㅈ
			System.out.println(Math.sqrt(4.0));
			
			System.out.println(Math.random() * 10);
			
			System.out.println(Math.pow(2, 4)); // 16;
			
			
			System.out.println("==String Class==");
			//length(); 문자열 길이 반한
			// equals(a, b) : 두 문자열 비교
			// substring(int 시작인덱스, int 끝인 인덱스): 부분 문자열 반환
			
			String message = "Hello, World!";
			
			System.out.println(message.length());
			
			boolean isEqual = message.equals("Hello, world!");
			System.out.println(isEqual);
			
			
			System.out.println(message.substring(7, 12));
			
			//indexOf(String str) : 특정 문자열의 위치 찾음;
			
			 char ch = message.charAt(1);
			 
			 System.out.println(ch);
			 
			 int index = message.indexOf("World");
			 System.out.println(index);
 					
			
			
			
					
		}
}
