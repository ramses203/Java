package chapter05;

public class Student_Test {

	//��������κ�
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	//���θ޼ҵ� �ۿ��� �����ϴ� �����
	public void showStudentInfo() {   //�Ű������� ���� �Լ��̴�. ��� �����̾���. ������ ��������void�� �ִ´�. 
		System.out.println(studentName + "," + address );//(�޼ҵ�)
	}
	
	public static int add(int num1, int num2) {//���⼭ n1(10), n2(20)�� �Ű������̴�. (���θ޼ҵ� �ۿ��� �����ϴ� �����)
		int result = num1 + num2; //result�� ������� ������ ��������������Ѵ�.
		return result;//���ϰ��� ������ ������ �����ټ� �ִ� 
	}
	
	
	
	
	public static void main(String[] args) {//(���θ޼ҵ�κ�)

		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);//�����ִ� int num1(10) , int num2(20) �Լ��� ȣ���Ѵ�.
		
		System.out.println(num1 +  "+" + num2 + "=" + sum + "�Դϴ�." );
		
		
		
		
		
	}

}
