package chapter04;

import java.util.Scanner;//1. scanner 임포트

public class ScannerEx01 {

	public static void main(String[] args) {
		
			System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
			Scanner scanner = new Scanner(System.in);//2. scanner 객체생성
			
			String name = scanner.next(); //문자열 읽기
			System.out.println("이름은 " + name + "이고, ");//3. scanner에서 받은 값을 변수에 할당
	
			String city = scanner.next(); //문자열 읽기
			System.out.println("도시는 " + city + "에 살며, ");

			int age = scanner.nextInt(); //정수 읽기
			System.out.println("나이는 " + age + "세 이고, ");
			
			double weight = scanner.nextDouble(); //실수 읽기
			System.out.println("체중은 " + weight + "KG이고, ");
			
			boolean married = scanner.nextBoolean(); //논리값 읽기 true or false로 키값입력하기
			System.out.println("독신여부는 " + married + "입니다. ");
			
			scanner.close(); //4. scanner닫기
			
			
			
	
	
	}

}
