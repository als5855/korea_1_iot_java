package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class D_Array {
	public static void main(String[] args) {
		// 자바의 기본 배열 형태
		// : 한번 생성되면 크기 변경 X 
		//>>변경시 새로운 배열 생성하여 원래 배열 요소를 복사
		int[] numbers = new int[5];
		System.out.println(Arrays.toString(numbers));
		
		// == 동적 배열 (ArrayList)
		// : 자바 ArrayList 라이브러리의 기능
		// : java.utill.ArrayList를 import 해서 사용
		
		// cf) 동적 배열의 경우 배열의 타입 지정 시 일반 데이터 타입은 사용할수 없다, 
		//참조 타입으로 작성
		// int >> Integer
		// char >> Charactor
		// bool >> Boolean
		// String
		
		
		// +) 참조 타입은 기본값이 모두 null
		// + ) 
		
		Integer a = 123; // 주소가 담긴다.
		System.out.println(a);//123
		
		//ArrayList 생성
		// ArrayList<데이터타입> 배열명 = new ArrayList<>(선택);
		// >> 소괄호 안의 선택값은 기본 용량 10
		ArrayList<Integer> arrayList = new ArrayList<>(5);
		
		System.out.println(arrayList);
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		System.out.println(arrayList); // [10, 20, 30]
		
		// == ArrayList 데이터 변경 == 
		// : 배열명.set(이덱스번호, 변경할 데이터);
		arrayList.set(1, 50);
		System.out.println(arrayList);
		
		// == ArrayList 데이터 삭제
		// : 배열명.remove(인덱스번호);
		arrayList.remove(2);
		System.out.println(arrayList);
		
		System.out.println(arrayList.size()); //2
		
		// == 원하는 위치에 데이터 삽입 ==
		// : 배열명.add(인덱스번호, 데이터값);
		arrayList.add(1, 123);
		System.out.println(arrayList); // [10, 123, 50]
		
		// == 특정요소 접근==
		// 배열명.get
		System.out.println(arrayList.get(1));
		
		
		
		
		
		
		
	}
}
