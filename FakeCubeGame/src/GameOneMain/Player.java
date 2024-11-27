package GameOneMain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject{
	
	Random r = new Random();
	Handler handler;
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		//velX = r.nextInt(5) +1;
		//velY = r.nextInt(5);
	}
	
	public Rectangle getBounds() {
		  return new Rectangle(x, y, 32, 32);
	}
	

	@Override
	public void tick() {
		x += velX;
		y += velY;
		x = Game.clamp(x, 0, Game.WIDTH - 49);
		y = Game.clamp(y, 0, Game.HEIGHT - 72);
		handler.addObject(new Trail(x, y, ID.Trail, Color.white, 32, 32, 0.05f, handler));
		collision();
	}
	
	private void collision() {
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.BasicEnemy) { //tempObject is  now the basic enemy
				//collision code
				if(getBounds().intersects(tempObject.getBounds())) {
					HUD.HEALTH -= 1;
					/*
					peg


					 */

				}
				
			}//end outer if
			
		}//end for
	}
	
	@Override
	public void render(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}
	
	
}
