package innercalss;


class Outer{
	
	
	int outNum = 10;
	static int sNum = 20;
	
	 
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {

			int localNum = 10;
			
			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(�ܺ�Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer.sNum =" + Outer.sNum + "(�ܺ�Ŭ������ ��������)");
			}
			
		}
	return new MyRunnable();
	}
	
	
}

public class LocalInnerTest {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable r = outer.getRunnable(10);
		r.run();
	
	}
	
	
}
