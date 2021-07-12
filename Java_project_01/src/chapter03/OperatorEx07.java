package chapter03; //뒤뒤

public class OperatorEx07 {

	public static void main(String[] args) {

		int gameScore = 150;

		int lastScore1 = gameScore++; // 변수앞에다 ++붙였을때는 ; 전에서 처리하고
		System.out.println(lastScore1);// 150그대로
		System.out.println(gameScore);// 이제 151

		int lastScore2 = gameScore--;
		System.out.println(lastScore2);// 151그대로
		System.out.println(gameScore); // 이제 연산되서 150
	}
}
