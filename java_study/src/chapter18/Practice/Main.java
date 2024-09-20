package chapter18.Practice;

import java.util.Arrays;
import java.util.List;

// ==빌더 패턴 예제==

// 1) Product 클래스 : 제품에 대한 정보(상품 이름, 가격, 설명 등)
// 2) Customer 클래스 : 고객에 대한 정보 (고객이름, 이메일, 배송 주소 등)
// 3) Order 클래스: 즈문에대힌 정보

//메인 클래스
public class Main {
		public static void main(String[] args) {
			// 1, Product 객체 생성
			Product pd1 = Product.builder()
					.name("삼성 노트북 4")
					.price(1200.10)
					.description("삼성 북 시리즈의 4번째 모델")
					.build();
			Product pd2 = Product.builder()
					.name("갤럭시 S24")
					.price(1000.10)
					.description("삼성 핸드폰")
					.build();
			
			// 2. Customer 객체 생성 (중첩된 Address 객체 포함)
			Customer.Address address1 = Customer.Address.builder()
					.street("전포로")
					.city("부산")
					.postalCode("1234")
					.build();
			
			Customer cust1 = Customer.builder()
					.name("장지민")
					.email("wlal")
					.address(address1)
					.build();
			
			// 3. Order 객체 생성
			List<Product> products = Arrays.asList(pd1, pd2);
			double totalPrice = Order.calculateTotalPrice(products);
			System.out.println(totalPrice);
			
			Order order = Order.builder()
					.orderId("ord111")
					.customer(cust1)
					.products(products)
					.totalPrice(totalPrice)
					.build();
			
			System.out.println(order);
			// Order(orderId=ORD123, customer=Customer(name=이승아, email=dev!, address=Customer.Address(street=전포대로, city=부산, postalCode=12345)), products=[Product(name=삼성 북 4, price=1200.1, description=삼성 북 시리즈의 네 번째 모델), Product(name=갤럭시 s24, price=670.5, description=삼성 핸드폰)], totalPrice=1870.6)
		}
}
