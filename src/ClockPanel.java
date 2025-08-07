
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ClockPanel extends JPanel{

	public ClockPanel () {
		
		this.setPreferredSize(new Dimension(150, 75));
		
		JLabel label = new JLabel();
		
		this.add(label);
	
		Timer timer = new Timer(100, new ClockListener(label));
		
		timer.start();
	}
	
	
	
	private class ClockListener implements ActionListener {
		
		
		public JLabel label;
		
		public ClockListener(JLabel label) {
			
			this.label = label;
		}
		
		
		public void actionPerformed(ActionEvent e) {
			
			
			
			
		String time = Calendar.getInstance().getTime().toString();
		
		label.setText(time);
		}
		
	}
	
	
}
