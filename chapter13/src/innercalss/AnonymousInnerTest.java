package innercalss;

class Outer2{
	
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
			}

		
	};
}
	
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
		}
		
	};
	}
	

public class AnonymousInnerTest {

	
	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable run = out.getRunnable(10);
		run.run();
		
		out.runner.run();
	}
}
