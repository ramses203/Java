package chapter05;

//Circle �̶�� �޼���
public class Circle {//Ŭ������
	int radius;// ���� ������
	String name;// �����̸�

	public Circle() {}// Circle Ŭ������ �⺻ ������(Circle �� Ŭ���� ��� ������ �̸��� �޼ҵ带 �⺻�����ڶ���Ѵ�.)
                      // ������� ���� ������: �⺻�����ڴ� ������ �����ϴ�.()<<���⸦ ��ǲ�Ű�������� �θ��� {}<<���⸦ ���๮�̶�� �θ���.
	
	// getArea��� �޼���=���̽㿡�� �Լ��� �������̴�.
	public double getArea() {
		return 3.14 * radius * radius;

	}

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
