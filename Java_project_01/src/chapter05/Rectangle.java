package chapter05;

import java.util.Scanner;

public class Rectangle {
	
	int width;
	int height ;
	
	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		 		
		
		
		int area = rect.getArea();
		
	System.out.println("�簢���� ������" + area);
	
	scanner.close();
		
		
	}

}
