package chapter08;

// === 다형성 ===
// Animal, Cat, Dog 클래스 선언

// Animal 클래스: sound 메서드 (The animal makes a sound)

// Cat, Dog 클래스 - Animal 클래스를 상속
// : sound 메서드를 오버라이딩 >> 각각 "meow", "bark" 출력



class Animal {
	void sound() {
		System.out.println("The animal makes a sound");
	}
}

class Cat extends Animal {
	@Override
	void sound( ) {
		System.out.println("Meow");
	}
}
class Dog extends Animal {
	@Override
	void sound( ) {
		System.out.println("Bark");
	}
}


//=== instanceof 연산자 === 
//AnimalChecker 클래스 선언
//: Animal, Cat, Dog 클래스를 사용하여 다형성을 확인하는 메서드 작성
//: checkAnimalType 메서드 - Animal 타입의 매개변수를 전달
//: instanceof 연산자를 사용하여 매개변수가 Cat과 Dog 중 어느 인스턴스인지 확인
//: Cat > 'cat'출력 / Dog > 'dog'출력 / 둘 다 X > 'Unknown animal type'

class AnimalChecker {
	void checkAniamlType(Animal animal) {//지역변수
			if(animal instanceof Cat) {
				System.out.println("cat");
			} else if (animal instanceof Dog) { 
				System.out.println("dog");
			} else {
				System.out.println("Unknown anmal type");
			}
	}
}

public class C_Practice {
	public static void main(String[] args) {
		//Animal, Cat, Dog 클래스의 객체를 Animal 타입으로 저장
		AnimalChecker animalChecker = new AnimalChecker();
		
		
		Animal myPet1 = new Animal();
		animalChecker.checkAniamlType(myPet1);
		
//		Dog myPetDog = (Dog) myPet1;   -error
//		animalChecker.checkAniamlType(myPetDog);

		Animal myPet2 = new Cat();
		animalChecker.checkAniamlType(myPet2);

		Animal myPet3 = new Dog();
		animalChecker.checkAniamlType(myPet3);
	}
}