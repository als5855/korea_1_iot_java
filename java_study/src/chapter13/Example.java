package chapter13;

import lombok.Data;

@Data
//@ToString
//@Getter
//@Setter
//>> @Data 어노테이션은 모든 멤버 필드에 대한 게터, 세터, toString, equals 메서드를 생성

public class Example {
	private String name;
	private int age;

	// public Example() {}
	// public Example(모든 멤버 필드에 
}


//Example exam1 = new Example();
//Example exam2 = new Example("이승아", 50);
