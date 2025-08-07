import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ColorListener implements ActionListener{
	
	
	private JLabel label;
	
	
	public ColorListener(JLabel labe) {
	
		this.label = label;
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		
		//randomly get an integer between 0-225
		int red = (int)(Math.random()*256);
		
		int green = (int)(Math.random()*256);
		
		int blue = (int)(Math.random()*256);
	
		label.setForeground(new Color(red, green, blue));
	
	}

	
}
