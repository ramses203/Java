package chapter05;

public class Student_Test {

	//변수선언부분
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	//메인메소드 밖에서 선언하는 선언부
	public void showStudentInfo() {   //매개변수가 없는 함수이다. 얘는 리턴이없다. 리턴이 없을떄는void를 넣는다. 
		System.out.println(studentName + "," + address );//(메소드)
	}
	
	public static int add(int num1, int num2) {//여기서 n1(10), n2(20)는 매개변수이다. (메인메소드 밖에서 선언하는 선언부)
		int result = num1 + num2; //result를 어떤값으로 받을지 변수설정해줘야한다.
		return result;//리턴값이 있으면 리턴을 돌려줄수 있는 
	}
	
	
	
	
	public static void main(String[] args) {//(메인메소드부분)

		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);//위애있는 int num1(10) , int num2(20) 함수를 호출한다.
		
		System.out.println(num1 +  "+" + num2 + "=" + sum + "입니다." );
		
		
		
		
		
	}

}
