
//여기는 메인메소드없이 선언만 해놓은 클래스
package chapter05.circle; //풀네임은 chapter05.circle Circle이다

public class Circle {
	
	int radius;// 원의 반지름
	String name;// 원의이름

	public Circle() {}// Circle 클래스의 기본 생성자(Circle 의 클래스 명과 동일한 이름의 메소드를 기본생성자라고한다.)
                      // 실행부자 없는 생성자: 기본생성자는 생략이 가능하다.()<<여기를 인풋매개변수라고 부르고 {}<<여기를 실행문이라고 부른다.
	
	// getArea라는 메서드=파이썬에서 함수랑 같은말이다.
	public double getArea() {
		return 3.14 * radius * radius;

	}

	
}
