import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorTextPanel extends JPanel{

	
	public ColorTextPanel() {
		
		this.setPreferredSize(new Dimension(150, 75));
		
		
		JLabel label = new JLabel("Ser120");
		
		JButton button = new JButton("Random Color");
		
		button.addActionListener(new ColorListener(label));
	
		
		this.add(button);
		this.add(label);
	
	}
	
}
