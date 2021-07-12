package finalex;


public class MainBoard {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play();
		
		AdvancedLevel aLevel  = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play();
		
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play();
	}
	
}
