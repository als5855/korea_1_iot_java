package chapter04;

// 객체 지향 프로그램의 '변수'

// 필드 vs 지역 변수

// 1.


class CarClass {
	String color;
	int speed;
	String brand;

//	정적 변수
	
	// 변수 선언과 동시에 공유될 값을 초기화
	static int tireNumber = 4;
	static int doorNumber;
	
	
	void accelerate(int increment) {
		// increment: 지역 변수
		// >> 메서드 내부에서만 유효
		speed += increment; // speed = speed + increment 
	}
}
public class Object05 {
	public static void main(String[] args) {
		
		//
		CarClass car1 = new CarClass();
		CarClass car2 = new CarClass();
		
		// 객체의 인스턴스 변수
		car1.brand ="kia";
		car1.color = "black";
		
		System.out.println(CarClass.doorNumber); // 4  
		car1.tireNumber = 5;
		
		System.out.println(car2.tireNumber); // 5
		System.out.println(car2.brand);
	}
}
