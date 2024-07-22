
import java.util.Scanner;

public class GameRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MarioGame game1 = new MarioGame();
		game1.up();
		game1.down();
		game1.left();
		game1.right();

		ChessGame game2 = new ChessGame();
		game2.up();
		game2.down();
		game2.left();
		game2.right();
		
		GamingConsole game3 = new MarioGame();
		// GamingConsole game3 = new ChessGame();
		game3.up();
		game3.down();
		game3.left();
		game3.right();

		System.out.println();
		sc.close();
	}
}
