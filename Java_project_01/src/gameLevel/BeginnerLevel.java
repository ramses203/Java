package gameLevel;

public class BeginnerLevel extends PlayerLevel{

	public void run() {
	System.out.println("천천히 달립니다.");
}
	public void jump() {
	System.out.println("점프못합니다");
}
	public void turn() {
	System.out.println("턴 못합니다.");
}
	public void showLevelMessage() {
	System.out.println("*****초보자 헤벨입니다.****");
}
}
