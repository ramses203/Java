package practice2;

public class AICar extends Car{

	@Override
	public void startCar() {
		// TODO Auto-generated method stub
		System.out.println("시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율주행합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("스스로 멈춥니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("시동을 끕니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 스스로 방향을 전환합니다.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.");
	}

}
