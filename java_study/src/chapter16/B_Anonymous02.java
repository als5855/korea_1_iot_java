package chapter16;


class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}

}

// interface 정의 - 성적 계산
interface Grading {
	String caluculateGrade(Student student); // 추상메서드
 	
}


public class B_Anonymous02 {
	public static void main(String[] args) {
		Student st1 = new Student("장지민", 85);
		Student st2 = new Student("이지윤", 95);
		Student st3 = new Student("이미진", 75);
		Student st4 = new Student("최유림", 100);
		Student st5 = new Student("장지호", 65);
		
		Grading grading = new Grading() {
			@Override
			public String caluculateGrade(Student student) {
					int score = student.getScore();
					if (score >100 || score < 0) {
						System.out.println("잘못된 점수입니다.");
						return null;
					} else if (score >= 90) {
						return "A";
					} else if (score >= 80) {
						return "B";
					} else if (score >= 70) {
						return "c";
					} else if (score >= 60) {
						return "D";
					} else {
						return "F";
					}
			}
		};
		
		System.out.println(st1.getName() + "의 성적은 " + grading.caluculateGrade(st1));
		System.out.println(st2.getName() + "의 성적은 " + grading.caluculateGrade(st2));
		System.out.println(st3.getName() + "의 성적은 " + grading.caluculateGrade(st3));
		System.out.println(st4.getName() + "의 성적은 " + grading.caluculateGrade(st4));
		System.out.println(st5.getName() + "의 성적은 " + grading.caluculateGrade(st5));
	}
}
