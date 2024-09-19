package chapter18;



// == 빌더 패턴 없이! ==
// 학생 클래스 구현
// : name, age(필수 속성)
// : grade, major(선택적 속성)
class Student {
	private String name;
	private  int age;
	
	private String grade;
	private String major;
	
	//생성자
	private Student(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.grade = builder.grade;
		this.major = builder.major;
	}
	
	// ==빌더 패턴 사용 시의 생성자==
	private static class Bulider {
		private String name;
		private  int age;
		
		private String grade;
		private String major;
		
	}
	
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	// cf) 생서자의 오버로딩
	//  : 파라미터의 개수와 타입이 같다면 생성자 호출시 출동 발생
	public Student(String name, int age, String selectedField) {
		this.name = name;
		this.age = age;
		this.grade = selectedField;
	}
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	public Student(String name, int age, String grade, String major) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.major = major;
	}
	
	//Getter aptjem 
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
}

// 
// >> 생성자 4개 구현

// >> 각 필드에 대한 getter 구현
public class Builder02 {
		public static void main(String[] args) {
			Student st1 = new Student("장지민", 29, "1학년");
			Student st2 = new Student("장지은", 30);
			Student st3 = new Student("장지민", 29, "4학년");
			System.out.println(st1.getName());
			System.out.println(st1.getAge());
			System.out.println(st1.getGrade());
			
			Student std1 = new Student.Builder("장지민", 29).build();
			Student std2 = new Student.Builder("장지민", 29)
					.grade()
					.major()
					.build();
			Student std3 = new Student.Builder("이지희", 27)
					.
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
