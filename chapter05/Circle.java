package chapter05;

//Circle 이라는 메서드
public class Circle {//클래스명
	int radius;// 원의 반지름
	String name;// 원의이름

	public Circle() {}// Circle 클래스의 기본 생성자(Circle 의 클래스 명과 동일한 이름의 메소드를 기본생성자라고한다.)
                      // 실행부자 없는 생성자: 기본생성자는 생략이 가능하다.()<<여기를 인풋매개변수라고 부르고 {}<<여기를 실행문이라고 부른다.
	
	// getArea라는 메서드=파이썬에서 함수랑 같은말이다.
	public double getArea() {
		return 3.14 * radius * radius;

	}

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
