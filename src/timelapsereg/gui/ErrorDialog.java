package timelapsereg.gui;

import ij.gui.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ErrorDialog extends JFrame implements ActionListener {
	
	private JButton ok 		= new JButton("Ok");
	private JLabel message	= new JLabel("Enter Valid Information");
	public ErrorDialog(String option)
	{
		super("Error!");
		setLayout(new BorderLayout());
		if(option.equalsIgnoreCase("range_bug"))
			message.setText("Please enter a valid range..!!");
		else if(option.equalsIgnoreCase("limit_bug"))
		{
			message.setText("Enter Upper limit less than total number of frames!");
		}
		else
		{
			message.setText("Enter Valid Information!!");
		}
		JPanel errorFrame = new JPanel(new BorderLayout());
		errorFrame.add(message, BorderLayout.CENTER);
		errorFrame.add(ok, BorderLayout.SOUTH);

		ok.addActionListener(this);
		
		this.add(errorFrame,BorderLayout.CENTER);
		this.pack();
		//this.setSize(200, 50);
		GUI.center(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == ok)
		{
			close();
			dispose();
		}
	}
	private void close()
	{
		ok.removeActionListener(this);
	}

}
