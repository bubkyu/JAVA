package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKim = new Student(1001,"kim");
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 100);
		
		studentKim.showStudentInfo();
		System.out.println("-----------------------");
		Student studentLee = new Student(1002, "lee");
		studentLee.addSubject("����", 60);
		studentLee.addSubject("����", 70);
		studentLee.addSubject("����", 80);
		
		studentLee.showStudentInfo();
	}

}
