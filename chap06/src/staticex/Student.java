package staticex;

public class Student {
	
	private static int serialNum = 100;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		
		int i = 10;	//��������
		
		i++;
		System.out.println(i);
		
		// studentName = "�浿"; // �������, �ν��Ͻ� ����
		
		return serialNum;	// static ����, Ŭ���� ����
	}

	

	
	
}
