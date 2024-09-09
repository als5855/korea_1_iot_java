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
			System.out.println("성인입니다."); 
		} else {
			System.out.println("미성년자 입니다."); 
		}
		
//			조건이 참일 때 실행될 코드 
//			조건이 거짓일 때 실행될 코드
		
		if(age > 19) System.out.println("성인");
		else if (age > 13) System.out.println("청소년");
		else System.out.println("어린이");
		
		
		System.out.println("==예제==");
		String  Appraise = null;

		Scanner sca = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sca.nextInt();
		
		System.out.print("b: ");
		int b = sca.nextInt();
		
		if(a > 0 && b > 0) Appraise = "둘 다 양수" ;
		else if( a <0 && b > 0) Appraise = "b는 양수이다.";  
		else if( a > 0 && b < 0) Appraise = "a는 양수이다.";  
		else  Appraise = "둘다 음수이다."; 
		
		System.out.println("결과: " + Appraise);
		
		sca.close();
		
		
		// == 조건문 예제 ==
				// : 함수 위치 구하기 문제
				// 1. 스캐너를 사용하여 x, y 변수에 데이터를 저장
				// 2. (x, y) 좌표가 1, 2, 3, 4 사분기 중 어느 위치에 있는지 검사
				// >> 조건문
				
				// 각 분기의 위치일 경우 functionScope 변수에 몇 사분면인지 할당
				// EX) functionScope = "제1사분면"
				
				// 조건문 이행 완료 시 
				// "결과: " + functionScope 출력
		
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
//		String functionScope = null ; 
//		
////		스캐너 생성
//		Scanner sc = new Scanner(System.in);
//		System.out.print("x : ");
//		int x = sc.nextInt();
//		
//		System.out.print("y : ");
//		int y = sc.nextInt();
//		
//	//	조건문
//		if(x > 0 && y > 0) functionScope = "1분기입니다." ;
//		else if( x <0 && y > 0) functionScope = "2분기입니다.";  
//		else if( x< 0 && y < 0) functionScope = "3분기입니다.";  
//		else  functionScope = "4분기입니다."; 
//		
//		System.out.println("결과: " + functionScope);
//		
//		sc.close();
//			
	}
}
