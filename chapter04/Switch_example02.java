package chapter04;

public class Switch_example02 {
	public static void main(String[] args) {
		
		String medal = "B";

		switch (medal) {
		case "Gold": case "G" : case  "g":
			System.out.println("�ݸ޴� �Դϴ�.");
			break;
		case "Silver": case "S" : case "s":
			System.out.println("���޴��Դϴ�.");
			break;
		case "Bronze": case "B" : case "b":
			System.out.println("���޴��Դϴ�.");
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");

		}
	}

}
