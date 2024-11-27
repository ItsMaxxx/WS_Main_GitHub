package GameOneMain;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	public static int HEALTH = 100;
	public void tick() {
		HEALTH = Game.clamp(HEALTH, 0, 100);
		
		if(HEALTH <= 0) {
			closeGame();
		}
	}

	public void closeGame(){
		System.out.println("Your Score: " + Game.score);
		UpdateDatabase upDB = new UpdateDatabase();
		upDB.addScore(Game.score);
		System.exit(0);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(15, 15, 200, 32);
		g.setColor(Color.green);
		g.fillRect(15, 15, HEALTH *2, 32);
		//is the border around the health bar
		g.setColor(Color.white);
		g.drawRect(15, 15, 200, 32);
	}
	
}
