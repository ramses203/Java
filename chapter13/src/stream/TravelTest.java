package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelTest {
public static void main(String[] args) {
	
	TravelCustomer customerLee = new TravelCustomer("이순신", 40 ,100);
	TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
	TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

	ArrayList<TravelCustomer> arr = new ArrayList<>();
	
	arr.add(customerLee);
	arr.add(customerKim);
	arr.add(customerHong);

	System.out.println("======고객명단 순서대로 출력======");
	arr.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
	
	int total = arr.stream().mapToInt(c -> c.getPrice()).sum();
	System.out.println("총 여행비용은 " + total + "입니다.");
	
	System.out.println("====20세 이상은 고객명단을 정렬해서 출력====");
	arr.stream().filter(c -> c.getAge() >= 20).map(s -> s.getName()).sorted().forEach(a -> System.out.println(a));

}
}
