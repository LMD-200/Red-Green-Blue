import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorPanel extends JPanel{

	
	public ColorPanel() {
	
	
	this.setPreferredSize(new Dimension(150, 75));
	this.setBackground(Color.white);
	
	JSlider redslider = new JSlider(0,255);
	
	JSlider greenslider = new JSlider(0,255);
	
	JSlider blueslider = new JSlider(0,255);

	//add changeListener to the slider
	
	redslider.addChangeListener(new SliderListener(0, this,redslider));
	greenslider.addChangeListener(new SliderListener(1, this,greenslider));
	blueslider.addChangeListener(new SliderListener(2, this,blueslider));
	
	
	this.add(redslider);
	this.add(greenslider);
	this.add(blueslider);
	
	}
	
	private class SliderListener implements ChangeListener{
		private int channel;
		private JPanel panel;
		
		private JSlider slider;
		
		public SliderListener(int channel, JPanel panel, JSlider slider) {
			
		this.channel = channel;
		this.panel = panel;
		this.slider = slider;
			
		}
		
		
		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			//get the value of slider
			
		int val = slider.getValue();		
		
		//get color of panel
		Color bg = panel.getBackground();
		
		//create new color based on change of any slider
		
		Color newColor;
		
		
		
		switch(channel) {
		case 0 :
			newColor = new Color(val, bg.getGreen(), bg.getBlue());
			break;
		case 1:
			newColor = new Color(val, bg.getRed(), bg.getBlue());
			break;
		default:
			newColor = new Color(val, bg.getRed(), bg.getGreen());
		}
		//set new color of panel
		panel.setBackground(newColor);
	}

		
		
	}
	
}
