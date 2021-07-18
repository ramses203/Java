package object;

class Student{
	int studentId;
	String studentName;

public Student(int studentId, String studentName) {
this.studentId = studentId;
this.studentName = studentName;
}


//public String toString() {
//	return studentId + ", " + studentName;
//	}




@Override
	public boolean equals(Object obj) {

	if(obj instanceof Student) {
		Student sobj = (Student)obj;
		if(this.studentId == sobj.studentId)
		return true;
	
		else 
		return false;
	}

	return false;
	
}

}


public class EqualsTest {

	

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"�̻��");
		
		
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
	 	else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
	
	
		if(studentLee == studentSang)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
	 	else
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
	
		System.out.println("==========================================================");
		
		System.out.println(studentLee);
		System.out.println(studentLee2);
		System.out.println(studentSang);
	
		System.out.println("==========================================================");
		
		System.out.println(studentLee.hashCode());
		System.out.println(studentSang.hashCode());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
