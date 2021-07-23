package lambda;


interface PrintString{
	void showString(String str);
}



public class TestLambda {
		public static void main(String[] args) {
			
			PrintString lambdaStr = s -> System.out.println(s);
			lambdaStr.showString("hello lambda_1");
			PrintMyString(lambdaStr);
			
		}
		
		public static void PrintMyString(PrintString p) {
			p.showString("hello lambda_2");
		
		}
	
	
}
