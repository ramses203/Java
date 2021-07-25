package lambda;


public class CalcTest{
public static void main(String[] args) {
	
	Calc calc = (int x, int y) -> x + y;
	System.out.println(calc.add(1, 3));
	
}
}
