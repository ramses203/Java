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
		order.orderDate = "2018년 3월 12일";
		order.goodsNum = "PD0345-12";
		order.orderAddress = "서울시 영등포구 여의도동 20번지";
		order.orderName = "홍길동";

		System.out.println("주문번호 : " + order.getorderNum());
		System.out.println("주문자 아이디 : " + order.getorderID());
		System.out.println("주문날짜 : " + order.getorderDate());
		System.out.println("주문자 이름 : " + order.getorderName());
		System.out.println("주문 상품 번호 : " + order.getgoodsNum());
		System.out.println("배송 주소 : " + order.getorderAddress());

	}

}
