package practice;

public class Taxi {

	int taxiNumber;
	int money;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
		
	}
	
	
	public void take(int money) {
		this.money += money;
		
	}

	public void showInfo() {
		System.out.println("�ý�" + taxiNumber + "���� ������ " + money + "�Դϴ�.");
		
		
	}
	
	
}
