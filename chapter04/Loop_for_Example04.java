package chapter04;

public class Loop_for_Example04 {

	public static void main(String[] args) {
		int dan;
		int times;//몇번 곱하는지
		
		for (dan = 2; dan <=9; dan++) {
			for (times =1; times <=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan *times);
			}
			System.out.println();
		}

	}

}
