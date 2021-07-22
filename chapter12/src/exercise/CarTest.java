package exercise;


public class CarTest {
public static void main(String[] args) {
	
	CarFactory factory = CarFactory.getInstance();
	Car sonata1 = factory.creatCar("���� ��");
	Car sonata2 = factory.creatCar("���� ��");
	System.out.println(sonata1 == sonata2);
	
	Car avante1 = factory.creatCar("�¿� ��");
	Car avante2 = factory.creatCar("�¿� ��");
	System.out.println(avante1 == avante2);
	
	System.out.println(sonata1 == avante1);
}
}
