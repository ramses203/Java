package practice;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student studentEdward = new Student("Edward", 15000 );
		
		Taxi taxi2032 = new Taxi(2032);
		studentEdward.takeTaxi(taxi2032);
		studentEdward.showInfo();
		taxi2032.showInfo();
		
		
			
		}
	}
	

