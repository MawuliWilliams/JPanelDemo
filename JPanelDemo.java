//Demonstsration of a JPanel


import java.awt.*;
import java.awt.event.*;

public class JPanelDemo
{
	public static void main(String[] args)
	{
		// Create and customize a Jframe object
		JFrame myFrame = new JFrame("Jpanel Demo");
		myFrame.setBounds(640, 400, 540, 380);
		myFrame.setDefaultCloseOperations(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new FlowLayout());
		myFrame.getContentPane().setBackground(new Color(50, 205, 50));
		myFrame.setVisible(true);

		// Create two JPanel objects and customize them
		Jpanel panelOne = new Jpanel();
		Jpanel panelTwo = new Jpanel();
		panelOne.setBackground(Color.BLACK);
		panelTwo.setBackground(Color.WHITE);
		panelOne.setPreferredSize(new Dimension(440, 200));
		panelOne.setPreferredSize(new Dimension(440, 200));

		// Create multiple JButton objects and customize them
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		button3.setBackground(Color.RED);
		button3.setForeground(Color.YELLOW);

		//add the buttons to the panels
		panelOne.add(button1);
		panelOne.add(button2);
		panelOne.add(button3);

		// add the buttons to the panels
		myFrame.add(panelOne);
		myFrame.add(panelTwo);
	}

}
