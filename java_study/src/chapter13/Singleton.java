package chapter13;

//Singleton
// : 소프트웨어 설계 패턴 중 하나
// >> 클래스의 인스턴스가 하나만 생성되도록 보장
// >> 해당 클래스의 인스턴스에 전역적인 접근을 제공하지만일관된 상태를 유지
public class Singleton {
	private static Singleton instance;
	
	private Singleton() {} // 생성자를 private으로 선언 - 외부에서 직적 인스턴스 생성 X
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	// cf) 싱글턴 패턴의 장단점
	// 장점: 자원의 중복 생성을 방지, 메모리 사용 최적화
	// , 전역 상태를 공유 + 통재된 접근
	
	// 단점: 전역 상태를 관리 + 다른 클래스에 영향(결합의 가능성)
	//		, 테스트가 
	
}
