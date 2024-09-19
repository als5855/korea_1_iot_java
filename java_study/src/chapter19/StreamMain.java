package chapter19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


// ===스트림 API===
// : 자바 8에서 처음 도입됨
// >> 컬렉션 데이터를 처리하는 도구 

// +) 스트립의 특징
// - 일회성 : 한 번 소비되면 다시 사용 X, 새로운 스트림을 생성하여 사용해야 함.
// - 연산의 분류: 스트림 연산은 중간, 최종 연산으로 나뉨
//  >> 중간 연산:  map, filter, sorted 등
//							데이터를 각오하지만 실제로 연산은 최종 연산의 호출 시 수행
//  >> 최종 연산: collect, forEachm reduce 등
//							스트림의 결과를 반환하고 스트림을 종료

/*
 		스트림 생성(사용) 절차
 		1. 배열 생성 >> 스트림으로 변환
 		2. List 생성 >> 스트림으로 변환
 		3. generate 메서드 >> 스트림 생성
 		4. 범위 지정 >> 스트림 생성
 		5.  빌더 >> 스트림 지정
 		
 		== 중간(가공) 절차 ==
 		1. map(Function)
 		2. filter(Prddicate)
 		3. sorted(comparator)
 		
 		
 		== 최종(결과) 절==
 		1. collect >> stream을 list로 변환
 		2. forEach >> 반복자
  */


public class StreamMain {
		public static void main(String[] args) {
			Stream<Integer> st1 = Arrays.stream(new Integer[] {1, 2, 3, 4, 5});
			
			// 중간 연산(map): 각 요소르 주어진 함수에 따라 변환
			List<Integer> st1Stream = st1.map(n -> n * 2)
					// peek( 중간 연산) : 중간에 각 요소를 소비, 디버깅 시 유용하게 사용
					.peek(n -> System.out.print(n))
					// collect(최종연산) : 스트림 데이터를다른 컬렉션이나 데이터 형식으로 변환
					// collectors.toList()로 리스트 변환을 가장 많이 사용
					.collect(Collectors.toList());
			
			System.out.println();
			st1Stream.forEach(n-> System.out.println("n: " + n));
			
			List<Integer> numberList = Arrays.asList(20, 30, 40, 50, 10);
			
			Stream<Integer>  numberStream = numberList.stream();
			List<Integer> filteredList = numberStream
								.map(n -> n / 2)
								.filter(n -> n % 2 == 0)
								.collect(Collectors.toList());
			System.out.println("컬렉션으로 부터 스트림 생성");
			filteredList.forEach(n -> System.out.println("n: " + n));
			
			List<Integer> sortedList = numberList.stream()
					.sorted((n1, n2) -> n1 - n2)
					.collect(Collectors.toList());
			System.out.println("컬렉션으로 부터 스트림 생성 - sorted 메서드");
			sortedList.forEach(n -> System.out.println("n: " + n));
			
			// 3. Stream.generate() 메서드로 스트림 생성
			// : 무한 스ㅡ림 생성 가능
			// >> 제한 조건을 주어 사용 가능
			Stream<Double> randomStream = Stream.generate(Math::random).limit(5);
			
			// 4. 범위 지정 스트림 새성
			// : 특정 범위를 지정하여 스트림 생성
			IntStream rangeStream = IntStream.range(1,  10);
			
			//5. 빌더를 이용한 스트림 생성
			// : 빌더
			Stream<String> nameStream = Stream.<String>builder()
					.add("장지민")
					.add("이도경")
					.add("최유림")
					.add("김수현")
					.add("장아진")
					.build();
			
//			nameStream.sorted().forEach(name -> System.out.println(name));
			
			nameStream
			.sorted((n1, n2) -> String.CASE_INSENSITIVE_ORDER.compare(n2, n1))
			.forEach(name -> System.out.println(name));
			
			//=====================//
			// phone 클래스를 사용한 리스트 생성 + 스트림 API 사용
			// --리스트를 한번에 상요한 리스트 생서 + 스트림 API 사용
			// : 배열을 리스트로 변환하는 메서드
			
			List<Number> asList = Arrays.asList(1, 2, 3);
			
			List<Number> listOf = List.of(1, 2, 3);
			
			//asList.add(1);
			//listOf.add(1);
			
			asList.set(0, 3);
			System.out.println(asList);
			
			//
			
			List<Phone> phoneList = List.of(
					Phone.builder().number(1).model("아이폰 16").build(),
					Phone.builder().number(2).model("아이폰 17").build(),
					Phone.builder().number(3).model("아이폰 18").build(),
					Phone.builder().number(4).model("아이폰 19").build()
					);
			phoneList.stream()
				.map(phone -> phone.builder()
						.number(phone.getNumber() * 2)
						.model(phone.getModel())
						.build()
						)
				.forEach(phone -> System.out.println(phone));
			
			phoneList.stream()
				.filter(phone -> phone.getNumber() %  2 != 0)
				.forEach(phone -> System.out.println(phone));
			
			System.out.println("sorted를 사용한 정렬");
			phoneList.stream();
			List<Phone> sortedPhoneList = phoneList.stream()
					.sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
					.collect(Collectors.toList());
			
			sortedPhoneList.forEach(phone -> System.out.println(phone));
		}
}
