package chapter01;



public class Test01 {

	
		  int studentID;
		  String studentName;
		  int grade;
		  String address;
		  
		  
		  
		  public String getstudentName() {
			return studentName;  
			  
		  }
		 
		  
    	  public static void main(String[] args) {
			
		  Test01 studentAhn = new Test01();
			
		  studentAhn.studentName = "¾È¿¬¼ö";
			
		  System.out.println(studentAhn.studentName);
		  System.out.println(studentAhn.getstudentName());
			
		}
			
		
		
	}	

	

		
		


			
			
			
		
		
		
		
		
		

