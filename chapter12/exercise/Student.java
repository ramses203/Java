package exercise;


public class Student {
private String studentId;
private String studentName;

public Student(String studentId, String studentName) {
	this.studentId = studentId;
	this.studentName = studentName;
}




@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return Integer.parseInt(studentId);
}




@Override
public boolean equals(Object obj) {
	if(obj instanceof Student) {
		Student student = (Student)obj;
		if(this.studentId == student.studentId)
			return true;
	}
	
	return false;
}




@Override
public String toString() {
	return studentId + ":" + studentName;
}


}
