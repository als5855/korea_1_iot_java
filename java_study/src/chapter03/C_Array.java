package chapter03;

import java.util.Arrays;

//Arrays  클래스
// : 배열을 조작하는 데  유용한 기능들을 제공
// >> 정렬, 검색, 변환 등

// -java.util 패키지 내부에 포함
// : import 구문을 사용
public class C_Array {
	public static void main(String[] args) {
//		Arrays 클래스 상용방법
		
		int[] numbers = {3, 2, 6, 4, 1};
		
		// 오름 차순
		Arrays.sort(numbers);
		System.out.println(numbers[0]); // 1
		
		// == 배열 변환===
		//Arrays.toString();
		// >> 배열의 전체 구조를 파악할 수 있는 기능
		// >> 전체 배열을 대괄호 안에 담은 형태를 나타냄
		// >> 각 요소를 쉰회하며 문자열로 반환
		System.out.println(Arrays.toString(numbers));
		
		//[1, 2, 3, 4, 5]
		
		// == 배열의 비교 ==
		int[] number2 = {1, 2, 3, 4, 5};
		System.out.println(Arrays.equals(numbers, number2));
		
		// ==배열의 채움==
		// Arrays.fill(배열, 삽입할 값);
		// >> 배열의 모든 요소를 특정 값으로 채움
		int[] example = new int[3];
		Arrays.fill(example, 10);
		
		System.out.println(Arrays.toString(example));
	}
}
