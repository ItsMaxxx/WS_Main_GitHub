package UltimateUI;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SystemShutdownUI{
	
	public SystemShutdownUI() {
		
		JFrame frame1 = new JFrame();// creating a Frame
		frame1.setTitle("Funny boy");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
		//frame1.setSize(500,500);
		frame1.setBounds(700,150,315,315);
		frame1.setAlwaysOnTop(false);
		frame1.setResizable(false);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		
		JTextField t1 = new JTextField("Nothing");
		t1.setBounds(50,100,200,25);
		
		JButton b1 = new JButton("Click Me  ;)");
		b1.setBounds(5,5,290,265);
		mainPanel.add(b1);
		b1.addActionListener(e->{
			mainPanel.add(t1);
			shut();
			mainPanel.setVisible(true);
			frame1.setVisible(true);
		});
		mainPanel.add(b1);
		
		frame1.add(mainPanel);
		frame1.setVisible(true);
		

	}//ens SystemShutdown
	
	public static void shut() {
		Runtime runtime = Runtime.getRuntime();
	    try{
	    	System.out.println("Shutting down the PC...");
	        runtime.exec("shutdown -r -t 0");
	        //aender das r, das     HIER ist zu nem s, damit der Computer nur runterfaehrt
	      }
	    catch(IOException e){
	    	System.err.println("Exception: " +e);
	    }
	}//end shut
	
	public static void main(String[] args){
		@SuppressWarnings("unused")
		SystemShutdownUI shut = new SystemShutdownUI();
   }
}
	

	
	