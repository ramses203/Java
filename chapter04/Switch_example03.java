package chapter04;

public class Switch_example03 {
	public static void main(String[] args) {

		String medal = "G";

		if (medal == "Gold" || medal == "G" || medal == "Gol") {
			System.out.println("�ݸ޴� �Դϴ�.");
		} else if (medal == "Silver" || medal == "S" || medal == "Sil") {
			System.out.println("�ݸ޴� �Դϴ�.");
		} else if (medal == "Bronze" || medal == "B" || medal == "Bro") {
			System.out.println("�ݸ޴� �Դϴ�.");
		} else {
			System.out.println("�޴޾���");
		}

	}
}
