package chapter16;

// 학교 클래스
class School {
	private String name;
	
	public School(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 내부 클래스 - 학생, 교사 클래스
	class Student {
		private String studentName;
		private int studentId;
		
		public Student(String studentName, int studentId) {
			this.studentName = studentName;
			this.studentId = studentId;
		}
		
		public void displayInfo() {
			System.out.println("학교 " + name);
			System.out.println("학생 이름 " + studentName);
			System.out.println("학생 ID " + studentId);
		}
	}
	class Teacher {
		private String teacherName;
		private String subject;
		
		public Teacher(String teacherName, String subject) {
			this.teacherName = teacherName;
			this.subject = subject;
		}
		
		public void displayInfo() {
			System.out.println("학교 " + name);
			System.out.println("교사 이름 " + teacherName);
			System.out.println("과목 " + subject);
		}
	}

}

public class A_Inner02 {
	public static void main(String[] args) {
		// 학교 객체 생성
		School school = new School("장성 초등학교");
		
		// 학생 객체 생성
		School.Student student1 = school.new Student("장지민", 11);
		School.Student student2 = school.new Student("이지윤", 10);
		
		// 교사 객체 생성
		School.Teacher teacther1 = school.new Teacher("정옥교", "사회");
		School.Teacher teacther2 = school.new Teacher("이경례", "수학");
		
		// == 학생 정보 출력 ==
		student1.displayInfo();
		student2.displayInfo();
		
		// == 교사 정보 출력 ==
		teacther1.displayInfo();
		teacther2.displayInfo();
	}
}