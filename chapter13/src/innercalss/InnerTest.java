package innercalss;


class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	
	
	//static InStaticClass(���� Ŭ����)
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
	
	
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(����Ŭ������ �ν��Ͻ� ���� ���)");	
			System.out.println("InStaticClass sInNum = " + sInNum + "(����Ŭ������ ���� ���� ���)");	
			System.out.println("OutClass sNum = " + sNum + "(�ܺ�Ŭ������ ���� ���� ���)");	
		}
	
	
	
		static void sTest() {
			System.out.println("OutClass sNum =" + sNum + "(�ܺ�Ŭ������ ���� ���� ���)");
			System.out.println("InStatic sNum =" + sInNum + "(����Ŭ������ ���� ���� ���)");
		}
	
	}
}
	
	

public class InnerTest {
	
	public static void main(String[] args) {
	
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("����Ŭ������ �Ϲݸ޼��� ȣ��");
		sInClass.inTest();
		
		System.out.println();
		System.out.println("����Ŭ������ �����޼��� ȣ��");
		sInClass.sTest();
	}
}

