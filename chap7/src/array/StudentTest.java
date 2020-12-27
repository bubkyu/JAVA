package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKim = new Student(1001,"kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 100);
		
		studentKim.showStudentInfo();
		System.out.println("-----------------------");
		Student studentLee = new Student(1002, "lee");
		studentLee.addSubject("국어", 60);
		studentLee.addSubject("수학", 70);
		studentLee.addSubject("영어", 80);
		
		studentLee.showStudentInfo();
	}

}
