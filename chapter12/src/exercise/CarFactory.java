package exercise;

import java.util.HashMap;

public class CarFactory {

	private static CarFactory instance = new CarFactory();
	HashMap<String, Car> carMap = new HashMap<>();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null);
		CarFactory instance = new CarFactory();
		return instance;
		
		
	}

	public Car creatCar(String name) {
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}
		Car car = new Car();
		carMap.put(name, car);
		return car;
	}
	
}
