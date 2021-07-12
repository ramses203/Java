package interfaceex;

public class CaculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc caca = new CompleteCalc();
		System.out.println(caca.add(num1, num2));
		System.out.println(caca.substract(num1, num2));
		System.out.println(caca.divide(num1, num2));
		System.out.println(caca.times(num1, num2));
		caca.showInfo();
		
		
		
		
	}
	
}
