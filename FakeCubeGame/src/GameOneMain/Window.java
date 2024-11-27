package GameOneMain;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends Canvas{
	private static final long serialVersionUID = 4126457148768849957L;

	public Window (int width, int height, String title, Game game) {
		JFrame mainFrame = new JFrame(title);
		mainFrame.setPreferredSize (new Dimension(width, height));
		mainFrame.setMaximumSize (new Dimension(width, height));
		mainFrame.setMinimumSize (new Dimension(width, height));
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setLocationRelativeTo(null);
		
		mainFrame.add(game);
		mainFrame.setVisible(true);
		game.start();
		
	}//end window
	
}
