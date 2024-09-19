package chapter19;

import lombok.Builder;
import lombok.Data;

@Builder
@Data // Getter, Setter, equals, toString 등을 생성
// >> 모든 필드에 대한 Getter, Setter, equals, toString 
public class Phone {
		private String model;
		private Integer number;
}
