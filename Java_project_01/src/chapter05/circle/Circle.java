
//����� ���θ޼ҵ���� ���� �س��� Ŭ����
package chapter05.circle; //Ǯ������ chapter05.circle Circle�̴�

public class Circle {
	
	int radius;// ���� ������
	String name;// �����̸�

	public Circle() {}// Circle Ŭ������ �⺻ ������(Circle �� Ŭ���� ��� ������ �̸��� �޼ҵ带 �⺻�����ڶ���Ѵ�.)
                      // ������� ���� ������: �⺻�����ڴ� ������ �����ϴ�.()<<���⸦ ��ǲ�Ű�������� �θ��� {}<<���⸦ ���๮�̶�� �θ���.
	
	// getArea��� �޼���=���̽㿡�� �Լ��� �������̴�.
	public double getArea() {
		return 3.14 * radius * radius;

	}

	
}
