package chapter04;

public class Switch_example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String medal = "Bronze";

		switch (medal) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");

		}
	}

}
