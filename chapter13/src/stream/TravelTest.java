package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelTest {
public static void main(String[] args) {
	
	TravelCustomer customerLee = new TravelCustomer("�̼���", 40 ,100);
	TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
	TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 50);

	ArrayList<TravelCustomer> arr = new ArrayList<>();
	
	arr.add(customerLee);
	arr.add(customerKim);
	arr.add(customerHong);

	System.out.println("======����� ������� ���======");
	arr.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
	
	int total = arr.stream().mapToInt(c -> c.getPrice()).sum();
	System.out.println("�� �������� " + total + "�Դϴ�.");
	
	System.out.println("====20�� �̻��� ������� �����ؼ� ���====");
	arr.stream().filter(c -> c.getAge() >= 20).map(s -> s.getName()).sorted().forEach(a -> System.out.println(a));

}
}
