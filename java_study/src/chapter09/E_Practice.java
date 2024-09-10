package chapter09;

// 추상 클래스 
// == 모바일 애플리케이션 ==
abstract class MobileApp  {
	abstract void execute();
	
	void appInfo() {
		System.out.println("This is a mobile app");
	}
}

// == 게임 애플리케이션 ==
class GameApp extends MobileApp{
	
	void execute() {
		System.out.println("Game app executes");
	}
}

// == 사회 네트워킹 애플리케이션 ==
class SocialApp extends MobileApp {
	String name;
	
	SocialApp(String name) {
		this.name = name;
	}
	void execute() {
		System.out.println("Social app execute");
	}
	
	@Override
	void appInfo() {
		System.out.println(name + "app is most popular social app");
	}
}

public class E_Practice {
		public static void main(String[] args) {
			// 인스턴스 생성
			MobileApp myGameApp = new GameApp();
			MobileApp mySocialApp = new SocialApp("FaceBook");
			
			myGameApp.execute();
			myGameApp.appInfo(); // 추상 클래스가 가진 일반 메서드 출력
			
			mySocialApp.execute();
			mySocialApp.appInfo();
			
		}
}
