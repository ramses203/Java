//����� ����� ���� ���θ޼ҵ常 �ִ� Ŭ����


package chapter05.circle;

import chapter05.circle.Circle; //������ Ǯ������ ����Ʈ ���Ѽ� �޼ҵ�(�Լ��� ����Ѵ�.)

public class Circle_Actor {

	
		public static void main(String[] args) {

			// Circle ��ü����, ���۷��� �̸� pizza
			Circle pizza;
			pizza = new Circle();
			pizza.radius = 10; //������ �������� 10���� ����
			pizza.name = "�ڹ� ����";//������ �̸��� ����
			double area = pizza.getArea();//������ ����(getArea ()�� ȣ���ؼ� area ������ �Ҵ�)
			System.out.println(pizza.name + "�� ������: " + area + "�Դϴ�.");
			
			// Circle ��ü ����, ���۷��� �̸� donut
			Circle donut = new Circle();
			donut.radius = 2;
			donut.name = "��Ų ����";
			area = donut.getArea();
			System.out.println(donut.name + "�� ������: " + area + "�Դϴ�.");
		}

	}