package array;

public class Student {
int[] studentIDs = new int[3] {1,2};
	
	int studentID;
	String name;
	
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name; 
	} 
	
	
	
	public void showStudentInfo(){
		System.out.println(studentID + ", " + name);
		
	}
	
	
}
