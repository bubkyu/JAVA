package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());
		
		Student studentBK = new Student();
		System.out.println(studentBK.getSerialNum());
		
		Student studentJK = new Student();
		System.out.println(studentJK.getSerialNum());
		
		
		/*
		Student studentBK = new Student();
		
		System.out.println(studentBK.studentID);
		
		
		Student studentJK = new Student();
		System.out.println(studentJK.studentID);
		
		Student studentBB = new Student();
		System.out.println(studentBB.studentID);
		System.out.println(studentJK.studentID);
		*/
	}

}
