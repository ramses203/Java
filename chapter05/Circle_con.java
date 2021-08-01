package chapter05;

public class Circle_con {

	int radius;
	String name;
	public Circle_con() { //<<==생성자(매개변수가 없는 생성자)
		radius = 1;
		name = ""; // radius의 초기값은 1
	}
	public Circle_con(int r, String n) {// 매개변수를 가진 생성자
		radius = r;
		name = n;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		Circle_con pizza = new Circle_con(10, "자바피자"); //<<== 매개변수를 가진 생성자를 호출
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		Circle_con donut = new Circle_con(); //<<==매개변수가 없는 생성자를 호출
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
		
	}

}
