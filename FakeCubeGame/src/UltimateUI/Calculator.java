package UltimateUI;
import javax.swing.*;

public class Calculator {
public static final String rechenzeichen = "+-*:";
public String zeichen;
public int zahlInt = 0;
public int zahlInt2 = 0;
public String result;
public int ergebnis;
	public Calculator() {
		
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("Calculator");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setBounds(700,150,500,500);
		mainFrame.setAlwaysOnTop(false);
		mainFrame.setResizable(false);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		//mainPanel.setBackground(Color.green);
		mainFrame.add(mainPanel);
		
		JTextField Tinput = new JTextField("");
		Tinput.setBounds(25, 50, 250, 25);
		mainPanel.add(Tinput);
		
		JTextField Toutput = new JTextField("");
		Toutput.setBounds(25, 140, 250, 25);
		mainPanel.add(Toutput);
		
		/*JRadioButton radioButton2 = new JRadioButton("Something yet undefined");
		radioButton2.setBounds(25,80,200,20);
		mainPanel.add(radioButton2);
		radioButton2.addActionListener (e ->{
			//
		});*/
		
		JButton button1 = new JButton("Don't push it");
		button1.setBounds(25,110,120,20);
		mainPanel.add(button1);
		button1.addActionListener (e ->{
			
			String strngIn = Tinput.getText();
			char[] ch = strngIn.toCharArray();
			
			//char[] number1 = new char[20];
			//char[] number2 = new char[20];
			StringBuilder number1 = new StringBuilder();
			StringBuilder number2 = new StringBuilder();
			boolean anzahlNummer = false;
			
			for(int i = 0; i<ch.length; i++) {
				String str = ""+ch[i];
				if(rechenzeichen.contains(str)) {
					zeichen = ""+ch[i];
					anzahlNummer = true;
					
				}else if(!rechenzeichen.contains(str)) {
					
					if(anzahlNummer == false) {
						//number2[i] = ch[i];
						number2.append(ch[i]);
						System.out.println("JA");
					}else if(anzahlNummer == true) {
						//number1 = ch[i];
						number1.append(ch[i]);
					}//end else if
					
					
					
				}//end if else
				
				String zahl = new String(number1);
				System.out.println(number1);
				System.out.println(zahl);
				zahlInt = Integer.parseInt(zahl);
				String zahl2 = new String(number2);
				System.out.println(number2);
				System.out.println(zahl2);
				zahlInt2 = Integer.parseInt(zahl2);
				
				
				//String stringg = new String(zahlInt+zeichen+zahlInt2);
				//int ergebnis = Integer.parseInt(stringg);
				
				
				
				//switching();
				//String s = Integer.toString(ergebnis);
				result = new String(zahl+zeichen+zahl2);
				
			}//end for
			
			
			
			Toutput.setText(result);
			
		});
		
		
		
		
		
		mainFrame.setVisible(true);
		mainPanel.setVisible(true);
		
	}//end Object
	
	public void switching() {
		switch (zeichen){
		case ("+"):
			ergebnis = zahlInt + zahlInt2;
			break;
		case ("-"):
			ergebnis = zahlInt - zahlInt2;
			break;
		case ("*"):
			ergebnis = zahlInt * zahlInt2;
			break;
		case (":"):
			ergebnis = zahlInt / zahlInt2;
			break;
		default:
			ergebnis = 0;
		}//end Swich
	}//end switching
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Calculator calc = new Calculator();
	}//end main

}//end class
