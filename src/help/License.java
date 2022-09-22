package help;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;

public class License {

	private JFrame frame;
	
	public static void launchAppLicense() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					License window = new License();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		launchAppLicense();
	}

	/**
	 * Create the application.
	 */
	public License() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 629, 463);
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnLicense = new JTextPane();
		txtpnLicense.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnLicense.setEditable(false);
		txtpnLicense.setText("License!");
		txtpnLicense.setBounds(272, 11, 89, 31);
		frame.getContentPane().add(txtpnLicense);
		
		JTextPane txtpnMitLicense = new JTextPane();
		txtpnMitLicense.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnMitLicense.setEditable(false);
		txtpnMitLicense.setText("MIT License\r\n\r\nCopyright (c) 2022 Lucas César\r\n\r\nPermission is hereby granted, free of charge, to any person obtaining a copy\r\nof this software and associated documentation files (the \"Software\"), to deal\r\nin the Software without restriction, including without limitation the rights\r\nto use, copy, modify, merge, publish, distribute, sublicense, and/or sell\r\ncopies of the Software, and to permit persons to whom the Software is\r\nfurnished to do so, subject to the following conditions:\r\n\r\nThe above copyright notice and this permission notice shall be included in all\r\ncopies or substantial portions of the Software.\r\n\r\nTHE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\r\nIMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\r\nFITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\r\nAUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\r\nLIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\r\nOUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\r\nSOFTWARE.");
		txtpnMitLicense.setBounds(10, 37, 593, 376);
		frame.getContentPane().add(txtpnMitLicense);
	}
}
