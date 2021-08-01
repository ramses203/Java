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
		
		studentAhn.studentName = "안연수";
		studentAhn.studentID = 1401826;
		studentAhn.studentgrade = 1;
		studentAhn.studentaddress = "수원시 권선구 탑동 507-6번지";
		
		System.out.println("학생이름 : " + studentAhn.studentName);
		System.out.println("학번 : " + studentAhn.studentID);
		System.out.println("학년 : " + studentAhn.studentgrade + "학년");
		System.out.println("주소 : " + studentAhn.studentaddress);
		
	}
	
}


