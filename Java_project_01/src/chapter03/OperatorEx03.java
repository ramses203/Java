package chapter03;

public class OperatorEx03 {

	public static void main(String[] args) {

		int gameScore = 150;
//		
//		int lastScore1 = ++gameScore;  //변수앞에다 ++붙였을때는 ; 전에서 처리하고
//		System.out.println(lastScore1);
//		
		int lastScore1 = gameScore++; // 변수 뒤에다가 ++붙였을떄는 ;후에서 처리한다.
		System.out.println(lastScore1);
		System.out.println(gameScore);

		int lastScore2 = ++gameScore;
		System.out.println(lastScore2);

	}

}
