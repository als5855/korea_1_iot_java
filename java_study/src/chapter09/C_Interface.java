package chapter09;

interface Flyable {
	int Max_SPEED =100;
	
	
	void fly(); // (public abstract 생략)
	
	// 디폴트 메서드
	default void land( ) {
		System.out.println("Landing");
	}
	
	static int getWingCount() {
		return 2;
	}
}

class Bird implements Flyable {
	// 인터페이스를 구현하는 클래스에서 인터페이스에 정의된 상수 사용 가능
	public void fly() {
		System.out.println("새는 최대 속려이 " + Max_SPEED + "입니다.");
	}
	
	@Override
	public void land( ) {
		System.out.println("...Landng...");
	}
}

public class C_Interface {
		public static void main(String[] args) {
			Bird bird = new Bird();
			
			bird.fly();
			bird.land(); // 디폴트 메서드 - 재정의 동작
			
			System.out.println(Flyable.getWingCount()); // 정적 메서드 - 인터페이스 호출
		}
}
