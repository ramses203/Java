package chapter05;

public class Student {
	
	int studentID;
	String studentName;
	int studentgrade;
	String studentaddress;
	
	public String getstudentName(){
	return studentName;
	}
	
	public static void main(String[] args) {
		
		Student studentAhn = new Student();
		
		studentAhn.studentName = "�ȿ���";
		studentAhn.studentID = 1401826;
		studentAhn.studentgrade = 1;
		studentAhn.studentaddress = "������ �Ǽ��� ž�� 507-6����";
		
		System.out.println("�л��̸� : " + studentAhn.studentName);
		System.out.println("�й� : " + studentAhn.studentID);
		System.out.println("�г� : " + studentAhn.studentgrade + "�г�");
		System.out.println("�ּ� : " + studentAhn.studentaddress);
		
	}
	
}


