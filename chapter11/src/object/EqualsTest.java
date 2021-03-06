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
		
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"이상원");
		
		
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다.");
	 	else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
	
	
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang는 동일합니다.");
	 	else
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
	
		System.out.println("==========================================================");
		
		System.out.println(studentLee);
		System.out.println(studentLee2);
		System.out.println(studentSang);
	
		System.out.println("==========================================================");
		
		System.out.println(studentLee.hashCode());
		System.out.println(studentSang.hashCode());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
