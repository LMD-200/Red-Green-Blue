import javax.swing.JFrame;

public class App {

	public App() {
		
		JFrame frame = new JFrame("Ser120 App");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//frame.add(new ColorTextPanel());
	
		//frame.add(new ClockPanel());
		
		frame.add(new ColorPanel());
		
		
		frame.pack();
	
		frame.setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new App();
		
	}
	
}
