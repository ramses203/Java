package chapter04;

public class Q05 {

	public static void main(String[] args) {

		int lineCount = 7; //����� ���μ�
		int starCount = 1; //���� ����ϴ� ����, �ʱⰪ���� 1�� �Ҵ�
		int spaceCount = 3; //������ ó���ϴ� ����, �ʱⰪ���� 3�� �Ҵ�

		for (int i = 0; i < lineCount; i++) { // ������ ó���ϴ� For
			for (int j = 0; j < spaceCount; j++) {// ��ǥ ������ ���� ó��
				System.out.print(' ');
			}
			for (int j = 0; j < starCount; j++) { // ��ǥ�� ó��
				System.out.print('*');
			}
			for (int j = 0; j < spaceCount; j++) {// ��ǥ�� �������� ����ó��
				System.out.print(' ');
			}
			
			if (i < lineCount / 2) {
				spaceCount -=1;
				starCount +=2;
				}else {
				spaceCount +=1;
				starCount -= 2;
				}
			
	
			
			System.out.println();
			
		}
	}
}
