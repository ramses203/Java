package chapter03;

public class OperatorEx02 {
	public static void main(String[] args) {

		int mathScore = 95;
		int engScore = 70;

		double totalScore = mathScore + engScore;

		System.out.println("토탈점수 " + totalScore);

		double avgScore = totalScore / 2;

		System.out.println("평균점수 " + avgScore);

		int 나머지값 = mathScore % engScore;
		String ch1 = "나눈 나머지 ";

		System.out.println(ch1 + 나머지값);

	}
}
