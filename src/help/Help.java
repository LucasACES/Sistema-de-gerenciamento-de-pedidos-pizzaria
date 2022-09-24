package help;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Help {

	private JFrame frame;

	public static void launchAppHelp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help window = new Help();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Help() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
