package chapter04;


public class Q01_IF {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		char operator = 'a';
		
		int result = 0;
		
		
		if  (operator == '+'){
			result = num1 + num2;
		}
		else if  (operator == '-'){
			result = num1 - num2;
		}
		else if  (operator == '*'){
			result = num1 * num2;
		}
		else if  (operator == '/'){
			result = num1 / num2;	
		}
		else {
			System.out.println("������ �����Դϴ�.");
		return;
		}
		System.out.println("�������" + result + "�Դϴ�.");
			
		
		
		
		
	}

}
