package UltimateUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import GameOneMain.Game;
import GameOneMain.UpdateDatabase;

public class GigaGUI {
	
	public GigaGUI() {
		
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("JMenu");
		mainFrame.setAlwaysOnTop(false);
        //Bidde ausprobieren, ob es nicht nur alle JFrames sondern auch alle Dialogues schlie�t
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setBounds(300,150,800,500);
        
        // Erstellen objekt men�leiste
        JMenuBar menubarOne = new JMenuBar();
        JMenuBar menubarTwo = new JMenuBar();
        
        //Umrandung der men�leiste
        Border bo = new LineBorder(Color.green);
        menubarOne.setBorder(bo);
        menubarTwo.setBorder(bo);

        Font font1 = new Font("SansSerif", Font.BOLD, 30);
        JMenu account = new JMenu("Account");
        JMenu minigame = new JMenu("Minigame");
        JMenu fakeWhatsApp = new JMenu("WhatsApp");
        JMenu menuChangeMenuBar = new JMenu("Swich Bar");
        JMenu menuChangeMenuBar2 = new JMenu("Swich Bar");
        JMenu menuNetflixAndChill = new JMenu("Netflix and Chill");

        account.setFont(font1);
        minigame.setFont(font1);
        fakeWhatsApp.setFont(font1);
        menuChangeMenuBar.setFont(font1);
        menuChangeMenuBar2.setFont(font1);
        menuNetflixAndChill.setFont(font1);
        
        menubarOne.add(account);
        menubarOne.add(minigame);
        menubarOne.add(fakeWhatsApp);
        menubarOne.add(menuChangeMenuBar);
        menubarTwo.add(menuNetflixAndChill);
        menubarTwo.add(menuChangeMenuBar2);
        
        
        JMenu submenu1 = new JMenu ("Registrieren");
        JMenu submenu2 = new JMenu ("Anmelden");
        JMenu submenu3 = new JMenu ("Start");
        JMenu submenu4 = new JMenu ("Scores");
        JMenu submenu5 = new JMenu ("Open");
        JMenu submenu7 = new JMenu("Netflix");
        JMenu submenu8 = new JMenu("Chill");

        submenu1.setFont(font1);
        submenu2.setFont(font1);
        submenu3.setFont(font1);
        submenu4.setFont(font1);
        submenu5.setFont(font1);
        submenu7.setFont(font1);
        submenu8.setFont(font1);

        account.add(submenu1);
        account.addSeparator();
        account.add(submenu2);
        minigame.add(submenu3);
        minigame.addSeparator();
        minigame.add(submenu4);
        fakeWhatsApp.add(submenu5);
        menuNetflixAndChill.add(submenu7);
        menuNetflixAndChill.addSeparator();
        menuNetflixAndChill.add(submenu8);
        
        JMenuItem item1 = new JMenuItem("Open");
        JMenuItem item2 = new JMenuItem ("Open");
        JMenuItem item3 = new JMenuItem ("Sicher?");
        JMenuItem item4 = new JMenuItem ("Open");
        JMenuItem itemChangeMenuBar = new JMenuItem("Change");
        JMenuItem itemChangeMenuBar2 = new JMenuItem("Change");

        item1.setFont(font1);
        item2.setFont(font1);
        item3.setFont(font1);
        itemChangeMenuBar.setFont(font1);
        itemChangeMenuBar2.setFont(font1);

        submenu1.add(item1);
        submenu2.add(item2);
        submenu3.add(item3);
        submenu4.add(item4);
        menuChangeMenuBar.add(itemChangeMenuBar);
        menuChangeMenuBar2.add(itemChangeMenuBar2);
        
        
        item1.addActionListener(e-> {
        	//@SuppressWarnings("unused")
        	//ErsteFrame yes = new ErsteFrame();
        });
        
        item2.addActionListener(e-> {
        	//@SuppressWarnings("unused")
        	//MyFileChooser chooser = new MyFileChooser();
        });
        
        item3.addActionListener(e-> {
        	//@SuppressWarnings("unused")
        	Game game = new Game();
        });

        item4.addActionListener(e-> {
                UpdateDatabase upDB = new UpdateDatabase();
                //upDB.
        });
        
        itemChangeMenuBar.addActionListener(e-> {
        	mainFrame.setJMenuBar(menubarTwo);
        	mainFrame.setVisible(true);
        });
        
        itemChangeMenuBar2.addActionListener(e-> {
        	mainFrame.setJMenuBar(menubarOne);
        	mainFrame.setVisible(true);
        });
        
        JPanel onePanel = new JPanel();
		onePanel.setLayout(null);
		mainFrame.add(onePanel);
        JButton newButton = new JButton("Don't");
        newButton.setBounds(100,100,40,40);
		
        mainFrame.setJMenuBar(menubarOne);
        mainFrame.setVisible(true);
        
	}//end GigaGUI
	
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		GigaGUI yesbaby = new GigaGUI();
		
    }
	

}
