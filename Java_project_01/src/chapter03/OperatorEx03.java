package chapter03;

public class OperatorEx03 {

	public static void main(String[] args) {

		int gameScore = 150;
//		
//		int lastScore1 = ++gameScore;  //�����տ��� ++�ٿ������� ; ������ ó���ϰ�
//		System.out.println(lastScore1);
//		
		int lastScore1 = gameScore++; // ���� �ڿ��ٰ� ++�ٿ������� ;�Ŀ��� ó���Ѵ�.
		System.out.println(lastScore1);
		System.out.println(gameScore);

		int lastScore2 = ++gameScore;
		System.out.println(lastScore2);

	}

}
