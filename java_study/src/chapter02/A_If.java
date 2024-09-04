package chapter02;

import java.util.Scanner;

// 종류
// 1.  if, else, else If, 

// 2.switch, case, default
// +) continue, break
public class A_If {
	public static void main(String[] args) {
		//1. if문
		int age = 20;
		if( age > 19) {
//			조건이 참일 때 실행될 코드 
			System.out.println("성인입니다."); 
		} else {
//			조건이 거짓일 때 실행될 코드
			System.out.println("미성년자 입니다."); 
		}
		
		if(age > 19) System.out.println("성인");
		else if (age > 13) System.out.println("청소년");
		else System.out.println("어린이");
		
		// 조건문 예제
//		: 함수 위치 구하기 때문에
//		: 1. 스캐너를 사용하여 
		
//		Scanner sc = new Scanner(System.in);
//			int x = sc.nextInt();
//			int y = sc.nextInt();
////			조건문
//			if(x > 0 && y > 0) System.out.println("1분기입니다.");
//			else if( x <0 && y > 0) System.out.println("2분기입니다.");  
//			else if( x< 0 && y < 0) System.out.println("3분기입니다.");  
//			else  System.out.println("4분기입니다.");  
//			
//			functionScope =  ;
//			
//			System.out.println("결과: " + functionScope);
			
//		== 풀이 ==
//		각 조건식에서 저장할 문자열값
		String functionScope = null ; 
		
//		스캐너 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
	//	조건문
		if(x > 0 && y > 0) functionScope = "1분기입니다." ;
		else if( x <0 && y > 0) functionScope = "2분기입니다.";  
		else if( x< 0 && y < 0) functionScope = "3분기입니다.";  
		else  functionScope = "4분기입니다."; 
		
		System.out.println("결과: " + functionScope);
		
		sc.close();
			
	}
}
