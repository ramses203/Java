package chapter05;

public class Circle_con {

	int radius;
	String name;
	public Circle_con() { //<<==������(�Ű������� ���� ������)
		radius = 1;
		name = ""; // radius�� �ʱⰪ�� 1
	}
	public Circle_con(int r, String n) {// �Ű������� ���� ������
		radius = r;
		name = n;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}
	public static void main(String[] args) {
		Circle_con pizza = new Circle_con(10, "�ڹ�����"); //<<== �Ű������� ���� �����ڸ� ȣ��
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area);
		
		Circle_con donut = new Circle_con(); //<<==�Ű������� ���� �����ڸ� ȣ��
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
		
		
	}

}
