package chapter01;

public class Order {

	long orderNum;
	String orderID;
	String orderDate;
	String orderName;
	String goodsNum;
	String orderAddress;

	public long getorderNum() {
		return orderNum;
	}

	public String getorderID() {
		return orderID;

	}

	public String getorderDate() {
		return orderDate;

	}

	public String getorderName() {
		return orderName;

	}

	public String getgoodsNum() {
		return goodsNum;

	}

	public String getorderAddress() {
		return orderAddress;

	}

	public static void main(String[] args) {

		Order order = new Order();

		order.orderNum = 201803120001l;
		order.orderID = "abc123";
		order.orderDate = "2018�� 3�� 12��";
		order.goodsNum = "PD0345-12";
		order.orderAddress = "����� �������� ���ǵ��� 20����";
		order.orderName = "ȫ�浿";

		System.out.println("�ֹ���ȣ : " + order.getorderNum());
		System.out.println("�ֹ��� ���̵� : " + order.getorderID());
		System.out.println("�ֹ���¥ : " + order.getorderDate());
		System.out.println("�ֹ��� �̸� : " + order.getorderName());
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.getgoodsNum());
		System.out.println("��� �ּ� : " + order.getorderAddress());

	}

}
