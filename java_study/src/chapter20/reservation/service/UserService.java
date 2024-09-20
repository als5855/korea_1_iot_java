package chapter20.reservation.service;


import chapter20.reservation.model.User;
import chapter20.reservation.repository.UserRepository;


/*
 	UserService 클래스 (service)
	- 사용자 등록(회원가입), 로그인, 로그아웃 등 사용자 관련 기능 구현
	- 메서드 정의
 */

public class UserService {
	private UserRepository userRepository;
	private User loggedInUser; // 현재 로그인한 사용자
	
	// 생성자
	public UserService() {
		this.userRepository = new UserRepository();
		this.loggedInUser = null; // 초기화 로그인 사용자 X
	}
	
	//사용자 등록(회원가입) 메서드
	public void registerUser(String userId, String password, String name, String email) {
		User newUser = new User(userId, password, name, email);
		userRepository.addUser(newUser);
		System.out.println("사용자 등록 완료: " + name);
	}
	
	// 사용자 로그인 메서드
	public boolean login(String userId, String password) {
		User user = userRepository.findById(userId);
			if(user != null && user.getPassword().equals(password)) {
				loggedInUser = user; // 로그인 한 사용자 설정
				System.out.println("로그인 성공: " + loggedInUser.getUserId());
				return true;
		}
		System.out.println("로그인 실패: 사용자 ID 또는 비밀번호가 잘못되었습니다.");
		return false;
	}
	
	// 사용자 로그아웃 메서드
	public void logout() {
		if(loggedInUser != null) {
			System.out.println("로그아웃 성공: " + loggedInUser.getName());
		} else {
			System.out.println("로그인이 되어있지 않습니다.");
		}
	}
	
	// 현재 로그인된 사용자 정보를 반환하는 메서드
	public User getLoggedInUser() {
		return loggedInUser;
	}
}	
