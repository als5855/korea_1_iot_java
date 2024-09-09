package chapter04;

class CardClass {
	int number;
	String kind;
}

public class Card {
	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card c1 = new Card();
		c1.kind = "spade";
		c1.number = 7;
		
		System.out.println(c1.kind + c1.number);
		
		System.out.println(c1.width);
		
		
	}
}
