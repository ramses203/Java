package chapter04;

import java.util.Scanner;//1. scanner ����Ʈ

public class ScannerEx01 {

	public static void main(String[] args) {
		
			System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
			Scanner scanner = new Scanner(System.in);//2. scanner ��ü����
			
			String name = scanner.next(); //���ڿ� �б�
			System.out.println("�̸��� " + name + "�̰�, ");//3. scanner���� ���� ���� ������ �Ҵ�
	
			String city = scanner.next(); //���ڿ� �б�
			System.out.println("���ô� " + city + "�� ���, ");

			int age = scanner.nextInt(); //���� �б�
			System.out.println("���̴� " + age + "�� �̰�, ");
			
			double weight = scanner.nextDouble(); //�Ǽ� �б�
			System.out.println("ü���� " + weight + "KG�̰�, ");
			
			boolean married = scanner.nextBoolean(); //���� �б� true or false�� Ű���Է��ϱ�
			System.out.println("���ſ��δ� " + married + "�Դϴ�. ");
			
			scanner.close(); //4. scanner�ݱ�
			
			
			
	
	
	}

}
