package chapter03; //�ڵ�

public class OperatorEx07 {

	public static void main(String[] args) {

		int gameScore = 150;

		int lastScore1 = gameScore++; // �����տ��� ++�ٿ������� ; ������ ó���ϰ�
		System.out.println(lastScore1);// 150�״��
		System.out.println(gameScore);// ���� 151

		int lastScore2 = gameScore--;
		System.out.println(lastScore2);// 151�״��
		System.out.println(gameScore); // ���� ����Ǽ� 150
	}
}
