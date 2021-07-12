//여기는 선언부 없이 메인메소드만 있는 클래스


package chapter05.circle;

import chapter05.circle.Circle; //파일의 풀네임을 임포트 시켜서 메소드(함수를 사용한다.)

public class Circle_Actor {

	
		public static void main(String[] args) {

			// Circle 객체생성, 레퍼런스 이름 pizza
			Circle pizza;
			pizza = new Circle();
			pizza.radius = 10; //피자의 반지름은 10으로 설정
			pizza.name = "자바 피자";//피자의 이름을 설정
			double area = pizza.getArea();//피자의 면적(getArea ()를 호출해서 area 변수에 할당)
			System.out.println(pizza.name + "의 면적은: " + area + "입니다.");
			
			// Circle 객체 생성, 레퍼런스 이름 donut
			Circle donut = new Circle();
			donut.radius = 2;
			donut.name = "던킨 도넛";
			area = donut.getArea();
			System.out.println(donut.name + "의 면적은: " + area + "입니다.");
		}

	}