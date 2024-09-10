package chapter09;

interface Fruit {
	String color(); // 추상 메서드 - public abstract 생략
	
	// 디폴트 메서드
	// >> 재정의 가능
	default void describe() {
		System.out.println("과일 색상은 " + color() + "입니다.");
	}
	// 정적 메서드
	// >> 재정의 불가능
	static void printType() {
		System.out.println("과일(Fruit)의 타입입니다.");
	}
}

// === 인터페이스 구현
 class Apple implements Fruit{
	 public String color() {
		return "red";
	}
	 
	 //디폴트 메서드를 재정의 X
	 // >> Fruit에 있는 디폴트 메서드가 생략된 형태
	 
	 
 }
 
 class Orange implements Fruit{
	 public String color() {
		 return "orange";
	 }
 }

public class F_Practice {
		public static void main(String[] args) {
			Fruit apple = new Apple();
			Fruit orange = new Orange();
			
			apple.describe();
			orange.describe();
			
			Fruit.printType();
			
		}
}
